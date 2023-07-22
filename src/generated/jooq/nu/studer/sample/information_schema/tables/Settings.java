/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.information_schema.tables;


import nu.studer.sample.information_schema.InformationSchema;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Settings extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.SETTINGS</code>
     */
    public static final Settings SETTINGS = new Settings();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.SETTINGS.SETTING_NAME</code>.
     */
    public final TableField<Record, String> SETTING_NAME = createField(DSL.name("SETTING_NAME"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SETTINGS.SETTING_VALUE</code>.
     */
    public final TableField<Record, String> SETTING_VALUE = createField(DSL.name("SETTING_VALUE"), SQLDataType.VARCHAR(1000000000), this, "");

    private Settings(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Settings(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.SETTINGS</code> table
     * reference
     */
    public Settings(String alias) {
        this(DSL.name(alias), SETTINGS);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.SETTINGS</code> table
     * reference
     */
    public Settings(Name alias) {
        this(alias, SETTINGS);
    }

    /**
     * Create a <code>INFORMATION_SCHEMA.SETTINGS</code> table reference
     */
    public Settings() {
        this(DSL.name("SETTINGS"), null);
    }

    public <O extends Record> Settings(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, SETTINGS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Settings as(String alias) {
        return new Settings(DSL.name(alias), this);
    }

    @Override
    public Settings as(Name alias) {
        return new Settings(alias, this);
    }

    @Override
    public Settings as(Table<?> alias) {
        return new Settings(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Settings rename(String name) {
        return new Settings(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Settings rename(Name name) {
        return new Settings(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Settings rename(Table<?> name) {
        return new Settings(name.getQualifiedName(), null);
    }
}
