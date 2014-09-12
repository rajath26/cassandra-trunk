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

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

import org.apache.cassandra.config.CFMetaData;
import org.apache.cassandra.db.composites.CellName;
import org.apache.cassandra.db.composites.CellNameType;
import org.apache.cassandra.io.util.DataOutputBuffer;
import org.apache.cassandra.serializers.MarshalException;
import org.apache.cassandra.utils.memory.AbstractAllocator;

/**
 * Alternative to Cell that have an expiring time.
 * ExpiringCell is immutable (as Cell is).
 *
 * Note that ExpiringCell does not override Cell.getMarkedForDeleteAt,
 * which means that it's in the somewhat unintuitive position of being deleted (after its expiration)
 * without having a time-at-which-it-became-deleted.  (Because ttl is a server-side measurement,
 * we can't mix it with the timestamp field, which is client-supplied and whose resolution we
 * can't assume anything about.)
 */
public class ExpiringCell extends Cell
{
    public static final int MAX_TTL = 20 * 365 * 24 * 60 * 60; // 20 years in seconds

    private final int localExpirationTime;
    private final int timeToLive;

    public ExpiringCell(CellName name, ByteBuffer value, long timestamp, int timeToLive)
    {
      this(name, value, timestamp, timeToLive, (int) (System.currentTimeMillis() / 1000) + timeToLive);
    }

    public ExpiringCell(CellName name, ByteBuffer value, long timestamp, int timeToLive, int localExpirationTime)
    {
        super(name, value, timestamp);
        assert timeToLive > 0 : timeToLive;
        assert localExpirationTime > 0 : localExpirationTime;
        this.timeToLive = timeToLive;
        this.localExpirationTime = localExpirationTime;
    }

    /** @return Either a DeletedCell, or an ExpiringCell. */
    public static Cell create(CellName name, ByteBuffer value, long timestamp, int timeToLive, int localExpirationTime, int expireBefore, ColumnSerializer.Flag flag)
    {
        if (localExpirationTime >= expireBefore || flag == ColumnSerializer.Flag.PRESERVE_SIZE)
            return new ExpiringCell(name, value, timestamp, timeToLive, localExpirationTime);
        // The column is now expired, we can safely return a simple tombstone. Note that
        // as long as the expiring column and the tombstone put together live longer than GC grace seconds,
        // we'll fulfil our responsibility to repair.  See discussion at
        // http://cassandra-user-incubator-apache-org.3065146.n2.nabble.com/repair-compaction-and-tombstone-rows-td7583481.html
        return new DeletedCell(name, localExpirationTime - timeToLive, timestamp);
    }

    public int getTimeToLive()
    {
        return timeToLive;
    }

    @Override
    public Cell withUpdatedName(CellName newName)
    {
        return new ExpiringCell(newName, value, timestamp, timeToLive, localExpirationTime);
    }

    @Override
    public Cell withUpdatedTimestamp(long newTimestamp)
    {
        return new ExpiringCell(name, value, newTimestamp, timeToLive, localExpirationTime);
    }

    @Override
    public int dataSize()
    {
        return super.dataSize() + TypeSizes.NATIVE.sizeof(localExpirationTime) + TypeSizes.NATIVE.sizeof(timeToLive);
    }

    @Override
    public int serializedSize(CellNameType type, TypeSizes typeSizes)
    {
        /*
         * An expired column adds to a Cell :
         *    4 bytes for the localExpirationTime
         *  + 4 bytes for the timeToLive
        */
        return super.serializedSize(type, typeSizes) + typeSizes.sizeof(localExpirationTime) + typeSizes.sizeof(timeToLive);
    }

    @Override
    public void updateDigest(MessageDigest digest)
    {
        digest.update(name.toByteBuffer().duplicate());
        digest.update(value.duplicate());

        DataOutputBuffer buffer = new DataOutputBuffer();
        try
        {
            buffer.writeLong(timestamp);
            buffer.writeByte(serializationFlags());
            buffer.writeInt(timeToLive);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        digest.update(buffer.getData(), 0, buffer.getLength());
    }

    @Override
    public int getLocalDeletionTime()
    {
        return localExpirationTime;
    }

    @Override
    public Cell localCopy(AbstractAllocator allocator)
    {
        return new ExpiringCell(name.copy(allocator), allocator.clone(value), timestamp, timeToLive, localExpirationTime);
    }

    @Override
    public String getString(CellNameType comparator)
    {
        return String.format("%s!%d", super.getString(comparator), timeToLive);
    }

    @Override
    public boolean isMarkedForDelete(long now)
    {
        return (int) (now / 1000) >= getLocalDeletionTime();
    }

    @Override
    public long getMarkedForDeleteAt()
    {
        return timestamp;
    }

    @Override
    public int serializationFlags()
    {
        return ColumnSerializer.EXPIRATION_MASK;
    }

    @Override
    public void validateFields(CFMetaData metadata) throws MarshalException
    {
        super.validateFields(metadata);
        if (timeToLive <= 0)
            throw new MarshalException("A column TTL should be > 0");
        if (localExpirationTime < 0)
            throw new MarshalException("The local expiration time should not be negative");
    }

    @Override
    public boolean equals(Object o)
    {
        // super.equals() returns false if o is not a CounterCell
        return super.equals(o)
            && localExpirationTime == ((ExpiringCell)o).localExpirationTime
            && timeToLive == ((ExpiringCell)o).timeToLive;
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + localExpirationTime;
        result = 31 * result + timeToLive;
        return result;
    }
}
