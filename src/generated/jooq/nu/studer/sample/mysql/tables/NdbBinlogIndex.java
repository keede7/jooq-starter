/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.mysql.tables;


import nu.studer.sample.mysql.Keys;
import nu.studer.sample.mysql.Mysql;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NdbBinlogIndex extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>mysql.ndb_binlog_index</code>
     */
    public static final NdbBinlogIndex NDB_BINLOG_INDEX = new NdbBinlogIndex();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>mysql.ndb_binlog_index.Position</code>.
     */
    public final TableField<Record, ULong> POSITION = createField(DSL.name("Position"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.ndb_binlog_index.File</code>.
     */
    public final TableField<Record, String> FILE = createField(DSL.name("File"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>mysql.ndb_binlog_index.epoch</code>.
     */
    public final TableField<Record, ULong> EPOCH = createField(DSL.name("epoch"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.ndb_binlog_index.inserts</code>.
     */
    public final TableField<Record, UInteger> INSERTS = createField(DSL.name("inserts"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.ndb_binlog_index.updates</code>.
     */
    public final TableField<Record, UInteger> UPDATES = createField(DSL.name("updates"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.ndb_binlog_index.deletes</code>.
     */
    public final TableField<Record, UInteger> DELETES = createField(DSL.name("deletes"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.ndb_binlog_index.schemaops</code>.
     */
    public final TableField<Record, UInteger> SCHEMAOPS = createField(DSL.name("schemaops"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.ndb_binlog_index.orig_server_id</code>.
     */
    public final TableField<Record, UInteger> ORIG_SERVER_ID = createField(DSL.name("orig_server_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.ndb_binlog_index.orig_epoch</code>.
     */
    public final TableField<Record, ULong> ORIG_EPOCH = createField(DSL.name("orig_epoch"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.ndb_binlog_index.gci</code>.
     */
    public final TableField<Record, UInteger> GCI = createField(DSL.name("gci"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.ndb_binlog_index.next_position</code>.
     */
    public final TableField<Record, ULong> NEXT_POSITION = createField(DSL.name("next_position"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.ndb_binlog_index.next_file</code>.
     */
    public final TableField<Record, String> NEXT_FILE = createField(DSL.name("next_file"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    private NdbBinlogIndex(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private NdbBinlogIndex(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>mysql.ndb_binlog_index</code> table reference
     */
    public NdbBinlogIndex(String alias) {
        this(DSL.name(alias), NDB_BINLOG_INDEX);
    }

    /**
     * Create an aliased <code>mysql.ndb_binlog_index</code> table reference
     */
    public NdbBinlogIndex(Name alias) {
        this(alias, NDB_BINLOG_INDEX);
    }

    /**
     * Create a <code>mysql.ndb_binlog_index</code> table reference
     */
    public NdbBinlogIndex() {
        this(DSL.name("ndb_binlog_index"), null);
    }

    public <O extends Record> NdbBinlogIndex(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, NDB_BINLOG_INDEX);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Mysql.MYSQL;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.KEY_NDB_BINLOG_INDEX_PRIMARY;
    }

    @Override
    public NdbBinlogIndex as(String alias) {
        return new NdbBinlogIndex(DSL.name(alias), this);
    }

    @Override
    public NdbBinlogIndex as(Name alias) {
        return new NdbBinlogIndex(alias, this);
    }

    @Override
    public NdbBinlogIndex as(Table<?> alias) {
        return new NdbBinlogIndex(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public NdbBinlogIndex rename(String name) {
        return new NdbBinlogIndex(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public NdbBinlogIndex rename(Name name) {
        return new NdbBinlogIndex(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public NdbBinlogIndex rename(Table<?> name) {
        return new NdbBinlogIndex(name.getQualifiedName(), null);
    }
}
