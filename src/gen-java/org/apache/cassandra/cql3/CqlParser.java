// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g 2014-04-12 15:47:27

    package org.apache.cassandra.cql3;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Collections;
    import java.util.EnumSet;
    import java.util.HashSet;
    import java.util.HashMap;
    import java.util.LinkedHashMap;
    import java.util.List;
    import java.util.Map;
    import java.util.Set;

    import org.apache.cassandra.auth.Permission;
    import org.apache.cassandra.auth.DataResource;
    import org.apache.cassandra.auth.IResource;
    import org.apache.cassandra.cql3.*;
    import org.apache.cassandra.cql3.statements.*;
    import org.apache.cassandra.cql3.functions.FunctionCall;
    import org.apache.cassandra.db.marshal.CollectionType;
    import org.apache.cassandra.exceptions.ConfigurationException;
    import org.apache.cassandra.exceptions.InvalidRequestException;
    import org.apache.cassandra.exceptions.SyntaxException;
    import org.apache.cassandra.utils.Pair;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "K_USE", "K_SELECT", "K_DISTINCT", "K_COUNT", "K_AS", "K_FROM", "K_WHERE", "K_ORDER", "K_BY", "K_LIMIT", "K_ALLOW", "K_FILTERING", "K_WRITETIME", "K_TTL", "INTEGER", "K_AND", "K_ASC", "K_DESC", "K_INSERT", "K_INTO", "K_VALUES", "K_IF", "K_NOT", "K_EXISTS", "K_USING", "K_TIMESTAMP", "K_UPDATE", "K_SET", "K_DELETE", "K_BEGIN", "K_UNLOGGED", "K_COUNTER", "K_BATCH", "K_APPLY", "K_CREATE", "K_KEYSPACE", "K_WITH", "K_COLUMNFAMILY", "K_STATIC", "K_PRIMARY", "K_KEY", "K_COMPACT", "K_STORAGE", "K_CLUSTERING", "K_TYPE", "K_CUSTOM", "K_INDEX", "IDENT", "K_ON", "STRING_LITERAL", "K_KEYS", "K_TRIGGER", "K_DROP", "K_ALTER", "K_ADD", "K_RENAME", "K_TO", "K_TRUNCATE", "K_GRANT", "K_REVOKE", "K_LIST", "K_OF", "K_NORECURSIVE", "K_MODIFY", "K_AUTHORIZE", "K_ALL", "K_PERMISSIONS", "K_PERMISSION", "K_KEYSPACES", "K_USER", "K_SUPERUSER", "K_NOSUPERUSER", "K_USERS", "K_PASSWORD", "QUOTED_NAME", "FLOAT", "BOOLEAN", "UUID", "HEXNUMBER", "K_NAN", "K_INFINITY", "K_NULL", "QMARK", "K_TOKEN", "K_IN", "K_CONTAINS", "K_ASCII", "K_BIGINT", "K_BLOB", "K_BOOLEAN", "K_DECIMAL", "K_DOUBLE", "K_FLOAT", "K_INET", "K_INT", "K_TEXT", "K_UUID", "K_VARCHAR", "K_VARINT", "K_TIMEUUID", "K_MAP", "S", "E", "L", "C", "T", "F", "R", "O", "M", "A", "W", "H", "N", "D", "K", "Y", "I", "U", "P", "G", "B", "X", "V", "Z", "J", "Q", "DIGIT", "LETTER", "HEX", "EXPONENT", "WS", "COMMENT", "MULTILINE_COMMENT", "';'", "'('", "')'", "','", "'\\*'", "'.'", "'['", "']'", "'-'", "'{'", "':'", "'}'", "'='", "'+'", "'<'", "'<='", "'>'", "'>='"
    };
    public static final int EXPONENT=134;
    public static final int K_PERMISSIONS=70;
    public static final int LETTER=132;
    public static final int K_INT=98;
    public static final int K_PERMISSION=71;
    public static final int K_CREATE=38;
    public static final int K_CLUSTERING=47;
    public static final int K_WRITETIME=16;
    public static final int K_INFINITY=84;
    public static final int K_EXISTS=27;
    public static final int EOF=-1;
    public static final int K_PRIMARY=43;
    public static final int K_AUTHORIZE=68;
    public static final int K_VALUES=24;
    public static final int K_USE=4;
    public static final int K_DISTINCT=6;
    public static final int T__148=148;
    public static final int STRING_LITERAL=53;
    public static final int T__147=147;
    public static final int K_GRANT=62;
    public static final int T__149=149;
    public static final int K_ON=52;
    public static final int K_USING=28;
    public static final int K_ADD=58;
    public static final int K_ASC=20;
    public static final int K_CUSTOM=49;
    public static final int K_KEY=44;
    public static final int K_KEYS=54;
    public static final int COMMENT=136;
    public static final int T__154=154;
    public static final int K_TRUNCATE=61;
    public static final int T__155=155;
    public static final int T__150=150;
    public static final int K_ORDER=11;
    public static final int T__151=151;
    public static final int HEXNUMBER=82;
    public static final int T__152=152;
    public static final int K_OF=65;
    public static final int K_ALL=69;
    public static final int T__153=153;
    public static final int D=118;
    public static final int T__139=139;
    public static final int E=106;
    public static final int T__138=138;
    public static final int F=110;
    public static final int G=124;
    public static final int K_COUNT=7;
    public static final int K_KEYSPACE=39;
    public static final int K_TYPE=48;
    public static final int A=114;
    public static final int B=125;
    public static final int C=108;
    public static final int L=107;
    public static final int M=113;
    public static final int N=117;
    public static final int O=112;
    public static final int H=116;
    public static final int I=121;
    public static final int J=129;
    public static final int K_UPDATE=30;
    public static final int K=119;
    public static final int K_FILTERING=15;
    public static final int U=122;
    public static final int T=109;
    public static final int W=115;
    public static final int K_TEXT=99;
    public static final int V=127;
    public static final int Q=130;
    public static final int P=123;
    public static final int K_COMPACT=45;
    public static final int S=105;
    public static final int R=111;
    public static final int T__141=141;
    public static final int T__142=142;
    public static final int K_TTL=17;
    public static final int T__140=140;
    public static final int Y=120;
    public static final int T__145=145;
    public static final int X=126;
    public static final int T__146=146;
    public static final int T__143=143;
    public static final int Z=128;
    public static final int T__144=144;
    public static final int K_INDEX=50;
    public static final int K_INSERT=22;
    public static final int WS=135;
    public static final int K_NOT=26;
    public static final int K_RENAME=59;
    public static final int K_APPLY=37;
    public static final int K_INET=97;
    public static final int K_STORAGE=46;
    public static final int K_TIMESTAMP=29;
    public static final int K_NULL=85;
    public static final int K_AND=19;
    public static final int K_DESC=21;
    public static final int K_TOKEN=87;
    public static final int QMARK=86;
    public static final int K_UUID=100;
    public static final int K_BATCH=36;
    public static final int K_ASCII=90;
    public static final int UUID=81;
    public static final int K_LIST=64;
    public static final int K_DELETE=32;
    public static final int K_TO=60;
    public static final int K_BY=12;
    public static final int FLOAT=79;
    public static final int K_VARINT=102;
    public static final int K_FLOAT=96;
    public static final int K_SUPERUSER=74;
    public static final int K_DOUBLE=95;
    public static final int K_SELECT=5;
    public static final int K_LIMIT=13;
    public static final int K_BOOLEAN=93;
    public static final int K_ALTER=57;
    public static final int K_SET=31;
    public static final int K_TRIGGER=55;
    public static final int K_WHERE=10;
    public static final int QUOTED_NAME=78;
    public static final int MULTILINE_COMMENT=137;
    public static final int K_BLOB=92;
    public static final int BOOLEAN=80;
    public static final int K_UNLOGGED=34;
    public static final int HEX=133;
    public static final int K_INTO=23;
    public static final int K_PASSWORD=77;
    public static final int K_REVOKE=63;
    public static final int K_ALLOW=14;
    public static final int K_VARCHAR=101;
    public static final int IDENT=51;
    public static final int DIGIT=131;
    public static final int K_USERS=76;
    public static final int K_BEGIN=33;
    public static final int INTEGER=18;
    public static final int K_KEYSPACES=72;
    public static final int K_COUNTER=35;
    public static final int K_DECIMAL=94;
    public static final int K_CONTAINS=89;
    public static final int K_WITH=40;
    public static final int K_IN=88;
    public static final int K_NORECURSIVE=66;
    public static final int K_MAP=104;
    public static final int K_NAN=83;
    public static final int K_IF=25;
    public static final int K_FROM=9;
    public static final int K_STATIC=42;
    public static final int K_COLUMNFAMILY=41;
    public static final int K_MODIFY=67;
    public static final int K_DROP=56;
    public static final int K_NOSUPERUSER=75;
    public static final int K_AS=8;
    public static final int K_BIGINT=91;
    public static final int K_TIMEUUID=103;
    public static final int K_USER=73;

    // delegates
    // delegators


        public CqlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CqlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return CqlParser.tokenNames; }
    public String getGrammarFileName() { return "/home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g"; }


        private final List<String> recognitionErrors = new ArrayList<String>();
        private final List<ColumnIdentifier> bindVariables = new ArrayList<ColumnIdentifier>();

        public static final Set<String> reservedTypeNames = new HashSet<String>()
        {{
            add("byte");
            add("smallint");
            add("complex");
            add("enum");
            add("date");
            add("interval");
            add("macaddr");
            add("bitstring");
        }};

        public AbstractMarker.Raw newBindVariables(ColumnIdentifier name)
        {
            AbstractMarker.Raw marker = new AbstractMarker.Raw(bindVariables.size());
            bindVariables.add(name);
            return marker;
        }

        public AbstractMarker.INRaw newINBindVariables(ColumnIdentifier name)
        {
            AbstractMarker.INRaw marker = new AbstractMarker.INRaw(bindVariables.size());
            bindVariables.add(name);
            return marker;
        }

        public void displayRecognitionError(String[] tokenNames, RecognitionException e)
        {
            String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, tokenNames);
            recognitionErrors.add(hdr + " " + msg);
        }

        public void addRecognitionError(String msg)
        {
            recognitionErrors.add(msg);
        }

        public List<String> getRecognitionErrors()
        {
            return recognitionErrors;
        }

        public void throwLastRecognitionError() throws SyntaxException
        {
            if (recognitionErrors.size() > 0)
                throw new SyntaxException(recognitionErrors.get((recognitionErrors.size()-1)));
        }

        public Map<String, String> convertPropertyMap(Maps.Literal map)
        {
            if (map == null || map.entries == null || map.entries.isEmpty())
                return Collections.<String, String>emptyMap();

            Map<String, String> res = new HashMap<String, String>(map.entries.size());

            for (Pair<Term.Raw, Term.Raw> entry : map.entries)
            {
                // Because the parser tries to be smart and recover on error (to
                // allow displaying more than one error I suppose), we have null
                // entries in there. Just skip those, a proper error will be thrown in the end.
                if (entry.left == null || entry.right == null)
                    break;

                if (!(entry.left instanceof Constants.Literal))
                {
                    String msg = "Invalid property name: " + entry.left;
                    if (entry.left instanceof AbstractMarker.Raw)
                        msg += " (bind variables are not supported in DDL queries)";
                    addRecognitionError(msg);
                    break;
                }
                if (!(entry.right instanceof Constants.Literal))
                {
                    String msg = "Invalid property value: " + entry.right + " for property: " + entry.left;
                    if (entry.right instanceof AbstractMarker.Raw)
                        msg += " (bind variables are not supported in DDL queries)";
                    addRecognitionError(msg);
                    break;
                }

                res.put(((Constants.Literal)entry.left).getRawText(), ((Constants.Literal)entry.right).getRawText());
            }

            return res;
        }

        public void addRawUpdate(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key, Operation.RawUpdate update)
        {
            for (Pair<ColumnIdentifier, Operation.RawUpdate> p : operations)
            {
                if (p.left.equals(key) && !p.right.isCompatibleWith(update))
                    addRecognitionError("Multiple incompatible setting of column " + key);
            }
            operations.add(Pair.create(key, update));
        }



    // $ANTLR start "query"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:199:1: query returns [ParsedStatement stmnt] : st= cqlStatement ( ';' )* EOF ;
    public final ParsedStatement query() throws RecognitionException {
        ParsedStatement stmnt = null;

        ParsedStatement st = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:202:5: (st= cqlStatement ( ';' )* EOF )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:202:7: st= cqlStatement ( ';' )* EOF
            {
            pushFollow(FOLLOW_cqlStatement_in_query72);
            st=cqlStatement();

            state._fsp--;

            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:202:23: ( ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==138) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:202:24: ';'
            	    {
            	    match(input,138,FOLLOW_138_in_query75); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_query79); 
             stmnt = st; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmnt;
    }
    // $ANTLR end "query"


    // $ANTLR start "cqlStatement"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:205:1: cqlStatement returns [ParsedStatement stmt] : (st1= selectStatement | st2= insertStatement | st3= updateStatement | st4= batchStatement | st5= deleteStatement | st6= useStatement | st7= truncateStatement | st8= createKeyspaceStatement | st9= createTableStatement | st10= createIndexStatement | st11= dropKeyspaceStatement | st12= dropTableStatement | st13= dropIndexStatement | st14= alterTableStatement | st15= alterKeyspaceStatement | st16= grantStatement | st17= revokeStatement | st18= listPermissionsStatement | st19= createUserStatement | st20= alterUserStatement | st21= dropUserStatement | st22= listUsersStatement | st23= createTriggerStatement | st24= dropTriggerStatement | st25= createTypeStatement | st26= alterTypeStatement | st27= dropTypeStatement );
    public final ParsedStatement cqlStatement() throws RecognitionException {
        ParsedStatement stmt = null;

        SelectStatement.RawStatement st1 = null;

        UpdateStatement.ParsedInsert st2 = null;

        UpdateStatement.ParsedUpdate st3 = null;

        BatchStatement.Parsed st4 = null;

        DeleteStatement.Parsed st5 = null;

        UseStatement st6 = null;

        TruncateStatement st7 = null;

        CreateKeyspaceStatement st8 = null;

        CreateTableStatement.RawStatement st9 = null;

        CreateIndexStatement st10 = null;

        DropKeyspaceStatement st11 = null;

        DropTableStatement st12 = null;

        DropIndexStatement st13 = null;

        AlterTableStatement st14 = null;

        AlterKeyspaceStatement st15 = null;

        GrantStatement st16 = null;

        RevokeStatement st17 = null;

        ListPermissionsStatement st18 = null;

        CreateUserStatement st19 = null;

        AlterUserStatement st20 = null;

        DropUserStatement st21 = null;

        ListUsersStatement st22 = null;

        CreateTriggerStatement st23 = null;

        DropTriggerStatement st24 = null;

        CreateTypeStatement st25 = null;

        AlterTypeStatement st26 = null;

        DropTypeStatement st27 = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:207:5: (st1= selectStatement | st2= insertStatement | st3= updateStatement | st4= batchStatement | st5= deleteStatement | st6= useStatement | st7= truncateStatement | st8= createKeyspaceStatement | st9= createTableStatement | st10= createIndexStatement | st11= dropKeyspaceStatement | st12= dropTableStatement | st13= dropIndexStatement | st14= alterTableStatement | st15= alterKeyspaceStatement | st16= grantStatement | st17= revokeStatement | st18= listPermissionsStatement | st19= createUserStatement | st20= alterUserStatement | st21= dropUserStatement | st22= listUsersStatement | st23= createTriggerStatement | st24= dropTriggerStatement | st25= createTypeStatement | st26= alterTypeStatement | st27= dropTypeStatement )
            int alt2=27;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:207:7: st1= selectStatement
                    {
                    pushFollow(FOLLOW_selectStatement_in_cqlStatement113);
                    st1=selectStatement();

                    state._fsp--;

                     stmt = st1; 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:208:7: st2= insertStatement
                    {
                    pushFollow(FOLLOW_insertStatement_in_cqlStatement138);
                    st2=insertStatement();

                    state._fsp--;

                     stmt = st2; 

                    }
                    break;
                case 3 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:209:7: st3= updateStatement
                    {
                    pushFollow(FOLLOW_updateStatement_in_cqlStatement163);
                    st3=updateStatement();

                    state._fsp--;

                     stmt = st3; 

                    }
                    break;
                case 4 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:210:7: st4= batchStatement
                    {
                    pushFollow(FOLLOW_batchStatement_in_cqlStatement188);
                    st4=batchStatement();

                    state._fsp--;

                     stmt = st4; 

                    }
                    break;
                case 5 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:211:7: st5= deleteStatement
                    {
                    pushFollow(FOLLOW_deleteStatement_in_cqlStatement214);
                    st5=deleteStatement();

                    state._fsp--;

                     stmt = st5; 

                    }
                    break;
                case 6 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:212:7: st6= useStatement
                    {
                    pushFollow(FOLLOW_useStatement_in_cqlStatement239);
                    st6=useStatement();

                    state._fsp--;

                     stmt = st6; 

                    }
                    break;
                case 7 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:213:7: st7= truncateStatement
                    {
                    pushFollow(FOLLOW_truncateStatement_in_cqlStatement267);
                    st7=truncateStatement();

                    state._fsp--;

                     stmt = st7; 

                    }
                    break;
                case 8 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:214:7: st8= createKeyspaceStatement
                    {
                    pushFollow(FOLLOW_createKeyspaceStatement_in_cqlStatement290);
                    st8=createKeyspaceStatement();

                    state._fsp--;

                     stmt = st8; 

                    }
                    break;
                case 9 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:215:7: st9= createTableStatement
                    {
                    pushFollow(FOLLOW_createTableStatement_in_cqlStatement307);
                    st9=createTableStatement();

                    state._fsp--;

                     stmt = st9; 

                    }
                    break;
                case 10 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:216:7: st10= createIndexStatement
                    {
                    pushFollow(FOLLOW_createIndexStatement_in_cqlStatement326);
                    st10=createIndexStatement();

                    state._fsp--;

                     stmt = st10; 

                    }
                    break;
                case 11 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:217:7: st11= dropKeyspaceStatement
                    {
                    pushFollow(FOLLOW_dropKeyspaceStatement_in_cqlStatement345);
                    st11=dropKeyspaceStatement();

                    state._fsp--;

                     stmt = st11; 

                    }
                    break;
                case 12 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:218:7: st12= dropTableStatement
                    {
                    pushFollow(FOLLOW_dropTableStatement_in_cqlStatement363);
                    st12=dropTableStatement();

                    state._fsp--;

                     stmt = st12; 

                    }
                    break;
                case 13 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:219:7: st13= dropIndexStatement
                    {
                    pushFollow(FOLLOW_dropIndexStatement_in_cqlStatement384);
                    st13=dropIndexStatement();

                    state._fsp--;

                     stmt = st13; 

                    }
                    break;
                case 14 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:220:7: st14= alterTableStatement
                    {
                    pushFollow(FOLLOW_alterTableStatement_in_cqlStatement405);
                    st14=alterTableStatement();

                    state._fsp--;

                     stmt = st14; 

                    }
                    break;
                case 15 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:221:7: st15= alterKeyspaceStatement
                    {
                    pushFollow(FOLLOW_alterKeyspaceStatement_in_cqlStatement425);
                    st15=alterKeyspaceStatement();

                    state._fsp--;

                     stmt = st15; 

                    }
                    break;
                case 16 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:222:7: st16= grantStatement
                    {
                    pushFollow(FOLLOW_grantStatement_in_cqlStatement442);
                    st16=grantStatement();

                    state._fsp--;

                     stmt = st16; 

                    }
                    break;
                case 17 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:223:7: st17= revokeStatement
                    {
                    pushFollow(FOLLOW_revokeStatement_in_cqlStatement467);
                    st17=revokeStatement();

                    state._fsp--;

                     stmt = st17; 

                    }
                    break;
                case 18 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:224:7: st18= listPermissionsStatement
                    {
                    pushFollow(FOLLOW_listPermissionsStatement_in_cqlStatement491);
                    st18=listPermissionsStatement();

                    state._fsp--;

                     stmt = st18; 

                    }
                    break;
                case 19 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:225:7: st19= createUserStatement
                    {
                    pushFollow(FOLLOW_createUserStatement_in_cqlStatement506);
                    st19=createUserStatement();

                    state._fsp--;

                     stmt = st19; 

                    }
                    break;
                case 20 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:226:7: st20= alterUserStatement
                    {
                    pushFollow(FOLLOW_alterUserStatement_in_cqlStatement526);
                    st20=alterUserStatement();

                    state._fsp--;

                     stmt = st20; 

                    }
                    break;
                case 21 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:227:7: st21= dropUserStatement
                    {
                    pushFollow(FOLLOW_dropUserStatement_in_cqlStatement547);
                    st21=dropUserStatement();

                    state._fsp--;

                     stmt = st21; 

                    }
                    break;
                case 22 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:228:7: st22= listUsersStatement
                    {
                    pushFollow(FOLLOW_listUsersStatement_in_cqlStatement569);
                    st22=listUsersStatement();

                    state._fsp--;

                     stmt = st22; 

                    }
                    break;
                case 23 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:229:7: st23= createTriggerStatement
                    {
                    pushFollow(FOLLOW_createTriggerStatement_in_cqlStatement590);
                    st23=createTriggerStatement();

                    state._fsp--;

                     stmt = st23; 

                    }
                    break;
                case 24 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:230:7: st24= dropTriggerStatement
                    {
                    pushFollow(FOLLOW_dropTriggerStatement_in_cqlStatement607);
                    st24=dropTriggerStatement();

                    state._fsp--;

                     stmt = st24; 

                    }
                    break;
                case 25 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:231:7: st25= createTypeStatement
                    {
                    pushFollow(FOLLOW_createTypeStatement_in_cqlStatement626);
                    st25=createTypeStatement();

                    state._fsp--;

                     stmt = st25; 

                    }
                    break;
                case 26 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:232:7: st26= alterTypeStatement
                    {
                    pushFollow(FOLLOW_alterTypeStatement_in_cqlStatement646);
                    st26=alterTypeStatement();

                    state._fsp--;

                     stmt = st26; 

                    }
                    break;
                case 27 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:233:7: st27= dropTypeStatement
                    {
                    pushFollow(FOLLOW_dropTypeStatement_in_cqlStatement667);
                    st27=dropTypeStatement();

                    state._fsp--;

                     stmt = st27; 

                    }
                    break;

            }
             if (stmt != null) stmt.setBoundVariables(bindVariables); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "cqlStatement"


    // $ANTLR start "useStatement"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:239:1: useStatement returns [UseStatement stmt] : K_USE ks= keyspaceName ;
    public final UseStatement useStatement() throws RecognitionException {
        UseStatement stmt = null;

        String ks = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:240:5: ( K_USE ks= keyspaceName )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:240:7: K_USE ks= keyspaceName
            {
            match(input,K_USE,FOLLOW_K_USE_in_useStatement702); 
            pushFollow(FOLLOW_keyspaceName_in_useStatement706);
            ks=keyspaceName();

            state._fsp--;

             stmt = new UseStatement(ks); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "useStatement"


    // $ANTLR start "selectStatement"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:243:1: selectStatement returns [SelectStatement.RawStatement expr] : K_SELECT ( ( K_DISTINCT )? sclause= selectClause | ( K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= cident )? ) ) K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )? ;
    public final SelectStatement.RawStatement selectStatement() throws RecognitionException {
        SelectStatement.RawStatement expr = null;

        List<RawSelector> sclause = null;

        ColumnIdentifier c = null;

        CFName cf = null;

        List<Relation> wclause = null;

        Term.Raw rows = null;



                boolean isDistinct = false;
                boolean isCount = false;
                ColumnIdentifier countAlias = null;
                Term.Raw limit = null;
                Map<ColumnIdentifier, Boolean> orderings = new LinkedHashMap<ColumnIdentifier, Boolean>();
                boolean allowFiltering = false;
            
        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:258:5: ( K_SELECT ( ( K_DISTINCT )? sclause= selectClause | ( K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= cident )? ) ) K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )? )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:258:7: K_SELECT ( ( K_DISTINCT )? sclause= selectClause | ( K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= cident )? ) ) K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )?
            {
            match(input,K_SELECT,FOLLOW_K_SELECT_in_selectStatement740); 
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:258:16: ( ( K_DISTINCT )? sclause= selectClause | ( K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= cident )? ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==K_DISTINCT||LA5_0==K_AS||(LA5_0>=K_FILTERING && LA5_0<=K_TTL)||LA5_0==K_VALUES||LA5_0==K_EXISTS||LA5_0==K_TIMESTAMP||LA5_0==K_COUNTER||LA5_0==K_STATIC||(LA5_0>=K_KEY && LA5_0<=K_CUSTOM)||LA5_0==IDENT||(LA5_0>=K_KEYS && LA5_0<=K_TRIGGER)||LA5_0==K_LIST||(LA5_0>=K_ALL && LA5_0<=QUOTED_NAME)||LA5_0==K_TOKEN||(LA5_0>=K_CONTAINS && LA5_0<=K_MAP)||LA5_0==142) ) {
                alt5=1;
            }
            else if ( (LA5_0==K_COUNT) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==139) ) {
                    alt5=2;
                }
                else if ( ((LA5_2>=K_AS && LA5_2<=K_FROM)||LA5_2==141||LA5_2==143) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:258:18: ( K_DISTINCT )? sclause= selectClause
                    {
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:258:18: ( K_DISTINCT )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==K_DISTINCT) ) {
                        int LA3_1 = input.LA(2);

                        if ( ((LA3_1>=K_DISTINCT && LA3_1<=K_COUNT)||(LA3_1>=K_FILTERING && LA3_1<=K_TTL)||LA3_1==K_VALUES||LA3_1==K_EXISTS||LA3_1==K_TIMESTAMP||LA3_1==K_COUNTER||LA3_1==K_STATIC||(LA3_1>=K_KEY && LA3_1<=K_CUSTOM)||LA3_1==IDENT||(LA3_1>=K_KEYS && LA3_1<=K_TRIGGER)||LA3_1==K_LIST||(LA3_1>=K_ALL && LA3_1<=QUOTED_NAME)||LA3_1==K_TOKEN||(LA3_1>=K_CONTAINS && LA3_1<=K_MAP)||LA3_1==142) ) {
                            alt3=1;
                        }
                        else if ( (LA3_1==K_AS) ) {
                            int LA3_4 = input.LA(3);

                            if ( (LA3_4==K_AS) ) {
                                int LA3_5 = input.LA(4);

                                if ( ((LA3_5>=K_DISTINCT && LA3_5<=K_AS)||(LA3_5>=K_FILTERING && LA3_5<=K_TTL)||LA3_5==K_VALUES||LA3_5==K_EXISTS||LA3_5==K_TIMESTAMP||LA3_5==K_COUNTER||LA3_5==K_STATIC||(LA3_5>=K_KEY && LA3_5<=K_CUSTOM)||LA3_5==IDENT||(LA3_5>=K_KEYS && LA3_5<=K_TRIGGER)||LA3_5==K_LIST||(LA3_5>=K_ALL && LA3_5<=QUOTED_NAME)||(LA3_5>=K_CONTAINS && LA3_5<=K_MAP)) ) {
                                    alt3=1;
                                }
                            }
                            else if ( (LA3_4==K_FROM||LA3_4==139||LA3_4==141||LA3_4==143) ) {
                                alt3=1;
                            }
                        }
                    }
                    switch (alt3) {
                        case 1 :
                            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:258:20: K_DISTINCT
                            {
                            match(input,K_DISTINCT,FOLLOW_K_DISTINCT_in_selectStatement746); 
                             isDistinct = true; 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_selectClause_in_selectStatement755);
                    sclause=selectClause();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:259:18: ( K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= cident )? )
                    {
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:259:18: ( K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= cident )? )
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:259:19: K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= cident )?
                    {
                    match(input,K_COUNT,FOLLOW_K_COUNT_in_selectStatement775); 
                    match(input,139,FOLLOW_139_in_selectStatement777); 
                    pushFollow(FOLLOW_selectCountClause_in_selectStatement781);
                    sclause=selectCountClause();

                    state._fsp--;

                    match(input,140,FOLLOW_140_in_selectStatement783); 
                     isCount = true; 
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:259:81: ( K_AS c= cident )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==K_AS) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:259:82: K_AS c= cident
                            {
                            match(input,K_AS,FOLLOW_K_AS_in_selectStatement788); 
                            pushFollow(FOLLOW_cident_in_selectStatement792);
                            c=cident();

                            state._fsp--;

                             countAlias = c; 

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            match(input,K_FROM,FOLLOW_K_FROM_in_selectStatement807); 
            pushFollow(FOLLOW_columnFamilyName_in_selectStatement811);
            cf=columnFamilyName();

            state._fsp--;

            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:261:7: ( K_WHERE wclause= whereClause )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==K_WHERE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:261:9: K_WHERE wclause= whereClause
                    {
                    match(input,K_WHERE,FOLLOW_K_WHERE_in_selectStatement821); 
                    pushFollow(FOLLOW_whereClause_in_selectStatement825);
                    wclause=whereClause();

                    state._fsp--;


                    }
                    break;

            }

            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:262:7: ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==K_ORDER) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:262:9: K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )*
                    {
                    match(input,K_ORDER,FOLLOW_K_ORDER_in_selectStatement838); 
                    match(input,K_BY,FOLLOW_K_BY_in_selectStatement840); 
                    pushFollow(FOLLOW_orderByClause_in_selectStatement842);
                    orderByClause(orderings);

                    state._fsp--;

                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:262:47: ( ',' orderByClause[orderings] )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==141) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:262:49: ',' orderByClause[orderings]
                    	    {
                    	    match(input,141,FOLLOW_141_in_selectStatement847); 
                    	    pushFollow(FOLLOW_orderByClause_in_selectStatement849);
                    	    orderByClause(orderings);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:263:7: ( K_LIMIT rows= intValue )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==K_LIMIT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:263:9: K_LIMIT rows= intValue
                    {
                    match(input,K_LIMIT,FOLLOW_K_LIMIT_in_selectStatement866); 
                    pushFollow(FOLLOW_intValue_in_selectStatement870);
                    rows=intValue();

                    state._fsp--;

                     limit = rows; 

                    }
                    break;

            }

            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:264:7: ( K_ALLOW K_FILTERING )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==K_ALLOW) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:264:9: K_ALLOW K_FILTERING
                    {
                    match(input,K_ALLOW,FOLLOW_K_ALLOW_in_selectStatement885); 
                    match(input,K_FILTERING,FOLLOW_K_FILTERING_in_selectStatement887); 
                     allowFiltering = true; 

                    }
                    break;

            }


                      SelectStatement.Parameters params = new SelectStatement.Parameters(orderings,
                                                                                         isDistinct,
                                                                                         isCount,
                                                                                         countAlias,
                                                                                         allowFiltering);
                      expr = new SelectStatement.RawStatement(cf, params, sclause, wclause, limit);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "selectStatement"


    // $ANTLR start "selectClause"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:275:1: selectClause returns [List<RawSelector> expr] : (t1= selector ( ',' tN= selector )* | '\\*' );
    public final List<RawSelector> selectClause() throws RecognitionException {
        List<RawSelector> expr = null;

        RawSelector t1 = null;

        RawSelector tN = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:276:5: (t1= selector ( ',' tN= selector )* | '\\*' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=K_DISTINCT && LA12_0<=K_AS)||(LA12_0>=K_FILTERING && LA12_0<=K_TTL)||LA12_0==K_VALUES||LA12_0==K_EXISTS||LA12_0==K_TIMESTAMP||LA12_0==K_COUNTER||LA12_0==K_STATIC||(LA12_0>=K_KEY && LA12_0<=K_CUSTOM)||LA12_0==IDENT||(LA12_0>=K_KEYS && LA12_0<=K_TRIGGER)||LA12_0==K_LIST||(LA12_0>=K_ALL && LA12_0<=QUOTED_NAME)||LA12_0==K_TOKEN||(LA12_0>=K_CONTAINS && LA12_0<=K_MAP)) ) {
                alt12=1;
            }
            else if ( (LA12_0==142) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:276:7: t1= selector ( ',' tN= selector )*
                    {
                    pushFollow(FOLLOW_selector_in_selectClause924);
                    t1=selector();

                    state._fsp--;

                     expr = new ArrayList<RawSelector>(); expr.add(t1); 
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:276:76: ( ',' tN= selector )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==141) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:276:77: ',' tN= selector
                    	    {
                    	    match(input,141,FOLLOW_141_in_selectClause929); 
                    	    pushFollow(FOLLOW_selector_in_selectClause933);
                    	    tN=selector();

                    	    state._fsp--;

                    	     expr.add(tN); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:277:7: '\\*'
                    {
                    match(input,142,FOLLOW_142_in_selectClause945); 
                     expr = Collections.<RawSelector>emptyList();

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "selectClause"


    // $ANTLR start "selector"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:280:1: selector returns [RawSelector s] : us= unaliasedSelector ( K_AS c= cident )? ;
    public final RawSelector selector() throws RecognitionException {
        RawSelector s = null;

        Selectable us = null;

        ColumnIdentifier c = null;


         ColumnIdentifier alias = null; 
        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:282:5: (us= unaliasedSelector ( K_AS c= cident )? )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:282:7: us= unaliasedSelector ( K_AS c= cident )?
            {
            pushFollow(FOLLOW_unaliasedSelector_in_selector978);
            us=unaliasedSelector();

            state._fsp--;

            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:282:28: ( K_AS c= cident )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==K_AS) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:282:29: K_AS c= cident
                    {
                    match(input,K_AS,FOLLOW_K_AS_in_selector981); 
                    pushFollow(FOLLOW_cident_in_selector985);
                    c=cident();

                    state._fsp--;

                     alias = c; 

                    }
                    break;

            }

             s = new RawSelector(us, alias); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return s;
    }
    // $ANTLR end "selector"


    // $ANTLR start "unaliasedSelector"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:285:1: unaliasedSelector returns [Selectable s] : (c= cident | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | f= functionName args= selectionFunctionArgs ) ( '.' fi= cident )* ;
    public final Selectable unaliasedSelector() throws RecognitionException {
        Selectable s = null;

        ColumnIdentifier c = null;

        String f = null;

        List<Selectable> args = null;

        ColumnIdentifier fi = null;


         Selectable tmp = null; 
        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:287:5: ( (c= cident | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | f= functionName args= selectionFunctionArgs ) ( '.' fi= cident )* )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:287:8: (c= cident | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | f= functionName args= selectionFunctionArgs ) ( '.' fi= cident )*
            {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:287:8: (c= cident | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | f= functionName args= selectionFunctionArgs )
            int alt14=4;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:287:10: c= cident
                    {
                    pushFollow(FOLLOW_cident_in_unaliasedSelector1026);
                    c=cident();

                    state._fsp--;

                     tmp = c; 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:288:10: K_WRITETIME '(' c= cident ')'
                    {
                    match(input,K_WRITETIME,FOLLOW_K_WRITETIME_in_unaliasedSelector1072); 
                    match(input,139,FOLLOW_139_in_unaliasedSelector1074); 
                    pushFollow(FOLLOW_cident_in_unaliasedSelector1078);
                    c=cident();

                    state._fsp--;

                    match(input,140,FOLLOW_140_in_unaliasedSelector1080); 
                     tmp = new Selectable.WritetimeOrTTL(c, true); 

                    }
                    break;
                case 3 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:289:10: K_TTL '(' c= cident ')'
                    {
                    match(input,K_TTL,FOLLOW_K_TTL_in_unaliasedSelector1106); 
                    match(input,139,FOLLOW_139_in_unaliasedSelector1114); 
                    pushFollow(FOLLOW_cident_in_unaliasedSelector1118);
                    c=cident();

                    state._fsp--;

                    match(input,140,FOLLOW_140_in_unaliasedSelector1120); 
                     tmp = new Selectable.WritetimeOrTTL(c, false); 

                    }
                    break;
                case 4 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:290:10: f= functionName args= selectionFunctionArgs
                    {
                    pushFollow(FOLLOW_functionName_in_unaliasedSelector1148);
                    f=functionName();

                    state._fsp--;

                    pushFollow(FOLLOW_selectionFunctionArgs_in_unaliasedSelector1152);
                    args=selectionFunctionArgs();

                    state._fsp--;

                     tmp = new Selectable.WithFunction(f, args); 

                    }
                    break;

            }

            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:291:10: ( '.' fi= cident )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==143) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:291:12: '.' fi= cident
            	    {
            	    match(input,143,FOLLOW_143_in_unaliasedSelector1167); 
            	    pushFollow(FOLLOW_cident_in_unaliasedSelector1171);
            	    fi=cident();

            	    state._fsp--;

            	     tmp = new Selectable.WithFieldSelection(tmp, fi); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             s = tmp; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return s;
    }
    // $ANTLR end "unaliasedSelector"


    // $ANTLR start "selectionFunctionArgs"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:294:1: selectionFunctionArgs returns [List<Selectable> a] : ( '(' ')' | '(' s1= unaliasedSelector ( ',' sn= unaliasedSelector )* ')' );
    public final List<Selectable> selectionFunctionArgs() throws RecognitionException {
        List<Selectable> a = null;

        Selectable s1 = null;

        Selectable sn = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:295:5: ( '(' ')' | '(' s1= unaliasedSelector ( ',' sn= unaliasedSelector )* ')' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==139) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==140) ) {
                    alt17=1;
                }
                else if ( ((LA17_1>=K_DISTINCT && LA17_1<=K_AS)||(LA17_1>=K_FILTERING && LA17_1<=K_TTL)||LA17_1==K_VALUES||LA17_1==K_EXISTS||LA17_1==K_TIMESTAMP||LA17_1==K_COUNTER||LA17_1==K_STATIC||(LA17_1>=K_KEY && LA17_1<=K_CUSTOM)||LA17_1==IDENT||(LA17_1>=K_KEYS && LA17_1<=K_TRIGGER)||LA17_1==K_LIST||(LA17_1>=K_ALL && LA17_1<=QUOTED_NAME)||LA17_1==K_TOKEN||(LA17_1>=K_CONTAINS && LA17_1<=K_MAP)) ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:295:7: '(' ')'
                    {
                    match(input,139,FOLLOW_139_in_selectionFunctionArgs1199); 
                    match(input,140,FOLLOW_140_in_selectionFunctionArgs1201); 
                     a = Collections.emptyList(); 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:296:7: '(' s1= unaliasedSelector ( ',' sn= unaliasedSelector )* ')'
                    {
                    match(input,139,FOLLOW_139_in_selectionFunctionArgs1211); 
                    pushFollow(FOLLOW_unaliasedSelector_in_selectionFunctionArgs1215);
                    s1=unaliasedSelector();

                    state._fsp--;

                     List<Selectable> args = new ArrayList<Selectable>(); args.add(s1); 
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:297:11: ( ',' sn= unaliasedSelector )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==141) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:297:13: ',' sn= unaliasedSelector
                    	    {
                    	    match(input,141,FOLLOW_141_in_selectionFunctionArgs1231); 
                    	    pushFollow(FOLLOW_unaliasedSelector_in_selectionFunctionArgs1235);
                    	    sn=unaliasedSelector();

                    	    state._fsp--;

                    	     args.add(sn); 

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    match(input,140,FOLLOW_140_in_selectionFunctionArgs1248); 
                     a = args; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return a;
    }
    // $ANTLR end "selectionFunctionArgs"


    // $ANTLR start "selectCountClause"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:301:1: selectCountClause returns [List<RawSelector> expr] : ( '\\*' | i= INTEGER );
    public final List<RawSelector> selectCountClause() throws RecognitionException {
        List<RawSelector> expr = null;

        Token i=null;

        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:302:5: ( '\\*' | i= INTEGER )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==142) ) {
                alt18=1;
            }
            else if ( (LA18_0==INTEGER) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:302:7: '\\*'
                    {
                    match(input,142,FOLLOW_142_in_selectCountClause1271); 
                     expr = Collections.<RawSelector>emptyList();

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:303:7: i= INTEGER
                    {
                    i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_selectCountClause1293); 
                     if (!i.getText().equals("1")) addRecognitionError("Only COUNT(1) is supported, got COUNT(" + i.getText() + ")"); expr = Collections.<RawSelector>emptyList();

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "selectCountClause"


    // $ANTLR start "whereClause"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:306:1: whereClause returns [List<Relation> clause] : relation[$clause] ( K_AND relation[$clause] )* ;
    public final List<Relation> whereClause() throws RecognitionException {
        List<Relation> clause = null;

         clause = new ArrayList<Relation>(); 
        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:308:5: ( relation[$clause] ( K_AND relation[$clause] )* )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:308:7: relation[$clause] ( K_AND relation[$clause] )*
            {
            pushFollow(FOLLOW_relation_in_whereClause1329);
            relation(clause);

            state._fsp--;

            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:308:25: ( K_AND relation[$clause] )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==K_AND) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:308:26: K_AND relation[$clause]
            	    {
            	    match(input,K_AND,FOLLOW_K_AND_in_whereClause1333); 
            	    pushFollow(FOLLOW_relation_in_whereClause1335);
            	    relation(clause);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return clause;
    }
    // $ANTLR end "whereClause"


    // $ANTLR start "orderByClause"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:311:1: orderByClause[Map<ColumnIdentifier, Boolean> orderings] : c= cident ( K_ASC | K_DESC )? ;
    public final void orderByClause(Map<ColumnIdentifier, Boolean> orderings) throws RecognitionException {
        ColumnIdentifier c = null;



                ColumnIdentifier orderBy = null;
                boolean reversed = false;
            
        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:316:5: (c= cident ( K_ASC | K_DESC )? )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:316:7: c= cident ( K_ASC | K_DESC )?
            {
            pushFollow(FOLLOW_cident_in_orderByClause1366);
            c=cident();

            state._fsp--;

             orderBy = c; 
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:316:33: ( K_ASC | K_DESC )?
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==K_ASC) ) {
                alt20=1;
            }
            else if ( (LA20_0==K_DESC) ) {
                alt20=2;
            }
            switch (alt20) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:316:34: K_ASC
                    {
                    match(input,K_ASC,FOLLOW_K_ASC_in_orderByClause1371); 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:316:42: K_DESC
                    {
                    match(input,K_DESC,FOLLOW_K_DESC_in_orderByClause1375); 
                     reversed = true; 

                    }
                    break;

            }

             orderings.put(c, reversed); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "orderByClause"


    // $ANTLR start "insertStatement"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:319:1: insertStatement returns [UpdateStatement.ParsedInsert expr] : K_INSERT K_INTO cf= columnFamilyName '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )? ;
    public final UpdateStatement.ParsedInsert insertStatement() throws RecognitionException {
        UpdateStatement.ParsedInsert expr = null;

        CFName cf = null;

        ColumnIdentifier c1 = null;

        ColumnIdentifier cn = null;

        Term.Raw v1 = null;

        Term.Raw vn = null;



                Attributes.Raw attrs = new Attributes.Raw();
                List<ColumnIdentifier> columnNames  = new ArrayList<ColumnIdentifier>();
                List<Term.Raw> values = new ArrayList<Term.Raw>();
                boolean ifNotExists = false;
            
        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:332:5: ( K_INSERT K_INTO cf= columnFamilyName '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )? )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:332:7: K_INSERT K_INTO cf= columnFamilyName '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )?
            {
            match(input,K_INSERT,FOLLOW_K_INSERT_in_insertStatement1413); 
            match(input,K_INTO,FOLLOW_K_INTO_in_insertStatement1415); 
            pushFollow(FOLLOW_columnFamilyName_in_insertStatement1419);
            cf=columnFamilyName();

            state._fsp--;

            match(input,139,FOLLOW_139_in_insertStatement1431); 
            pushFollow(FOLLOW_cident_in_insertStatement1435);
            c1=cident();

            state._fsp--;

             columnNames.add(c1); 
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:333:51: ( ',' cn= cident )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==141) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:333:53: ',' cn= cident
            	    {
            	    match(input,141,FOLLOW_141_in_insertStatement1442); 
            	    pushFollow(FOLLOW_cident_in_insertStatement1446);
            	    cn=cident();

            	    state._fsp--;

            	     columnNames.add(cn); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            match(input,140,FOLLOW_140_in_insertStatement1453); 
            match(input,K_VALUES,FOLLOW_K_VALUES_in_insertStatement1463); 
            match(input,139,FOLLOW_139_in_insertStatement1475); 
            pushFollow(FOLLOW_term_in_insertStatement1479);
            v1=term();

            state._fsp--;

             values.add(v1); 
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:335:43: ( ',' vn= term )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==141) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:335:45: ',' vn= term
            	    {
            	    match(input,141,FOLLOW_141_in_insertStatement1485); 
            	    pushFollow(FOLLOW_term_in_insertStatement1489);
            	    vn=term();

            	    state._fsp--;

            	     values.add(vn); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            match(input,140,FOLLOW_140_in_insertStatement1496); 
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:337:9: ( K_IF K_NOT K_EXISTS )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==K_IF) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:337:11: K_IF K_NOT K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_insertStatement1509); 
                    match(input,K_NOT,FOLLOW_K_NOT_in_insertStatement1511); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_insertStatement1513); 
                     ifNotExists = true; 

                    }
                    break;

            }

            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:338:9: ( usingClause[attrs] )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==K_USING) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:338:11: usingClause[attrs]
                    {
                    pushFollow(FOLLOW_usingClause_in_insertStatement1530);
                    usingClause(attrs);

                    state._fsp--;


                    }
                    break;

            }


                      expr = new UpdateStatement.ParsedInsert(cf,
                                                               attrs,
                                                               columnNames,
                                                               values,
                                                               ifNotExists);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "insertStatement"


    // $ANTLR start "usingClause"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:348:1: usingClause[Attributes.Raw attrs] : K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )* ;
    public final void usingClause(Attributes.Raw attrs) throws RecognitionException {
        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:349:5: ( K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )* )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:349:7: K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )*
            {
            match(input,K_USING,FOLLOW_K_USING_in_usingClause1560); 
            pushFollow(FOLLOW_usingClauseObjective_in_usingClause1562);
            usingClauseObjective(attrs);

            state._fsp--;

            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:349:43: ( K_AND usingClauseObjective[attrs] )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==K_AND) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:349:45: K_AND usingClauseObjective[attrs]
            	    {
            	    match(input,K_AND,FOLLOW_K_AND_in_usingClause1567); 
            	    pushFollow(FOLLOW_usingClauseObjective_in_usingClause1569);
            	    usingClauseObjective(attrs);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "usingClause"


    // $ANTLR start "usingClauseObjective"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:352:1: usingClauseObjective[Attributes.Raw attrs] : ( K_TIMESTAMP ts= intValue | K_TTL t= intValue );
    public final void usingClauseObjective(Attributes.Raw attrs) throws RecognitionException {
        Term.Raw ts = null;

        Term.Raw t = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:353:5: ( K_TIMESTAMP ts= intValue | K_TTL t= intValue )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==K_TIMESTAMP) ) {
                alt26=1;
            }
            else if ( (LA26_0==K_TTL) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:353:7: K_TIMESTAMP ts= intValue
                    {
                    match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_usingClauseObjective1591); 
                    pushFollow(FOLLOW_intValue_in_usingClauseObjective1595);
                    ts=intValue();

                    state._fsp--;

                     attrs.timestamp = ts; 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:354:7: K_TTL t= intValue
                    {
                    match(input,K_TTL,FOLLOW_K_TTL_in_usingClauseObjective1605); 
                    pushFollow(FOLLOW_intValue_in_usingClauseObjective1609);
                    t=intValue();

                    state._fsp--;

                     attrs.timeToLive = t; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "usingClauseObjective"


    // $ANTLR start "updateStatement"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:357:1: updateStatement returns [UpdateStatement.ParsedUpdate expr] : K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF conditions= updateConditions )? ;
    public final UpdateStatement.ParsedUpdate updateStatement() throws RecognitionException {
        UpdateStatement.ParsedUpdate expr = null;

        CFName cf = null;

        List<Relation> wclause = null;

        List<Pair<ColumnIdentifier, ColumnCondition.Raw>> conditions = null;



                Attributes.Raw attrs = new Attributes.Raw();
                List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations = new ArrayList<Pair<ColumnIdentifier, Operation.RawUpdate>>();
            
        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:368:5: ( K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF conditions= updateConditions )? )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:368:7: K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF conditions= updateConditions )?
            {
            match(input,K_UPDATE,FOLLOW_K_UPDATE_in_updateStatement1643); 
            pushFollow(FOLLOW_columnFamilyName_in_updateStatement1647);
            cf=columnFamilyName();

            state._fsp--;

            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:369:7: ( usingClause[attrs] )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==K_USING) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:369:9: usingClause[attrs]
                    {
                    pushFollow(FOLLOW_usingClause_in_updateStatement1657);
                    usingClause(attrs);

                    state._fsp--;


                    }
                    break;

            }

            match(input,K_SET,FOLLOW_K_SET_in_updateStatement1669); 
            pushFollow(FOLLOW_columnOperation_in_updateStatement1671);
            columnOperation(operations);

            state._fsp--;

            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:370:41: ( ',' columnOperation[operations] )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==141) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:370:42: ',' columnOperation[operations]
            	    {
            	    match(input,141,FOLLOW_141_in_updateStatement1675); 
            	    pushFollow(FOLLOW_columnOperation_in_updateStatement1677);
            	    columnOperation(operations);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            match(input,K_WHERE,FOLLOW_K_WHERE_in_updateStatement1688); 
            pushFollow(FOLLOW_whereClause_in_updateStatement1692);
            wclause=whereClause();

            state._fsp--;

            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:372:7: ( K_IF conditions= updateConditions )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==K_IF) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:372:9: K_IF conditions= updateConditions
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_updateStatement1702); 
                    pushFollow(FOLLOW_updateConditions_in_updateStatement1706);
                    conditions=updateConditions();

                    state._fsp--;


                    }
                    break;

            }


                      return new UpdateStatement.ParsedUpdate(cf,
                                                              attrs,
                                                              operations,
                                                              wclause,
                                                              conditions == null ? Collections.<Pair<ColumnIdentifier, ColumnCondition.Raw>>emptyList() : conditions);
                 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "updateStatement"


    // $ANTLR start "updateConditions"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:382:1: updateConditions returns [List<Pair<ColumnIdentifier, ColumnCondition.Raw>> conditions] : columnCondition[conditions] ( K_AND columnCondition[conditions] )* ;
    public final List<Pair<ColumnIdentifier, ColumnCondition.Raw>> updateConditions() throws RecognitionException {
        List<Pair<ColumnIdentifier, ColumnCondition.Raw>> conditions = null;

         conditions = new ArrayList<Pair<ColumnIdentifier, ColumnCondition.Raw>>(); 
        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:384:5: ( columnCondition[conditions] ( K_AND columnCondition[conditions] )* )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:384:7: columnCondition[conditions] ( K_AND columnCondition[conditions] )*
            {
            pushFollow(FOLLOW_columnCondition_in_updateConditions1747);
            columnCondition(conditions);

            state._fsp--;

            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:384:35: ( K_AND columnCondition[conditions] )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==K_AND) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:384:37: K_AND columnCondition[conditions]
            	    {
            	    match(input,K_AND,FOLLOW_K_AND_in_updateConditions1752); 
            	    pushFollow(FOLLOW_columnCondition_in_updateConditions1754);
            	    columnCondition(conditions);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return conditions;
    }
    // $ANTLR end "updateConditions"


    // $ANTLR start "deleteStatement"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:388:1: deleteStatement returns [DeleteStatement.Parsed expr] : K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF ( K_EXISTS | conditions= updateConditions ) )? ;
    public final DeleteStatement.Parsed deleteStatement() throws RecognitionException {
        DeleteStatement.Parsed expr = null;

        List<Operation.RawDeletion> dels = null;

        CFName cf = null;

        List<Relation> wclause = null;

        List<Pair<ColumnIdentifier, ColumnCondition.Raw>> conditions = null;



                Attributes.Raw attrs = new Attributes.Raw();
                List<Operation.RawDeletion> columnDeletions = Collections.emptyList();
                boolean ifExists = false;
            
        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:401:5: ( K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF ( K_EXISTS | conditions= updateConditions ) )? )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:401:7: K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF ( K_EXISTS | conditions= updateConditions ) )?
            {
            match(input,K_DELETE,FOLLOW_K_DELETE_in_deleteStatement1791); 
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:401:16: (dels= deleteSelection )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=K_DISTINCT && LA31_0<=K_AS)||(LA31_0>=K_FILTERING && LA31_0<=K_TTL)||LA31_0==K_VALUES||LA31_0==K_EXISTS||LA31_0==K_TIMESTAMP||LA31_0==K_COUNTER||LA31_0==K_STATIC||(LA31_0>=K_KEY && LA31_0<=K_CUSTOM)||LA31_0==IDENT||(LA31_0>=K_KEYS && LA31_0<=K_TRIGGER)||LA31_0==K_LIST||(LA31_0>=K_ALL && LA31_0<=QUOTED_NAME)||(LA31_0>=K_CONTAINS && LA31_0<=K_MAP)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:401:18: dels= deleteSelection
                    {
                    pushFollow(FOLLOW_deleteSelection_in_deleteStatement1797);
                    dels=deleteSelection();

                    state._fsp--;

                     columnDeletions = dels; 

                    }
                    break;

            }

            match(input,K_FROM,FOLLOW_K_FROM_in_deleteStatement1810); 
            pushFollow(FOLLOW_columnFamilyName_in_deleteStatement1814);
            cf=columnFamilyName();

            state._fsp--;

            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:403:7: ( usingClauseDelete[attrs] )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==K_USING) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:403:9: usingClauseDelete[attrs]
                    {
                    pushFollow(FOLLOW_usingClauseDelete_in_deleteStatement1824);
                    usingClauseDelete(attrs);

                    state._fsp--;


                    }
                    break;

            }

            match(input,K_WHERE,FOLLOW_K_WHERE_in_deleteStatement1836); 
            pushFollow(FOLLOW_whereClause_in_deleteStatement1840);
            wclause=whereClause();

            state._fsp--;

            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:405:7: ( K_IF ( K_EXISTS | conditions= updateConditions ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==K_IF) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:405:9: K_IF ( K_EXISTS | conditions= updateConditions )
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_deleteStatement1850); 
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:405:14: ( K_EXISTS | conditions= updateConditions )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==K_EXISTS) ) {
                        int LA33_1 = input.LA(2);

                        if ( (LA33_1==144||LA33_1==150) ) {
                            alt33=2;
                        }
                        else if ( (LA33_1==EOF||LA33_1==K_INSERT||LA33_1==K_UPDATE||LA33_1==K_DELETE||LA33_1==K_APPLY||LA33_1==138) ) {
                            alt33=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( ((LA33_0>=K_DISTINCT && LA33_0<=K_AS)||(LA33_0>=K_FILTERING && LA33_0<=K_TTL)||LA33_0==K_VALUES||LA33_0==K_TIMESTAMP||LA33_0==K_COUNTER||LA33_0==K_STATIC||(LA33_0>=K_KEY && LA33_0<=K_CUSTOM)||LA33_0==IDENT||(LA33_0>=K_KEYS && LA33_0<=K_TRIGGER)||LA33_0==K_LIST||(LA33_0>=K_ALL && LA33_0<=QUOTED_NAME)||(LA33_0>=K_CONTAINS && LA33_0<=K_MAP)) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:405:16: K_EXISTS
                            {
                            match(input,K_EXISTS,FOLLOW_K_EXISTS_in_deleteStatement1854); 
                             ifExists = true; 

                            }
                            break;
                        case 2 :
                            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:405:48: conditions= updateConditions
                            {
                            pushFollow(FOLLOW_updateConditions_in_deleteStatement1862);
                            conditions=updateConditions();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


                      return new DeleteStatement.Parsed(cf,
                                                        attrs,
                                                        columnDeletions,
                                                        wclause,
                                                        conditions == null ? Collections.<Pair<ColumnIdentifier, ColumnCondition.Raw>>emptyList() : conditions,
                                                        ifExists);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "deleteStatement"


    // $ANTLR start "deleteSelection"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:416:1: deleteSelection returns [List<Operation.RawDeletion> operations] : t1= deleteOp ( ',' tN= deleteOp )* ;
    public final List<Operation.RawDeletion> deleteSelection() throws RecognitionException {
        List<Operation.RawDeletion> operations = null;

        Operation.RawDeletion t1 = null;

        Operation.RawDeletion tN = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:417:5: (t1= deleteOp ( ',' tN= deleteOp )* )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:417:7: t1= deleteOp ( ',' tN= deleteOp )*
            {
             operations = new ArrayList<Operation.RawDeletion>(); 
            pushFollow(FOLLOW_deleteOp_in_deleteSelection1909);
            t1=deleteOp();

            state._fsp--;

             operations.add(t1); 
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:419:11: ( ',' tN= deleteOp )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==141) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:419:12: ',' tN= deleteOp
            	    {
            	    match(input,141,FOLLOW_141_in_deleteSelection1924); 
            	    pushFollow(FOLLOW_deleteOp_in_deleteSelection1928);
            	    tN=deleteOp();

            	    state._fsp--;

            	     operations.add(tN); 

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return operations;
    }
    // $ANTLR end "deleteSelection"


    // $ANTLR start "deleteOp"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:422:1: deleteOp returns [Operation.RawDeletion op] : (c= cident | c= cident '[' t= term ']' );
    public final Operation.RawDeletion deleteOp() throws RecognitionException {
        Operation.RawDeletion op = null;

        ColumnIdentifier c = null;

        Term.Raw t = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:423:5: (c= cident | c= cident '[' t= term ']' )
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:423:7: c= cident
                    {
                    pushFollow(FOLLOW_cident_in_deleteOp1955);
                    c=cident();

                    state._fsp--;

                     op = new Operation.ColumnDeletion(c); 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:424:7: c= cident '[' t= term ']'
                    {
                    pushFollow(FOLLOW_cident_in_deleteOp1982);
                    c=cident();

                    state._fsp--;

                    match(input,144,FOLLOW_144_in_deleteOp1984); 
                    pushFollow(FOLLOW_term_in_deleteOp1988);
                    t=term();

                    state._fsp--;

                    match(input,145,FOLLOW_145_in_deleteOp1990); 
                     op = new Operation.ElementDeletion(c, t); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return op;
    }
    // $ANTLR end "deleteOp"


    // $ANTLR start "usingClauseDelete"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:427:1: usingClauseDelete[Attributes.Raw attrs] : K_USING K_TIMESTAMP ts= intValue ;
    public final void usingClauseDelete(Attributes.Raw attrs) throws RecognitionException {
        Term.Raw ts = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:428:5: ( K_USING K_TIMESTAMP ts= intValue )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:428:7: K_USING K_TIMESTAMP ts= intValue
            {
            match(input,K_USING,FOLLOW_K_USING_in_usingClauseDelete2010); 
            match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_usingClauseDelete2012); 
            pushFollow(FOLLOW_intValue_in_usingClauseDelete2016);
            ts=intValue();

            state._fsp--;

             attrs.timestamp = ts; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "usingClauseDelete"


    // $ANTLR start "batchStatement"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:431:1: batchStatement returns [BatchStatement.Parsed expr] : K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH ;
    public final BatchStatement.Parsed batchStatement() throws RecognitionException {
        BatchStatement.Parsed expr = null;

        ModificationStatement.Parsed s = null;



                BatchStatement.Type type = BatchStatement.Type.LOGGED;
                List<ModificationStatement.Parsed> statements = new ArrayList<ModificationStatement.Parsed>();
                Attributes.Raw attrs = new Attributes.Raw();
            
        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:461:5: ( K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:461:7: K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH
            {
            match(input,K_BEGIN,FOLLOW_K_BEGIN_in_batchStatement2050); 
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:462:7: ( K_UNLOGGED | K_COUNTER )?
            int alt37=3;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==K_UNLOGGED) ) {
                alt37=1;
            }
            else if ( (LA37_0==K_COUNTER) ) {
                alt37=2;
            }
            switch (alt37) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:462:9: K_UNLOGGED
                    {
                    match(input,K_UNLOGGED,FOLLOW_K_UNLOGGED_in_batchStatement2060); 
                     type = BatchStatement.Type.UNLOGGED; 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:462:63: K_COUNTER
                    {
                    match(input,K_COUNTER,FOLLOW_K_COUNTER_in_batchStatement2066); 
                     type = BatchStatement.Type.COUNTER; 

                    }
                    break;

            }

            match(input,K_BATCH,FOLLOW_K_BATCH_in_batchStatement2079); 
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:463:15: ( usingClause[attrs] )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==K_USING) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:463:17: usingClause[attrs]
                    {
                    pushFollow(FOLLOW_usingClause_in_batchStatement2083);
                    usingClause(attrs);

                    state._fsp--;


                    }
                    break;

            }

            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:464:11: (s= batchStatementObjective ( ';' )? )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==K_INSERT||LA40_0==K_UPDATE||LA40_0==K_DELETE) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:464:13: s= batchStatementObjective ( ';' )?
            	    {
            	    pushFollow(FOLLOW_batchStatementObjective_in_batchStatement2103);
            	    s=batchStatementObjective();

            	    state._fsp--;

            	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:464:39: ( ';' )?
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==138) ) {
            	        alt39=1;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:464:39: ';'
            	            {
            	            match(input,138,FOLLOW_138_in_batchStatement2105); 

            	            }
            	            break;

            	    }

            	     statements.add(s); 

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            match(input,K_APPLY,FOLLOW_K_APPLY_in_batchStatement2119); 
            match(input,K_BATCH,FOLLOW_K_BATCH_in_batchStatement2121); 

                      return new BatchStatement.Parsed(type, attrs, statements);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "batchStatement"


    // $ANTLR start "batchStatementObjective"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:471:1: batchStatementObjective returns [ModificationStatement.Parsed statement] : (i= insertStatement | u= updateStatement | d= deleteStatement );
    public final ModificationStatement.Parsed batchStatementObjective() throws RecognitionException {
        ModificationStatement.Parsed statement = null;

        UpdateStatement.ParsedInsert i = null;

        UpdateStatement.ParsedUpdate u = null;

        DeleteStatement.Parsed d = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:472:5: (i= insertStatement | u= updateStatement | d= deleteStatement )
            int alt41=3;
            switch ( input.LA(1) ) {
            case K_INSERT:
                {
                alt41=1;
                }
                break;
            case K_UPDATE:
                {
                alt41=2;
                }
                break;
            case K_DELETE:
                {
                alt41=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:472:7: i= insertStatement
                    {
                    pushFollow(FOLLOW_insertStatement_in_batchStatementObjective2152);
                    i=insertStatement();

                    state._fsp--;

                     statement = i; 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:473:7: u= updateStatement
                    {
                    pushFollow(FOLLOW_updateStatement_in_batchStatementObjective2165);
                    u=updateStatement();

                    state._fsp--;

                     statement = u; 

                    }
                    break;
                case 3 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:474:7: d= deleteStatement
                    {
                    pushFollow(FOLLOW_deleteStatement_in_batchStatementObjective2178);
                    d=deleteStatement();

                    state._fsp--;

                     statement = d; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return statement;
    }
    // $ANTLR end "batchStatementObjective"


    // $ANTLR start "createKeyspaceStatement"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:477:1: createKeyspaceStatement returns [CreateKeyspaceStatement expr] : K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs] ;
    public final CreateKeyspaceStatement createKeyspaceStatement() throws RecognitionException {
        CreateKeyspaceStatement expr = null;

        String ks = null;



                KSPropDefs attrs = new KSPropDefs();
                boolean ifNotExists = false;
            
        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:485:5: ( K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs] )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:485:7: K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs]
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createKeyspaceStatement2213); 
            match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_createKeyspaceStatement2215); 
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:485:27: ( K_IF K_NOT K_EXISTS )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==K_IF) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:485:28: K_IF K_NOT K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_createKeyspaceStatement2218); 
                    match(input,K_NOT,FOLLOW_K_NOT_in_createKeyspaceStatement2220); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createKeyspaceStatement2222); 
                     ifNotExists = true; 

                    }
                    break;

            }

            pushFollow(FOLLOW_keyspaceName_in_createKeyspaceStatement2231);
            ks=keyspaceName();

            state._fsp--;

            match(input,K_WITH,FOLLOW_K_WITH_in_createKeyspaceStatement2239); 
            pushFollow(FOLLOW_properties_in_createKeyspaceStatement2241);
            properties(attrs);

            state._fsp--;

             expr = new CreateKeyspaceStatement(ks, attrs, ifNotExists); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "createKeyspaceStatement"


    // $ANTLR start "createTableStatement"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:489:1: createTableStatement returns [CreateTableStatement.RawStatement expr] : K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName cfamDefinition[expr] ;
    public final CreateTableStatement.RawStatement createTableStatement() throws RecognitionException {
        CreateTableStatement.RawStatement expr = null;

        CFName cf = null;


         boolean ifNotExists = false; 
        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:498:5: ( K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName cfamDefinition[expr] )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:498:7: K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName cfamDefinition[expr]
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createTableStatement2276); 
            match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_createTableStatement2278); 
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:498:31: ( K_IF K_NOT K_EXISTS )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==K_IF) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:498:32: K_IF K_NOT K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_createTableStatement2281); 
                    match(input,K_NOT,FOLLOW_K_NOT_in_createTableStatement2283); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createTableStatement2285); 
                     ifNotExists = true; 

                    }
                    break;

            }

            pushFollow(FOLLOW_columnFamilyName_in_createTableStatement2300);
            cf=columnFamilyName();

            state._fsp--;

             expr = new CreateTableStatement.RawStatement(cf, ifNotExists); 
            pushFollow(FOLLOW_cfamDefinition_in_createTableStatement2310);
            cfamDefinition(expr);

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "createTableStatement"


    // $ANTLR start "cfamDefinition"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:503:1: cfamDefinition[CreateTableStatement.RawStatement expr] : '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )* )? ;
    public final void cfamDefinition(CreateTableStatement.RawStatement expr) throws RecognitionException {
        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:504:5: ( '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )* )? )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:504:7: '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )* )?
            {
            match(input,139,FOLLOW_139_in_cfamDefinition2329); 
            pushFollow(FOLLOW_cfamColumns_in_cfamDefinition2331);
            cfamColumns(expr);

            state._fsp--;

            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:504:29: ( ',' ( cfamColumns[expr] )? )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==141) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:504:31: ',' ( cfamColumns[expr] )?
            	    {
            	    match(input,141,FOLLOW_141_in_cfamDefinition2336); 
            	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:504:35: ( cfamColumns[expr] )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( ((LA44_0>=K_DISTINCT && LA44_0<=K_AS)||(LA44_0>=K_FILTERING && LA44_0<=K_TTL)||LA44_0==K_VALUES||LA44_0==K_EXISTS||LA44_0==K_TIMESTAMP||LA44_0==K_COUNTER||(LA44_0>=K_STATIC && LA44_0<=K_CUSTOM)||LA44_0==IDENT||(LA44_0>=K_KEYS && LA44_0<=K_TRIGGER)||LA44_0==K_LIST||(LA44_0>=K_ALL && LA44_0<=QUOTED_NAME)||(LA44_0>=K_CONTAINS && LA44_0<=K_MAP)) ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:504:35: cfamColumns[expr]
            	            {
            	            pushFollow(FOLLOW_cfamColumns_in_cfamDefinition2338);
            	            cfamColumns(expr);

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            match(input,140,FOLLOW_140_in_cfamDefinition2345); 
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:505:7: ( K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==K_WITH) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:505:9: K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )*
                    {
                    match(input,K_WITH,FOLLOW_K_WITH_in_cfamDefinition2355); 
                    pushFollow(FOLLOW_cfamProperty_in_cfamDefinition2357);
                    cfamProperty(expr);

                    state._fsp--;

                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:505:35: ( K_AND cfamProperty[expr] )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==K_AND) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:505:37: K_AND cfamProperty[expr]
                    	    {
                    	    match(input,K_AND,FOLLOW_K_AND_in_cfamDefinition2362); 
                    	    pushFollow(FOLLOW_cfamProperty_in_cfamDefinition2364);
                    	    cfamProperty(expr);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cfamDefinition"


    // $ANTLR start "cfamColumns"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:508:1: cfamColumns[CreateTableStatement.RawStatement expr] : (k= cident v= comparatorType ( K_STATIC )? ( K_PRIMARY K_KEY )? | K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= cident )* ')' );
    public final void cfamColumns(CreateTableStatement.RawStatement expr) throws RecognitionException {
        ColumnIdentifier k = null;

        CQL3Type.Raw v = null;

        ColumnIdentifier c = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:509:5: (k= cident v= comparatorType ( K_STATIC )? ( K_PRIMARY K_KEY )? | K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= cident )* ')' )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=K_DISTINCT && LA51_0<=K_AS)||(LA51_0>=K_FILTERING && LA51_0<=K_TTL)||LA51_0==K_VALUES||LA51_0==K_EXISTS||LA51_0==K_TIMESTAMP||LA51_0==K_COUNTER||LA51_0==K_STATIC||(LA51_0>=K_KEY && LA51_0<=K_CUSTOM)||LA51_0==IDENT||(LA51_0>=K_KEYS && LA51_0<=K_TRIGGER)||LA51_0==K_LIST||(LA51_0>=K_ALL && LA51_0<=QUOTED_NAME)||(LA51_0>=K_CONTAINS && LA51_0<=K_MAP)) ) {
                alt51=1;
            }
            else if ( (LA51_0==K_PRIMARY) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:509:7: k= cident v= comparatorType ( K_STATIC )? ( K_PRIMARY K_KEY )?
                    {
                    pushFollow(FOLLOW_cident_in_cfamColumns2390);
                    k=cident();

                    state._fsp--;

                    pushFollow(FOLLOW_comparatorType_in_cfamColumns2394);
                    v=comparatorType();

                    state._fsp--;

                     boolean isStatic=false; 
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:509:61: ( K_STATIC )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==K_STATIC) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:509:62: K_STATIC
                            {
                            match(input,K_STATIC,FOLLOW_K_STATIC_in_cfamColumns2399); 
                            isStatic = true;

                            }
                            break;

                    }

                     expr.addDefinition(k, v, isStatic); 
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:510:9: ( K_PRIMARY K_KEY )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==K_PRIMARY) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:510:10: K_PRIMARY K_KEY
                            {
                            match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_cfamColumns2416); 
                            match(input,K_KEY,FOLLOW_K_KEY_in_cfamColumns2418); 
                             expr.addKeyAliases(Collections.singletonList(k)); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:511:7: K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= cident )* ')'
                    {
                    match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_cfamColumns2430); 
                    match(input,K_KEY,FOLLOW_K_KEY_in_cfamColumns2432); 
                    match(input,139,FOLLOW_139_in_cfamColumns2434); 
                    pushFollow(FOLLOW_pkDef_in_cfamColumns2436);
                    pkDef(expr);

                    state._fsp--;

                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:511:39: ( ',' c= cident )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==141) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:511:40: ',' c= cident
                    	    {
                    	    match(input,141,FOLLOW_141_in_cfamColumns2440); 
                    	    pushFollow(FOLLOW_cident_in_cfamColumns2444);
                    	    c=cident();

                    	    state._fsp--;

                    	     expr.addColumnAlias(c); 

                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    match(input,140,FOLLOW_140_in_cfamColumns2451); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cfamColumns"


    // $ANTLR start "pkDef"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:514:1: pkDef[CreateTableStatement.RawStatement expr] : (k= cident | '(' k1= cident ( ',' kn= cident )* ')' );
    public final void pkDef(CreateTableStatement.RawStatement expr) throws RecognitionException {
        ColumnIdentifier k = null;

        ColumnIdentifier k1 = null;

        ColumnIdentifier kn = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:515:5: (k= cident | '(' k1= cident ( ',' kn= cident )* ')' )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=K_DISTINCT && LA53_0<=K_AS)||(LA53_0>=K_FILTERING && LA53_0<=K_TTL)||LA53_0==K_VALUES||LA53_0==K_EXISTS||LA53_0==K_TIMESTAMP||LA53_0==K_COUNTER||LA53_0==K_STATIC||(LA53_0>=K_KEY && LA53_0<=K_CUSTOM)||LA53_0==IDENT||(LA53_0>=K_KEYS && LA53_0<=K_TRIGGER)||LA53_0==K_LIST||(LA53_0>=K_ALL && LA53_0<=QUOTED_NAME)||(LA53_0>=K_CONTAINS && LA53_0<=K_MAP)) ) {
                alt53=1;
            }
            else if ( (LA53_0==139) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:515:7: k= cident
                    {
                    pushFollow(FOLLOW_cident_in_pkDef2471);
                    k=cident();

                    state._fsp--;

                     expr.addKeyAliases(Collections.singletonList(k)); 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:516:7: '(' k1= cident ( ',' kn= cident )* ')'
                    {
                    match(input,139,FOLLOW_139_in_pkDef2481); 
                     List<ColumnIdentifier> l = new ArrayList<ColumnIdentifier>(); 
                    pushFollow(FOLLOW_cident_in_pkDef2487);
                    k1=cident();

                    state._fsp--;

                     l.add(k1); 
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:516:102: ( ',' kn= cident )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==141) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:516:104: ',' kn= cident
                    	    {
                    	    match(input,141,FOLLOW_141_in_pkDef2493); 
                    	    pushFollow(FOLLOW_cident_in_pkDef2497);
                    	    kn=cident();

                    	    state._fsp--;

                    	     l.add(kn); 

                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    match(input,140,FOLLOW_140_in_pkDef2504); 
                     expr.addKeyAliases(l); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "pkDef"


    // $ANTLR start "cfamProperty"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:519:1: cfamProperty[CreateTableStatement.RawStatement expr] : ( property[expr.properties] | K_COMPACT K_STORAGE | K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[expr] ( ',' cfamOrdering[expr] )* ')' );
    public final void cfamProperty(CreateTableStatement.RawStatement expr) throws RecognitionException {
        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:520:5: ( property[expr.properties] | K_COMPACT K_STORAGE | K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[expr] ( ',' cfamOrdering[expr] )* ')' )
            int alt55=3;
            switch ( input.LA(1) ) {
            case K_DISTINCT:
            case K_COUNT:
            case K_AS:
            case K_FILTERING:
            case K_WRITETIME:
            case K_TTL:
            case K_VALUES:
            case K_EXISTS:
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_STATIC:
            case K_KEY:
            case K_STORAGE:
            case K_TYPE:
            case K_CUSTOM:
            case IDENT:
            case K_KEYS:
            case K_TRIGGER:
            case K_LIST:
            case K_ALL:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case QUOTED_NAME:
            case K_CONTAINS:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt55=1;
                }
                break;
            case K_COMPACT:
                {
                int LA55_2 = input.LA(2);

                if ( (LA55_2==K_STORAGE) ) {
                    alt55=2;
                }
                else if ( (LA55_2==150) ) {
                    alt55=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 2, input);

                    throw nvae;
                }
                }
                break;
            case K_CLUSTERING:
                {
                int LA55_3 = input.LA(2);

                if ( (LA55_3==K_ORDER) ) {
                    alt55=3;
                }
                else if ( (LA55_3==150) ) {
                    alt55=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:520:7: property[expr.properties]
                    {
                    pushFollow(FOLLOW_property_in_cfamProperty2524);
                    property(expr.properties);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:521:7: K_COMPACT K_STORAGE
                    {
                    match(input,K_COMPACT,FOLLOW_K_COMPACT_in_cfamProperty2533); 
                    match(input,K_STORAGE,FOLLOW_K_STORAGE_in_cfamProperty2535); 
                     expr.setCompactStorage(); 

                    }
                    break;
                case 3 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:522:7: K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[expr] ( ',' cfamOrdering[expr] )* ')'
                    {
                    match(input,K_CLUSTERING,FOLLOW_K_CLUSTERING_in_cfamProperty2545); 
                    match(input,K_ORDER,FOLLOW_K_ORDER_in_cfamProperty2547); 
                    match(input,K_BY,FOLLOW_K_BY_in_cfamProperty2549); 
                    match(input,139,FOLLOW_139_in_cfamProperty2551); 
                    pushFollow(FOLLOW_cfamOrdering_in_cfamProperty2553);
                    cfamOrdering(expr);

                    state._fsp--;

                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:522:56: ( ',' cfamOrdering[expr] )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==141) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:522:57: ',' cfamOrdering[expr]
                    	    {
                    	    match(input,141,FOLLOW_141_in_cfamProperty2557); 
                    	    pushFollow(FOLLOW_cfamOrdering_in_cfamProperty2559);
                    	    cfamOrdering(expr);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    match(input,140,FOLLOW_140_in_cfamProperty2564); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cfamProperty"


    // $ANTLR start "cfamOrdering"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:525:1: cfamOrdering[CreateTableStatement.RawStatement expr] : k= cident ( K_ASC | K_DESC ) ;
    public final void cfamOrdering(CreateTableStatement.RawStatement expr) throws RecognitionException {
        ColumnIdentifier k = null;


         boolean reversed=false; 
        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:527:5: (k= cident ( K_ASC | K_DESC ) )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:527:7: k= cident ( K_ASC | K_DESC )
            {
            pushFollow(FOLLOW_cident_in_cfamOrdering2592);
            k=cident();

            state._fsp--;

            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:527:16: ( K_ASC | K_DESC )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==K_ASC) ) {
                alt56=1;
            }
            else if ( (LA56_0==K_DESC) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:527:17: K_ASC
                    {
                    match(input,K_ASC,FOLLOW_K_ASC_in_cfamOrdering2595); 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:527:25: K_DESC
                    {
                    match(input,K_DESC,FOLLOW_K_DESC_in_cfamOrdering2599); 
                     reversed=true;

                    }
                    break;

            }

             expr.setOrdering(k, reversed); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cfamOrdering"


    // $ANTLR start "createTypeStatement"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:531:1: createTypeStatement returns [CreateTypeStatement expr] : K_CREATE K_TYPE ( K_IF K_NOT K_EXISTS )? tn= userTypeName '(' typeColumns[expr] ( ',' ( typeColumns[expr] )? )* ')' ;
    public final CreateTypeStatement createTypeStatement() throws RecognitionException {
        CreateTypeStatement expr = null;

        UTName tn = null;


         boolean ifNotExists = false; 
        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:540:5: ( K_CREATE K_TYPE ( K_IF K_NOT K_EXISTS )? tn= userTypeName '(' typeColumns[expr] ( ',' ( typeColumns[expr] )? )* ')' )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:540:7: K_CREATE K_TYPE ( K_IF K_NOT K_EXISTS )? tn= userTypeName '(' typeColumns[expr] ( ',' ( typeColumns[expr] )? )* ')'
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createTypeStatement2638); 
            match(input,K_TYPE,FOLLOW_K_TYPE_in_createTypeStatement2640); 
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:540:23: ( K_IF K_NOT K_EXISTS )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==K_IF) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:540:24: K_IF K_NOT K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_createTypeStatement2643); 
                    match(input,K_NOT,FOLLOW_K_NOT_in_createTypeStatement2645); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createTypeStatement2647); 
                     ifNotExists = true; 

                    }
                    break;

            }

            pushFollow(FOLLOW_userTypeName_in_createTypeStatement2665);
            tn=userTypeName();

            state._fsp--;

             expr = new CreateTypeStatement(tn, ifNotExists); 
            match(input,139,FOLLOW_139_in_createTypeStatement2678); 
            pushFollow(FOLLOW_typeColumns_in_createTypeStatement2680);
            typeColumns(expr);

            state._fsp--;

            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:542:32: ( ',' ( typeColumns[expr] )? )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==141) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:542:34: ',' ( typeColumns[expr] )?
            	    {
            	    match(input,141,FOLLOW_141_in_createTypeStatement2685); 
            	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:542:38: ( typeColumns[expr] )?
            	    int alt58=2;
            	    int LA58_0 = input.LA(1);

            	    if ( ((LA58_0>=K_DISTINCT && LA58_0<=K_AS)||(LA58_0>=K_FILTERING && LA58_0<=K_TTL)||LA58_0==K_VALUES||LA58_0==K_EXISTS||LA58_0==K_TIMESTAMP||LA58_0==K_COUNTER||LA58_0==K_STATIC||(LA58_0>=K_KEY && LA58_0<=K_CUSTOM)||LA58_0==IDENT||(LA58_0>=K_KEYS && LA58_0<=K_TRIGGER)||LA58_0==K_LIST||(LA58_0>=K_ALL && LA58_0<=QUOTED_NAME)||(LA58_0>=K_CONTAINS && LA58_0<=K_MAP)) ) {
            	        alt58=1;
            	    }
            	    switch (alt58) {
            	        case 1 :
            	            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:542:38: typeColumns[expr]
            	            {
            	            pushFollow(FOLLOW_typeColumns_in_createTypeStatement2687);
            	            typeColumns(expr);

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            match(input,140,FOLLOW_140_in_createTypeStatement2694); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "createTypeStatement"


    // $ANTLR start "typeColumns"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:545:1: typeColumns[CreateTypeStatement expr] : k= cident v= comparatorType ;
    public final void typeColumns(CreateTypeStatement expr) throws RecognitionException {
        ColumnIdentifier k = null;

        CQL3Type.Raw v = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:546:5: (k= cident v= comparatorType )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:546:7: k= cident v= comparatorType
            {
            pushFollow(FOLLOW_cident_in_typeColumns2714);
            k=cident();

            state._fsp--;

            pushFollow(FOLLOW_comparatorType_in_typeColumns2718);
            v=comparatorType();

            state._fsp--;

             expr.addDefinition(k, v); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "typeColumns"


    // $ANTLR start "createIndexStatement"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:550:1: createIndexStatement returns [CreateIndexStatement expr] : K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? (idxName= IDENT )? K_ON cf= columnFamilyName '(' id= indexIdent ')' ( K_USING cls= STRING_LITERAL )? ( K_WITH properties[props] )? ;
    public final CreateIndexStatement createIndexStatement() throws RecognitionException {
        CreateIndexStatement expr = null;

        Token idxName=null;
        Token cls=null;
        CFName cf = null;

        IndexTarget id = null;



                IndexPropDefs props = new IndexPropDefs();
                boolean ifNotExists = false;
            
        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:559:5: ( K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? (idxName= IDENT )? K_ON cf= columnFamilyName '(' id= indexIdent ')' ( K_USING cls= STRING_LITERAL )? ( K_WITH properties[props] )? )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:559:7: K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? (idxName= IDENT )? K_ON cf= columnFamilyName '(' id= indexIdent ')' ( K_USING cls= STRING_LITERAL )? ( K_WITH properties[props] )?
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createIndexStatement2753); 
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:559:16: ( K_CUSTOM )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==K_CUSTOM) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:559:17: K_CUSTOM
                    {
                    match(input,K_CUSTOM,FOLLOW_K_CUSTOM_in_createIndexStatement2756); 
                     props.isCustom = true; 

                    }
                    break;

            }

            match(input,K_INDEX,FOLLOW_K_INDEX_in_createIndexStatement2762); 
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:559:63: ( K_IF K_NOT K_EXISTS )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==K_IF) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:559:64: K_IF K_NOT K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_createIndexStatement2765); 
                    match(input,K_NOT,FOLLOW_K_NOT_in_createIndexStatement2767); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createIndexStatement2769); 
                     ifNotExists = true; 

                    }
                    break;

            }

            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:560:9: (idxName= IDENT )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==IDENT) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:560:10: idxName= IDENT
                    {
                    idxName=(Token)match(input,IDENT,FOLLOW_IDENT_in_createIndexStatement2787); 

                    }
                    break;

            }

            match(input,K_ON,FOLLOW_K_ON_in_createIndexStatement2791); 
            pushFollow(FOLLOW_columnFamilyName_in_createIndexStatement2795);
            cf=columnFamilyName();

            state._fsp--;

            match(input,139,FOLLOW_139_in_createIndexStatement2797); 
            pushFollow(FOLLOW_indexIdent_in_createIndexStatement2801);
            id=indexIdent();

            state._fsp--;

            match(input,140,FOLLOW_140_in_createIndexStatement2803); 
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:561:9: ( K_USING cls= STRING_LITERAL )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==K_USING) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:561:10: K_USING cls= STRING_LITERAL
                    {
                    match(input,K_USING,FOLLOW_K_USING_in_createIndexStatement2814); 
                    cls=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_createIndexStatement2818); 
                     props.customClass = (cls!=null?cls.getText():null); 

                    }
                    break;

            }

            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:562:9: ( K_WITH properties[props] )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==K_WITH) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:562:10: K_WITH properties[props]
                    {
                    match(input,K_WITH,FOLLOW_K_WITH_in_createIndexStatement2833); 
                    pushFollow(FOLLOW_properties_in_createIndexStatement2835);
                    properties(props);

                    state._fsp--;


                    }
                    break;

            }

             expr = new CreateIndexStatement(cf, (idxName!=null?idxName.getText():null), id, props, ifNotExists); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "createIndexStatement"


    // $ANTLR start "indexIdent"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:566:1: indexIdent returns [IndexTarget id] : (c= cident | K_KEYS '(' c= cident ')' );
    public final IndexTarget indexIdent() throws RecognitionException {
        IndexTarget id = null;

        ColumnIdentifier c = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:567:5: (c= cident | K_KEYS '(' c= cident ')' )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=K_DISTINCT && LA65_0<=K_AS)||(LA65_0>=K_FILTERING && LA65_0<=K_TTL)||LA65_0==K_VALUES||LA65_0==K_EXISTS||LA65_0==K_TIMESTAMP||LA65_0==K_COUNTER||LA65_0==K_STATIC||(LA65_0>=K_KEY && LA65_0<=K_CUSTOM)||LA65_0==IDENT||LA65_0==K_TRIGGER||LA65_0==K_LIST||(LA65_0>=K_ALL && LA65_0<=QUOTED_NAME)||(LA65_0>=K_CONTAINS && LA65_0<=K_MAP)) ) {
                alt65=1;
            }
            else if ( (LA65_0==K_KEYS) ) {
                int LA65_2 = input.LA(2);

                if ( (LA65_2==139) ) {
                    alt65=2;
                }
                else if ( (LA65_2==140) ) {
                    alt65=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:567:7: c= cident
                    {
                    pushFollow(FOLLOW_cident_in_indexIdent2869);
                    c=cident();

                    state._fsp--;

                     id = IndexTarget.of(c); 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:568:7: K_KEYS '(' c= cident ')'
                    {
                    match(input,K_KEYS,FOLLOW_K_KEYS_in_indexIdent2894); 
                    match(input,139,FOLLOW_139_in_indexIdent2896); 
                    pushFollow(FOLLOW_cident_in_indexIdent2900);
                    c=cident();

                    state._fsp--;

                    match(input,140,FOLLOW_140_in_indexIdent2902); 
                     id = IndexTarget.keysOf(c); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return id;
    }
    // $ANTLR end "indexIdent"


    // $ANTLR start "createTriggerStatement"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:572:1: createTriggerStatement returns [CreateTriggerStatement expr] : K_CREATE K_TRIGGER (name= IDENT ) K_ON cf= columnFamilyName K_USING cls= STRING_LITERAL ;
    public final CreateTriggerStatement createTriggerStatement() throws RecognitionException {
        CreateTriggerStatement expr = null;

        Token name=null;
        Token cls=null;
        CFName cf = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:576:5: ( K_CREATE K_TRIGGER (name= IDENT ) K_ON cf= columnFamilyName K_USING cls= STRING_LITERAL )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:576:7: K_CREATE K_TRIGGER (name= IDENT ) K_ON cf= columnFamilyName K_USING cls= STRING_LITERAL
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createTriggerStatement2928); 
            match(input,K_TRIGGER,FOLLOW_K_TRIGGER_in_createTriggerStatement2930); 
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:576:26: (name= IDENT )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:576:27: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_createTriggerStatement2935); 

            }

            match(input,K_ON,FOLLOW_K_ON_in_createTriggerStatement2938); 
            pushFollow(FOLLOW_columnFamilyName_in_createTriggerStatement2942);
            cf=columnFamilyName();

            state._fsp--;

            match(input,K_USING,FOLLOW_K_USING_in_createTriggerStatement2944); 
            cls=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_createTriggerStatement2948); 
             expr = new CreateTriggerStatement(cf, (name!=null?name.getText():null), (cls!=null?cls.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "createTriggerStatement"


    // $ANTLR start "dropTriggerStatement"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:580:1: dropTriggerStatement returns [DropTriggerStatement expr] : K_DROP K_TRIGGER (name= IDENT ) K_ON cf= columnFamilyName ;
    public final DropTriggerStatement dropTriggerStatement() throws RecognitionException {
        DropTriggerStatement expr = null;

        Token name=null;
        CFName cf = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:584:5: ( K_DROP K_TRIGGER (name= IDENT ) K_ON cf= columnFamilyName )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:584:7: K_DROP K_TRIGGER (name= IDENT ) K_ON cf= columnFamilyName
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropTriggerStatement2979); 
            match(input,K_TRIGGER,FOLLOW_K_TRIGGER_in_dropTriggerStatement2981); 
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:584:24: (name= IDENT )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:584:25: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_dropTriggerStatement2986); 

            }

            match(input,K_ON,FOLLOW_K_ON_in_dropTriggerStatement2989); 
            pushFollow(FOLLOW_columnFamilyName_in_dropTriggerStatement2993);
            cf=columnFamilyName();

            state._fsp--;

             expr = new DropTriggerStatement(cf, (name!=null?name.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "dropTriggerStatement"


    // $ANTLR start "alterKeyspaceStatement"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:588:1: alterKeyspaceStatement returns [AlterKeyspaceStatement expr] : K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs] ;
    public final AlterKeyspaceStatement alterKeyspaceStatement() throws RecognitionException {
        AlterKeyspaceStatement expr = null;

        String ks = null;


         KSPropDefs attrs = new KSPropDefs(); 
        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:593:5: ( K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs] )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:593:7: K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs]
            {
            match(input,K_ALTER,FOLLOW_K_ALTER_in_alterKeyspaceStatement3033); 
            match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_alterKeyspaceStatement3035); 
            pushFollow(FOLLOW_keyspaceName_in_alterKeyspaceStatement3039);
            ks=keyspaceName();

            state._fsp--;

            match(input,K_WITH,FOLLOW_K_WITH_in_alterKeyspaceStatement3049); 
            pushFollow(FOLLOW_properties_in_alterKeyspaceStatement3051);
            properties(attrs);

            state._fsp--;

             expr = new AlterKeyspaceStatement(ks, attrs); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "alterKeyspaceStatement"


    // $ANTLR start "alterTableStatement"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:598:1: alterTableStatement returns [AlterTableStatement expr] : K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD id= cident v= comparatorType ( K_STATIC )? | K_DROP id= cident | K_WITH properties[props] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* ) ;
    public final AlterTableStatement alterTableStatement() throws RecognitionException {
        AlterTableStatement expr = null;

        CFName cf = null;

        ColumnIdentifier id = null;

        CQL3Type.Raw v = null;

        ColumnIdentifier id1 = null;

        ColumnIdentifier toId1 = null;

        ColumnIdentifier idn = null;

        ColumnIdentifier toIdn = null;



                AlterTableStatement.Type type = null;
                CFPropDefs props = new CFPropDefs();
                Map<ColumnIdentifier, ColumnIdentifier> renames = new HashMap<ColumnIdentifier, ColumnIdentifier>();
                boolean isStatic = false;
            
        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:612:5: ( K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD id= cident v= comparatorType ( K_STATIC )? | K_DROP id= cident | K_WITH properties[props] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* ) )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:612:7: K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD id= cident v= comparatorType ( K_STATIC )? | K_DROP id= cident | K_WITH properties[props] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* )
            {
            match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTableStatement3087); 
            match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_alterTableStatement3089); 
            pushFollow(FOLLOW_columnFamilyName_in_alterTableStatement3093);
            cf=columnFamilyName();

            state._fsp--;

            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:613:11: ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD id= cident v= comparatorType ( K_STATIC )? | K_DROP id= cident | K_WITH properties[props] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* )
            int alt68=5;
            switch ( input.LA(1) ) {
            case K_ALTER:
                {
                alt68=1;
                }
                break;
            case K_ADD:
                {
                alt68=2;
                }
                break;
            case K_DROP:
                {
                alt68=3;
                }
                break;
            case K_WITH:
                {
                alt68=4;
                }
                break;
            case K_RENAME:
                {
                alt68=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:613:13: K_ALTER id= cident K_TYPE v= comparatorType
                    {
                    match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTableStatement3107); 
                    pushFollow(FOLLOW_cident_in_alterTableStatement3111);
                    id=cident();

                    state._fsp--;

                    match(input,K_TYPE,FOLLOW_K_TYPE_in_alterTableStatement3113); 
                    pushFollow(FOLLOW_comparatorType_in_alterTableStatement3117);
                    v=comparatorType();

                    state._fsp--;

                     type = AlterTableStatement.Type.ALTER; 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:614:13: K_ADD id= cident v= comparatorType ( K_STATIC )?
                    {
                    match(input,K_ADD,FOLLOW_K_ADD_in_alterTableStatement3133); 
                    pushFollow(FOLLOW_cident_in_alterTableStatement3139);
                    id=cident();

                    state._fsp--;

                    pushFollow(FOLLOW_comparatorType_in_alterTableStatement3143);
                    v=comparatorType();

                    state._fsp--;

                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:614:48: ( K_STATIC )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==K_STATIC) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:614:49: K_STATIC
                            {
                             isStatic=true; 
                            match(input,K_STATIC,FOLLOW_K_STATIC_in_alterTableStatement3148); 

                            }
                            break;

                    }

                     type = AlterTableStatement.Type.ADD; 

                    }
                    break;
                case 3 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:615:13: K_DROP id= cident
                    {
                    match(input,K_DROP,FOLLOW_K_DROP_in_alterTableStatement3166); 
                    pushFollow(FOLLOW_cident_in_alterTableStatement3171);
                    id=cident();

                    state._fsp--;

                     type = AlterTableStatement.Type.DROP; 

                    }
                    break;
                case 4 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:616:13: K_WITH properties[props]
                    {
                    match(input,K_WITH,FOLLOW_K_WITH_in_alterTableStatement3211); 
                    pushFollow(FOLLOW_properties_in_alterTableStatement3214);
                    properties(props);

                    state._fsp--;

                     type = AlterTableStatement.Type.OPTS; 

                    }
                    break;
                case 5 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:617:13: K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )*
                    {
                    match(input,K_RENAME,FOLLOW_K_RENAME_in_alterTableStatement3247); 
                     type = AlterTableStatement.Type.RENAME; 
                    pushFollow(FOLLOW_cident_in_alterTableStatement3301);
                    id1=cident();

                    state._fsp--;

                    match(input,K_TO,FOLLOW_K_TO_in_alterTableStatement3303); 
                    pushFollow(FOLLOW_cident_in_alterTableStatement3307);
                    toId1=cident();

                    state._fsp--;

                     renames.put(id1, toId1); 
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:619:16: ( K_AND idn= cident K_TO toIdn= cident )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==K_AND) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:619:18: K_AND idn= cident K_TO toIdn= cident
                    	    {
                    	    match(input,K_AND,FOLLOW_K_AND_in_alterTableStatement3328); 
                    	    pushFollow(FOLLOW_cident_in_alterTableStatement3332);
                    	    idn=cident();

                    	    state._fsp--;

                    	    match(input,K_TO,FOLLOW_K_TO_in_alterTableStatement3334); 
                    	    pushFollow(FOLLOW_cident_in_alterTableStatement3338);
                    	    toIdn=cident();

                    	    state._fsp--;

                    	     renames.put(idn, toIdn); 

                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);


                    }
                    break;

            }


                    expr = new AlterTableStatement(cf, type, id, v, props, renames, isStatic);
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "alterTableStatement"


    // $ANTLR start "alterTypeStatement"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:626:1: alterTypeStatement returns [AlterTypeStatement expr] : K_ALTER K_TYPE name= userTypeName ( K_ALTER f= cident K_TYPE v= comparatorType | K_ADD f= cident v= comparatorType | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* ) ;
    public final AlterTypeStatement alterTypeStatement() throws RecognitionException {
        AlterTypeStatement expr = null;

        UTName name = null;

        ColumnIdentifier f = null;

        CQL3Type.Raw v = null;

        ColumnIdentifier id1 = null;

        ColumnIdentifier toId1 = null;

        ColumnIdentifier idn = null;

        ColumnIdentifier toIdn = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:632:5: ( K_ALTER K_TYPE name= userTypeName ( K_ALTER f= cident K_TYPE v= comparatorType | K_ADD f= cident v= comparatorType | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* ) )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:632:7: K_ALTER K_TYPE name= userTypeName ( K_ALTER f= cident K_TYPE v= comparatorType | K_ADD f= cident v= comparatorType | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* )
            {
            match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTypeStatement3384); 
            match(input,K_TYPE,FOLLOW_K_TYPE_in_alterTypeStatement3386); 
            pushFollow(FOLLOW_userTypeName_in_alterTypeStatement3390);
            name=userTypeName();

            state._fsp--;

            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:633:11: ( K_ALTER f= cident K_TYPE v= comparatorType | K_ADD f= cident v= comparatorType | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* )
            int alt70=3;
            switch ( input.LA(1) ) {
            case K_ALTER:
                {
                alt70=1;
                }
                break;
            case K_ADD:
                {
                alt70=2;
                }
                break;
            case K_RENAME:
                {
                alt70=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:633:13: K_ALTER f= cident K_TYPE v= comparatorType
                    {
                    match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTypeStatement3404); 
                    pushFollow(FOLLOW_cident_in_alterTypeStatement3408);
                    f=cident();

                    state._fsp--;

                    match(input,K_TYPE,FOLLOW_K_TYPE_in_alterTypeStatement3410); 
                    pushFollow(FOLLOW_comparatorType_in_alterTypeStatement3414);
                    v=comparatorType();

                    state._fsp--;

                     expr = AlterTypeStatement.alter(name, f, v); 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:634:13: K_ADD f= cident v= comparatorType
                    {
                    match(input,K_ADD,FOLLOW_K_ADD_in_alterTypeStatement3430); 
                    pushFollow(FOLLOW_cident_in_alterTypeStatement3436);
                    f=cident();

                    state._fsp--;

                    pushFollow(FOLLOW_comparatorType_in_alterTypeStatement3440);
                    v=comparatorType();

                    state._fsp--;

                     expr = AlterTypeStatement.addition(name, f, v); 

                    }
                    break;
                case 3 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:635:13: K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )*
                    {
                    match(input,K_RENAME,FOLLOW_K_RENAME_in_alterTypeStatement3463); 
                     Map<ColumnIdentifier, ColumnIdentifier> renames = new HashMap<ColumnIdentifier, ColumnIdentifier>(); 
                    pushFollow(FOLLOW_cident_in_alterTypeStatement3501);
                    id1=cident();

                    state._fsp--;

                    match(input,K_TO,FOLLOW_K_TO_in_alterTypeStatement3503); 
                    pushFollow(FOLLOW_cident_in_alterTypeStatement3507);
                    toId1=cident();

                    state._fsp--;

                     renames.put(id1, toId1); 
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:638:18: ( K_AND idn= cident K_TO toIdn= cident )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==K_AND) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:638:20: K_AND idn= cident K_TO toIdn= cident
                    	    {
                    	    match(input,K_AND,FOLLOW_K_AND_in_alterTypeStatement3530); 
                    	    pushFollow(FOLLOW_cident_in_alterTypeStatement3534);
                    	    idn=cident();

                    	    state._fsp--;

                    	    match(input,K_TO,FOLLOW_K_TO_in_alterTypeStatement3536); 
                    	    pushFollow(FOLLOW_cident_in_alterTypeStatement3540);
                    	    toIdn=cident();

                    	    state._fsp--;

                    	     renames.put(idn, toIdn); 

                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                     expr = AlterTypeStatement.renames(name, renames); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "alterTypeStatement"


    // $ANTLR start "dropKeyspaceStatement"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:644:1: dropKeyspaceStatement returns [DropKeyspaceStatement ksp] : K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName ;
    public final DropKeyspaceStatement dropKeyspaceStatement() throws RecognitionException {
        DropKeyspaceStatement ksp = null;

        String ks = null;


         boolean ifExists = false; 
        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:649:5: ( K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:649:7: K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropKeyspaceStatement3607); 
            match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_dropKeyspaceStatement3609); 
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:649:25: ( K_IF K_EXISTS )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==K_IF) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:649:26: K_IF K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_dropKeyspaceStatement3612); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropKeyspaceStatement3614); 
                     ifExists = true; 

                    }
                    break;

            }

            pushFollow(FOLLOW_keyspaceName_in_dropKeyspaceStatement3623);
            ks=keyspaceName();

            state._fsp--;

             ksp = new DropKeyspaceStatement(ks, ifExists); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ksp;
    }
    // $ANTLR end "dropKeyspaceStatement"


    // $ANTLR start "dropTableStatement"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:652:1: dropTableStatement returns [DropTableStatement stmt] : K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? cf= columnFamilyName ;
    public final DropTableStatement dropTableStatement() throws RecognitionException {
        DropTableStatement stmt = null;

        CFName cf = null;


         boolean ifExists = false; 
        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:657:5: ( K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? cf= columnFamilyName )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:657:7: K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? cf= columnFamilyName
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropTableStatement3657); 
            match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_dropTableStatement3659); 
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:657:29: ( K_IF K_EXISTS )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==K_IF) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:657:30: K_IF K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_dropTableStatement3662); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropTableStatement3664); 
                     ifExists = true; 

                    }
                    break;

            }

            pushFollow(FOLLOW_columnFamilyName_in_dropTableStatement3673);
            cf=columnFamilyName();

            state._fsp--;

             stmt = new DropTableStatement(cf, ifExists); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "dropTableStatement"


    // $ANTLR start "dropTypeStatement"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:660:1: dropTypeStatement returns [DropTypeStatement stmt] : K_DROP K_TYPE ( K_IF K_EXISTS )? name= userTypeName ;
    public final DropTypeStatement dropTypeStatement() throws RecognitionException {
        DropTypeStatement stmt = null;

        UTName name = null;


         boolean ifExists = false; 
        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:665:5: ( K_DROP K_TYPE ( K_IF K_EXISTS )? name= userTypeName )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:665:7: K_DROP K_TYPE ( K_IF K_EXISTS )? name= userTypeName
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropTypeStatement3707); 
            match(input,K_TYPE,FOLLOW_K_TYPE_in_dropTypeStatement3709); 
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:665:21: ( K_IF K_EXISTS )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==K_IF) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:665:22: K_IF K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_dropTypeStatement3712); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropTypeStatement3714); 
                     ifExists = true; 

                    }
                    break;

            }

            pushFollow(FOLLOW_userTypeName_in_dropTypeStatement3723);
            name=userTypeName();

            state._fsp--;

             stmt = new DropTypeStatement(name, ifExists); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "dropTypeStatement"


    // $ANTLR start "dropIndexStatement"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:668:1: dropIndexStatement returns [DropIndexStatement expr] : K_DROP K_INDEX ( K_IF K_EXISTS )? index= IDENT ;
    public final DropIndexStatement dropIndexStatement() throws RecognitionException {
        DropIndexStatement expr = null;

        Token index=null;

         boolean ifExists = false; 
        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:673:5: ( K_DROP K_INDEX ( K_IF K_EXISTS )? index= IDENT )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:673:7: K_DROP K_INDEX ( K_IF K_EXISTS )? index= IDENT
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropIndexStatement3757); 
            match(input,K_INDEX,FOLLOW_K_INDEX_in_dropIndexStatement3759); 
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:673:22: ( K_IF K_EXISTS )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==K_IF) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:673:23: K_IF K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_dropIndexStatement3762); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropIndexStatement3764); 
                     ifExists = true; 

                    }
                    break;

            }

            index=(Token)match(input,IDENT,FOLLOW_IDENT_in_dropIndexStatement3773); 
             expr = new DropIndexStatement((index!=null?index.getText():null), ifExists); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "dropIndexStatement"


    // $ANTLR start "truncateStatement"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:677:1: truncateStatement returns [TruncateStatement stmt] : K_TRUNCATE cf= columnFamilyName ;
    public final TruncateStatement truncateStatement() throws RecognitionException {
        TruncateStatement stmt = null;

        CFName cf = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:681:5: ( K_TRUNCATE cf= columnFamilyName )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:681:7: K_TRUNCATE cf= columnFamilyName
            {
            match(input,K_TRUNCATE,FOLLOW_K_TRUNCATE_in_truncateStatement3804); 
            pushFollow(FOLLOW_columnFamilyName_in_truncateStatement3808);
            cf=columnFamilyName();

            state._fsp--;

             stmt = new TruncateStatement(cf); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "truncateStatement"


    // $ANTLR start "grantStatement"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:684:1: grantStatement returns [GrantStatement stmt] : K_GRANT permissionOrAll K_ON resource K_TO username ;
    public final GrantStatement grantStatement() throws RecognitionException {
        GrantStatement stmt = null;

        Set<Permission> permissionOrAll1 = null;

        IResource resource2 = null;

        CqlParser.username_return username3 = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:688:5: ( K_GRANT permissionOrAll K_ON resource K_TO username )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:688:7: K_GRANT permissionOrAll K_ON resource K_TO username
            {
            match(input,K_GRANT,FOLLOW_K_GRANT_in_grantStatement3833); 
            pushFollow(FOLLOW_permissionOrAll_in_grantStatement3845);
            permissionOrAll1=permissionOrAll();

            state._fsp--;

            match(input,K_ON,FOLLOW_K_ON_in_grantStatement3853); 
            pushFollow(FOLLOW_resource_in_grantStatement3865);
            resource2=resource();

            state._fsp--;

            match(input,K_TO,FOLLOW_K_TO_in_grantStatement3873); 
            pushFollow(FOLLOW_username_in_grantStatement3885);
            username3=username();

            state._fsp--;

             stmt = new GrantStatement(permissionOrAll1, resource2, (username3!=null?input.toString(username3.start,username3.stop):null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "grantStatement"


    // $ANTLR start "revokeStatement"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:697:1: revokeStatement returns [RevokeStatement stmt] : K_REVOKE permissionOrAll K_ON resource K_FROM username ;
    public final RevokeStatement revokeStatement() throws RecognitionException {
        RevokeStatement stmt = null;

        Set<Permission> permissionOrAll4 = null;

        IResource resource5 = null;

        CqlParser.username_return username6 = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:701:5: ( K_REVOKE permissionOrAll K_ON resource K_FROM username )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:701:7: K_REVOKE permissionOrAll K_ON resource K_FROM username
            {
            match(input,K_REVOKE,FOLLOW_K_REVOKE_in_revokeStatement3916); 
            pushFollow(FOLLOW_permissionOrAll_in_revokeStatement3928);
            permissionOrAll4=permissionOrAll();

            state._fsp--;

            match(input,K_ON,FOLLOW_K_ON_in_revokeStatement3936); 
            pushFollow(FOLLOW_resource_in_revokeStatement3948);
            resource5=resource();

            state._fsp--;

            match(input,K_FROM,FOLLOW_K_FROM_in_revokeStatement3956); 
            pushFollow(FOLLOW_username_in_revokeStatement3968);
            username6=username();

            state._fsp--;

             stmt = new RevokeStatement(permissionOrAll4, resource5, (username6!=null?input.toString(username6.start,username6.stop):null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "revokeStatement"


    // $ANTLR start "listPermissionsStatement"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:710:1: listPermissionsStatement returns [ListPermissionsStatement stmt] : K_LIST permissionOrAll ( K_ON resource )? ( K_OF username )? ( K_NORECURSIVE )? ;
    public final ListPermissionsStatement listPermissionsStatement() throws RecognitionException {
        ListPermissionsStatement stmt = null;

        IResource resource7 = null;

        CqlParser.username_return username8 = null;

        Set<Permission> permissionOrAll9 = null;



                IResource resource = null;
                String username = null;
                boolean recursive = true;
            
        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:716:5: ( K_LIST permissionOrAll ( K_ON resource )? ( K_OF username )? ( K_NORECURSIVE )? )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:716:7: K_LIST permissionOrAll ( K_ON resource )? ( K_OF username )? ( K_NORECURSIVE )?
            {
            match(input,K_LIST,FOLLOW_K_LIST_in_listPermissionsStatement4006); 
            pushFollow(FOLLOW_permissionOrAll_in_listPermissionsStatement4018);
            permissionOrAll9=permissionOrAll();

            state._fsp--;

            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:718:7: ( K_ON resource )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==K_ON) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:718:9: K_ON resource
                    {
                    match(input,K_ON,FOLLOW_K_ON_in_listPermissionsStatement4028); 
                    pushFollow(FOLLOW_resource_in_listPermissionsStatement4030);
                    resource7=resource();

                    state._fsp--;

                     resource = resource7; 

                    }
                    break;

            }

            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:719:7: ( K_OF username )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==K_OF) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:719:9: K_OF username
                    {
                    match(input,K_OF,FOLLOW_K_OF_in_listPermissionsStatement4045); 
                    pushFollow(FOLLOW_username_in_listPermissionsStatement4047);
                    username8=username();

                    state._fsp--;

                     username = (username8!=null?input.toString(username8.start,username8.stop):null); 

                    }
                    break;

            }

            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:720:7: ( K_NORECURSIVE )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==K_NORECURSIVE) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:720:9: K_NORECURSIVE
                    {
                    match(input,K_NORECURSIVE,FOLLOW_K_NORECURSIVE_in_listPermissionsStatement4062); 
                     recursive = false; 

                    }
                    break;

            }

             stmt = new ListPermissionsStatement(permissionOrAll9, resource, username, recursive); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "listPermissionsStatement"


    // $ANTLR start "permission"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:724:1: permission returns [Permission perm] : p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE ) ;
    public final Permission permission() throws RecognitionException {
        Permission perm = null;

        Token p=null;

        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:725:5: (p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE ) )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:725:7: p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE )
            {
            p=(Token)input.LT(1);
            if ( input.LA(1)==K_SELECT||input.LA(1)==K_CREATE||(input.LA(1)>=K_DROP && input.LA(1)<=K_ALTER)||(input.LA(1)>=K_MODIFY && input.LA(1)<=K_AUTHORIZE) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             perm = Permission.valueOf((p!=null?p.getText():null).toUpperCase()); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return perm;
    }
    // $ANTLR end "permission"


    // $ANTLR start "permissionOrAll"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:729:1: permissionOrAll returns [Set<Permission> perms] : ( K_ALL ( K_PERMISSIONS )? | p= permission ( K_PERMISSION )? );
    public final Set<Permission> permissionOrAll() throws RecognitionException {
        Set<Permission> perms = null;

        Permission p = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:730:5: ( K_ALL ( K_PERMISSIONS )? | p= permission ( K_PERMISSION )? )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==K_ALL) ) {
                alt80=1;
            }
            else if ( (LA80_0==K_SELECT||LA80_0==K_CREATE||(LA80_0>=K_DROP && LA80_0<=K_ALTER)||(LA80_0>=K_MODIFY && LA80_0<=K_AUTHORIZE)) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:730:7: K_ALL ( K_PERMISSIONS )?
                    {
                    match(input,K_ALL,FOLLOW_K_ALL_in_permissionOrAll4147); 
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:730:13: ( K_PERMISSIONS )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==K_PERMISSIONS) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:730:15: K_PERMISSIONS
                            {
                            match(input,K_PERMISSIONS,FOLLOW_K_PERMISSIONS_in_permissionOrAll4151); 

                            }
                            break;

                    }

                     perms = Permission.ALL_DATA; 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:731:7: p= permission ( K_PERMISSION )?
                    {
                    pushFollow(FOLLOW_permission_in_permissionOrAll4172);
                    p=permission();

                    state._fsp--;

                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:731:20: ( K_PERMISSION )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==K_PERMISSION) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:731:22: K_PERMISSION
                            {
                            match(input,K_PERMISSION,FOLLOW_K_PERMISSION_in_permissionOrAll4176); 

                            }
                            break;

                    }

                     perms = EnumSet.of(p); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return perms;
    }
    // $ANTLR end "permissionOrAll"


    // $ANTLR start "resource"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:734:1: resource returns [IResource res] : r= dataResource ;
    public final IResource resource() throws RecognitionException {
        IResource res = null;

        DataResource r = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:735:5: (r= dataResource )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:735:7: r= dataResource
            {
            pushFollow(FOLLOW_dataResource_in_resource4204);
            r=dataResource();

            state._fsp--;

             res = r; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return res;
    }
    // $ANTLR end "resource"


    // $ANTLR start "dataResource"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:738:1: dataResource returns [DataResource res] : ( K_ALL K_KEYSPACES | K_KEYSPACE ks= keyspaceName | ( K_COLUMNFAMILY )? cf= columnFamilyName );
    public final DataResource dataResource() throws RecognitionException {
        DataResource res = null;

        String ks = null;

        CFName cf = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:739:5: ( K_ALL K_KEYSPACES | K_KEYSPACE ks= keyspaceName | ( K_COLUMNFAMILY )? cf= columnFamilyName )
            int alt82=3;
            switch ( input.LA(1) ) {
            case K_ALL:
                {
                int LA82_1 = input.LA(2);

                if ( (LA82_1==K_KEYSPACES) ) {
                    alt82=1;
                }
                else if ( (LA82_1==EOF||LA82_1==K_FROM||LA82_1==K_TO||(LA82_1>=K_OF && LA82_1<=K_NORECURSIVE)||LA82_1==138||LA82_1==143) ) {
                    alt82=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 82, 1, input);

                    throw nvae;
                }
                }
                break;
            case K_KEYSPACE:
                {
                alt82=2;
                }
                break;
            case K_DISTINCT:
            case K_COUNT:
            case K_AS:
            case K_FILTERING:
            case K_WRITETIME:
            case K_TTL:
            case K_VALUES:
            case K_EXISTS:
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_COLUMNFAMILY:
            case K_STATIC:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_TYPE:
            case K_CUSTOM:
            case IDENT:
            case K_KEYS:
            case K_TRIGGER:
            case K_LIST:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case QUOTED_NAME:
            case K_CONTAINS:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt82=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:739:7: K_ALL K_KEYSPACES
                    {
                    match(input,K_ALL,FOLLOW_K_ALL_in_dataResource4227); 
                    match(input,K_KEYSPACES,FOLLOW_K_KEYSPACES_in_dataResource4229); 
                     res = DataResource.root(); 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:740:7: K_KEYSPACE ks= keyspaceName
                    {
                    match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_dataResource4239); 
                    pushFollow(FOLLOW_keyspaceName_in_dataResource4245);
                    ks=keyspaceName();

                    state._fsp--;

                     res = DataResource.keyspace(ks); 

                    }
                    break;
                case 3 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:741:7: ( K_COLUMNFAMILY )? cf= columnFamilyName
                    {
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:741:7: ( K_COLUMNFAMILY )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==K_COLUMNFAMILY) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:741:9: K_COLUMNFAMILY
                            {
                            match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_dataResource4257); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_columnFamilyName_in_dataResource4266);
                    cf=columnFamilyName();

                    state._fsp--;

                     res = DataResource.columnFamily(cf.getKeyspace(), cf.getColumnFamily()); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return res;
    }
    // $ANTLR end "dataResource"


    // $ANTLR start "createUserStatement"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:745:1: createUserStatement returns [CreateUserStatement stmt] : K_CREATE K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? ;
    public final CreateUserStatement createUserStatement() throws RecognitionException {
        CreateUserStatement stmt = null;

        CqlParser.username_return username10 = null;



                UserOptions opts = new UserOptions();
                boolean superuser = false;
            
        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:753:5: ( K_CREATE K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:753:7: K_CREATE K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )?
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createUserStatement4306); 
            match(input,K_USER,FOLLOW_K_USER_in_createUserStatement4308); 
            pushFollow(FOLLOW_username_in_createUserStatement4310);
            username10=username();

            state._fsp--;

            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:754:7: ( K_WITH userOptions[opts] )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==K_WITH) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:754:9: K_WITH userOptions[opts]
                    {
                    match(input,K_WITH,FOLLOW_K_WITH_in_createUserStatement4320); 
                    pushFollow(FOLLOW_userOptions_in_createUserStatement4322);
                    userOptions(opts);

                    state._fsp--;


                    }
                    break;

            }

            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:755:7: ( K_SUPERUSER | K_NOSUPERUSER )?
            int alt84=3;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==K_SUPERUSER) ) {
                alt84=1;
            }
            else if ( (LA84_0==K_NOSUPERUSER) ) {
                alt84=2;
            }
            switch (alt84) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:755:9: K_SUPERUSER
                    {
                    match(input,K_SUPERUSER,FOLLOW_K_SUPERUSER_in_createUserStatement4336); 
                     superuser = true; 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:755:45: K_NOSUPERUSER
                    {
                    match(input,K_NOSUPERUSER,FOLLOW_K_NOSUPERUSER_in_createUserStatement4342); 
                     superuser = false; 

                    }
                    break;

            }

             stmt = new CreateUserStatement((username10!=null?input.toString(username10.start,username10.stop):null), opts, superuser); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "createUserStatement"


    // $ANTLR start "alterUserStatement"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:759:1: alterUserStatement returns [AlterUserStatement stmt] : K_ALTER K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? ;
    public final AlterUserStatement alterUserStatement() throws RecognitionException {
        AlterUserStatement stmt = null;

        CqlParser.username_return username11 = null;



                UserOptions opts = new UserOptions();
                Boolean superuser = null;
            
        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:767:5: ( K_ALTER K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:767:7: K_ALTER K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )?
            {
            match(input,K_ALTER,FOLLOW_K_ALTER_in_alterUserStatement4387); 
            match(input,K_USER,FOLLOW_K_USER_in_alterUserStatement4389); 
            pushFollow(FOLLOW_username_in_alterUserStatement4391);
            username11=username();

            state._fsp--;

            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:768:7: ( K_WITH userOptions[opts] )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==K_WITH) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:768:9: K_WITH userOptions[opts]
                    {
                    match(input,K_WITH,FOLLOW_K_WITH_in_alterUserStatement4401); 
                    pushFollow(FOLLOW_userOptions_in_alterUserStatement4403);
                    userOptions(opts);

                    state._fsp--;


                    }
                    break;

            }

            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:769:7: ( K_SUPERUSER | K_NOSUPERUSER )?
            int alt86=3;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==K_SUPERUSER) ) {
                alt86=1;
            }
            else if ( (LA86_0==K_NOSUPERUSER) ) {
                alt86=2;
            }
            switch (alt86) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:769:9: K_SUPERUSER
                    {
                    match(input,K_SUPERUSER,FOLLOW_K_SUPERUSER_in_alterUserStatement4417); 
                     superuser = true; 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:769:45: K_NOSUPERUSER
                    {
                    match(input,K_NOSUPERUSER,FOLLOW_K_NOSUPERUSER_in_alterUserStatement4423); 
                     superuser = false; 

                    }
                    break;

            }

             stmt = new AlterUserStatement((username11!=null?input.toString(username11.start,username11.stop):null), opts, superuser); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "alterUserStatement"


    // $ANTLR start "dropUserStatement"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:773:1: dropUserStatement returns [DropUserStatement stmt] : K_DROP K_USER username ;
    public final DropUserStatement dropUserStatement() throws RecognitionException {
        DropUserStatement stmt = null;

        CqlParser.username_return username12 = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:777:5: ( K_DROP K_USER username )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:777:7: K_DROP K_USER username
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropUserStatement4459); 
            match(input,K_USER,FOLLOW_K_USER_in_dropUserStatement4461); 
            pushFollow(FOLLOW_username_in_dropUserStatement4463);
            username12=username();

            state._fsp--;

             stmt = new DropUserStatement((username12!=null?input.toString(username12.start,username12.stop):null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "dropUserStatement"


    // $ANTLR start "listUsersStatement"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:780:1: listUsersStatement returns [ListUsersStatement stmt] : K_LIST K_USERS ;
    public final ListUsersStatement listUsersStatement() throws RecognitionException {
        ListUsersStatement stmt = null;

        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:784:5: ( K_LIST K_USERS )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:784:7: K_LIST K_USERS
            {
            match(input,K_LIST,FOLLOW_K_LIST_in_listUsersStatement4488); 
            match(input,K_USERS,FOLLOW_K_USERS_in_listUsersStatement4490); 
             stmt = new ListUsersStatement(); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "listUsersStatement"


    // $ANTLR start "userOptions"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:787:1: userOptions[UserOptions opts] : userOption[opts] ;
    public final void userOptions(UserOptions opts) throws RecognitionException {
        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:788:5: ( userOption[opts] )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:788:7: userOption[opts]
            {
            pushFollow(FOLLOW_userOption_in_userOptions4510);
            userOption(opts);

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "userOptions"


    // $ANTLR start "userOption"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:791:1: userOption[UserOptions opts] : k= K_PASSWORD v= STRING_LITERAL ;
    public final void userOption(UserOptions opts) throws RecognitionException {
        Token k=null;
        Token v=null;

        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:792:5: (k= K_PASSWORD v= STRING_LITERAL )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:792:7: k= K_PASSWORD v= STRING_LITERAL
            {
            k=(Token)match(input,K_PASSWORD,FOLLOW_K_PASSWORD_in_userOption4531); 
            v=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_userOption4535); 
             opts.put((k!=null?k.getText():null), (v!=null?v.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "userOption"


    // $ANTLR start "cident"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:795:1: cident returns [ColumnIdentifier id] : (t= IDENT | t= QUOTED_NAME | k= unreserved_keyword );
    public final ColumnIdentifier cident() throws RecognitionException {
        ColumnIdentifier id = null;

        Token t=null;
        String k = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:799:5: (t= IDENT | t= QUOTED_NAME | k= unreserved_keyword )
            int alt87=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt87=1;
                }
                break;
            case QUOTED_NAME:
                {
                alt87=2;
                }
                break;
            case K_DISTINCT:
            case K_COUNT:
            case K_AS:
            case K_FILTERING:
            case K_WRITETIME:
            case K_TTL:
            case K_VALUES:
            case K_EXISTS:
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_STATIC:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_TYPE:
            case K_CUSTOM:
            case K_KEYS:
            case K_TRIGGER:
            case K_LIST:
            case K_ALL:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case K_CONTAINS:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt87=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:799:7: t= IDENT
                    {
                    t=(Token)match(input,IDENT,FOLLOW_IDENT_in_cident4564); 
                     id = new ColumnIdentifier((t!=null?t.getText():null), false); 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:800:7: t= QUOTED_NAME
                    {
                    t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_cident4589); 
                     id = new ColumnIdentifier((t!=null?t.getText():null), true); 

                    }
                    break;
                case 3 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:801:7: k= unreserved_keyword
                    {
                    pushFollow(FOLLOW_unreserved_keyword_in_cident4608);
                    k=unreserved_keyword();

                    state._fsp--;

                     id = new ColumnIdentifier(k, false); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return id;
    }
    // $ANTLR end "cident"


    // $ANTLR start "keyspaceName"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:805:1: keyspaceName returns [String id] : cfOrKsName[name, true] ;
    public final String keyspaceName() throws RecognitionException {
        String id = null;

         CFName name = new CFName(); 
        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:807:5: ( cfOrKsName[name, true] )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:807:7: cfOrKsName[name, true]
            {
            pushFollow(FOLLOW_cfOrKsName_in_keyspaceName4641);
            cfOrKsName(name, true);

            state._fsp--;

             id = name.getKeyspace(); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return id;
    }
    // $ANTLR end "keyspaceName"


    // $ANTLR start "columnFamilyName"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:810:1: columnFamilyName returns [CFName name] : ( cfOrKsName[name, true] '.' )? cfOrKsName[name, false] ;
    public final CFName columnFamilyName() throws RecognitionException {
        CFName name = null;

         name = new CFName(); 
        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:812:5: ( ( cfOrKsName[name, true] '.' )? cfOrKsName[name, false] )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:812:7: ( cfOrKsName[name, true] '.' )? cfOrKsName[name, false]
            {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:812:7: ( cfOrKsName[name, true] '.' )?
            int alt88=2;
            alt88 = dfa88.predict(input);
            switch (alt88) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:812:8: cfOrKsName[name, true] '.'
                    {
                    pushFollow(FOLLOW_cfOrKsName_in_columnFamilyName4675);
                    cfOrKsName(name, true);

                    state._fsp--;

                    match(input,143,FOLLOW_143_in_columnFamilyName4678); 

                    }
                    break;

            }

            pushFollow(FOLLOW_cfOrKsName_in_columnFamilyName4682);
            cfOrKsName(name, false);

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return name;
    }
    // $ANTLR end "columnFamilyName"


    // $ANTLR start "userTypeName"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:815:1: userTypeName returns [UTName name] : (ks= cident '.' )? ut= non_type_ident ;
    public final UTName userTypeName() throws RecognitionException {
        UTName name = null;

        ColumnIdentifier ks = null;

        ColumnIdentifier ut = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:816:5: ( (ks= cident '.' )? ut= non_type_ident )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:816:7: (ks= cident '.' )? ut= non_type_ident
            {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:816:7: (ks= cident '.' )?
            int alt89=2;
            switch ( input.LA(1) ) {
                case IDENT:
                    {
                    int LA89_1 = input.LA(2);

                    if ( (LA89_1==143) ) {
                        alt89=1;
                    }
                    }
                    break;
                case QUOTED_NAME:
                    {
                    int LA89_2 = input.LA(2);

                    if ( (LA89_2==143) ) {
                        alt89=1;
                    }
                    }
                    break;
                case K_DISTINCT:
                case K_AS:
                case K_FILTERING:
                case K_VALUES:
                case K_EXISTS:
                case K_STATIC:
                case K_KEY:
                case K_COMPACT:
                case K_STORAGE:
                case K_CLUSTERING:
                case K_TYPE:
                case K_CUSTOM:
                case K_KEYS:
                case K_TRIGGER:
                case K_LIST:
                case K_ALL:
                case K_PERMISSIONS:
                case K_PERMISSION:
                case K_KEYSPACES:
                case K_USER:
                case K_SUPERUSER:
                case K_NOSUPERUSER:
                case K_USERS:
                case K_PASSWORD:
                case K_CONTAINS:
                case K_MAP:
                    {
                    int LA89_3 = input.LA(2);

                    if ( (LA89_3==143) ) {
                        alt89=1;
                    }
                    }
                    break;
                case K_COUNT:
                case K_WRITETIME:
                case K_TTL:
                case K_TIMESTAMP:
                case K_COUNTER:
                case K_ASCII:
                case K_BIGINT:
                case K_BLOB:
                case K_BOOLEAN:
                case K_DECIMAL:
                case K_DOUBLE:
                case K_FLOAT:
                case K_INET:
                case K_INT:
                case K_TEXT:
                case K_UUID:
                case K_VARCHAR:
                case K_VARINT:
                case K_TIMEUUID:
                    {
                    alt89=1;
                    }
                    break;
            }

            switch (alt89) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:816:8: ks= cident '.'
                    {
                    pushFollow(FOLLOW_cident_in_userTypeName4707);
                    ks=cident();

                    state._fsp--;

                    match(input,143,FOLLOW_143_in_userTypeName4709); 

                    }
                    break;

            }

            pushFollow(FOLLOW_non_type_ident_in_userTypeName4715);
            ut=non_type_ident();

            state._fsp--;

             return new UTName(ks, ut); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return name;
    }
    // $ANTLR end "userTypeName"


    // $ANTLR start "cfOrKsName"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:819:1: cfOrKsName[CFName name, boolean isKs] : (t= IDENT | t= QUOTED_NAME | k= unreserved_keyword );
    public final void cfOrKsName(CFName name, boolean isKs) throws RecognitionException {
        Token t=null;
        String k = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:820:5: (t= IDENT | t= QUOTED_NAME | k= unreserved_keyword )
            int alt90=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt90=1;
                }
                break;
            case QUOTED_NAME:
                {
                alt90=2;
                }
                break;
            case K_DISTINCT:
            case K_COUNT:
            case K_AS:
            case K_FILTERING:
            case K_WRITETIME:
            case K_TTL:
            case K_VALUES:
            case K_EXISTS:
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_STATIC:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_TYPE:
            case K_CUSTOM:
            case K_KEYS:
            case K_TRIGGER:
            case K_LIST:
            case K_ALL:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case K_CONTAINS:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt90=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:820:7: t= IDENT
                    {
                    t=(Token)match(input,IDENT,FOLLOW_IDENT_in_cfOrKsName4737); 
                     if (isKs) name.setKeyspace((t!=null?t.getText():null), false); else name.setColumnFamily((t!=null?t.getText():null), false); 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:821:7: t= QUOTED_NAME
                    {
                    t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_cfOrKsName4762); 
                     if (isKs) name.setKeyspace((t!=null?t.getText():null), true); else name.setColumnFamily((t!=null?t.getText():null), true); 

                    }
                    break;
                case 3 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:822:7: k= unreserved_keyword
                    {
                    pushFollow(FOLLOW_unreserved_keyword_in_cfOrKsName4781);
                    k=unreserved_keyword();

                    state._fsp--;

                     if (isKs) name.setKeyspace(k, false); else name.setColumnFamily(k, false); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cfOrKsName"


    // $ANTLR start "constant"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:825:1: constant returns [Constants.Literal constant] : (t= STRING_LITERAL | t= INTEGER | t= FLOAT | t= BOOLEAN | t= UUID | t= HEXNUMBER | ( '-' )? t= ( K_NAN | K_INFINITY ) );
    public final Constants.Literal constant() throws RecognitionException {
        Constants.Literal constant = null;

        Token t=null;

        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:826:5: (t= STRING_LITERAL | t= INTEGER | t= FLOAT | t= BOOLEAN | t= UUID | t= HEXNUMBER | ( '-' )? t= ( K_NAN | K_INFINITY ) )
            int alt92=7;
            switch ( input.LA(1) ) {
            case STRING_LITERAL:
                {
                alt92=1;
                }
                break;
            case INTEGER:
                {
                alt92=2;
                }
                break;
            case FLOAT:
                {
                alt92=3;
                }
                break;
            case BOOLEAN:
                {
                alt92=4;
                }
                break;
            case UUID:
                {
                alt92=5;
                }
                break;
            case HEXNUMBER:
                {
                alt92=6;
                }
                break;
            case K_NAN:
            case K_INFINITY:
            case 146:
                {
                alt92=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:826:7: t= STRING_LITERAL
                    {
                    t=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_constant4806); 
                     constant = Constants.Literal.string((t!=null?t.getText():null)); 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:827:7: t= INTEGER
                    {
                    t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_constant4818); 
                     constant = Constants.Literal.integer((t!=null?t.getText():null)); 

                    }
                    break;
                case 3 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:828:7: t= FLOAT
                    {
                    t=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_constant4837); 
                     constant = Constants.Literal.floatingPoint((t!=null?t.getText():null)); 

                    }
                    break;
                case 4 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:829:7: t= BOOLEAN
                    {
                    t=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_constant4858); 
                     constant = Constants.Literal.bool((t!=null?t.getText():null)); 

                    }
                    break;
                case 5 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:830:7: t= UUID
                    {
                    t=(Token)match(input,UUID,FOLLOW_UUID_in_constant4877); 
                     constant = Constants.Literal.uuid((t!=null?t.getText():null)); 

                    }
                    break;
                case 6 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:831:7: t= HEXNUMBER
                    {
                    t=(Token)match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_constant4899); 
                     constant = Constants.Literal.hex((t!=null?t.getText():null)); 

                    }
                    break;
                case 7 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:832:7: ( '-' )? t= ( K_NAN | K_INFINITY )
                    {
                     String sign=""; 
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:832:27: ( '-' )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==146) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:832:28: '-'
                            {
                            match(input,146,FOLLOW_146_in_constant4917); 
                            sign = "-"; 

                            }
                            break;

                    }

                    t=(Token)input.LT(1);
                    if ( (input.LA(1)>=K_NAN && input.LA(1)<=K_INFINITY) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                     constant = Constants.Literal.floatingPoint(sign + (t!=null?t.getText():null)); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return constant;
    }
    // $ANTLR end "constant"


    // $ANTLR start "map_literal"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:835:1: map_literal returns [Maps.Literal map] : '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}' ;
    public final Maps.Literal map_literal() throws RecognitionException {
        Maps.Literal map = null;

        Term.Raw k1 = null;

        Term.Raw v1 = null;

        Term.Raw kn = null;

        Term.Raw vn = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:836:5: ( '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}' )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:836:7: '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}'
            {
            match(input,147,FOLLOW_147_in_map_literal4955); 
             List<Pair<Term.Raw, Term.Raw>> m = new ArrayList<Pair<Term.Raw, Term.Raw>>(); 
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:837:11: (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==K_DISTINCT||LA94_0==K_AS||LA94_0==K_FILTERING||LA94_0==INTEGER||LA94_0==K_VALUES||LA94_0==K_EXISTS||LA94_0==K_TIMESTAMP||LA94_0==K_COUNTER||LA94_0==K_STATIC||(LA94_0>=K_KEY && LA94_0<=K_CUSTOM)||LA94_0==IDENT||(LA94_0>=STRING_LITERAL && LA94_0<=K_TRIGGER)||LA94_0==K_LIST||(LA94_0>=K_ALL && LA94_0<=K_PASSWORD)||(LA94_0>=FLOAT && LA94_0<=K_TOKEN)||(LA94_0>=K_CONTAINS && LA94_0<=K_MAP)||LA94_0==139||LA94_0==144||(LA94_0>=146 && LA94_0<=148)) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:837:13: k1= term ':' v1= term ( ',' kn= term ':' vn= term )*
                    {
                    pushFollow(FOLLOW_term_in_map_literal4973);
                    k1=term();

                    state._fsp--;

                    match(input,148,FOLLOW_148_in_map_literal4975); 
                    pushFollow(FOLLOW_term_in_map_literal4979);
                    v1=term();

                    state._fsp--;

                     m.add(Pair.create(k1, v1)); 
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:837:65: ( ',' kn= term ':' vn= term )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==141) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:837:67: ',' kn= term ':' vn= term
                    	    {
                    	    match(input,141,FOLLOW_141_in_map_literal4985); 
                    	    pushFollow(FOLLOW_term_in_map_literal4989);
                    	    kn=term();

                    	    state._fsp--;

                    	    match(input,148,FOLLOW_148_in_map_literal4991); 
                    	    pushFollow(FOLLOW_term_in_map_literal4995);
                    	    vn=term();

                    	    state._fsp--;

                    	     m.add(Pair.create(kn, vn)); 

                    	    }
                    	    break;

                    	default :
                    	    break loop93;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,149,FOLLOW_149_in_map_literal5011); 
             map = new Maps.Literal(m); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return map;
    }
    // $ANTLR end "map_literal"


    // $ANTLR start "set_or_map"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:841:1: set_or_map[Term.Raw t] returns [Term.Raw value] : ( ':' v= term ( ',' kn= term ':' vn= term )* | ( ',' tn= term )* );
    public final Term.Raw set_or_map(Term.Raw t) throws RecognitionException {
        Term.Raw value = null;

        Term.Raw v = null;

        Term.Raw kn = null;

        Term.Raw vn = null;

        Term.Raw tn = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:842:5: ( ':' v= term ( ',' kn= term ':' vn= term )* | ( ',' tn= term )* )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==148) ) {
                alt97=1;
            }
            else if ( (LA97_0==141||LA97_0==149) ) {
                alt97=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:842:7: ':' v= term ( ',' kn= term ':' vn= term )*
                    {
                    match(input,148,FOLLOW_148_in_set_or_map5035); 
                    pushFollow(FOLLOW_term_in_set_or_map5039);
                    v=term();

                    state._fsp--;

                     List<Pair<Term.Raw, Term.Raw>> m = new ArrayList<Pair<Term.Raw, Term.Raw>>(); m.add(Pair.create(t, v)); 
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:843:11: ( ',' kn= term ':' vn= term )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==141) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:843:13: ',' kn= term ':' vn= term
                    	    {
                    	    match(input,141,FOLLOW_141_in_set_or_map5055); 
                    	    pushFollow(FOLLOW_term_in_set_or_map5059);
                    	    kn=term();

                    	    state._fsp--;

                    	    match(input,148,FOLLOW_148_in_set_or_map5061); 
                    	    pushFollow(FOLLOW_term_in_set_or_map5065);
                    	    vn=term();

                    	    state._fsp--;

                    	     m.add(Pair.create(kn, vn)); 

                    	    }
                    	    break;

                    	default :
                    	    break loop95;
                        }
                    } while (true);

                     value = new Maps.Literal(m); 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:845:7: ( ',' tn= term )*
                    {
                     List<Term.Raw> s = new ArrayList<Term.Raw>(); s.add(t); 
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:846:11: ( ',' tn= term )*
                    loop96:
                    do {
                        int alt96=2;
                        int LA96_0 = input.LA(1);

                        if ( (LA96_0==141) ) {
                            alt96=1;
                        }


                        switch (alt96) {
                    	case 1 :
                    	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:846:13: ',' tn= term
                    	    {
                    	    match(input,141,FOLLOW_141_in_set_or_map5100); 
                    	    pushFollow(FOLLOW_term_in_set_or_map5104);
                    	    tn=term();

                    	    state._fsp--;

                    	     s.add(tn); 

                    	    }
                    	    break;

                    	default :
                    	    break loop96;
                        }
                    } while (true);

                     value = new Sets.Literal(s); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "set_or_map"


    // $ANTLR start "collection_literal"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:850:1: collection_literal returns [Term.Raw value] : ( '[' (t1= term ( ',' tn= term )* )? ']' | '{' t= term v= set_or_map[t] '}' | '{' '}' );
    public final Term.Raw collection_literal() throws RecognitionException {
        Term.Raw value = null;

        Term.Raw t1 = null;

        Term.Raw tn = null;

        Term.Raw t = null;

        Term.Raw v = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:851:5: ( '[' (t1= term ( ',' tn= term )* )? ']' | '{' t= term v= set_or_map[t] '}' | '{' '}' )
            int alt100=3;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==144) ) {
                alt100=1;
            }
            else if ( (LA100_0==147) ) {
                int LA100_2 = input.LA(2);

                if ( (LA100_2==149) ) {
                    alt100=3;
                }
                else if ( (LA100_2==K_DISTINCT||LA100_2==K_AS||LA100_2==K_FILTERING||LA100_2==INTEGER||LA100_2==K_VALUES||LA100_2==K_EXISTS||LA100_2==K_TIMESTAMP||LA100_2==K_COUNTER||LA100_2==K_STATIC||(LA100_2>=K_KEY && LA100_2<=K_CUSTOM)||LA100_2==IDENT||(LA100_2>=STRING_LITERAL && LA100_2<=K_TRIGGER)||LA100_2==K_LIST||(LA100_2>=K_ALL && LA100_2<=K_PASSWORD)||(LA100_2>=FLOAT && LA100_2<=K_TOKEN)||(LA100_2>=K_CONTAINS && LA100_2<=K_MAP)||LA100_2==139||LA100_2==144||(LA100_2>=146 && LA100_2<=148)) ) {
                    alt100=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:851:7: '[' (t1= term ( ',' tn= term )* )? ']'
                    {
                    match(input,144,FOLLOW_144_in_collection_literal5138); 
                     List<Term.Raw> l = new ArrayList<Term.Raw>(); 
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:852:11: (t1= term ( ',' tn= term )* )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==K_DISTINCT||LA99_0==K_AS||LA99_0==K_FILTERING||LA99_0==INTEGER||LA99_0==K_VALUES||LA99_0==K_EXISTS||LA99_0==K_TIMESTAMP||LA99_0==K_COUNTER||LA99_0==K_STATIC||(LA99_0>=K_KEY && LA99_0<=K_CUSTOM)||LA99_0==IDENT||(LA99_0>=STRING_LITERAL && LA99_0<=K_TRIGGER)||LA99_0==K_LIST||(LA99_0>=K_ALL && LA99_0<=K_PASSWORD)||(LA99_0>=FLOAT && LA99_0<=K_TOKEN)||(LA99_0>=K_CONTAINS && LA99_0<=K_MAP)||LA99_0==139||LA99_0==144||(LA99_0>=146 && LA99_0<=148)) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:852:13: t1= term ( ',' tn= term )*
                            {
                            pushFollow(FOLLOW_term_in_collection_literal5156);
                            t1=term();

                            state._fsp--;

                             l.add(t1); 
                            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:852:36: ( ',' tn= term )*
                            loop98:
                            do {
                                int alt98=2;
                                int LA98_0 = input.LA(1);

                                if ( (LA98_0==141) ) {
                                    alt98=1;
                                }


                                switch (alt98) {
                            	case 1 :
                            	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:852:38: ',' tn= term
                            	    {
                            	    match(input,141,FOLLOW_141_in_collection_literal5162); 
                            	    pushFollow(FOLLOW_term_in_collection_literal5166);
                            	    tn=term();

                            	    state._fsp--;

                            	     l.add(tn); 

                            	    }
                            	    break;

                            	default :
                            	    break loop98;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,145,FOLLOW_145_in_collection_literal5182); 
                     value = new Lists.Literal(l); 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:854:7: '{' t= term v= set_or_map[t] '}'
                    {
                    match(input,147,FOLLOW_147_in_collection_literal5192); 
                    pushFollow(FOLLOW_term_in_collection_literal5196);
                    t=term();

                    state._fsp--;

                    pushFollow(FOLLOW_set_or_map_in_collection_literal5200);
                    v=set_or_map(t);

                    state._fsp--;

                     value = v; 
                    match(input,149,FOLLOW_149_in_collection_literal5205); 

                    }
                    break;
                case 3 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:857:7: '{' '}'
                    {
                    match(input,147,FOLLOW_147_in_collection_literal5223); 
                    match(input,149,FOLLOW_149_in_collection_literal5225); 
                     value = new Sets.Literal(Collections.<Term.Raw>emptyList()); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "collection_literal"


    // $ANTLR start "usertype_literal"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:860:1: usertype_literal returns [UserTypes.Literal ut] : '{' k1= cident ':' v1= term ( ',' kn= cident ':' vn= term )* '}' ;
    public final UserTypes.Literal usertype_literal() throws RecognitionException {
        UserTypes.Literal ut = null;

        ColumnIdentifier k1 = null;

        Term.Raw v1 = null;

        ColumnIdentifier kn = null;

        Term.Raw vn = null;


         Map<ColumnIdentifier, Term.Raw> m = new HashMap<ColumnIdentifier, Term.Raw>(); 
        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:864:5: ( '{' k1= cident ':' v1= term ( ',' kn= cident ':' vn= term )* '}' )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:864:7: '{' k1= cident ':' v1= term ( ',' kn= cident ':' vn= term )* '}'
            {
            match(input,147,FOLLOW_147_in_usertype_literal5269); 
            pushFollow(FOLLOW_cident_in_usertype_literal5273);
            k1=cident();

            state._fsp--;

            match(input,148,FOLLOW_148_in_usertype_literal5275); 
            pushFollow(FOLLOW_term_in_usertype_literal5279);
            v1=term();

            state._fsp--;

             m.put(k1, v1); 
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:864:52: ( ',' kn= cident ':' vn= term )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==141) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:864:54: ',' kn= cident ':' vn= term
            	    {
            	    match(input,141,FOLLOW_141_in_usertype_literal5285); 
            	    pushFollow(FOLLOW_cident_in_usertype_literal5289);
            	    kn=cident();

            	    state._fsp--;

            	    match(input,148,FOLLOW_148_in_usertype_literal5291); 
            	    pushFollow(FOLLOW_term_in_usertype_literal5295);
            	    vn=term();

            	    state._fsp--;

            	     m.put(kn, vn); 

            	    }
            	    break;

            	default :
            	    break loop101;
                }
            } while (true);

            match(input,149,FOLLOW_149_in_usertype_literal5302); 

            }

             ut = new UserTypes.Literal(m); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ut;
    }
    // $ANTLR end "usertype_literal"


    // $ANTLR start "value"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:867:1: value returns [Term.Raw value] : (c= constant | l= collection_literal | u= usertype_literal | K_NULL | ':' id= cident | QMARK );
    public final Term.Raw value() throws RecognitionException {
        Term.Raw value = null;

        Constants.Literal c = null;

        Term.Raw l = null;

        UserTypes.Literal u = null;

        ColumnIdentifier id = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:868:5: (c= constant | l= collection_literal | u= usertype_literal | K_NULL | ':' id= cident | QMARK )
            int alt102=6;
            alt102 = dfa102.predict(input);
            switch (alt102) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:868:7: c= constant
                    {
                    pushFollow(FOLLOW_constant_in_value5325);
                    c=constant();

                    state._fsp--;

                     value = c; 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:869:7: l= collection_literal
                    {
                    pushFollow(FOLLOW_collection_literal_in_value5347);
                    l=collection_literal();

                    state._fsp--;

                     value = l; 

                    }
                    break;
                case 3 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:870:7: u= usertype_literal
                    {
                    pushFollow(FOLLOW_usertype_literal_in_value5359);
                    u=usertype_literal();

                    state._fsp--;

                     value = u; 

                    }
                    break;
                case 4 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:871:7: K_NULL
                    {
                    match(input,K_NULL,FOLLOW_K_NULL_in_value5371); 
                     value = Constants.NULL_LITERAL; 

                    }
                    break;
                case 5 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:872:7: ':' id= cident
                    {
                    match(input,148,FOLLOW_148_in_value5395); 
                    pushFollow(FOLLOW_cident_in_value5399);
                    id=cident();

                    state._fsp--;

                     value = newBindVariables(id); 

                    }
                    break;
                case 6 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:873:7: QMARK
                    {
                    match(input,QMARK,FOLLOW_QMARK_in_value5416); 
                     value = newBindVariables(null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "value"


    // $ANTLR start "intValue"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:876:1: intValue returns [Term.Raw value] : ( | t= INTEGER | ':' id= cident | QMARK );
    public final Term.Raw intValue() throws RecognitionException {
        Term.Raw value = null;

        Token t=null;
        ColumnIdentifier id = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:877:5: ( | t= INTEGER | ':' id= cident | QMARK )
            int alt103=4;
            switch ( input.LA(1) ) {
            case EOF:
            case K_WHERE:
            case K_ALLOW:
            case K_AND:
            case K_INSERT:
            case K_UPDATE:
            case K_SET:
            case K_DELETE:
            case K_APPLY:
            case 138:
                {
                alt103=1;
                }
                break;
            case INTEGER:
                {
                alt103=2;
                }
                break;
            case 148:
                {
                alt103=3;
                }
                break;
            case QMARK:
                {
                alt103=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:878:5: 
                    {
                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:878:7: t= INTEGER
                    {
                    t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_intValue5462); 
                     value = Constants.Literal.integer((t!=null?t.getText():null)); 

                    }
                    break;
                case 3 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:879:7: ':' id= cident
                    {
                    match(input,148,FOLLOW_148_in_intValue5476); 
                    pushFollow(FOLLOW_cident_in_intValue5480);
                    id=cident();

                    state._fsp--;

                     value = newBindVariables(id); 

                    }
                    break;
                case 4 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:880:7: QMARK
                    {
                    match(input,QMARK,FOLLOW_QMARK_in_intValue5490); 
                     value = newBindVariables(null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "intValue"


    // $ANTLR start "functionName"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:883:1: functionName returns [String s] : (f= IDENT | u= unreserved_function_keyword | K_TOKEN );
    public final String functionName() throws RecognitionException {
        String s = null;

        Token f=null;
        String u = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:884:5: (f= IDENT | u= unreserved_function_keyword | K_TOKEN )
            int alt104=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt104=1;
                }
                break;
            case K_DISTINCT:
            case K_AS:
            case K_FILTERING:
            case K_VALUES:
            case K_EXISTS:
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_STATIC:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_TYPE:
            case K_CUSTOM:
            case K_KEYS:
            case K_TRIGGER:
            case K_LIST:
            case K_ALL:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case K_CONTAINS:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt104=2;
                }
                break;
            case K_TOKEN:
                {
                alt104=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:884:7: f= IDENT
                    {
                    f=(Token)match(input,IDENT,FOLLOW_IDENT_in_functionName5523); 
                     s = (f!=null?f.getText():null); 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:885:7: u= unreserved_function_keyword
                    {
                    pushFollow(FOLLOW_unreserved_function_keyword_in_functionName5557);
                    u=unreserved_function_keyword();

                    state._fsp--;

                     s = u; 

                    }
                    break;
                case 3 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:886:7: K_TOKEN
                    {
                    match(input,K_TOKEN,FOLLOW_K_TOKEN_in_functionName5567); 
                     s = "token"; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return s;
    }
    // $ANTLR end "functionName"


    // $ANTLR start "functionArgs"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:889:1: functionArgs returns [List<Term.Raw> a] : ( '(' ')' | '(' t1= term ( ',' tn= term )* ')' );
    public final List<Term.Raw> functionArgs() throws RecognitionException {
        List<Term.Raw> a = null;

        Term.Raw t1 = null;

        Term.Raw tn = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:890:5: ( '(' ')' | '(' t1= term ( ',' tn= term )* ')' )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==139) ) {
                int LA106_1 = input.LA(2);

                if ( (LA106_1==140) ) {
                    alt106=1;
                }
                else if ( (LA106_1==K_DISTINCT||LA106_1==K_AS||LA106_1==K_FILTERING||LA106_1==INTEGER||LA106_1==K_VALUES||LA106_1==K_EXISTS||LA106_1==K_TIMESTAMP||LA106_1==K_COUNTER||LA106_1==K_STATIC||(LA106_1>=K_KEY && LA106_1<=K_CUSTOM)||LA106_1==IDENT||(LA106_1>=STRING_LITERAL && LA106_1<=K_TRIGGER)||LA106_1==K_LIST||(LA106_1>=K_ALL && LA106_1<=K_PASSWORD)||(LA106_1>=FLOAT && LA106_1<=K_TOKEN)||(LA106_1>=K_CONTAINS && LA106_1<=K_MAP)||LA106_1==139||LA106_1==144||(LA106_1>=146 && LA106_1<=148)) ) {
                    alt106=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 106, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:890:7: '(' ')'
                    {
                    match(input,139,FOLLOW_139_in_functionArgs5612); 
                    match(input,140,FOLLOW_140_in_functionArgs5614); 
                     a = Collections.emptyList(); 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:891:7: '(' t1= term ( ',' tn= term )* ')'
                    {
                    match(input,139,FOLLOW_139_in_functionArgs5624); 
                    pushFollow(FOLLOW_term_in_functionArgs5628);
                    t1=term();

                    state._fsp--;

                     List<Term.Raw> args = new ArrayList<Term.Raw>(); args.add(t1); 
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:892:11: ( ',' tn= term )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==141) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:892:13: ',' tn= term
                    	    {
                    	    match(input,141,FOLLOW_141_in_functionArgs5644); 
                    	    pushFollow(FOLLOW_term_in_functionArgs5648);
                    	    tn=term();

                    	    state._fsp--;

                    	     args.add(tn); 

                    	    }
                    	    break;

                    	default :
                    	    break loop105;
                        }
                    } while (true);

                    match(input,140,FOLLOW_140_in_functionArgs5662); 
                     a = args; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return a;
    }
    // $ANTLR end "functionArgs"


    // $ANTLR start "term"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:896:1: term returns [Term.Raw term] : (v= value | f= functionName args= functionArgs | '(' c= comparatorType ')' t= term );
    public final Term.Raw term() throws RecognitionException {
        Term.Raw term = null;

        Term.Raw v = null;

        String f = null;

        List<Term.Raw> args = null;

        CQL3Type.Raw c = null;

        Term.Raw t = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:897:5: (v= value | f= functionName args= functionArgs | '(' c= comparatorType ')' t= term )
            int alt107=3;
            switch ( input.LA(1) ) {
            case INTEGER:
            case STRING_LITERAL:
            case FLOAT:
            case BOOLEAN:
            case UUID:
            case HEXNUMBER:
            case K_NAN:
            case K_INFINITY:
            case K_NULL:
            case QMARK:
            case 144:
            case 146:
            case 147:
            case 148:
                {
                alt107=1;
                }
                break;
            case K_DISTINCT:
            case K_AS:
            case K_FILTERING:
            case K_VALUES:
            case K_EXISTS:
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_STATIC:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_TYPE:
            case K_CUSTOM:
            case IDENT:
            case K_KEYS:
            case K_TRIGGER:
            case K_LIST:
            case K_ALL:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case K_TOKEN:
            case K_CONTAINS:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt107=2;
                }
                break;
            case 139:
                {
                alt107=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }

            switch (alt107) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:897:7: v= value
                    {
                    pushFollow(FOLLOW_value_in_term5687);
                    v=value();

                    state._fsp--;

                     term = v; 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:898:7: f= functionName args= functionArgs
                    {
                    pushFollow(FOLLOW_functionName_in_term5724);
                    f=functionName();

                    state._fsp--;

                    pushFollow(FOLLOW_functionArgs_in_term5728);
                    args=functionArgs();

                    state._fsp--;

                     term = new FunctionCall.Raw(f, args); 

                    }
                    break;
                case 3 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:899:7: '(' c= comparatorType ')' t= term
                    {
                    match(input,139,FOLLOW_139_in_term5738); 
                    pushFollow(FOLLOW_comparatorType_in_term5742);
                    c=comparatorType();

                    state._fsp--;

                    match(input,140,FOLLOW_140_in_term5744); 
                    pushFollow(FOLLOW_term_in_term5748);
                    t=term();

                    state._fsp--;

                     term = new TypeCast(c, t); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return term;
    }
    // $ANTLR end "term"


    // $ANTLR start "columnOperation"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:902:1: columnOperation[List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations] : (key= cident '=' t= term ( '+' c= cident )? | key= cident '=' c= cident sig= ( '+' | '-' ) t= term | key= cident '=' c= cident i= INTEGER | key= cident '[' k= term ']' '=' t= term );
    public final void columnOperation(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations) throws RecognitionException {
        Token sig=null;
        Token i=null;
        ColumnIdentifier key = null;

        Term.Raw t = null;

        ColumnIdentifier c = null;

        Term.Raw k = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:903:5: (key= cident '=' t= term ( '+' c= cident )? | key= cident '=' c= cident sig= ( '+' | '-' ) t= term | key= cident '=' c= cident i= INTEGER | key= cident '[' k= term ']' '=' t= term )
            int alt109=4;
            alt109 = dfa109.predict(input);
            switch (alt109) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:903:7: key= cident '=' t= term ( '+' c= cident )?
                    {
                    pushFollow(FOLLOW_cident_in_columnOperation5771);
                    key=cident();

                    state._fsp--;

                    match(input,150,FOLLOW_150_in_columnOperation5773); 
                    pushFollow(FOLLOW_term_in_columnOperation5777);
                    t=term();

                    state._fsp--;

                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:903:29: ( '+' c= cident )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==151) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:903:30: '+' c= cident
                            {
                            match(input,151,FOLLOW_151_in_columnOperation5780); 
                            pushFollow(FOLLOW_cident_in_columnOperation5784);
                            c=cident();

                            state._fsp--;


                            }
                            break;

                    }


                              if (c == null)
                              {
                                  addRawUpdate(operations, key, new Operation.SetValue(t));
                              }
                              else
                              {
                                  if (!key.equals(c))
                                      addRecognitionError("Only expressions of the form X = <value> + X are supported.");
                                  addRawUpdate(operations, key, new Operation.Prepend(t));
                              }
                          

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:916:7: key= cident '=' c= cident sig= ( '+' | '-' ) t= term
                    {
                    pushFollow(FOLLOW_cident_in_columnOperation5805);
                    key=cident();

                    state._fsp--;

                    match(input,150,FOLLOW_150_in_columnOperation5807); 
                    pushFollow(FOLLOW_cident_in_columnOperation5811);
                    c=cident();

                    state._fsp--;

                    sig=(Token)input.LT(1);
                    if ( input.LA(1)==146||input.LA(1)==151 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_term_in_columnOperation5825);
                    t=term();

                    state._fsp--;


                              if (!key.equals(c))
                                  addRecognitionError("Only expressions of the form X = X " + (sig!=null?sig.getText():null) + "<value> are supported.");
                              addRawUpdate(operations, key, (sig!=null?sig.getText():null).equals("+") ? new Operation.Addition(t) : new Operation.Substraction(t));
                          

                    }
                    break;
                case 3 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:922:7: key= cident '=' c= cident i= INTEGER
                    {
                    pushFollow(FOLLOW_cident_in_columnOperation5843);
                    key=cident();

                    state._fsp--;

                    match(input,150,FOLLOW_150_in_columnOperation5845); 
                    pushFollow(FOLLOW_cident_in_columnOperation5849);
                    c=cident();

                    state._fsp--;

                    i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_columnOperation5853); 

                              // Note that this production *is* necessary because X = X - 3 will in fact be lexed as [ X, '=', X, INTEGER].
                              if (!key.equals(c))
                                  // We don't yet allow a '+' in front of an integer, but we could in the future really, so let's be future-proof in our error message
                                  addRecognitionError("Only expressions of the form X = X " + ((i!=null?i.getText():null).charAt(0) == '-' ? '-' : '+') + " <value> are supported.");
                              addRawUpdate(operations, key, new Operation.Addition(Constants.Literal.integer((i!=null?i.getText():null))));
                          

                    }
                    break;
                case 4 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:930:7: key= cident '[' k= term ']' '=' t= term
                    {
                    pushFollow(FOLLOW_cident_in_columnOperation5871);
                    key=cident();

                    state._fsp--;

                    match(input,144,FOLLOW_144_in_columnOperation5873); 
                    pushFollow(FOLLOW_term_in_columnOperation5877);
                    k=term();

                    state._fsp--;

                    match(input,145,FOLLOW_145_in_columnOperation5879); 
                    match(input,150,FOLLOW_150_in_columnOperation5881); 
                    pushFollow(FOLLOW_term_in_columnOperation5885);
                    t=term();

                    state._fsp--;


                              addRawUpdate(operations, key, new Operation.SetElement(k, t));
                          

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "columnOperation"


    // $ANTLR start "columnCondition"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:936:1: columnCondition[List<Pair<ColumnIdentifier, ColumnCondition.Raw>> conditions] : (key= cident '=' t= term | key= cident '[' element= term ']' '=' t= term );
    public final void columnCondition(List<Pair<ColumnIdentifier, ColumnCondition.Raw>> conditions) throws RecognitionException {
        ColumnIdentifier key = null;

        Term.Raw t = null;

        Term.Raw element = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:938:5: (key= cident '=' t= term | key= cident '[' element= term ']' '=' t= term )
            int alt110=2;
            alt110 = dfa110.predict(input);
            switch (alt110) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:938:7: key= cident '=' t= term
                    {
                    pushFollow(FOLLOW_cident_in_columnCondition5918);
                    key=cident();

                    state._fsp--;

                    match(input,150,FOLLOW_150_in_columnCondition5920); 
                    pushFollow(FOLLOW_term_in_columnCondition5924);
                    t=term();

                    state._fsp--;

                     conditions.add(Pair.create(key, ColumnCondition.Raw.simpleEqual(t))); 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:939:7: key= cident '[' element= term ']' '=' t= term
                    {
                    pushFollow(FOLLOW_cident_in_columnCondition5936);
                    key=cident();

                    state._fsp--;

                    match(input,144,FOLLOW_144_in_columnCondition5938); 
                    pushFollow(FOLLOW_term_in_columnCondition5942);
                    element=term();

                    state._fsp--;

                    match(input,145,FOLLOW_145_in_columnCondition5944); 
                    match(input,150,FOLLOW_150_in_columnCondition5946); 
                    pushFollow(FOLLOW_term_in_columnCondition5950);
                    t=term();

                    state._fsp--;

                     conditions.add(Pair.create(key, ColumnCondition.Raw.collectionEqual(t, element))); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "columnCondition"


    // $ANTLR start "properties"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:942:1: properties[PropertyDefinitions props] : property[props] ( K_AND property[props] )* ;
    public final void properties(PropertyDefinitions props) throws RecognitionException {
        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:943:5: ( property[props] ( K_AND property[props] )* )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:943:7: property[props] ( K_AND property[props] )*
            {
            pushFollow(FOLLOW_property_in_properties5971);
            property(props);

            state._fsp--;

            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:943:23: ( K_AND property[props] )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==K_AND) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:943:24: K_AND property[props]
            	    {
            	    match(input,K_AND,FOLLOW_K_AND_in_properties5975); 
            	    pushFollow(FOLLOW_property_in_properties5977);
            	    property(props);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop111;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "properties"


    // $ANTLR start "property"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:946:1: property[PropertyDefinitions props] : k= cident '=' (simple= propertyValue | map= map_literal ) ;
    public final void property(PropertyDefinitions props) throws RecognitionException {
        ColumnIdentifier k = null;

        String simple = null;

        Maps.Literal map = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:947:5: (k= cident '=' (simple= propertyValue | map= map_literal ) )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:947:7: k= cident '=' (simple= propertyValue | map= map_literal )
            {
            pushFollow(FOLLOW_cident_in_property6000);
            k=cident();

            state._fsp--;

            match(input,150,FOLLOW_150_in_property6002); 
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:947:20: (simple= propertyValue | map= map_literal )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( ((LA112_0>=K_DISTINCT && LA112_0<=K_AS)||(LA112_0>=K_FILTERING && LA112_0<=INTEGER)||LA112_0==K_VALUES||LA112_0==K_EXISTS||LA112_0==K_TIMESTAMP||LA112_0==K_COUNTER||LA112_0==K_STATIC||(LA112_0>=K_KEY && LA112_0<=K_CUSTOM)||(LA112_0>=STRING_LITERAL && LA112_0<=K_TRIGGER)||LA112_0==K_LIST||(LA112_0>=K_ALL && LA112_0<=K_PASSWORD)||(LA112_0>=FLOAT && LA112_0<=K_INFINITY)||(LA112_0>=K_CONTAINS && LA112_0<=K_MAP)||LA112_0==146) ) {
                alt112=1;
            }
            else if ( (LA112_0==147) ) {
                alt112=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }
            switch (alt112) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:947:21: simple= propertyValue
                    {
                    pushFollow(FOLLOW_propertyValue_in_property6007);
                    simple=propertyValue();

                    state._fsp--;

                     try { props.addProperty(k.toString(), simple); } catch (SyntaxException e) { addRecognitionError(e.getMessage()); } 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:948:24: map= map_literal
                    {
                    pushFollow(FOLLOW_map_literal_in_property6036);
                    map=map_literal();

                    state._fsp--;

                     try { props.addProperty(k.toString(), convertPropertyMap(map)); } catch (SyntaxException e) { addRecognitionError(e.getMessage()); } 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "property"


    // $ANTLR start "propertyValue"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:951:1: propertyValue returns [String str] : (c= constant | u= unreserved_keyword );
    public final String propertyValue() throws RecognitionException {
        String str = null;

        Constants.Literal c = null;

        String u = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:952:5: (c= constant | u= unreserved_keyword )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==INTEGER||LA113_0==STRING_LITERAL||(LA113_0>=FLOAT && LA113_0<=K_INFINITY)||LA113_0==146) ) {
                alt113=1;
            }
            else if ( ((LA113_0>=K_DISTINCT && LA113_0<=K_AS)||(LA113_0>=K_FILTERING && LA113_0<=K_TTL)||LA113_0==K_VALUES||LA113_0==K_EXISTS||LA113_0==K_TIMESTAMP||LA113_0==K_COUNTER||LA113_0==K_STATIC||(LA113_0>=K_KEY && LA113_0<=K_CUSTOM)||(LA113_0>=K_KEYS && LA113_0<=K_TRIGGER)||LA113_0==K_LIST||(LA113_0>=K_ALL && LA113_0<=K_PASSWORD)||(LA113_0>=K_CONTAINS && LA113_0<=K_MAP)) ) {
                alt113=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }
            switch (alt113) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:952:7: c= constant
                    {
                    pushFollow(FOLLOW_constant_in_propertyValue6064);
                    c=constant();

                    state._fsp--;

                     str = c.getRawText(); 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:953:7: u= unreserved_keyword
                    {
                    pushFollow(FOLLOW_unreserved_keyword_in_propertyValue6086);
                    u=unreserved_keyword();

                    state._fsp--;

                     str = u; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "propertyValue"


    // $ANTLR start "relationType"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:956:1: relationType returns [Relation.Type op] : ( '=' | '<' | '<=' | '>' | '>=' );
    public final Relation.Type relationType() throws RecognitionException {
        Relation.Type op = null;

        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:957:5: ( '=' | '<' | '<=' | '>' | '>=' )
            int alt114=5;
            switch ( input.LA(1) ) {
            case 150:
                {
                alt114=1;
                }
                break;
            case 152:
                {
                alt114=2;
                }
                break;
            case 153:
                {
                alt114=3;
                }
                break;
            case 154:
                {
                alt114=4;
                }
                break;
            case 155:
                {
                alt114=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }

            switch (alt114) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:957:7: '='
                    {
                    match(input,150,FOLLOW_150_in_relationType6109); 
                     op = Relation.Type.EQ; 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:958:7: '<'
                    {
                    match(input,152,FOLLOW_152_in_relationType6120); 
                     op = Relation.Type.LT; 

                    }
                    break;
                case 3 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:959:7: '<='
                    {
                    match(input,153,FOLLOW_153_in_relationType6131); 
                     op = Relation.Type.LTE; 

                    }
                    break;
                case 4 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:960:7: '>'
                    {
                    match(input,154,FOLLOW_154_in_relationType6141); 
                     op = Relation.Type.GT; 

                    }
                    break;
                case 5 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:961:7: '>='
                    {
                    match(input,155,FOLLOW_155_in_relationType6152); 
                     op = Relation.Type.GTE; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return op;
    }
    // $ANTLR end "relationType"


    // $ANTLR start "relation"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:964:1: relation[List<Relation> clauses] : (name= cident type= relationType t= term | K_TOKEN '(' name1= cident ( ',' namen= cident )* ')' type= relationType t= term | name= cident K_IN ( QMARK | ':' mid= cident ) | name= cident K_IN '(' (f1= term ( ',' fN= term )* )? ')' | name= cident K_CONTAINS ( K_KEY )? t= term | '(' n1= cident ( ',' ni= cident )* ')' type= relationType '(' t1= term ( ',' ti= term )* ')' | '(' relation[$clauses] ')' );
    public final void relation(List<Relation> clauses) throws RecognitionException {
        ColumnIdentifier name = null;

        Relation.Type type = null;

        Term.Raw t = null;

        ColumnIdentifier name1 = null;

        ColumnIdentifier namen = null;

        ColumnIdentifier mid = null;

        Term.Raw f1 = null;

        Term.Raw fN = null;

        ColumnIdentifier n1 = null;

        ColumnIdentifier ni = null;

        Term.Raw t1 = null;

        Term.Raw ti = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:965:5: (name= cident type= relationType t= term | K_TOKEN '(' name1= cident ( ',' namen= cident )* ')' type= relationType t= term | name= cident K_IN ( QMARK | ':' mid= cident ) | name= cident K_IN '(' (f1= term ( ',' fN= term )* )? ')' | name= cident K_CONTAINS ( K_KEY )? t= term | '(' n1= cident ( ',' ni= cident )* ')' type= relationType '(' t1= term ( ',' ti= term )* ')' | '(' relation[$clauses] ')' )
            int alt122=7;
            alt122 = dfa122.predict(input);
            switch (alt122) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:965:7: name= cident type= relationType t= term
                    {
                    pushFollow(FOLLOW_cident_in_relation6174);
                    name=cident();

                    state._fsp--;

                    pushFollow(FOLLOW_relationType_in_relation6178);
                    type=relationType();

                    state._fsp--;

                    pushFollow(FOLLOW_term_in_relation6182);
                    t=term();

                    state._fsp--;

                     clauses.add(new Relation(name, type, t)); 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:966:7: K_TOKEN '(' name1= cident ( ',' namen= cident )* ')' type= relationType t= term
                    {
                    match(input,K_TOKEN,FOLLOW_K_TOKEN_in_relation6192); 
                     List<ColumnIdentifier> l = new ArrayList<ColumnIdentifier>(); 
                    match(input,139,FOLLOW_139_in_relation6215); 
                    pushFollow(FOLLOW_cident_in_relation6219);
                    name1=cident();

                    state._fsp--;

                     l.add(name1); 
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:968:46: ( ',' namen= cident )*
                    loop115:
                    do {
                        int alt115=2;
                        int LA115_0 = input.LA(1);

                        if ( (LA115_0==141) ) {
                            alt115=1;
                        }


                        switch (alt115) {
                    	case 1 :
                    	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:968:48: ',' namen= cident
                    	    {
                    	    match(input,141,FOLLOW_141_in_relation6225); 
                    	    pushFollow(FOLLOW_cident_in_relation6229);
                    	    namen=cident();

                    	    state._fsp--;

                    	     l.add(namen); 

                    	    }
                    	    break;

                    	default :
                    	    break loop115;
                        }
                    } while (true);

                    match(input,140,FOLLOW_140_in_relation6235); 
                    pushFollow(FOLLOW_relationType_in_relation6247);
                    type=relationType();

                    state._fsp--;

                    pushFollow(FOLLOW_term_in_relation6251);
                    t=term();

                    state._fsp--;


                                for (ColumnIdentifier id : l)
                                    clauses.add(new Relation(id, type, t, true));
                            

                    }
                    break;
                case 3 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:974:7: name= cident K_IN ( QMARK | ':' mid= cident )
                    {
                    pushFollow(FOLLOW_cident_in_relation6271);
                    name=cident();

                    state._fsp--;

                    match(input,K_IN,FOLLOW_K_IN_in_relation6273); 
                     Term.Raw marker = null; 
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:974:52: ( QMARK | ':' mid= cident )
                    int alt116=2;
                    int LA116_0 = input.LA(1);

                    if ( (LA116_0==QMARK) ) {
                        alt116=1;
                    }
                    else if ( (LA116_0==148) ) {
                        alt116=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 116, 0, input);

                        throw nvae;
                    }
                    switch (alt116) {
                        case 1 :
                            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:974:53: QMARK
                            {
                            match(input,QMARK,FOLLOW_QMARK_in_relation6278); 
                             marker = newINBindVariables(null); 

                            }
                            break;
                        case 2 :
                            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:974:100: ':' mid= cident
                            {
                            match(input,148,FOLLOW_148_in_relation6284); 
                            pushFollow(FOLLOW_cident_in_relation6288);
                            mid=cident();

                            state._fsp--;

                             marker = newINBindVariables(mid); 

                            }
                            break;

                    }

                     clauses.add(new Relation(name, Relation.Type.IN, marker)); 

                    }
                    break;
                case 4 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:976:7: name= cident K_IN '(' (f1= term ( ',' fN= term )* )? ')'
                    {
                    pushFollow(FOLLOW_cident_in_relation6311);
                    name=cident();

                    state._fsp--;

                    match(input,K_IN,FOLLOW_K_IN_in_relation6313); 
                     Relation rel = Relation.createInRelation(name); 
                    match(input,139,FOLLOW_139_in_relation6324); 
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:977:12: (f1= term ( ',' fN= term )* )?
                    int alt118=2;
                    int LA118_0 = input.LA(1);

                    if ( (LA118_0==K_DISTINCT||LA118_0==K_AS||LA118_0==K_FILTERING||LA118_0==INTEGER||LA118_0==K_VALUES||LA118_0==K_EXISTS||LA118_0==K_TIMESTAMP||LA118_0==K_COUNTER||LA118_0==K_STATIC||(LA118_0>=K_KEY && LA118_0<=K_CUSTOM)||LA118_0==IDENT||(LA118_0>=STRING_LITERAL && LA118_0<=K_TRIGGER)||LA118_0==K_LIST||(LA118_0>=K_ALL && LA118_0<=K_PASSWORD)||(LA118_0>=FLOAT && LA118_0<=K_TOKEN)||(LA118_0>=K_CONTAINS && LA118_0<=K_MAP)||LA118_0==139||LA118_0==144||(LA118_0>=146 && LA118_0<=148)) ) {
                        alt118=1;
                    }
                    switch (alt118) {
                        case 1 :
                            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:977:14: f1= term ( ',' fN= term )*
                            {
                            pushFollow(FOLLOW_term_in_relation6330);
                            f1=term();

                            state._fsp--;

                             rel.addInValue(f1); 
                            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:977:46: ( ',' fN= term )*
                            loop117:
                            do {
                                int alt117=2;
                                int LA117_0 = input.LA(1);

                                if ( (LA117_0==141) ) {
                                    alt117=1;
                                }


                                switch (alt117) {
                            	case 1 :
                            	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:977:47: ',' fN= term
                            	    {
                            	    match(input,141,FOLLOW_141_in_relation6335); 
                            	    pushFollow(FOLLOW_term_in_relation6339);
                            	    fN=term();

                            	    state._fsp--;

                            	     rel.addInValue(fN); 

                            	    }
                            	    break;

                            	default :
                            	    break loop117;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,140,FOLLOW_140_in_relation6349); 
                     clauses.add(rel); 

                    }
                    break;
                case 5 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:978:7: name= cident K_CONTAINS ( K_KEY )? t= term
                    {
                    pushFollow(FOLLOW_cident_in_relation6361);
                    name=cident();

                    state._fsp--;

                    match(input,K_CONTAINS,FOLLOW_K_CONTAINS_in_relation6363); 
                     Relation.Type rt = Relation.Type.CONTAINS; 
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:978:77: ( K_KEY )?
                    int alt119=2;
                    alt119 = dfa119.predict(input);
                    switch (alt119) {
                        case 1 :
                            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:978:78: K_KEY
                            {
                            match(input,K_KEY,FOLLOW_K_KEY_in_relation6368); 
                             rt = Relation.Type.CONTAINS_KEY; 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_term_in_relation6384);
                    t=term();

                    state._fsp--;

                     clauses.add(new Relation(name, rt, t)); 

                    }
                    break;
                case 6 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:980:7: '(' n1= cident ( ',' ni= cident )* ')' type= relationType '(' t1= term ( ',' ti= term )* ')'
                    {

                             List<ColumnIdentifier> ids = new ArrayList<ColumnIdentifier>();
                             List<Term.Raw> terms = new ArrayList<Term.Raw>();
                          
                    match(input,139,FOLLOW_139_in_relation6404); 
                    pushFollow(FOLLOW_cident_in_relation6408);
                    n1=cident();

                    state._fsp--;

                     ids.add(n1); 
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:984:40: ( ',' ni= cident )*
                    loop120:
                    do {
                        int alt120=2;
                        int LA120_0 = input.LA(1);

                        if ( (LA120_0==141) ) {
                            alt120=1;
                        }


                        switch (alt120) {
                    	case 1 :
                    	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:984:41: ',' ni= cident
                    	    {
                    	    match(input,141,FOLLOW_141_in_relation6413); 
                    	    pushFollow(FOLLOW_cident_in_relation6417);
                    	    ni=cident();

                    	    state._fsp--;

                    	     ids.add(ni); 

                    	    }
                    	    break;

                    	default :
                    	    break loop120;
                        }
                    } while (true);

                    match(input,140,FOLLOW_140_in_relation6423); 
                    pushFollow(FOLLOW_relationType_in_relation6435);
                    type=relationType();

                    state._fsp--;

                    match(input,139,FOLLOW_139_in_relation6445); 
                    pushFollow(FOLLOW_term_in_relation6449);
                    t1=term();

                    state._fsp--;

                     terms.add(t1); 
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:986:40: ( ',' ti= term )*
                    loop121:
                    do {
                        int alt121=2;
                        int LA121_0 = input.LA(1);

                        if ( (LA121_0==141) ) {
                            alt121=1;
                        }


                        switch (alt121) {
                    	case 1 :
                    	    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:986:41: ',' ti= term
                    	    {
                    	    match(input,141,FOLLOW_141_in_relation6454); 
                    	    pushFollow(FOLLOW_term_in_relation6458);
                    	    ti=term();

                    	    state._fsp--;

                    	     terms.add(ti); 

                    	    }
                    	    break;

                    	default :
                    	    break loop121;
                        }
                    } while (true);

                    match(input,140,FOLLOW_140_in_relation6464); 

                              if (type == Relation.Type.IN)
                                  addRecognitionError("Cannot use IN relation with tuple notation");
                              if (ids.size() != terms.size())
                                  addRecognitionError(String.format("Number of values (" + terms.size() + ") in tuple notation doesn't match the number of column names (" + ids.size() + ")"));
                              else
                                  for (int i = 0; i < ids.size(); i++)
                                      clauses.add(new Relation(ids.get(i), type, terms.get(i), i == 0 ? null : ids.get(i-1)));
                          

                    }
                    break;
                case 7 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:996:7: '(' relation[$clauses] ')'
                    {
                    match(input,139,FOLLOW_139_in_relation6480); 
                    pushFollow(FOLLOW_relation_in_relation6482);
                    relation(clauses);

                    state._fsp--;

                    match(input,140,FOLLOW_140_in_relation6485); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "relation"


    // $ANTLR start "comparatorType"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:999:1: comparatorType returns [CQL3Type.Raw t] : (n= native_type | c= collection_type | id= userTypeName | s= STRING_LITERAL );
    public final CQL3Type.Raw comparatorType() throws RecognitionException {
        CQL3Type.Raw t = null;

        Token s=null;
        CQL3Type n = null;

        CQL3Type.Raw c = null;

        UTName id = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1000:5: (n= native_type | c= collection_type | id= userTypeName | s= STRING_LITERAL )
            int alt123=4;
            alt123 = dfa123.predict(input);
            switch (alt123) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1000:7: n= native_type
                    {
                    pushFollow(FOLLOW_native_type_in_comparatorType6508);
                    n=native_type();

                    state._fsp--;

                     t = CQL3Type.Raw.from(n); 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1001:7: c= collection_type
                    {
                    pushFollow(FOLLOW_collection_type_in_comparatorType6524);
                    c=collection_type();

                    state._fsp--;

                     t = c; 

                    }
                    break;
                case 3 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1002:7: id= userTypeName
                    {
                    pushFollow(FOLLOW_userTypeName_in_comparatorType6536);
                    id=userTypeName();

                    state._fsp--;

                     t = CQL3Type.Raw.userType(id); 

                    }
                    break;
                case 4 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1003:7: s= STRING_LITERAL
                    {
                    s=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_comparatorType6549); 

                            try {
                                t = CQL3Type.Raw.from(new CQL3Type.Custom((s!=null?s.getText():null)));
                            } catch (SyntaxException e) {
                                addRecognitionError("Cannot parse type " + (s!=null?s.getText():null) + ": " + e.getMessage());
                            } catch (ConfigurationException e) {
                                addRecognitionError("Error setting type " + (s!=null?s.getText():null) + ": " + e.getMessage());
                            }
                          

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return t;
    }
    // $ANTLR end "comparatorType"


    // $ANTLR start "native_type"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1015:1: native_type returns [CQL3Type t] : ( K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INET | K_INT | K_TEXT | K_TIMESTAMP | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID );
    public final CQL3Type native_type() throws RecognitionException {
        CQL3Type t = null;

        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1016:5: ( K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INET | K_INT | K_TEXT | K_TIMESTAMP | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID )
            int alt124=16;
            switch ( input.LA(1) ) {
            case K_ASCII:
                {
                alt124=1;
                }
                break;
            case K_BIGINT:
                {
                alt124=2;
                }
                break;
            case K_BLOB:
                {
                alt124=3;
                }
                break;
            case K_BOOLEAN:
                {
                alt124=4;
                }
                break;
            case K_COUNTER:
                {
                alt124=5;
                }
                break;
            case K_DECIMAL:
                {
                alt124=6;
                }
                break;
            case K_DOUBLE:
                {
                alt124=7;
                }
                break;
            case K_FLOAT:
                {
                alt124=8;
                }
                break;
            case K_INET:
                {
                alt124=9;
                }
                break;
            case K_INT:
                {
                alt124=10;
                }
                break;
            case K_TEXT:
                {
                alt124=11;
                }
                break;
            case K_TIMESTAMP:
                {
                alt124=12;
                }
                break;
            case K_UUID:
                {
                alt124=13;
                }
                break;
            case K_VARCHAR:
                {
                alt124=14;
                }
                break;
            case K_VARINT:
                {
                alt124=15;
                }
                break;
            case K_TIMEUUID:
                {
                alt124=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }

            switch (alt124) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1016:7: K_ASCII
                    {
                    match(input,K_ASCII,FOLLOW_K_ASCII_in_native_type6578); 
                     t = CQL3Type.Native.ASCII; 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1017:7: K_BIGINT
                    {
                    match(input,K_BIGINT,FOLLOW_K_BIGINT_in_native_type6592); 
                     t = CQL3Type.Native.BIGINT; 

                    }
                    break;
                case 3 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1018:7: K_BLOB
                    {
                    match(input,K_BLOB,FOLLOW_K_BLOB_in_native_type6605); 
                     t = CQL3Type.Native.BLOB; 

                    }
                    break;
                case 4 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1019:7: K_BOOLEAN
                    {
                    match(input,K_BOOLEAN,FOLLOW_K_BOOLEAN_in_native_type6620); 
                     t = CQL3Type.Native.BOOLEAN; 

                    }
                    break;
                case 5 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1020:7: K_COUNTER
                    {
                    match(input,K_COUNTER,FOLLOW_K_COUNTER_in_native_type6632); 
                     t = CQL3Type.Native.COUNTER; 

                    }
                    break;
                case 6 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1021:7: K_DECIMAL
                    {
                    match(input,K_DECIMAL,FOLLOW_K_DECIMAL_in_native_type6644); 
                     t = CQL3Type.Native.DECIMAL; 

                    }
                    break;
                case 7 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1022:7: K_DOUBLE
                    {
                    match(input,K_DOUBLE,FOLLOW_K_DOUBLE_in_native_type6656); 
                     t = CQL3Type.Native.DOUBLE; 

                    }
                    break;
                case 8 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1023:7: K_FLOAT
                    {
                    match(input,K_FLOAT,FOLLOW_K_FLOAT_in_native_type6669); 
                     t = CQL3Type.Native.FLOAT; 

                    }
                    break;
                case 9 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1024:7: K_INET
                    {
                    match(input,K_INET,FOLLOW_K_INET_in_native_type6683); 
                     t = CQL3Type.Native.INET;

                    }
                    break;
                case 10 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1025:7: K_INT
                    {
                    match(input,K_INT,FOLLOW_K_INT_in_native_type6698); 
                     t = CQL3Type.Native.INT; 

                    }
                    break;
                case 11 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1026:7: K_TEXT
                    {
                    match(input,K_TEXT,FOLLOW_K_TEXT_in_native_type6714); 
                     t = CQL3Type.Native.TEXT; 

                    }
                    break;
                case 12 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1027:7: K_TIMESTAMP
                    {
                    match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_native_type6729); 
                     t = CQL3Type.Native.TIMESTAMP; 

                    }
                    break;
                case 13 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1028:7: K_UUID
                    {
                    match(input,K_UUID,FOLLOW_K_UUID_in_native_type6739); 
                     t = CQL3Type.Native.UUID; 

                    }
                    break;
                case 14 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1029:7: K_VARCHAR
                    {
                    match(input,K_VARCHAR,FOLLOW_K_VARCHAR_in_native_type6754); 
                     t = CQL3Type.Native.VARCHAR; 

                    }
                    break;
                case 15 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1030:7: K_VARINT
                    {
                    match(input,K_VARINT,FOLLOW_K_VARINT_in_native_type6766); 
                     t = CQL3Type.Native.VARINT; 

                    }
                    break;
                case 16 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1031:7: K_TIMEUUID
                    {
                    match(input,K_TIMEUUID,FOLLOW_K_TIMEUUID_in_native_type6779); 
                     t = CQL3Type.Native.TIMEUUID; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return t;
    }
    // $ANTLR end "native_type"


    // $ANTLR start "collection_type"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1034:1: collection_type returns [CQL3Type.Raw pt] : ( K_MAP '<' t1= comparatorType ',' t2= comparatorType '>' | K_LIST '<' t= comparatorType '>' | K_SET '<' t= comparatorType '>' );
    public final CQL3Type.Raw collection_type() throws RecognitionException {
        CQL3Type.Raw pt = null;

        CQL3Type.Raw t1 = null;

        CQL3Type.Raw t2 = null;

        CQL3Type.Raw t = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1035:5: ( K_MAP '<' t1= comparatorType ',' t2= comparatorType '>' | K_LIST '<' t= comparatorType '>' | K_SET '<' t= comparatorType '>' )
            int alt125=3;
            switch ( input.LA(1) ) {
            case K_MAP:
                {
                alt125=1;
                }
                break;
            case K_LIST:
                {
                alt125=2;
                }
                break;
            case K_SET:
                {
                alt125=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }

            switch (alt125) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1035:7: K_MAP '<' t1= comparatorType ',' t2= comparatorType '>'
                    {
                    match(input,K_MAP,FOLLOW_K_MAP_in_collection_type6803); 
                    match(input,152,FOLLOW_152_in_collection_type6806); 
                    pushFollow(FOLLOW_comparatorType_in_collection_type6810);
                    t1=comparatorType();

                    state._fsp--;

                    match(input,141,FOLLOW_141_in_collection_type6812); 
                    pushFollow(FOLLOW_comparatorType_in_collection_type6816);
                    t2=comparatorType();

                    state._fsp--;

                    match(input,154,FOLLOW_154_in_collection_type6818); 
                     try {
                                // if we can't parse either t1 or t2, antlr will "recover" and we may have t1 or t2 null.
                                if (t1 != null && t2 != null)
                                    pt = CQL3Type.Raw.map(t1, t2);
                              } catch (InvalidRequestException e) { addRecognitionError(e.getMessage()); } 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1041:7: K_LIST '<' t= comparatorType '>'
                    {
                    match(input,K_LIST,FOLLOW_K_LIST_in_collection_type6836); 
                    match(input,152,FOLLOW_152_in_collection_type6838); 
                    pushFollow(FOLLOW_comparatorType_in_collection_type6842);
                    t=comparatorType();

                    state._fsp--;

                    match(input,154,FOLLOW_154_in_collection_type6844); 
                     try { if (t != null) pt = CQL3Type.Raw.list(t); } catch (InvalidRequestException e) { addRecognitionError(e.getMessage()); } 

                    }
                    break;
                case 3 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1043:7: K_SET '<' t= comparatorType '>'
                    {
                    match(input,K_SET,FOLLOW_K_SET_in_collection_type6862); 
                    match(input,152,FOLLOW_152_in_collection_type6865); 
                    pushFollow(FOLLOW_comparatorType_in_collection_type6869);
                    t=comparatorType();

                    state._fsp--;

                    match(input,154,FOLLOW_154_in_collection_type6871); 
                     try { if (t != null) pt = CQL3Type.Raw.set(t); } catch (InvalidRequestException e) { addRecognitionError(e.getMessage()); } 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return pt;
    }
    // $ANTLR end "collection_type"

    public static class username_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "username"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1047:1: username : ( IDENT | STRING_LITERAL );
    public final CqlParser.username_return username() throws RecognitionException {
        CqlParser.username_return retval = new CqlParser.username_return();
        retval.start = input.LT(1);

        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1048:5: ( IDENT | STRING_LITERAL )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
            {
            if ( input.LA(1)==IDENT||input.LA(1)==STRING_LITERAL ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "username"


    // $ANTLR start "non_type_ident"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1054:1: non_type_ident returns [ColumnIdentifier id] : (t= IDENT | t= QUOTED_NAME | k= basic_unreserved_keyword );
    public final ColumnIdentifier non_type_ident() throws RecognitionException {
        ColumnIdentifier id = null;

        Token t=null;
        String k = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1055:5: (t= IDENT | t= QUOTED_NAME | k= basic_unreserved_keyword )
            int alt126=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt126=1;
                }
                break;
            case QUOTED_NAME:
                {
                alt126=2;
                }
                break;
            case K_DISTINCT:
            case K_AS:
            case K_FILTERING:
            case K_VALUES:
            case K_EXISTS:
            case K_STATIC:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_TYPE:
            case K_CUSTOM:
            case K_KEYS:
            case K_TRIGGER:
            case K_LIST:
            case K_ALL:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case K_CONTAINS:
            case K_MAP:
                {
                alt126=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;
            }

            switch (alt126) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1055:7: t= IDENT
                    {
                    t=(Token)match(input,IDENT,FOLLOW_IDENT_in_non_type_ident6931); 
                     if (reservedTypeNames.contains((t!=null?t.getText():null))) addRecognitionError("Invalid (reserved) user type name " + (t!=null?t.getText():null)); id = new ColumnIdentifier((t!=null?t.getText():null), false); 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1056:7: t= QUOTED_NAME
                    {
                    t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_non_type_ident6962); 
                     id = new ColumnIdentifier((t!=null?t.getText():null), true); 

                    }
                    break;
                case 3 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1057:7: k= basic_unreserved_keyword
                    {
                    pushFollow(FOLLOW_basic_unreserved_keyword_in_non_type_ident6987);
                    k=basic_unreserved_keyword();

                    state._fsp--;

                     id = new ColumnIdentifier(k, false); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return id;
    }
    // $ANTLR end "non_type_ident"


    // $ANTLR start "unreserved_keyword"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1060:1: unreserved_keyword returns [String str] : (u= unreserved_function_keyword | k= ( K_TTL | K_COUNT | K_WRITETIME ) );
    public final String unreserved_keyword() throws RecognitionException {
        String str = null;

        Token k=null;
        String u = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1061:5: (u= unreserved_function_keyword | k= ( K_TTL | K_COUNT | K_WRITETIME ) )
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==K_DISTINCT||LA127_0==K_AS||LA127_0==K_FILTERING||LA127_0==K_VALUES||LA127_0==K_EXISTS||LA127_0==K_TIMESTAMP||LA127_0==K_COUNTER||LA127_0==K_STATIC||(LA127_0>=K_KEY && LA127_0<=K_CUSTOM)||(LA127_0>=K_KEYS && LA127_0<=K_TRIGGER)||LA127_0==K_LIST||(LA127_0>=K_ALL && LA127_0<=K_PASSWORD)||(LA127_0>=K_CONTAINS && LA127_0<=K_MAP)) ) {
                alt127=1;
            }
            else if ( (LA127_0==K_COUNT||(LA127_0>=K_WRITETIME && LA127_0<=K_TTL)) ) {
                alt127=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }
            switch (alt127) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1061:7: u= unreserved_function_keyword
                    {
                    pushFollow(FOLLOW_unreserved_function_keyword_in_unreserved_keyword7012);
                    u=unreserved_function_keyword();

                    state._fsp--;

                     str = u; 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1062:7: k= ( K_TTL | K_COUNT | K_WRITETIME )
                    {
                    k=(Token)input.LT(1);
                    if ( input.LA(1)==K_COUNT||(input.LA(1)>=K_WRITETIME && input.LA(1)<=K_TTL) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                     str = (k!=null?k.getText():null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "unreserved_keyword"


    // $ANTLR start "unreserved_function_keyword"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1065:1: unreserved_function_keyword returns [String str] : (u= basic_unreserved_keyword | t= native_type );
    public final String unreserved_function_keyword() throws RecognitionException {
        String str = null;

        String u = null;

        CQL3Type t = null;


        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1066:5: (u= basic_unreserved_keyword | t= native_type )
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==K_DISTINCT||LA128_0==K_AS||LA128_0==K_FILTERING||LA128_0==K_VALUES||LA128_0==K_EXISTS||LA128_0==K_STATIC||(LA128_0>=K_KEY && LA128_0<=K_CUSTOM)||(LA128_0>=K_KEYS && LA128_0<=K_TRIGGER)||LA128_0==K_LIST||(LA128_0>=K_ALL && LA128_0<=K_PASSWORD)||LA128_0==K_CONTAINS||LA128_0==K_MAP) ) {
                alt128=1;
            }
            else if ( (LA128_0==K_TIMESTAMP||LA128_0==K_COUNTER||(LA128_0>=K_ASCII && LA128_0<=K_TIMEUUID)) ) {
                alt128=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }
            switch (alt128) {
                case 1 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1066:7: u= basic_unreserved_keyword
                    {
                    pushFollow(FOLLOW_basic_unreserved_keyword_in_unreserved_function_keyword7063);
                    u=basic_unreserved_keyword();

                    state._fsp--;

                     str = u; 

                    }
                    break;
                case 2 :
                    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1067:7: t= native_type
                    {
                    pushFollow(FOLLOW_native_type_in_unreserved_function_keyword7075);
                    t=native_type();

                    state._fsp--;

                     str = t.toString(); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "unreserved_function_keyword"


    // $ANTLR start "basic_unreserved_keyword"
    // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1070:1: basic_unreserved_keyword returns [String str] : k= ( K_KEY | K_KEYS | K_AS | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_SUPERUSER | K_NOSUPERUSER | K_PASSWORD | K_EXISTS | K_CUSTOM | K_TRIGGER | K_DISTINCT | K_CONTAINS | K_STATIC ) ;
    public final String basic_unreserved_keyword() throws RecognitionException {
        String str = null;

        Token k=null;

        try {
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1071:5: (k= ( K_KEY | K_KEYS | K_AS | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_SUPERUSER | K_NOSUPERUSER | K_PASSWORD | K_EXISTS | K_CUSTOM | K_TRIGGER | K_DISTINCT | K_CONTAINS | K_STATIC ) )
            // /home/rajatsub/Documents/UIUC/RA/Cassandra/CassandraCodeBase/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1071:7: k= ( K_KEY | K_KEYS | K_AS | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_SUPERUSER | K_NOSUPERUSER | K_PASSWORD | K_EXISTS | K_CUSTOM | K_TRIGGER | K_DISTINCT | K_CONTAINS | K_STATIC )
            {
            k=(Token)input.LT(1);
            if ( input.LA(1)==K_DISTINCT||input.LA(1)==K_AS||input.LA(1)==K_FILTERING||input.LA(1)==K_VALUES||input.LA(1)==K_EXISTS||input.LA(1)==K_STATIC||(input.LA(1)>=K_KEY && input.LA(1)<=K_CUSTOM)||(input.LA(1)>=K_KEYS && input.LA(1)<=K_TRIGGER)||input.LA(1)==K_LIST||(input.LA(1)>=K_ALL && input.LA(1)<=K_PASSWORD)||input.LA(1)==K_CONTAINS||input.LA(1)==K_MAP ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             str = (k!=null?k.getText():null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "basic_unreserved_keyword"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA88 dfa88 = new DFA88(this);
    protected DFA102 dfa102 = new DFA102(this);
    protected DFA109 dfa109 = new DFA109(this);
    protected DFA110 dfa110 = new DFA110(this);
    protected DFA122 dfa122 = new DFA122(this);
    protected DFA119 dfa119 = new DFA119(this);
    protected DFA123 dfa123 = new DFA123(this);
    static final String DFA2_eotS =
        "\40\uffff";
    static final String DFA2_eofS =
        "\40\uffff";
    static final String DFA2_minS =
        "\1\4\7\uffff\3\47\2\uffff\1\5\22\uffff";
    static final String DFA2_maxS =
        "\1\100\7\uffff\3\111\2\uffff\1\114\22\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\3\uffff\1\20\1\21\1\uffff\1"+
        "\10\1\11\1\23\1\27\1\31\1\12\1\13\1\14\1\15\1\25\1\30\1\33\1\16"+
        "\1\17\1\24\1\32\1\26\1\22";
    static final String DFA2_specialS =
        "\40\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\6\1\1\20\uffff\1\2\7\uffff\1\3\1\uffff\1\5\1\4\4\uffff\1"+
            "\10\21\uffff\1\11\1\12\3\uffff\1\7\1\13\1\14\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\16\1\uffff\1\17\6\uffff\1\22\2\23\4\uffff\1\21\21\uffff"+
            "\1\20",
            "\1\24\1\uffff\1\25\6\uffff\1\31\1\uffff\1\26\4\uffff\1\30\21"+
            "\uffff\1\27",
            "\1\33\1\uffff\1\32\6\uffff\1\35\30\uffff\1\34",
            "",
            "",
            "\1\37\40\uffff\1\37\21\uffff\2\37\11\uffff\3\37\6\uffff\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "205:1: cqlStatement returns [ParsedStatement stmt] : (st1= selectStatement | st2= insertStatement | st3= updateStatement | st4= batchStatement | st5= deleteStatement | st6= useStatement | st7= truncateStatement | st8= createKeyspaceStatement | st9= createTableStatement | st10= createIndexStatement | st11= dropKeyspaceStatement | st12= dropTableStatement | st13= dropIndexStatement | st14= alterTableStatement | st15= alterKeyspaceStatement | st16= grantStatement | st17= revokeStatement | st18= listPermissionsStatement | st19= createUserStatement | st20= alterUserStatement | st21= dropUserStatement | st22= listUsersStatement | st23= createTriggerStatement | st24= dropTriggerStatement | st25= createTypeStatement | st26= alterTypeStatement | st27= dropTypeStatement );";
        }
    }
    static final String DFA14_eotS =
        "\31\uffff";
    static final String DFA14_eofS =
        "\31\uffff";
    static final String DFA14_minS =
        "\1\6\1\10\1\uffff\23\10\3\uffff";
    static final String DFA14_maxS =
        "\1\150\1\u008f\1\uffff\23\u008f\3\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\1\23\uffff\1\4\1\2\1\3";
    static final String DFA14_specialS =
        "\31\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\3\1\2\1\3\6\uffff\1\3\1\24\1\25\6\uffff\1\3\2\uffff\1\3\1"+
            "\uffff\1\17\5\uffff\1\10\6\uffff\1\3\1\uffff\6\3\1\uffff\1\1"+
            "\2\uffff\2\3\10\uffff\1\3\4\uffff\11\3\1\2\10\uffff\1\26\1\uffff"+
            "\1\3\1\4\1\5\1\6\1\7\1\11\1\12\1\13\1\14\1\15\1\16\1\20\1\21"+
            "\1\22\1\23\1\3",
            "\2\2\u0081\uffff\1\26\2\2\1\uffff\1\2",
            "",
            "\2\2\u0081\uffff\1\26\2\2\1\uffff\1\2",
            "\2\2\u0081\uffff\1\26\2\2\1\uffff\1\2",
            "\2\2\u0081\uffff\1\26\2\2\1\uffff\1\2",
            "\2\2\u0081\uffff\1\26\2\2\1\uffff\1\2",
            "\2\2\u0081\uffff\1\26\2\2\1\uffff\1\2",
            "\2\2\u0081\uffff\1\26\2\2\1\uffff\1\2",
            "\2\2\u0081\uffff\1\26\2\2\1\uffff\1\2",
            "\2\2\u0081\uffff\1\26\2\2\1\uffff\1\2",
            "\2\2\u0081\uffff\1\26\2\2\1\uffff\1\2",
            "\2\2\u0081\uffff\1\26\2\2\1\uffff\1\2",
            "\2\2\u0081\uffff\1\26\2\2\1\uffff\1\2",
            "\2\2\u0081\uffff\1\26\2\2\1\uffff\1\2",
            "\2\2\u0081\uffff\1\26\2\2\1\uffff\1\2",
            "\2\2\u0081\uffff\1\26\2\2\1\uffff\1\2",
            "\2\2\u0081\uffff\1\26\2\2\1\uffff\1\2",
            "\2\2\u0081\uffff\1\26\2\2\1\uffff\1\2",
            "\2\2\u0081\uffff\1\26\2\2\1\uffff\1\2",
            "\2\2\u0081\uffff\1\27\2\2\1\uffff\1\2",
            "\2\2\u0081\uffff\1\30\2\2\1\uffff\1\2",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "287:8: (c= cident | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | f= functionName args= selectionFunctionArgs )";
        }
    }
    static final String DFA36_eotS =
        "\27\uffff";
    static final String DFA36_eofS =
        "\27\uffff";
    static final String DFA36_minS =
        "\1\6\24\11\2\uffff";
    static final String DFA36_maxS =
        "\1\150\24\u0090\2\uffff";
    static final String DFA36_acceptS =
        "\25\uffff\1\1\1\2";
    static final String DFA36_specialS =
        "\27\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\3\1\24\1\3\6\uffff\1\3\2\24\6\uffff\1\3\2\uffff\1\3\1\uffff"+
            "\1\17\5\uffff\1\10\6\uffff\1\3\1\uffff\6\3\1\uffff\1\1\2\uffff"+
            "\2\3\10\uffff\1\3\4\uffff\11\3\1\2\12\uffff\1\3\1\4\1\5\1\6"+
            "\1\7\1\11\1\12\1\13\1\14\1\15\1\16\1\20\1\21\1\22\1\23\1\3",
            "\1\25\u0083\uffff\1\25\2\uffff\1\26",
            "\1\25\u0083\uffff\1\25\2\uffff\1\26",
            "\1\25\u0083\uffff\1\25\2\uffff\1\26",
            "\1\25\u0083\uffff\1\25\2\uffff\1\26",
            "\1\25\u0083\uffff\1\25\2\uffff\1\26",
            "\1\25\u0083\uffff\1\25\2\uffff\1\26",
            "\1\25\u0083\uffff\1\25\2\uffff\1\26",
            "\1\25\u0083\uffff\1\25\2\uffff\1\26",
            "\1\25\u0083\uffff\1\25\2\uffff\1\26",
            "\1\25\u0083\uffff\1\25\2\uffff\1\26",
            "\1\25\u0083\uffff\1\25\2\uffff\1\26",
            "\1\25\u0083\uffff\1\25\2\uffff\1\26",
            "\1\25\u0083\uffff\1\25\2\uffff\1\26",
            "\1\25\u0083\uffff\1\25\2\uffff\1\26",
            "\1\25\u0083\uffff\1\25\2\uffff\1\26",
            "\1\25\u0083\uffff\1\25\2\uffff\1\26",
            "\1\25\u0083\uffff\1\25\2\uffff\1\26",
            "\1\25\u0083\uffff\1\25\2\uffff\1\26",
            "\1\25\u0083\uffff\1\25\2\uffff\1\26",
            "\1\25\u0083\uffff\1\25\2\uffff\1\26",
            "",
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "422:1: deleteOp returns [Operation.RawDeletion op] : (c= cident | c= cident '[' t= term ']' );";
        }
    }
    static final String DFA88_eotS =
        "\27\uffff";
    static final String DFA88_eofS =
        "\1\uffff\24\26\2\uffff";
    static final String DFA88_minS =
        "\1\6\24\11\2\uffff";
    static final String DFA88_maxS =
        "\1\150\24\u008f\2\uffff";
    static final String DFA88_acceptS =
        "\25\uffff\1\1\1\2";
    static final String DFA88_specialS =
        "\27\uffff}>";
    static final String[] DFA88_transitionS = {
            "\1\3\1\24\1\3\6\uffff\1\3\2\24\6\uffff\1\3\2\uffff\1\3\1\uffff"+
            "\1\17\5\uffff\1\10\6\uffff\1\3\1\uffff\6\3\1\uffff\1\1\2\uffff"+
            "\2\3\10\uffff\1\3\4\uffff\11\3\1\2\12\uffff\1\3\1\4\1\5\1\6"+
            "\1\7\1\11\1\12\1\13\1\14\1\15\1\16\1\20\1\21\1\22\1\23\1\3",
            "\3\26\1\uffff\2\26\15\uffff\1\26\2\uffff\1\26\10\uffff\1\26"+
            "\17\uffff\5\26\4\uffff\2\26\107\uffff\2\26\3\uffff\1\25",
            "\3\26\1\uffff\2\26\15\uffff\1\26\2\uffff\1\26\10\uffff\1\26"+
            "\17\uffff\5\26\4\uffff\2\26\107\uffff\2\26\3\uffff\1\25",
            "\3\26\1\uffff\2\26\15\uffff\1\26\2\uffff\1\26\10\uffff\1\26"+
            "\17\uffff\5\26\4\uffff\2\26\107\uffff\2\26\3\uffff\1\25",
            "\3\26\1\uffff\2\26\15\uffff\1\26\2\uffff\1\26\10\uffff\1\26"+
            "\17\uffff\5\26\4\uffff\2\26\107\uffff\2\26\3\uffff\1\25",
            "\3\26\1\uffff\2\26\15\uffff\1\26\2\uffff\1\26\10\uffff\1\26"+
            "\17\uffff\5\26\4\uffff\2\26\107\uffff\2\26\3\uffff\1\25",
            "\3\26\1\uffff\2\26\15\uffff\1\26\2\uffff\1\26\10\uffff\1\26"+
            "\17\uffff\5\26\4\uffff\2\26\107\uffff\2\26\3\uffff\1\25",
            "\3\26\1\uffff\2\26\15\uffff\1\26\2\uffff\1\26\10\uffff\1\26"+
            "\17\uffff\5\26\4\uffff\2\26\107\uffff\2\26\3\uffff\1\25",
            "\3\26\1\uffff\2\26\15\uffff\1\26\2\uffff\1\26\10\uffff\1\26"+
            "\17\uffff\5\26\4\uffff\2\26\107\uffff\2\26\3\uffff\1\25",
            "\3\26\1\uffff\2\26\15\uffff\1\26\2\uffff\1\26\10\uffff\1\26"+
            "\17\uffff\5\26\4\uffff\2\26\107\uffff\2\26\3\uffff\1\25",
            "\3\26\1\uffff\2\26\15\uffff\1\26\2\uffff\1\26\10\uffff\1\26"+
            "\17\uffff\5\26\4\uffff\2\26\107\uffff\2\26\3\uffff\1\25",
            "\3\26\1\uffff\2\26\15\uffff\1\26\2\uffff\1\26\10\uffff\1\26"+
            "\17\uffff\5\26\4\uffff\2\26\107\uffff\2\26\3\uffff\1\25",
            "\3\26\1\uffff\2\26\15\uffff\1\26\2\uffff\1\26\10\uffff\1\26"+
            "\17\uffff\5\26\4\uffff\2\26\107\uffff\2\26\3\uffff\1\25",
            "\3\26\1\uffff\2\26\15\uffff\1\26\2\uffff\1\26\10\uffff\1\26"+
            "\17\uffff\5\26\4\uffff\2\26\107\uffff\2\26\3\uffff\1\25",
            "\3\26\1\uffff\2\26\15\uffff\1\26\2\uffff\1\26\10\uffff\1\26"+
            "\17\uffff\5\26\4\uffff\2\26\107\uffff\2\26\3\uffff\1\25",
            "\3\26\1\uffff\2\26\15\uffff\1\26\2\uffff\1\26\10\uffff\1\26"+
            "\17\uffff\5\26\4\uffff\2\26\107\uffff\2\26\3\uffff\1\25",
            "\3\26\1\uffff\2\26\15\uffff\1\26\2\uffff\1\26\10\uffff\1\26"+
            "\17\uffff\5\26\4\uffff\2\26\107\uffff\2\26\3\uffff\1\25",
            "\3\26\1\uffff\2\26\15\uffff\1\26\2\uffff\1\26\10\uffff\1\26"+
            "\17\uffff\5\26\4\uffff\2\26\107\uffff\2\26\3\uffff\1\25",
            "\3\26\1\uffff\2\26\15\uffff\1\26\2\uffff\1\26\10\uffff\1\26"+
            "\17\uffff\5\26\4\uffff\2\26\107\uffff\2\26\3\uffff\1\25",
            "\3\26\1\uffff\2\26\15\uffff\1\26\2\uffff\1\26\10\uffff\1\26"+
            "\17\uffff\5\26\4\uffff\2\26\107\uffff\2\26\3\uffff\1\25",
            "\3\26\1\uffff\2\26\15\uffff\1\26\2\uffff\1\26\10\uffff\1\26"+
            "\17\uffff\5\26\4\uffff\2\26\107\uffff\2\26\3\uffff\1\25",
            "",
            ""
    };

    static final short[] DFA88_eot = DFA.unpackEncodedString(DFA88_eotS);
    static final short[] DFA88_eof = DFA.unpackEncodedString(DFA88_eofS);
    static final char[] DFA88_min = DFA.unpackEncodedStringToUnsignedChars(DFA88_minS);
    static final char[] DFA88_max = DFA.unpackEncodedStringToUnsignedChars(DFA88_maxS);
    static final short[] DFA88_accept = DFA.unpackEncodedString(DFA88_acceptS);
    static final short[] DFA88_special = DFA.unpackEncodedString(DFA88_specialS);
    static final short[][] DFA88_transition;

    static {
        int numStates = DFA88_transitionS.length;
        DFA88_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA88_transition[i] = DFA.unpackEncodedString(DFA88_transitionS[i]);
        }
    }

    class DFA88 extends DFA {

        public DFA88(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 88;
            this.eot = DFA88_eot;
            this.eof = DFA88_eof;
            this.min = DFA88_min;
            this.max = DFA88_max;
            this.accept = DFA88_accept;
            this.special = DFA88_special;
            this.transition = DFA88_transition;
        }
        public String getDescription() {
            return "812:7: ( cfOrKsName[name, true] '.' )?";
        }
    }
    static final String DFA102_eotS =
        "\32\uffff";
    static final String DFA102_eofS =
        "\32\uffff";
    static final String DFA102_minS =
        "\1\22\2\uffff\1\6\3\uffff\1\u008b\1\uffff\21\u008b";
    static final String DFA102_maxS =
        "\1\u0094\2\uffff\1\u0095\3\uffff\1\u0094\1\uffff\21\u0094";
    static final String DFA102_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\uffff\1\3\21\uffff";
    static final String DFA102_specialS =
        "\32\uffff}>";
    static final String[] DFA102_transitionS = {
            "\1\1\42\uffff\1\1\31\uffff\6\1\1\4\1\6\71\uffff\1\2\1\uffff"+
            "\1\1\1\3\1\5",
            "",
            "",
            "\1\11\1\10\1\11\6\uffff\1\11\2\10\1\2\5\uffff\1\11\2\uffff"+
            "\1\11\1\uffff\1\25\5\uffff\1\16\6\uffff\1\11\1\uffff\6\11\1"+
            "\uffff\1\7\1\uffff\1\2\2\11\10\uffff\1\11\4\uffff\11\11\1\10"+
            "\11\2\1\uffff\1\11\1\12\1\13\1\14\1\15\1\17\1\20\1\21\1\22\1"+
            "\23\1\24\1\26\1\27\1\30\1\31\1\11\42\uffff\1\2\4\uffff\1\2\1"+
            "\uffff\4\2",
            "",
            "",
            "",
            "\1\2\10\uffff\1\10",
            "",
            "\1\2\10\uffff\1\10",
            "\1\2\10\uffff\1\10",
            "\1\2\10\uffff\1\10",
            "\1\2\10\uffff\1\10",
            "\1\2\10\uffff\1\10",
            "\1\2\10\uffff\1\10",
            "\1\2\10\uffff\1\10",
            "\1\2\10\uffff\1\10",
            "\1\2\10\uffff\1\10",
            "\1\2\10\uffff\1\10",
            "\1\2\10\uffff\1\10",
            "\1\2\10\uffff\1\10",
            "\1\2\10\uffff\1\10",
            "\1\2\10\uffff\1\10",
            "\1\2\10\uffff\1\10",
            "\1\2\10\uffff\1\10",
            "\1\2\10\uffff\1\10"
    };

    static final short[] DFA102_eot = DFA.unpackEncodedString(DFA102_eotS);
    static final short[] DFA102_eof = DFA.unpackEncodedString(DFA102_eofS);
    static final char[] DFA102_min = DFA.unpackEncodedStringToUnsignedChars(DFA102_minS);
    static final char[] DFA102_max = DFA.unpackEncodedStringToUnsignedChars(DFA102_maxS);
    static final short[] DFA102_accept = DFA.unpackEncodedString(DFA102_acceptS);
    static final short[] DFA102_special = DFA.unpackEncodedString(DFA102_specialS);
    static final short[][] DFA102_transition;

    static {
        int numStates = DFA102_transitionS.length;
        DFA102_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA102_transition[i] = DFA.unpackEncodedString(DFA102_transitionS[i]);
        }
    }

    class DFA102 extends DFA {

        public DFA102(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 102;
            this.eot = DFA102_eot;
            this.eof = DFA102_eof;
            this.min = DFA102_min;
            this.max = DFA102_max;
            this.accept = DFA102_accept;
            this.special = DFA102_special;
            this.transition = DFA102_transition;
        }
        public String getDescription() {
            return "867:1: value returns [Term.Raw value] : (c= constant | l= collection_literal | u= usertype_literal | K_NULL | ':' id= cident | QMARK );";
        }
    }
    static final String DFA109_eotS =
        "\56\uffff";
    static final String DFA109_eofS =
        "\56\uffff";
    static final String DFA109_minS =
        "\1\6\24\u0090\1\6\1\uffff\24\22\3\uffff";
    static final String DFA109_maxS =
        "\1\150\24\u0096\1\u0094\1\uffff\24\u0097\3\uffff";
    static final String DFA109_acceptS =
        "\26\uffff\1\4\24\uffff\1\1\1\3\1\2";
    static final String DFA109_specialS =
        "\56\uffff}>";
    static final String[] DFA109_transitionS = {
            "\1\3\1\24\1\3\6\uffff\1\3\2\24\6\uffff\1\3\2\uffff\1\3\1\uffff"+
            "\1\17\5\uffff\1\10\6\uffff\1\3\1\uffff\6\3\1\uffff\1\1\2\uffff"+
            "\2\3\10\uffff\1\3\4\uffff\11\3\1\2\12\uffff\1\3\1\4\1\5\1\6"+
            "\1\7\1\11\1\12\1\13\1\14\1\15\1\16\1\20\1\21\1\22\1\23\1\3",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\31\1\52\1\31\6\uffff\1\31\2\52\1\53\5\uffff\1\31\2\uffff"+
            "\1\31\1\uffff\1\45\5\uffff\1\36\6\uffff\1\31\1\uffff\6\31\1"+
            "\uffff\1\27\1\uffff\1\53\2\31\10\uffff\1\31\4\uffff\11\31\1"+
            "\30\11\53\1\uffff\1\31\1\32\1\33\1\34\1\35\1\37\1\40\1\41\1"+
            "\42\1\43\1\44\1\46\1\47\1\50\1\51\1\31\42\uffff\1\53\4\uffff"+
            "\1\53\1\uffff\3\53",
            "",
            "\1\54\170\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\177\uffff\1\55\4\uffff\1\55",
            "\1\54\170\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\170\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\170\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\170\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\170\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\170\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\170\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\170\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\170\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\170\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\170\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\170\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\170\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\170\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\170\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\170\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\170\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\177\uffff\1\55\4\uffff\1\55",
            "",
            "",
            ""
    };

    static final short[] DFA109_eot = DFA.unpackEncodedString(DFA109_eotS);
    static final short[] DFA109_eof = DFA.unpackEncodedString(DFA109_eofS);
    static final char[] DFA109_min = DFA.unpackEncodedStringToUnsignedChars(DFA109_minS);
    static final char[] DFA109_max = DFA.unpackEncodedStringToUnsignedChars(DFA109_maxS);
    static final short[] DFA109_accept = DFA.unpackEncodedString(DFA109_acceptS);
    static final short[] DFA109_special = DFA.unpackEncodedString(DFA109_specialS);
    static final short[][] DFA109_transition;

    static {
        int numStates = DFA109_transitionS.length;
        DFA109_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA109_transition[i] = DFA.unpackEncodedString(DFA109_transitionS[i]);
        }
    }

    class DFA109 extends DFA {

        public DFA109(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 109;
            this.eot = DFA109_eot;
            this.eof = DFA109_eof;
            this.min = DFA109_min;
            this.max = DFA109_max;
            this.accept = DFA109_accept;
            this.special = DFA109_special;
            this.transition = DFA109_transition;
        }
        public String getDescription() {
            return "902:1: columnOperation[List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations] : (key= cident '=' t= term ( '+' c= cident )? | key= cident '=' c= cident sig= ( '+' | '-' ) t= term | key= cident '=' c= cident i= INTEGER | key= cident '[' k= term ']' '=' t= term );";
        }
    }
    static final String DFA110_eotS =
        "\27\uffff";
    static final String DFA110_eofS =
        "\27\uffff";
    static final String DFA110_minS =
        "\1\6\24\u0090\2\uffff";
    static final String DFA110_maxS =
        "\1\150\24\u0096\2\uffff";
    static final String DFA110_acceptS =
        "\25\uffff\1\1\1\2";
    static final String DFA110_specialS =
        "\27\uffff}>";
    static final String[] DFA110_transitionS = {
            "\1\3\1\24\1\3\6\uffff\1\3\2\24\6\uffff\1\3\2\uffff\1\3\1\uffff"+
            "\1\17\5\uffff\1\10\6\uffff\1\3\1\uffff\6\3\1\uffff\1\1\2\uffff"+
            "\2\3\10\uffff\1\3\4\uffff\11\3\1\2\12\uffff\1\3\1\4\1\5\1\6"+
            "\1\7\1\11\1\12\1\13\1\14\1\15\1\16\1\20\1\21\1\22\1\23\1\3",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "",
            ""
    };

    static final short[] DFA110_eot = DFA.unpackEncodedString(DFA110_eotS);
    static final short[] DFA110_eof = DFA.unpackEncodedString(DFA110_eofS);
    static final char[] DFA110_min = DFA.unpackEncodedStringToUnsignedChars(DFA110_minS);
    static final char[] DFA110_max = DFA.unpackEncodedStringToUnsignedChars(DFA110_maxS);
    static final short[] DFA110_accept = DFA.unpackEncodedString(DFA110_acceptS);
    static final short[] DFA110_special = DFA.unpackEncodedString(DFA110_specialS);
    static final short[][] DFA110_transition;

    static {
        int numStates = DFA110_transitionS.length;
        DFA110_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA110_transition[i] = DFA.unpackEncodedString(DFA110_transitionS[i]);
        }
    }

    class DFA110 extends DFA {

        public DFA110(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 110;
            this.eot = DFA110_eot;
            this.eof = DFA110_eof;
            this.min = DFA110_min;
            this.max = DFA110_max;
            this.accept = DFA110_accept;
            this.special = DFA110_special;
            this.transition = DFA110_transition;
        }
        public String getDescription() {
            return "936:1: columnCondition[List<Pair<ColumnIdentifier, ColumnCondition.Raw>> conditions] : (key= cident '=' t= term | key= cident '[' element= term ']' '=' t= term );";
        }
    }
    static final String DFA122_eotS =
        "\62\uffff";
    static final String DFA122_eofS =
        "\62\uffff";
    static final String DFA122_minS =
        "\1\6\24\130\1\uffff\1\6\1\126\2\uffff\24\130\4\uffff";
    static final String DFA122_maxS =
        "\1\u008b\24\u009b\1\uffff\1\u008b\1\u0094\2\uffff\24\u009b\4\uffff";
    static final String DFA122_acceptS =
        "\25\uffff\1\2\2\uffff\1\1\1\5\24\uffff\1\7\1\3\1\4\1\6";
    static final String DFA122_specialS =
        "\62\uffff}>";
    static final String[] DFA122_transitionS = {
            "\1\3\1\24\1\3\6\uffff\1\3\2\24\6\uffff\1\3\2\uffff\1\3\1\uffff"+
            "\1\17\5\uffff\1\10\6\uffff\1\3\1\uffff\6\3\1\uffff\1\1\2\uffff"+
            "\2\3\10\uffff\1\3\4\uffff\11\3\1\2\10\uffff\1\25\1\uffff\1\3"+
            "\1\4\1\5\1\6\1\7\1\11\1\12\1\13\1\14\1\15\1\16\1\20\1\21\1\22"+
            "\1\23\1\3\42\uffff\1\26",
            "\1\27\1\31\74\uffff\1\30\1\uffff\4\30",
            "\1\27\1\31\74\uffff\1\30\1\uffff\4\30",
            "\1\27\1\31\74\uffff\1\30\1\uffff\4\30",
            "\1\27\1\31\74\uffff\1\30\1\uffff\4\30",
            "\1\27\1\31\74\uffff\1\30\1\uffff\4\30",
            "\1\27\1\31\74\uffff\1\30\1\uffff\4\30",
            "\1\27\1\31\74\uffff\1\30\1\uffff\4\30",
            "\1\27\1\31\74\uffff\1\30\1\uffff\4\30",
            "\1\27\1\31\74\uffff\1\30\1\uffff\4\30",
            "\1\27\1\31\74\uffff\1\30\1\uffff\4\30",
            "\1\27\1\31\74\uffff\1\30\1\uffff\4\30",
            "\1\27\1\31\74\uffff\1\30\1\uffff\4\30",
            "\1\27\1\31\74\uffff\1\30\1\uffff\4\30",
            "\1\27\1\31\74\uffff\1\30\1\uffff\4\30",
            "\1\27\1\31\74\uffff\1\30\1\uffff\4\30",
            "\1\27\1\31\74\uffff\1\30\1\uffff\4\30",
            "\1\27\1\31\74\uffff\1\30\1\uffff\4\30",
            "\1\27\1\31\74\uffff\1\30\1\uffff\4\30",
            "\1\27\1\31\74\uffff\1\30\1\uffff\4\30",
            "\1\27\1\31\74\uffff\1\30\1\uffff\4\30",
            "",
            "\1\34\1\55\1\34\6\uffff\1\34\2\55\6\uffff\1\34\2\uffff\1\34"+
            "\1\uffff\1\50\5\uffff\1\41\6\uffff\1\34\1\uffff\6\34\1\uffff"+
            "\1\32\2\uffff\2\34\10\uffff\1\34\4\uffff\11\34\1\33\10\uffff"+
            "\1\56\1\uffff\1\34\1\35\1\36\1\37\1\40\1\42\1\43\1\44\1\45\1"+
            "\46\1\47\1\51\1\52\1\53\1\54\1\34\42\uffff\1\56",
            "\1\57\64\uffff\1\60\10\uffff\1\57",
            "",
            "",
            "\2\56\62\uffff\2\61\10\uffff\1\56\1\uffff\4\56",
            "\2\56\62\uffff\2\61\10\uffff\1\56\1\uffff\4\56",
            "\2\56\62\uffff\2\61\10\uffff\1\56\1\uffff\4\56",
            "\2\56\62\uffff\2\61\10\uffff\1\56\1\uffff\4\56",
            "\2\56\62\uffff\2\61\10\uffff\1\56\1\uffff\4\56",
            "\2\56\62\uffff\2\61\10\uffff\1\56\1\uffff\4\56",
            "\2\56\62\uffff\2\61\10\uffff\1\56\1\uffff\4\56",
            "\2\56\62\uffff\2\61\10\uffff\1\56\1\uffff\4\56",
            "\2\56\62\uffff\2\61\10\uffff\1\56\1\uffff\4\56",
            "\2\56\62\uffff\2\61\10\uffff\1\56\1\uffff\4\56",
            "\2\56\62\uffff\2\61\10\uffff\1\56\1\uffff\4\56",
            "\2\56\62\uffff\2\61\10\uffff\1\56\1\uffff\4\56",
            "\2\56\62\uffff\2\61\10\uffff\1\56\1\uffff\4\56",
            "\2\56\62\uffff\2\61\10\uffff\1\56\1\uffff\4\56",
            "\2\56\62\uffff\2\61\10\uffff\1\56\1\uffff\4\56",
            "\2\56\62\uffff\2\61\10\uffff\1\56\1\uffff\4\56",
            "\2\56\62\uffff\2\61\10\uffff\1\56\1\uffff\4\56",
            "\2\56\62\uffff\2\61\10\uffff\1\56\1\uffff\4\56",
            "\2\56\62\uffff\2\61\10\uffff\1\56\1\uffff\4\56",
            "\2\56\62\uffff\2\61\10\uffff\1\56\1\uffff\4\56",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA122_eot = DFA.unpackEncodedString(DFA122_eotS);
    static final short[] DFA122_eof = DFA.unpackEncodedString(DFA122_eofS);
    static final char[] DFA122_min = DFA.unpackEncodedStringToUnsignedChars(DFA122_minS);
    static final char[] DFA122_max = DFA.unpackEncodedStringToUnsignedChars(DFA122_maxS);
    static final short[] DFA122_accept = DFA.unpackEncodedString(DFA122_acceptS);
    static final short[] DFA122_special = DFA.unpackEncodedString(DFA122_specialS);
    static final short[][] DFA122_transition;

    static {
        int numStates = DFA122_transitionS.length;
        DFA122_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA122_transition[i] = DFA.unpackEncodedString(DFA122_transitionS[i]);
        }
    }

    class DFA122 extends DFA {

        public DFA122(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 122;
            this.eot = DFA122_eot;
            this.eof = DFA122_eof;
            this.min = DFA122_min;
            this.max = DFA122_max;
            this.accept = DFA122_accept;
            this.special = DFA122_special;
            this.transition = DFA122_transition;
        }
        public String getDescription() {
            return "964:1: relation[List<Relation> clauses] : (name= cident type= relationType t= term | K_TOKEN '(' name1= cident ( ',' namen= cident )* ')' type= relationType t= term | name= cident K_IN ( QMARK | ':' mid= cident ) | name= cident K_IN '(' (f1= term ( ',' fN= term )* )? ')' | name= cident K_CONTAINS ( K_KEY )? t= term | '(' n1= cident ( ',' ni= cident )* ')' type= relationType '(' t1= term ( ',' ti= term )* ')' | '(' relation[$clauses] ')' );";
        }
    }
    static final String DFA119_eotS =
        "\33\uffff";
    static final String DFA119_eofS =
        "\32\uffff\1\2";
    static final String DFA119_minS =
        "\2\6\2\uffff\1\6\24\u008b\1\u008c\1\6";
    static final String DFA119_maxS =
        "\2\u0094\2\uffff\1\u0094\20\u008f\2\u0098\2\u008f\1\u008d\1\u0094";
    static final String DFA119_acceptS =
        "\2\uffff\1\2\1\1\27\uffff";
    static final String DFA119_specialS =
        "\33\uffff}>";
    static final String[] DFA119_transitionS = {
            "\1\2\1\uffff\1\2\6\uffff\1\2\2\uffff\1\2\5\uffff\1\2\2\uffff"+
            "\1\2\1\uffff\1\2\5\uffff\1\2\6\uffff\1\2\1\uffff\1\1\5\2\1\uffff"+
            "\1\2\1\uffff\3\2\10\uffff\1\2\4\uffff\11\2\1\uffff\11\2\1\uffff"+
            "\20\2\42\uffff\1\2\4\uffff\1\2\1\uffff\3\2",
            "\1\3\1\uffff\1\3\6\uffff\1\3\2\uffff\1\3\5\uffff\1\3\2\uffff"+
            "\1\3\1\uffff\1\3\5\uffff\1\3\6\uffff\1\3\1\uffff\6\3\1\uffff"+
            "\1\3\1\uffff\3\3\10\uffff\1\3\4\uffff\11\3\1\uffff\11\3\1\uffff"+
            "\20\3\42\uffff\1\4\4\uffff\1\3\1\uffff\3\3",
            "",
            "",
            "\1\30\1\3\1\30\6\uffff\1\30\2\3\1\2\5\uffff\1\30\2\uffff\1"+
            "\30\1\uffff\1\20\1\uffff\1\3\3\uffff\1\11\6\uffff\1\30\1\uffff"+
            "\6\30\1\uffff\1\27\1\uffff\1\31\2\30\10\uffff\1\26\4\uffff\11"+
            "\30\1\3\11\2\1\uffff\1\30\1\5\1\6\1\7\1\10\1\12\1\13\1\14\1"+
            "\15\1\16\1\17\1\21\1\22\1\23\1\24\1\25\42\uffff\2\2\3\uffff"+
            "\1\2\1\uffff\3\2",
            "\1\2\1\3\2\uffff\1\3",
            "\1\2\1\3\2\uffff\1\3",
            "\1\2\1\3\2\uffff\1\3",
            "\1\2\1\3\2\uffff\1\3",
            "\1\2\1\3\2\uffff\1\3",
            "\1\2\1\3\2\uffff\1\3",
            "\1\2\1\3\2\uffff\1\3",
            "\1\2\1\3\2\uffff\1\3",
            "\1\2\1\3\2\uffff\1\3",
            "\1\2\1\3\2\uffff\1\3",
            "\1\2\1\3\2\uffff\1\3",
            "\1\2\1\3\2\uffff\1\3",
            "\1\2\1\3\2\uffff\1\3",
            "\1\2\1\3\2\uffff\1\3",
            "\1\2\1\3\2\uffff\1\3",
            "\1\2\1\3\2\uffff\1\3",
            "\1\2\1\3\2\uffff\1\3\10\uffff\1\3",
            "\1\2\1\3\2\uffff\1\3\10\uffff\1\3",
            "\1\2\1\3\2\uffff\1\3",
            "\1\2\1\3\2\uffff\1\3",
            "\1\32\1\2",
            "\1\3\1\uffff\1\3\2\uffff\1\2\1\uffff\2\2\1\3\2\uffff\1\3\1"+
            "\2\2\uffff\1\2\1\uffff\1\3\1\2\1\uffff\1\3\1\uffff\1\3\1\2\1"+
            "\uffff\1\2\2\uffff\1\3\1\uffff\1\2\4\uffff\1\3\1\uffff\6\3\1"+
            "\uffff\1\3\1\uffff\3\3\10\uffff\1\3\4\uffff\11\3\1\uffff\11"+
            "\3\1\uffff\20\3\41\uffff\1\2\1\3\1\2\3\uffff\1\3\1\uffff\3\3"
    };

    static final short[] DFA119_eot = DFA.unpackEncodedString(DFA119_eotS);
    static final short[] DFA119_eof = DFA.unpackEncodedString(DFA119_eofS);
    static final char[] DFA119_min = DFA.unpackEncodedStringToUnsignedChars(DFA119_minS);
    static final char[] DFA119_max = DFA.unpackEncodedStringToUnsignedChars(DFA119_maxS);
    static final short[] DFA119_accept = DFA.unpackEncodedString(DFA119_acceptS);
    static final short[] DFA119_special = DFA.unpackEncodedString(DFA119_specialS);
    static final short[][] DFA119_transition;

    static {
        int numStates = DFA119_transitionS.length;
        DFA119_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA119_transition[i] = DFA.unpackEncodedString(DFA119_transitionS[i]);
        }
    }

    class DFA119 extends DFA {

        public DFA119(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 119;
            this.eot = DFA119_eot;
            this.eof = DFA119_eof;
            this.min = DFA119_min;
            this.max = DFA119_max;
            this.accept = DFA119_accept;
            this.special = DFA119_special;
            this.transition = DFA119_transition;
        }
        public String getDescription() {
            return "978:77: ( K_KEY )?";
        }
    }
    static final String DFA123_eotS =
        "\27\uffff";
    static final String DFA123_eofS =
        "\1\uffff\20\26\2\24\4\uffff";
    static final String DFA123_minS =
        "\1\6\22\52\4\uffff";
    static final String DFA123_maxS =
        "\1\150\22\u009a\4\uffff";
    static final String DFA123_acceptS =
        "\23\uffff\1\2\1\3\1\4\1\1";
    static final String DFA123_specialS =
        "\27\uffff}>";
    static final String[] DFA123_transitionS = {
            "\3\24\6\uffff\3\24\6\uffff\1\24\2\uffff\1\24\1\uffff\1\14\1"+
            "\uffff\1\23\3\uffff\1\5\6\uffff\1\24\1\uffff\6\24\1\uffff\1"+
            "\24\1\uffff\1\25\2\24\10\uffff\1\22\4\uffff\12\24\12\uffff\1"+
            "\24\1\1\1\2\1\3\1\4\1\6\1\7\1\10\1\11\1\12\1\13\1\15\1\16\1"+
            "\17\1\20\1\21",
            "\2\26\136\uffff\1\26\1\uffff\2\26\1\uffff\1\24\12\uffff\1\26",
            "\2\26\136\uffff\1\26\1\uffff\2\26\1\uffff\1\24\12\uffff\1\26",
            "\2\26\136\uffff\1\26\1\uffff\2\26\1\uffff\1\24\12\uffff\1\26",
            "\2\26\136\uffff\1\26\1\uffff\2\26\1\uffff\1\24\12\uffff\1\26",
            "\2\26\136\uffff\1\26\1\uffff\2\26\1\uffff\1\24\12\uffff\1\26",
            "\2\26\136\uffff\1\26\1\uffff\2\26\1\uffff\1\24\12\uffff\1\26",
            "\2\26\136\uffff\1\26\1\uffff\2\26\1\uffff\1\24\12\uffff\1\26",
            "\2\26\136\uffff\1\26\1\uffff\2\26\1\uffff\1\24\12\uffff\1\26",
            "\2\26\136\uffff\1\26\1\uffff\2\26\1\uffff\1\24\12\uffff\1\26",
            "\2\26\136\uffff\1\26\1\uffff\2\26\1\uffff\1\24\12\uffff\1\26",
            "\2\26\136\uffff\1\26\1\uffff\2\26\1\uffff\1\24\12\uffff\1\26",
            "\2\26\136\uffff\1\26\1\uffff\2\26\1\uffff\1\24\12\uffff\1\26",
            "\2\26\136\uffff\1\26\1\uffff\2\26\1\uffff\1\24\12\uffff\1\26",
            "\2\26\136\uffff\1\26\1\uffff\2\26\1\uffff\1\24\12\uffff\1\26",
            "\2\26\136\uffff\1\26\1\uffff\2\26\1\uffff\1\24\12\uffff\1\26",
            "\2\26\136\uffff\1\26\1\uffff\2\26\1\uffff\1\24\12\uffff\1\26",
            "\2\24\136\uffff\1\24\1\uffff\2\24\1\uffff\1\24\10\uffff\1\23"+
            "\1\uffff\1\24",
            "\2\24\136\uffff\1\24\1\uffff\2\24\1\uffff\1\24\10\uffff\1\23"+
            "\1\uffff\1\24",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA123_eot = DFA.unpackEncodedString(DFA123_eotS);
    static final short[] DFA123_eof = DFA.unpackEncodedString(DFA123_eofS);
    static final char[] DFA123_min = DFA.unpackEncodedStringToUnsignedChars(DFA123_minS);
    static final char[] DFA123_max = DFA.unpackEncodedStringToUnsignedChars(DFA123_maxS);
    static final short[] DFA123_accept = DFA.unpackEncodedString(DFA123_acceptS);
    static final short[] DFA123_special = DFA.unpackEncodedString(DFA123_specialS);
    static final short[][] DFA123_transition;

    static {
        int numStates = DFA123_transitionS.length;
        DFA123_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA123_transition[i] = DFA.unpackEncodedString(DFA123_transitionS[i]);
        }
    }

    class DFA123 extends DFA {

        public DFA123(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 123;
            this.eot = DFA123_eot;
            this.eof = DFA123_eof;
            this.min = DFA123_min;
            this.max = DFA123_max;
            this.accept = DFA123_accept;
            this.special = DFA123_special;
            this.transition = DFA123_transition;
        }
        public String getDescription() {
            return "999:1: comparatorType returns [CQL3Type.Raw t] : (n= native_type | c= collection_type | id= userTypeName | s= STRING_LITERAL );";
        }
    }
 

    public static final BitSet FOLLOW_cqlStatement_in_query72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_query75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_EOF_in_query79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectStatement_in_cqlStatement113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insertStatement_in_cqlStatement138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateStatement_in_cqlStatement163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_batchStatement_in_cqlStatement188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deleteStatement_in_cqlStatement214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_useStatement_in_cqlStatement239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_truncateStatement_in_cqlStatement267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createKeyspaceStatement_in_cqlStatement290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createTableStatement_in_cqlStatement307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createIndexStatement_in_cqlStatement326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropKeyspaceStatement_in_cqlStatement345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropTableStatement_in_cqlStatement363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropIndexStatement_in_cqlStatement384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterTableStatement_in_cqlStatement405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterKeyspaceStatement_in_cqlStatement425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_grantStatement_in_cqlStatement442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_revokeStatement_in_cqlStatement467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listPermissionsStatement_in_cqlStatement491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createUserStatement_in_cqlStatement506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterUserStatement_in_cqlStatement526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropUserStatement_in_cqlStatement547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listUsersStatement_in_cqlStatement569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createTriggerStatement_in_cqlStatement590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropTriggerStatement_in_cqlStatement607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createTypeStatement_in_cqlStatement626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterTypeStatement_in_cqlStatement646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropTypeStatement_in_cqlStatement667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_USE_in_useStatement702 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_keyspaceName_in_useStatement706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_SELECT_in_selectStatement740 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE807FE1L,0x0000000000004000L});
    public static final BitSet FOLLOW_K_DISTINCT_in_selectStatement746 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE807FE1L,0x0000000000004000L});
    public static final BitSet FOLLOW_selectClause_in_selectStatement755 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_K_COUNT_in_selectStatement775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_selectStatement777 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_selectCountClause_in_selectStatement781 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_selectStatement783 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_K_AS_in_selectStatement788 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_selectStatement792 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_K_FROM_in_selectStatement807 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_columnFamilyName_in_selectStatement811 = new BitSet(new long[]{0x0000000000006C02L});
    public static final BitSet FOLLOW_K_WHERE_in_selectStatement821 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE807FE1L,0x0000000000000800L});
    public static final BitSet FOLLOW_whereClause_in_selectStatement825 = new BitSet(new long[]{0x0000000000006802L});
    public static final BitSet FOLLOW_K_ORDER_in_selectStatement838 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_K_BY_in_selectStatement840 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_orderByClause_in_selectStatement842 = new BitSet(new long[]{0x0000000000006002L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_selectStatement847 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_orderByClause_in_selectStatement849 = new BitSet(new long[]{0x0000000000006002L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_K_LIMIT_in_selectStatement866 = new BitSet(new long[]{0x0000000000044000L,0x0000000000400000L,0x0000000000100000L});
    public static final BitSet FOLLOW_intValue_in_selectStatement870 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_K_ALLOW_in_selectStatement885 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_K_FILTERING_in_selectStatement887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_selectClause924 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_selectClause929 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE807FE1L});
    public static final BitSet FOLLOW_selector_in_selectClause933 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_142_in_selectClause945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaliasedSelector_in_selector978 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_K_AS_in_selector981 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_selector985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_unaliasedSelector1026 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_K_WRITETIME_in_unaliasedSelector1072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_unaliasedSelector1074 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_unaliasedSelector1078 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_unaliasedSelector1080 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_K_TTL_in_unaliasedSelector1106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_unaliasedSelector1114 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_unaliasedSelector1118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_unaliasedSelector1120 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_functionName_in_unaliasedSelector1148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_selectionFunctionArgs_in_unaliasedSelector1152 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_unaliasedSelector1167 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_unaliasedSelector1171 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_139_in_selectionFunctionArgs1199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_selectionFunctionArgs1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_selectionFunctionArgs1211 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE807FE1L});
    public static final BitSet FOLLOW_unaliasedSelector_in_selectionFunctionArgs1215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_141_in_selectionFunctionArgs1231 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE807FE1L});
    public static final BitSet FOLLOW_unaliasedSelector_in_selectionFunctionArgs1235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_140_in_selectionFunctionArgs1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_selectCountClause1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_selectCountClause1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relation_in_whereClause1329 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_K_AND_in_whereClause1333 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE807FE1L,0x0000000000000800L});
    public static final BitSet FOLLOW_relation_in_whereClause1335 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_cident_in_orderByClause1366 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_K_ASC_in_orderByClause1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DESC_in_orderByClause1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_INSERT_in_insertStatement1413 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_K_INTO_in_insertStatement1415 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_columnFamilyName_in_insertStatement1419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_insertStatement1431 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_insertStatement1435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_141_in_insertStatement1442 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_insertStatement1446 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_140_in_insertStatement1453 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_K_VALUES_in_insertStatement1463 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_insertStatement1475 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001D0800L});
    public static final BitSet FOLLOW_term_in_insertStatement1479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_141_in_insertStatement1485 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001D0800L});
    public static final BitSet FOLLOW_term_in_insertStatement1489 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_140_in_insertStatement1496 = new BitSet(new long[]{0x0000000012000002L});
    public static final BitSet FOLLOW_K_IF_in_insertStatement1509 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_K_NOT_in_insertStatement1511 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_insertStatement1513 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_usingClause_in_insertStatement1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_USING_in_usingClause1560 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_usingClauseObjective_in_usingClause1562 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_K_AND_in_usingClause1567 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_usingClauseObjective_in_usingClause1569 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_K_TIMESTAMP_in_usingClauseObjective1591 = new BitSet(new long[]{0x0000000000040000L,0x0000000000400000L,0x0000000000100000L});
    public static final BitSet FOLLOW_intValue_in_usingClauseObjective1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TTL_in_usingClauseObjective1605 = new BitSet(new long[]{0x0000000000040000L,0x0000000000400000L,0x0000000000100000L});
    public static final BitSet FOLLOW_intValue_in_usingClauseObjective1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_UPDATE_in_updateStatement1643 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_columnFamilyName_in_updateStatement1647 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_usingClause_in_updateStatement1657 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_K_SET_in_updateStatement1669 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_columnOperation_in_updateStatement1671 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_updateStatement1675 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_columnOperation_in_updateStatement1677 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_K_WHERE_in_updateStatement1688 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE807FE1L,0x0000000000000800L});
    public static final BitSet FOLLOW_whereClause_in_updateStatement1692 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_K_IF_in_updateStatement1702 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_updateConditions_in_updateStatement1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_columnCondition_in_updateConditions1747 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_K_AND_in_updateConditions1752 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_columnCondition_in_updateConditions1754 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_K_DELETE_in_deleteStatement1791 = new BitSet(new long[]{0x00CBF408290383C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_deleteSelection_in_deleteStatement1797 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_K_FROM_in_deleteStatement1810 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_columnFamilyName_in_deleteStatement1814 = new BitSet(new long[]{0x0000000010000400L});
    public static final BitSet FOLLOW_usingClauseDelete_in_deleteStatement1824 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_K_WHERE_in_deleteStatement1836 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE807FE1L,0x0000000000000800L});
    public static final BitSet FOLLOW_whereClause_in_deleteStatement1840 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_K_IF_in_deleteStatement1850 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_K_EXISTS_in_deleteStatement1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateConditions_in_deleteStatement1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deleteOp_in_deleteSelection1909 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_deleteSelection1924 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_deleteOp_in_deleteSelection1928 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_cident_in_deleteOp1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_deleteOp1982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_144_in_deleteOp1984 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001D0800L});
    public static final BitSet FOLLOW_term_in_deleteOp1988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_145_in_deleteOp1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_USING_in_usingClauseDelete2010 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_K_TIMESTAMP_in_usingClauseDelete2012 = new BitSet(new long[]{0x0000000000040000L,0x0000000000400000L,0x0000000000100000L});
    public static final BitSet FOLLOW_intValue_in_usingClauseDelete2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_BEGIN_in_batchStatement2050 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_K_UNLOGGED_in_batchStatement2060 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_K_COUNTER_in_batchStatement2066 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_K_BATCH_in_batchStatement2079 = new BitSet(new long[]{0x0000002150400000L});
    public static final BitSet FOLLOW_usingClause_in_batchStatement2083 = new BitSet(new long[]{0x0000002140400000L});
    public static final BitSet FOLLOW_batchStatementObjective_in_batchStatement2103 = new BitSet(new long[]{0x0000002140400000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_batchStatement2105 = new BitSet(new long[]{0x0000002140400000L});
    public static final BitSet FOLLOW_K_APPLY_in_batchStatement2119 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_K_BATCH_in_batchStatement2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insertStatement_in_batchStatementObjective2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateStatement_in_batchStatementObjective2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deleteStatement_in_batchStatementObjective2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createKeyspaceStatement2213 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_K_KEYSPACE_in_createKeyspaceStatement2215 = new BitSet(new long[]{0x00CBF4082B0381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_K_IF_in_createKeyspaceStatement2218 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_K_NOT_in_createKeyspaceStatement2220 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_createKeyspaceStatement2222 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_keyspaceName_in_createKeyspaceStatement2231 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_K_WITH_in_createKeyspaceStatement2239 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_properties_in_createKeyspaceStatement2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createTableStatement2276 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_K_COLUMNFAMILY_in_createTableStatement2278 = new BitSet(new long[]{0x00CBF4082B0381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_K_IF_in_createTableStatement2281 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_K_NOT_in_createTableStatement2283 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_createTableStatement2285 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_columnFamilyName_in_createTableStatement2300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_cfamDefinition_in_createTableStatement2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_cfamDefinition2329 = new BitSet(new long[]{0x00CBFC08290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cfamColumns_in_cfamDefinition2331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_141_in_cfamDefinition2336 = new BitSet(new long[]{0x00CBFC08290381C0L,0x000001FFFE007FE1L,0x0000000000003000L});
    public static final BitSet FOLLOW_cfamColumns_in_cfamDefinition2338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_140_in_cfamDefinition2345 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_K_WITH_in_cfamDefinition2355 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cfamProperty_in_cfamDefinition2357 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_K_AND_in_cfamDefinition2362 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cfamProperty_in_cfamDefinition2364 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_cident_in_cfamColumns2390 = new BitSet(new long[]{0x00EBF408A90381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_comparatorType_in_cfamColumns2394 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_K_STATIC_in_cfamColumns2399 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_K_PRIMARY_in_cfamColumns2416 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_K_KEY_in_cfamColumns2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_PRIMARY_in_cfamColumns2430 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_K_KEY_in_cfamColumns2432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_cfamColumns2434 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L,0x0000000000000800L});
    public static final BitSet FOLLOW_pkDef_in_cfamColumns2436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_141_in_cfamColumns2440 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_cfamColumns2444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_140_in_cfamColumns2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_pkDef2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_pkDef2481 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_pkDef2487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_141_in_pkDef2493 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_pkDef2497 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_140_in_pkDef2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_cfamProperty2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_COMPACT_in_cfamProperty2533 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_K_STORAGE_in_cfamProperty2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CLUSTERING_in_cfamProperty2545 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_K_ORDER_in_cfamProperty2547 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_K_BY_in_cfamProperty2549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_cfamProperty2551 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cfamOrdering_in_cfamProperty2553 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_141_in_cfamProperty2557 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cfamOrdering_in_cfamProperty2559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_140_in_cfamProperty2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_cfamOrdering2592 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_K_ASC_in_cfamOrdering2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DESC_in_cfamOrdering2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createTypeStatement2638 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_K_TYPE_in_createTypeStatement2640 = new BitSet(new long[]{0x00CBF4082B0381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_K_IF_in_createTypeStatement2643 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_K_NOT_in_createTypeStatement2645 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_createTypeStatement2647 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_userTypeName_in_createTypeStatement2665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_createTypeStatement2678 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_typeColumns_in_createTypeStatement2680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_141_in_createTypeStatement2685 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L,0x0000000000003000L});
    public static final BitSet FOLLOW_typeColumns_in_createTypeStatement2687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_140_in_createTypeStatement2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_typeColumns2714 = new BitSet(new long[]{0x00EBF408A90381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_comparatorType_in_typeColumns2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createIndexStatement2753 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_K_CUSTOM_in_createIndexStatement2756 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_K_INDEX_in_createIndexStatement2762 = new BitSet(new long[]{0x0018000002000000L});
    public static final BitSet FOLLOW_K_IF_in_createIndexStatement2765 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_K_NOT_in_createIndexStatement2767 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_createIndexStatement2769 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_IDENT_in_createIndexStatement2787 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_K_ON_in_createIndexStatement2791 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_columnFamilyName_in_createIndexStatement2795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_createIndexStatement2797 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_indexIdent_in_createIndexStatement2801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_createIndexStatement2803 = new BitSet(new long[]{0x0000010010000002L});
    public static final BitSet FOLLOW_K_USING_in_createIndexStatement2814 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_createIndexStatement2818 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_K_WITH_in_createIndexStatement2833 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_properties_in_createIndexStatement2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_indexIdent2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_KEYS_in_indexIdent2894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_indexIdent2896 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_indexIdent2900 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_indexIdent2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createTriggerStatement2928 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_K_TRIGGER_in_createTriggerStatement2930 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_IDENT_in_createTriggerStatement2935 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_K_ON_in_createTriggerStatement2938 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_columnFamilyName_in_createTriggerStatement2942 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_K_USING_in_createTriggerStatement2944 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_createTriggerStatement2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_dropTriggerStatement2979 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_K_TRIGGER_in_dropTriggerStatement2981 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_IDENT_in_dropTriggerStatement2986 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_K_ON_in_dropTriggerStatement2989 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_columnFamilyName_in_dropTriggerStatement2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ALTER_in_alterKeyspaceStatement3033 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_K_KEYSPACE_in_alterKeyspaceStatement3035 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_keyspaceName_in_alterKeyspaceStatement3039 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_K_WITH_in_alterKeyspaceStatement3049 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_properties_in_alterKeyspaceStatement3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ALTER_in_alterTableStatement3087 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_K_COLUMNFAMILY_in_alterTableStatement3089 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_columnFamilyName_in_alterTableStatement3093 = new BitSet(new long[]{0x0F00010000000000L});
    public static final BitSet FOLLOW_K_ALTER_in_alterTableStatement3107 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_alterTableStatement3111 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_K_TYPE_in_alterTableStatement3113 = new BitSet(new long[]{0x00EBF408A90381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_comparatorType_in_alterTableStatement3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ADD_in_alterTableStatement3133 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_alterTableStatement3139 = new BitSet(new long[]{0x00EBF408A90381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_comparatorType_in_alterTableStatement3143 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_K_STATIC_in_alterTableStatement3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_alterTableStatement3166 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_alterTableStatement3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_WITH_in_alterTableStatement3211 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_properties_in_alterTableStatement3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_RENAME_in_alterTableStatement3247 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_alterTableStatement3301 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_K_TO_in_alterTableStatement3303 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_alterTableStatement3307 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_K_AND_in_alterTableStatement3328 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_alterTableStatement3332 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_K_TO_in_alterTableStatement3334 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_alterTableStatement3338 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_K_ALTER_in_alterTypeStatement3384 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_K_TYPE_in_alterTypeStatement3386 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_userTypeName_in_alterTypeStatement3390 = new BitSet(new long[]{0x0E00000000000000L});
    public static final BitSet FOLLOW_K_ALTER_in_alterTypeStatement3404 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_alterTypeStatement3408 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_K_TYPE_in_alterTypeStatement3410 = new BitSet(new long[]{0x00EBF408A90381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_comparatorType_in_alterTypeStatement3414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ADD_in_alterTypeStatement3430 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_alterTypeStatement3436 = new BitSet(new long[]{0x00EBF408A90381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_comparatorType_in_alterTypeStatement3440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_RENAME_in_alterTypeStatement3463 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_alterTypeStatement3501 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_K_TO_in_alterTypeStatement3503 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_alterTypeStatement3507 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_K_AND_in_alterTypeStatement3530 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_alterTypeStatement3534 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_K_TO_in_alterTypeStatement3536 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_alterTypeStatement3540 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_K_DROP_in_dropKeyspaceStatement3607 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_K_KEYSPACE_in_dropKeyspaceStatement3609 = new BitSet(new long[]{0x00CBF4082B0381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_K_IF_in_dropKeyspaceStatement3612 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_dropKeyspaceStatement3614 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_keyspaceName_in_dropKeyspaceStatement3623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_dropTableStatement3657 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_K_COLUMNFAMILY_in_dropTableStatement3659 = new BitSet(new long[]{0x00CBF4082B0381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_K_IF_in_dropTableStatement3662 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_dropTableStatement3664 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_columnFamilyName_in_dropTableStatement3673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_dropTypeStatement3707 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_K_TYPE_in_dropTypeStatement3709 = new BitSet(new long[]{0x00CBF4082B0381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_K_IF_in_dropTypeStatement3712 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_dropTypeStatement3714 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_userTypeName_in_dropTypeStatement3723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_dropIndexStatement3757 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_K_INDEX_in_dropIndexStatement3759 = new BitSet(new long[]{0x0008000002000000L});
    public static final BitSet FOLLOW_K_IF_in_dropIndexStatement3762 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_dropIndexStatement3764 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_IDENT_in_dropIndexStatement3773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TRUNCATE_in_truncateStatement3804 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_columnFamilyName_in_truncateStatement3808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_GRANT_in_grantStatement3833 = new BitSet(new long[]{0x0300004000000020L,0x0000000000000038L});
    public static final BitSet FOLLOW_permissionOrAll_in_grantStatement3845 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_K_ON_in_grantStatement3853 = new BitSet(new long[]{0x00CBF688290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_resource_in_grantStatement3865 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_K_TO_in_grantStatement3873 = new BitSet(new long[]{0x0028000000000000L});
    public static final BitSet FOLLOW_username_in_grantStatement3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_REVOKE_in_revokeStatement3916 = new BitSet(new long[]{0x0300004000000020L,0x0000000000000038L});
    public static final BitSet FOLLOW_permissionOrAll_in_revokeStatement3928 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_K_ON_in_revokeStatement3936 = new BitSet(new long[]{0x00CBF688290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_resource_in_revokeStatement3948 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_K_FROM_in_revokeStatement3956 = new BitSet(new long[]{0x0028000000000000L});
    public static final BitSet FOLLOW_username_in_revokeStatement3968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_LIST_in_listPermissionsStatement4006 = new BitSet(new long[]{0x0300004000000020L,0x0000000000000038L});
    public static final BitSet FOLLOW_permissionOrAll_in_listPermissionsStatement4018 = new BitSet(new long[]{0x0010000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_K_ON_in_listPermissionsStatement4028 = new BitSet(new long[]{0x00CBF688290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_resource_in_listPermissionsStatement4030 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_K_OF_in_listPermissionsStatement4045 = new BitSet(new long[]{0x0028000000000000L});
    public static final BitSet FOLLOW_username_in_listPermissionsStatement4047 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_K_NORECURSIVE_in_listPermissionsStatement4062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_permission4098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ALL_in_permissionOrAll4147 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_K_PERMISSIONS_in_permissionOrAll4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_permission_in_permissionOrAll4172 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_K_PERMISSION_in_permissionOrAll4176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dataResource_in_resource4204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ALL_in_dataResource4227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_K_KEYSPACES_in_dataResource4229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_KEYSPACE_in_dataResource4239 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_keyspaceName_in_dataResource4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_COLUMNFAMILY_in_dataResource4257 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_columnFamilyName_in_dataResource4266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createUserStatement4306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_K_USER_in_createUserStatement4308 = new BitSet(new long[]{0x0028000000000000L});
    public static final BitSet FOLLOW_username_in_createUserStatement4310 = new BitSet(new long[]{0x0000010000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_K_WITH_in_createUserStatement4320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_userOptions_in_createUserStatement4322 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_K_SUPERUSER_in_createUserStatement4336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_NOSUPERUSER_in_createUserStatement4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ALTER_in_alterUserStatement4387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_K_USER_in_alterUserStatement4389 = new BitSet(new long[]{0x0028000000000000L});
    public static final BitSet FOLLOW_username_in_alterUserStatement4391 = new BitSet(new long[]{0x0000010000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_K_WITH_in_alterUserStatement4401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_userOptions_in_alterUserStatement4403 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_K_SUPERUSER_in_alterUserStatement4417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_NOSUPERUSER_in_alterUserStatement4423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_dropUserStatement4459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_K_USER_in_dropUserStatement4461 = new BitSet(new long[]{0x0028000000000000L});
    public static final BitSet FOLLOW_username_in_dropUserStatement4463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_LIST_in_listUsersStatement4488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_K_USERS_in_listUsersStatement4490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_userOption_in_userOptions4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_PASSWORD_in_userOption4531 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_userOption4535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_cident4564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_NAME_in_cident4589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_keyword_in_cident4608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cfOrKsName_in_keyspaceName4641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cfOrKsName_in_columnFamilyName4675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_columnFamilyName4678 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cfOrKsName_in_columnFamilyName4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_userTypeName4707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_userTypeName4709 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_non_type_ident_in_userTypeName4715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_cfOrKsName4737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_NAME_in_cfOrKsName4762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_keyword_in_cfOrKsName4781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_constant4806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_constant4818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_constant4837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_constant4858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UUID_in_constant4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_constant4899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_constant4917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_set_in_constant4926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_map_literal4955 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000003D0800L});
    public static final BitSet FOLLOW_term_in_map_literal4973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_148_in_map_literal4975 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001D0800L});
    public static final BitSet FOLLOW_term_in_map_literal4979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000202000L});
    public static final BitSet FOLLOW_141_in_map_literal4985 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001D0800L});
    public static final BitSet FOLLOW_term_in_map_literal4989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_148_in_map_literal4991 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001D0800L});
    public static final BitSet FOLLOW_term_in_map_literal4995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000202000L});
    public static final BitSet FOLLOW_149_in_map_literal5011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_set_or_map5035 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001D0800L});
    public static final BitSet FOLLOW_term_in_set_or_map5039 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_set_or_map5055 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001D0800L});
    public static final BitSet FOLLOW_term_in_set_or_map5059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_148_in_set_or_map5061 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001D0800L});
    public static final BitSet FOLLOW_term_in_set_or_map5065 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_set_or_map5100 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001D0800L});
    public static final BitSet FOLLOW_term_in_set_or_map5104 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_144_in_collection_literal5138 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001F0800L});
    public static final BitSet FOLLOW_term_in_collection_literal5156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000022000L});
    public static final BitSet FOLLOW_141_in_collection_literal5162 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001D0800L});
    public static final BitSet FOLLOW_term_in_collection_literal5166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000022000L});
    public static final BitSet FOLLOW_145_in_collection_literal5182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_collection_literal5192 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001D0800L});
    public static final BitSet FOLLOW_term_in_collection_literal5196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000302000L});
    public static final BitSet FOLLOW_set_or_map_in_collection_literal5200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_149_in_collection_literal5205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_collection_literal5223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_149_in_collection_literal5225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_usertype_literal5269 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_usertype_literal5273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_148_in_usertype_literal5275 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001D0800L});
    public static final BitSet FOLLOW_term_in_usertype_literal5279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000202000L});
    public static final BitSet FOLLOW_141_in_usertype_literal5285 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_usertype_literal5289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_148_in_usertype_literal5291 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001D0800L});
    public static final BitSet FOLLOW_term_in_usertype_literal5295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000202000L});
    public static final BitSet FOLLOW_149_in_usertype_literal5302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_value5325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collection_literal_in_value5347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usertype_literal_in_value5359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_NULL_in_value5371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_value5395 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_value5399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QMARK_in_value5416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_intValue5462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_intValue5476 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_intValue5480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QMARK_in_intValue5490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_functionName5523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_function_keyword_in_functionName5557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TOKEN_in_functionName5567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_functionArgs5612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_functionArgs5614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_functionArgs5624 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001D0800L});
    public static final BitSet FOLLOW_term_in_functionArgs5628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_141_in_functionArgs5644 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001D0800L});
    public static final BitSet FOLLOW_term_in_functionArgs5648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_140_in_functionArgs5662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_term5687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionName_in_term5724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_functionArgs_in_term5728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_term5738 = new BitSet(new long[]{0x00EBF408A90381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_comparatorType_in_term5742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_term5744 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001D0800L});
    public static final BitSet FOLLOW_term_in_term5748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_columnOperation5771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_columnOperation5773 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001D0800L});
    public static final BitSet FOLLOW_term_in_columnOperation5777 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_columnOperation5780 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_columnOperation5784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_columnOperation5805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_columnOperation5807 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_columnOperation5811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000840000L});
    public static final BitSet FOLLOW_set_in_columnOperation5815 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001D0800L});
    public static final BitSet FOLLOW_term_in_columnOperation5825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_columnOperation5843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_columnOperation5845 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_columnOperation5849 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_INTEGER_in_columnOperation5853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_columnOperation5871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_144_in_columnOperation5873 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001D0800L});
    public static final BitSet FOLLOW_term_in_columnOperation5877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_145_in_columnOperation5879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_columnOperation5881 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001D0800L});
    public static final BitSet FOLLOW_term_in_columnOperation5885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_columnCondition5918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_columnCondition5920 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001D0800L});
    public static final BitSet FOLLOW_term_in_columnCondition5924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_columnCondition5936 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_144_in_columnCondition5938 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001D0800L});
    public static final BitSet FOLLOW_term_in_columnCondition5942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_145_in_columnCondition5944 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_columnCondition5946 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001D0800L});
    public static final BitSet FOLLOW_term_in_columnCondition5950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_properties5971 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_K_AND_in_properties5975 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_property_in_properties5977 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_cident_in_property6000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_property6002 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFE1FFFE1L,0x00000000000C0000L});
    public static final BitSet FOLLOW_propertyValue_in_property6007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_literal_in_property6036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_propertyValue6064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_keyword_in_propertyValue6086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_relationType6109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_relationType6120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_relationType6131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_relationType6141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_relationType6152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_relation6174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000F400000L});
    public static final BitSet FOLLOW_relationType_in_relation6178 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001D0800L});
    public static final BitSet FOLLOW_term_in_relation6182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TOKEN_in_relation6192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_relation6215 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_relation6219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_141_in_relation6225 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_relation6229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_140_in_relation6235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000F400000L});
    public static final BitSet FOLLOW_relationType_in_relation6247 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001D0800L});
    public static final BitSet FOLLOW_term_in_relation6251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_relation6271 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_K_IN_in_relation6273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x0000000000100000L});
    public static final BitSet FOLLOW_QMARK_in_relation6278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_relation6284 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_relation6288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_relation6311 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_K_IN_in_relation6313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_relation6324 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001D1800L});
    public static final BitSet FOLLOW_term_in_relation6330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_141_in_relation6335 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001D0800L});
    public static final BitSet FOLLOW_term_in_relation6339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_140_in_relation6349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_relation6361 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_K_CONTAINS_in_relation6363 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001D0800L});
    public static final BitSet FOLLOW_K_KEY_in_relation6368 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001D0800L});
    public static final BitSet FOLLOW_term_in_relation6384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_relation6404 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_relation6408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_141_in_relation6413 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_cident_in_relation6417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_140_in_relation6423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000F400000L});
    public static final BitSet FOLLOW_relationType_in_relation6435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_relation6445 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001D0800L});
    public static final BitSet FOLLOW_term_in_relation6449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_141_in_relation6454 = new BitSet(new long[]{0x00EBF408290781C0L,0x000001FFFEFFFFE1L,0x00000000001D0800L});
    public static final BitSet FOLLOW_term_in_relation6458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_140_in_relation6464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_relation6480 = new BitSet(new long[]{0x00CBF408290381C0L,0x000001FFFE807FE1L,0x0000000000000800L});
    public static final BitSet FOLLOW_relation_in_relation6482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_relation6485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_native_type_in_comparatorType6508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collection_type_in_comparatorType6524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_userTypeName_in_comparatorType6536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_comparatorType6549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ASCII_in_native_type6578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_BIGINT_in_native_type6592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_BLOB_in_native_type6605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_BOOLEAN_in_native_type6620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_COUNTER_in_native_type6632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DECIMAL_in_native_type6644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DOUBLE_in_native_type6656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_FLOAT_in_native_type6669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_INET_in_native_type6683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_INT_in_native_type6698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TEXT_in_native_type6714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TIMESTAMP_in_native_type6729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_UUID_in_native_type6739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_VARCHAR_in_native_type6754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_VARINT_in_native_type6766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TIMEUUID_in_native_type6779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_MAP_in_collection_type6803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_152_in_collection_type6806 = new BitSet(new long[]{0x00EBF408A90381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_comparatorType_in_collection_type6810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_collection_type6812 = new BitSet(new long[]{0x00EBF408A90381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_comparatorType_in_collection_type6816 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_collection_type6818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_LIST_in_collection_type6836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_152_in_collection_type6838 = new BitSet(new long[]{0x00EBF408A90381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_comparatorType_in_collection_type6842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_collection_type6844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_SET_in_collection_type6862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_152_in_collection_type6865 = new BitSet(new long[]{0x00EBF408A90381C0L,0x000001FFFE007FE1L});
    public static final BitSet FOLLOW_comparatorType_in_collection_type6869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_collection_type6871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_username0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_non_type_ident6931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_NAME_in_non_type_ident6962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basic_unreserved_keyword_in_non_type_ident6987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_function_keyword_in_unreserved_keyword7012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unreserved_keyword7028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basic_unreserved_keyword_in_unreserved_function_keyword7063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_native_type_in_unreserved_function_keyword7075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_basic_unreserved_keyword7113 = new BitSet(new long[]{0x0000000000000002L});

}