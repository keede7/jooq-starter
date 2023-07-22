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
public class Locks extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.LOCKS</code>
     */
    public static final Locks LOCKS = new Locks();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.LOCKS.TABLE_SCHEMA</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.LOCKS.TABLE_NAME</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.LOCKS.SESSION_ID</code>.
     */
    public final TableField<Record, Integer> SESSION_ID = createField(DSL.name("SESSION_ID"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.LOCKS.LOCK_TYPE</code>.
     */
    public final TableField<Record, String> LOCK_TYPE = createField(DSL.name("LOCK_TYPE"), SQLDataType.VARCHAR(1000000000), this, "");

    private Locks(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Locks(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.LOCKS</code> table reference
     */
    public Locks(String alias) {
        this(DSL.name(alias), LOCKS);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.LOCKS</code> table reference
     */
    public Locks(Name alias) {
        this(alias, LOCKS);
    }

    /**
     * Create a <code>INFORMATION_SCHEMA.LOCKS</code> table reference
     */
    public Locks() {
        this(DSL.name("LOCKS"), null);
    }

    public <O extends Record> Locks(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, LOCKS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Locks as(String alias) {
        return new Locks(DSL.name(alias), this);
    }

    @Override
    public Locks as(Name alias) {
        return new Locks(alias, this);
    }

    @Override
    public Locks as(Table<?> alias) {
        return new Locks(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Locks rename(String name) {
        return new Locks(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Locks rename(Name name) {
        return new Locks(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Locks rename(Table<?> name) {
        return new Locks(name.getQualifiedName(), null);
    }
}