/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.performance_schema.tables;


import java.util.Arrays;
import java.util.List;

import nu.studer.sample.performance_schema.Keys;
import nu.studer.sample.performance_schema.PerformanceSchema;

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
public class StatusByHost extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>performance_schema.status_by_host</code>
     */
    public static final StatusByHost STATUS_BY_HOST = new StatusByHost();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>performance_schema.status_by_host.HOST</code>.
     */
    public final TableField<Record, String> HOST = createField(DSL.name("HOST"), SQLDataType.CHAR(255), this, "");

    /**
     * The column <code>performance_schema.status_by_host.VARIABLE_NAME</code>.
     */
    public final TableField<Record, String> VARIABLE_NAME = createField(DSL.name("VARIABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>performance_schema.status_by_host.VARIABLE_VALUE</code>.
     */
    public final TableField<Record, String> VARIABLE_VALUE = createField(DSL.name("VARIABLE_VALUE"), SQLDataType.VARCHAR(1024), this, "");

    private StatusByHost(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private StatusByHost(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.status_by_host</code> table
     * reference
     */
    public StatusByHost(String alias) {
        this(DSL.name(alias), STATUS_BY_HOST);
    }

    /**
     * Create an aliased <code>performance_schema.status_by_host</code> table
     * reference
     */
    public StatusByHost(Name alias) {
        this(alias, STATUS_BY_HOST);
    }

    /**
     * Create a <code>performance_schema.status_by_host</code> table reference
     */
    public StatusByHost() {
        this(DSL.name("status_by_host"), null);
    }

    public <O extends Record> StatusByHost(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, STATUS_BY_HOST);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public List<UniqueKey<Record>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_STATUS_BY_HOST_HOST);
    }

    @Override
    public StatusByHost as(String alias) {
        return new StatusByHost(DSL.name(alias), this);
    }

    @Override
    public StatusByHost as(Name alias) {
        return new StatusByHost(alias, this);
    }

    @Override
    public StatusByHost as(Table<?> alias) {
        return new StatusByHost(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public StatusByHost rename(String name) {
        return new StatusByHost(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public StatusByHost rename(Name name) {
        return new StatusByHost(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public StatusByHost rename(Table<?> name) {
        return new StatusByHost(name.getQualifiedName(), null);
    }
}
