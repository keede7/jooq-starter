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
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbForeign extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.INNODB_FOREIGN</code>
     */
    public static final InnodbForeign INNODB_FOREIGN = new InnodbForeign();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.INNODB_FOREIGN.ID</code>.
     */
    public final TableField<Record, String> ID = createField(DSL.name("ID"), SQLDataType.VARCHAR(129), this, "");

    /**
     * The column <code>information_schema.INNODB_FOREIGN.FOR_NAME</code>.
     */
    public final TableField<Record, String> FOR_NAME = createField(DSL.name("FOR_NAME"), SQLDataType.VARCHAR(129), this, "");

    /**
     * The column <code>information_schema.INNODB_FOREIGN.REF_NAME</code>.
     */
    public final TableField<Record, String> REF_NAME = createField(DSL.name("REF_NAME"), SQLDataType.VARCHAR(129), this, "");

    /**
     * The column <code>information_schema.INNODB_FOREIGN.N_COLS</code>.
     */
    public final TableField<Record, Long> N_COLS = createField(DSL.name("N_COLS"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.INNODB_FOREIGN.TYPE</code>.
     */
    public final TableField<Record, ULong> TYPE = createField(DSL.name("TYPE"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    private InnodbForeign(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private InnodbForeign(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_FOREIGN</code> table
     * reference
     */
    public InnodbForeign(String alias) {
        this(DSL.name(alias), INNODB_FOREIGN);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_FOREIGN</code> table
     * reference
     */
    public InnodbForeign(Name alias) {
        this(alias, INNODB_FOREIGN);
    }

    /**
     * Create a <code>information_schema.INNODB_FOREIGN</code> table reference
     */
    public InnodbForeign() {
        this(DSL.name("INNODB_FOREIGN"), null);
    }

    public <O extends Record> InnodbForeign(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, INNODB_FOREIGN);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbForeign as(String alias) {
        return new InnodbForeign(DSL.name(alias), this);
    }

    @Override
    public InnodbForeign as(Name alias) {
        return new InnodbForeign(alias, this);
    }

    @Override
    public InnodbForeign as(Table<?> alias) {
        return new InnodbForeign(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbForeign rename(String name) {
        return new InnodbForeign(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbForeign rename(Name name) {
        return new InnodbForeign(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbForeign rename(Table<?> name) {
        return new InnodbForeign(name.getQualifiedName(), null);
    }
}
