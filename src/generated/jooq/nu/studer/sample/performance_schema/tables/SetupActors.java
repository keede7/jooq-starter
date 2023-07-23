/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.performance_schema.tables;


import nu.studer.sample.performance_schema.Keys;
import nu.studer.sample.performance_schema.PerformanceSchema;
import nu.studer.sample.performance_schema.enums.SetupActorsEnabled;
import nu.studer.sample.performance_schema.enums.SetupActorsHistory;

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
public class SetupActors extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>performance_schema.setup_actors</code>
     */
    public static final SetupActors SETUP_ACTORS = new SetupActors();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>performance_schema.setup_actors.HOST</code>.
     */
    public final TableField<Record, String> HOST = createField(DSL.name("HOST"), SQLDataType.CHAR(255).nullable(false).defaultValue(DSL.inline("%", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>performance_schema.setup_actors.USER</code>.
     */
    public final TableField<Record, String> USER = createField(DSL.name("USER"), SQLDataType.CHAR(32).nullable(false).defaultValue(DSL.inline("%", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>performance_schema.setup_actors.ROLE</code>.
     */
    public final TableField<Record, String> ROLE = createField(DSL.name("ROLE"), SQLDataType.CHAR(32).nullable(false).defaultValue(DSL.inline("%", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>performance_schema.setup_actors.ENABLED</code>.
     */
    public final TableField<Record, SetupActorsEnabled> ENABLED = createField(DSL.name("ENABLED"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("YES", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.performance_schema.enums.SetupActorsEnabled.class), this, "");

    /**
     * The column <code>performance_schema.setup_actors.HISTORY</code>.
     */
    public final TableField<Record, SetupActorsHistory> HISTORY = createField(DSL.name("HISTORY"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("YES", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.performance_schema.enums.SetupActorsHistory.class), this, "");

    private SetupActors(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private SetupActors(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.setup_actors</code> table
     * reference
     */
    public SetupActors(String alias) {
        this(DSL.name(alias), SETUP_ACTORS);
    }

    /**
     * Create an aliased <code>performance_schema.setup_actors</code> table
     * reference
     */
    public SetupActors(Name alias) {
        this(alias, SETUP_ACTORS);
    }

    /**
     * Create a <code>performance_schema.setup_actors</code> table reference
     */
    public SetupActors() {
        this(DSL.name("setup_actors"), null);
    }

    public <O extends Record> SetupActors(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, SETUP_ACTORS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.KEY_SETUP_ACTORS_PRIMARY;
    }

    @Override
    public SetupActors as(String alias) {
        return new SetupActors(DSL.name(alias), this);
    }

    @Override
    public SetupActors as(Name alias) {
        return new SetupActors(alias, this);
    }

    @Override
    public SetupActors as(Table<?> alias) {
        return new SetupActors(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public SetupActors rename(String name) {
        return new SetupActors(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SetupActors rename(Name name) {
        return new SetupActors(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public SetupActors rename(Table<?> name) {
        return new SetupActors(name.getQualifiedName(), null);
    }
}