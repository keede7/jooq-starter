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
public class EnabledRoles extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.ENABLED_ROLES</code>
     */
    public static final EnabledRoles ENABLED_ROLES = new EnabledRoles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.ENABLED_ROLES.ROLE_NAME</code>.
     */
    public final TableField<Record, String> ROLE_NAME = createField(DSL.name("ROLE_NAME"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>information_schema.ENABLED_ROLES.ROLE_HOST</code>.
     */
    public final TableField<Record, String> ROLE_HOST = createField(DSL.name("ROLE_HOST"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>information_schema.ENABLED_ROLES.IS_DEFAULT</code>.
     */
    public final TableField<Record, String> IS_DEFAULT = createField(DSL.name("IS_DEFAULT"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>information_schema.ENABLED_ROLES.IS_MANDATORY</code>.
     */
    public final TableField<Record, String> IS_MANDATORY = createField(DSL.name("IS_MANDATORY"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    private EnabledRoles(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private EnabledRoles(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.ENABLED_ROLES</code> table
     * reference
     */
    public EnabledRoles(String alias) {
        this(DSL.name(alias), ENABLED_ROLES);
    }

    /**
     * Create an aliased <code>information_schema.ENABLED_ROLES</code> table
     * reference
     */
    public EnabledRoles(Name alias) {
        this(alias, ENABLED_ROLES);
    }

    /**
     * Create a <code>information_schema.ENABLED_ROLES</code> table reference
     */
    public EnabledRoles() {
        this(DSL.name("ENABLED_ROLES"), null);
    }

    public <O extends Record> EnabledRoles(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, ENABLED_ROLES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public EnabledRoles as(String alias) {
        return new EnabledRoles(DSL.name(alias), this);
    }

    @Override
    public EnabledRoles as(Name alias) {
        return new EnabledRoles(alias, this);
    }

    @Override
    public EnabledRoles as(Table<?> alias) {
        return new EnabledRoles(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public EnabledRoles rename(String name) {
        return new EnabledRoles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EnabledRoles rename(Name name) {
        return new EnabledRoles(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public EnabledRoles rename(Table<?> name) {
        return new EnabledRoles(name.getQualifiedName(), null);
    }
}