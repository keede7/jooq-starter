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
public class SchemataExtensions extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.SCHEMATA_EXTENSIONS</code>
     */
    public static final SchemataExtensions SCHEMATA_EXTENSIONS = new SchemataExtensions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column
     * <code>information_schema.SCHEMATA_EXTENSIONS.CATALOG_NAME</code>.
     */
    public final TableField<Record, String> CATALOG_NAME = createField(DSL.name("CATALOG_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.SCHEMATA_EXTENSIONS.SCHEMA_NAME</code>.
     */
    public final TableField<Record, String> SCHEMA_NAME = createField(DSL.name("SCHEMA_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.SCHEMATA_EXTENSIONS.OPTIONS</code>.
     */
    public final TableField<Record, String> OPTIONS = createField(DSL.name("OPTIONS"), SQLDataType.VARCHAR(256), this, "");

    private SchemataExtensions(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private SchemataExtensions(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.SCHEMATA_EXTENSIONS</code>
     * table reference
     */
    public SchemataExtensions(String alias) {
        this(DSL.name(alias), SCHEMATA_EXTENSIONS);
    }

    /**
     * Create an aliased <code>information_schema.SCHEMATA_EXTENSIONS</code>
     * table reference
     */
    public SchemataExtensions(Name alias) {
        this(alias, SCHEMATA_EXTENSIONS);
    }

    /**
     * Create a <code>information_schema.SCHEMATA_EXTENSIONS</code> table
     * reference
     */
    public SchemataExtensions() {
        this(DSL.name("SCHEMATA_EXTENSIONS"), null);
    }

    public <O extends Record> SchemataExtensions(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, SCHEMATA_EXTENSIONS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public SchemataExtensions as(String alias) {
        return new SchemataExtensions(DSL.name(alias), this);
    }

    @Override
    public SchemataExtensions as(Name alias) {
        return new SchemataExtensions(alias, this);
    }

    @Override
    public SchemataExtensions as(Table<?> alias) {
        return new SchemataExtensions(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemataExtensions rename(String name) {
        return new SchemataExtensions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemataExtensions rename(Name name) {
        return new SchemataExtensions(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemataExtensions rename(Table<?> name) {
        return new SchemataExtensions(name.getQualifiedName(), null);
    }
}
