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
public class InnodbTablespacesBrief extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.INNODB_TABLESPACES_BRIEF</code>
     */
    public static final InnodbTablespacesBrief INNODB_TABLESPACES_BRIEF = new InnodbTablespacesBrief();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column
     * <code>information_schema.INNODB_TABLESPACES_BRIEF.SPACE</code>.
     */
    public final TableField<Record, byte[]> SPACE = createField(DSL.name("SPACE"), SQLDataType.VARBINARY(256), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLESPACES_BRIEF.NAME</code>.
     */
    public final TableField<Record, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(268).nullable(false), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLESPACES_BRIEF.PATH</code>.
     */
    public final TableField<Record, String> PATH = createField(DSL.name("PATH"), SQLDataType.VARCHAR(512).nullable(false), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLESPACES_BRIEF.FLAG</code>.
     */
    public final TableField<Record, byte[]> FLAG = createField(DSL.name("FLAG"), SQLDataType.VARBINARY(256), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_TABLESPACES_BRIEF.SPACE_TYPE</code>.
     */
    public final TableField<Record, String> SPACE_TYPE = createField(DSL.name("SPACE_TYPE"), SQLDataType.VARCHAR(7).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    private InnodbTablespacesBrief(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private InnodbTablespacesBrief(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>information_schema.INNODB_TABLESPACES_BRIEF</code> table reference
     */
    public InnodbTablespacesBrief(String alias) {
        this(DSL.name(alias), INNODB_TABLESPACES_BRIEF);
    }

    /**
     * Create an aliased
     * <code>information_schema.INNODB_TABLESPACES_BRIEF</code> table reference
     */
    public InnodbTablespacesBrief(Name alias) {
        this(alias, INNODB_TABLESPACES_BRIEF);
    }

    /**
     * Create a <code>information_schema.INNODB_TABLESPACES_BRIEF</code> table
     * reference
     */
    public InnodbTablespacesBrief() {
        this(DSL.name("INNODB_TABLESPACES_BRIEF"), null);
    }

    public <O extends Record> InnodbTablespacesBrief(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, INNODB_TABLESPACES_BRIEF);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbTablespacesBrief as(String alias) {
        return new InnodbTablespacesBrief(DSL.name(alias), this);
    }

    @Override
    public InnodbTablespacesBrief as(Name alias) {
        return new InnodbTablespacesBrief(alias, this);
    }

    @Override
    public InnodbTablespacesBrief as(Table<?> alias) {
        return new InnodbTablespacesBrief(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbTablespacesBrief rename(String name) {
        return new InnodbTablespacesBrief(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbTablespacesBrief rename(Name name) {
        return new InnodbTablespacesBrief(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbTablespacesBrief rename(Table<?> name) {
        return new InnodbTablespacesBrief(name.getQualifiedName(), null);
    }
}