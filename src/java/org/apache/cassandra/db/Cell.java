/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.cassandra.db;

import java.io.DataInput;
import java.io.IOError;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Iterator;

import com.google.common.collect.AbstractIterator;

import org.apache.cassandra.config.CFMetaData;
import org.apache.cassandra.db.composites.CellName;
import org.apache.cassandra.db.composites.CellNameType;
import org.apache.cassandra.db.composites.CellNames;
import org.apache.cassandra.db.marshal.*;
import org.apache.cassandra.io.sstable.Descriptor;
import org.apache.cassandra.io.util.DataOutputBuffer;
import org.apache.cassandra.serializers.MarshalException;
import org.apache.cassandra.utils.ObjectSizes;
import org.apache.cassandra.utils.memory.AbstractAllocator;
import org.apache.cassandra.utils.ByteBufferUtil;
import org.apache.cassandra.utils.FBUtilities;

/**
 * Cell is immutable, which prevents all kinds of confusion in a multithreaded environment.
 */
public class Cell implements OnDiskAtom
{
    public static final int MAX_NAME_LENGTH = FBUtilities.MAX_UNSIGNED_SHORT;

    private static final long EMPTY_SIZE = ObjectSizes.measure(new Cell(CellNames.simpleDense(ByteBuffer.allocate(1))));

    public static Iterator<OnDiskAtom> onDiskIterator(final DataInput in,
                                                      final ColumnSerializer.Flag flag,
                                                      final int expireBefore,
                                                      final Descriptor.Version version,
                                                      final CellNameType type)
    {
        return new AbstractIterator<OnDiskAtom>()
        {
            protected OnDiskAtom computeNext()
            {
                OnDiskAtom atom;
                try
                {
                    atom = type.onDiskAtomSerializer().deserializeFromSSTable(in, flag, expireBefore, version);
                }
                catch (IOException e)
                {
                    throw new IOError(e);
                }
                if (atom == null)
                    return endOfData();

                return atom;
            }
        };
    }

    protected final CellName name;
    protected final ByteBuffer value;
    protected final long timestamp;

    Cell(CellName name)
    {
        this(name, ByteBufferUtil.EMPTY_BYTE_BUFFER);
    }

    public Cell(CellName name, ByteBuffer value)
    {
        this(name, value, 0);
    }

    public Cell(CellName name, ByteBuffer value, long timestamp)
    {
        assert name != null;
        assert value != null;
        this.name = name;
        this.value = value;
        this.timestamp = timestamp;
    }

    public Cell withUpdatedName(CellName newName)
    {
        return new Cell(newName, value, timestamp);
    }

    public Cell withUpdatedTimestamp(long newTimestamp)
    {
        return new Cell(name, value, newTimestamp);
    }

    public CellName name()
    {
        return name;
    }

    public ByteBuffer value()
    {
        return value;
    }

    public long timestamp()
    {
        return timestamp;
    }

    public boolean isMarkedForDelete(long now)
    {
        return false;
    }

    public boolean isLive(long now)
    {
        return !isMarkedForDelete(now);
    }

    // Don't call unless the column is actually marked for delete.
    public long getMarkedForDeleteAt()
    {
        return Long.MAX_VALUE;
    }

    public int dataSize()
    {
        return name.dataSize() + value.remaining() + TypeSizes.NATIVE.sizeof(timestamp);
    }

    // returns the size of the Cell and all references on the heap, excluding any costs associated with byte arrays
    // that would be allocated by a localCopy, as these will be accounted for by the allocator
    public long excessHeapSizeExcludingData()
    {
        return EMPTY_SIZE + name.excessHeapSizeExcludingData() + ObjectSizes.sizeOnHeapExcludingData(value);
    }

    public int serializedSize(CellNameType type, TypeSizes typeSizes)
    {
        /*
         * Size of a column is =
         *   size of a name (short + length of the string)
         * + 1 byte to indicate if the column has been deleted
         * + 8 bytes for timestamp
         * + 4 bytes which basically indicates the size of the byte array
         * + entire byte array.
        */
        int valueSize = value.remaining();
        return ((int)type.cellSerializer().serializedSize(name, typeSizes)) + 1 + typeSizes.sizeof(timestamp) + typeSizes.sizeof(valueSize) + valueSize;
    }

    public int serializationFlags()
    {
        return 0;
    }

    public Cell diff(Cell cell)
    {
        if (timestamp() < cell.timestamp())
            return cell;
        return null;
    }

    public void updateDigest(MessageDigest digest)
    {
        digest.update(name.toByteBuffer().duplicate());
        digest.update(value.duplicate());

        DataOutputBuffer buffer = new DataOutputBuffer();
        try
        {
            buffer.writeLong(timestamp);
            buffer.writeByte(serializationFlags());
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        digest.update(buffer.getData(), 0, buffer.getLength());
    }

    public int getLocalDeletionTime()
    {
        return Integer.MAX_VALUE;
    }

    public Cell reconcile(Cell cell)
    {
        // tombstones take precedence.  (if both are tombstones, then it doesn't matter which one we use.)
        if (isMarkedForDelete(System.currentTimeMillis()))
            return timestamp() < cell.timestamp() ? cell : this;
        if (cell.isMarkedForDelete(System.currentTimeMillis()))
            return timestamp() > cell.timestamp() ? this : cell;
        // break ties by comparing values.
        if (timestamp() == cell.timestamp())
            return value().compareTo(cell.value()) < 0 ? cell : this;
        // neither is tombstoned and timestamps are different
        return timestamp() < cell.timestamp() ? cell : this;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Cell cell = (Cell)o;

        return timestamp == cell.timestamp && name.equals(cell.name) && value.equals(cell.value);
    }

    @Override
    public int hashCode()
    {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (int)(timestamp ^ (timestamp >>> 32));
        return result;
    }

    public Cell localCopy(AbstractAllocator allocator)
    {
        return new Cell(name.copy(allocator), allocator.clone(value), timestamp);
    }

    public String getString(CellNameType comparator)
    {
        return String.format("%s:%b:%d@%d",
                             comparator.getString(name),
                             isMarkedForDelete(System.currentTimeMillis()),
                             value.remaining(),
                             timestamp);
    }

    protected void validateName(CFMetaData metadata) throws MarshalException
    {
        metadata.comparator.validate(name());
    }

    public void validateFields(CFMetaData metadata) throws MarshalException
    {
        validateName(metadata);

        AbstractType<?> valueValidator = metadata.getValueValidator(name());
        if (valueValidator != null)
            valueValidator.validate(value());
    }

    public static Cell create(CellName name, ByteBuffer value, long timestamp, int ttl, CFMetaData metadata)
    {
        if (ttl <= 0)
            ttl = metadata.getDefaultTimeToLive();

        return ttl > 0
               ? new ExpiringCell(name, value, timestamp, ttl)
               : new Cell(name, value, timestamp);
    }
}
