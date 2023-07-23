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


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GtidExecuted extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>mysql.gtid_executed</code>
     */
    public static final GtidExecuted GTID_EXECUTED = new GtidExecuted();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>mysql.gtid_executed.source_uuid</code>. uuid of the
     * source where the transaction was originally executed.
     */
    public final TableField<Record, String> SOURCE_UUID = createField(DSL.name("source_uuid"), SQLDataType.CHAR(36).nullable(false), this, "uuid of the source where the transaction was originally executed.");

    /**
     * The column <code>mysql.gtid_executed.interval_start</code>. First number
     * of interval.
     */
    public final TableField<Record, Long> INTERVAL_START = createField(DSL.name("interval_start"), SQLDataType.BIGINT.nullable(false), this, "First number of interval.");

    /**
     * The column <code>mysql.gtid_executed.interval_end</code>. Last number of
     * interval.
     */
    public final TableField<Record, Long> INTERVAL_END = createField(DSL.name("interval_end"), SQLDataType.BIGINT.nullable(false), this, "Last number of interval.");

    private GtidExecuted(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private GtidExecuted(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>mysql.gtid_executed</code> table reference
     */
    public GtidExecuted(String alias) {
        this(DSL.name(alias), GTID_EXECUTED);
    }

    /**
     * Create an aliased <code>mysql.gtid_executed</code> table reference
     */
    public GtidExecuted(Name alias) {
        this(alias, GTID_EXECUTED);
    }

    /**
     * Create a <code>mysql.gtid_executed</code> table reference
     */
    public GtidExecuted() {
        this(DSL.name("gtid_executed"), null);
    }

    public <O extends Record> GtidExecuted(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, GTID_EXECUTED);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Mysql.MYSQL;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.KEY_GTID_EXECUTED_PRIMARY;
    }

    @Override
    public GtidExecuted as(String alias) {
        return new GtidExecuted(DSL.name(alias), this);
    }

    @Override
    public GtidExecuted as(Name alias) {
        return new GtidExecuted(alias, this);
    }

    @Override
    public GtidExecuted as(Table<?> alias) {
        return new GtidExecuted(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public GtidExecuted rename(String name) {
        return new GtidExecuted(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GtidExecuted rename(Name name) {
        return new GtidExecuted(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public GtidExecuted rename(Table<?> name) {
        return new GtidExecuted(name.getQualifiedName(), null);
    }
}