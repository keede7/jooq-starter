/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.performance_schema.tables;


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
public class PersistedVariables extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>performance_schema.persisted_variables</code>
     */
    public static final PersistedVariables PERSISTED_VARIABLES = new PersistedVariables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column
     * <code>performance_schema.persisted_variables.VARIABLE_NAME</code>.
     */
    public final TableField<Record, String> VARIABLE_NAME = createField(DSL.name("VARIABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.persisted_variables.VARIABLE_VALUE</code>.
     */
    public final TableField<Record, String> VARIABLE_VALUE = createField(DSL.name("VARIABLE_VALUE"), SQLDataType.VARCHAR(1024), this, "");

    private PersistedVariables(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private PersistedVariables(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.persisted_variables</code>
     * table reference
     */
    public PersistedVariables(String alias) {
        this(DSL.name(alias), PERSISTED_VARIABLES);
    }

    /**
     * Create an aliased <code>performance_schema.persisted_variables</code>
     * table reference
     */
    public PersistedVariables(Name alias) {
        this(alias, PERSISTED_VARIABLES);
    }

    /**
     * Create a <code>performance_schema.persisted_variables</code> table
     * reference
     */
    public PersistedVariables() {
        this(DSL.name("persisted_variables"), null);
    }

    public <O extends Record> PersistedVariables(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, PERSISTED_VARIABLES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.KEY_PERSISTED_VARIABLES_PRIMARY;
    }

    @Override
    public PersistedVariables as(String alias) {
        return new PersistedVariables(DSL.name(alias), this);
    }

    @Override
    public PersistedVariables as(Name alias) {
        return new PersistedVariables(alias, this);
    }

    @Override
    public PersistedVariables as(Table<?> alias) {
        return new PersistedVariables(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PersistedVariables rename(String name) {
        return new PersistedVariables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PersistedVariables rename(Name name) {
        return new PersistedVariables(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PersistedVariables rename(Table<?> name) {
        return new PersistedVariables(name.getQualifiedName(), null);
    }
}