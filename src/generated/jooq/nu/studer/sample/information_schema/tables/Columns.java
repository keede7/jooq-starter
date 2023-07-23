/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.information_schema.tables;


import nu.studer.sample.information_schema.InformationSchema;
import nu.studer.sample.information_schema.enums.ColumnsColumnKey;

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
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Columns extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.COLUMNS</code>
     */
    public static final Columns COLUMNS = new Columns();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.COLUMNS.TABLE_CATALOG</code>.
     */
    public final TableField<Record, String> TABLE_CATALOG = createField(DSL.name("TABLE_CATALOG"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.COLUMNS.TABLE_SCHEMA</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.COLUMNS.TABLE_NAME</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.COLUMNS.COLUMN_NAME</code>.
     */
    public final TableField<Record, String> COLUMN_NAME = createField(DSL.name("COLUMN_NAME"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.COLUMNS.ORDINAL_POSITION</code>.
     */
    public final TableField<Record, UInteger> ORDINAL_POSITION = createField(DSL.name("ORDINAL_POSITION"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>information_schema.COLUMNS.COLUMN_DEFAULT</code>.
     */
    public final TableField<Record, String> COLUMN_DEFAULT = createField(DSL.name("COLUMN_DEFAULT"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>information_schema.COLUMNS.IS_NULLABLE</code>.
     */
    public final TableField<Record, String> IS_NULLABLE = createField(DSL.name("IS_NULLABLE"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.COLUMNS.DATA_TYPE</code>.
     */
    public final TableField<Record, String> DATA_TYPE = createField(DSL.name("DATA_TYPE"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>information_schema.COLUMNS.CHARACTER_MAXIMUM_LENGTH</code>.
     */
    public final TableField<Record, Long> CHARACTER_MAXIMUM_LENGTH = createField(DSL.name("CHARACTER_MAXIMUM_LENGTH"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>information_schema.COLUMNS.CHARACTER_OCTET_LENGTH</code>.
     */
    public final TableField<Record, Long> CHARACTER_OCTET_LENGTH = createField(DSL.name("CHARACTER_OCTET_LENGTH"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.COLUMNS.NUMERIC_PRECISION</code>.
     */
    public final TableField<Record, ULong> NUMERIC_PRECISION = createField(DSL.name("NUMERIC_PRECISION"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.COLUMNS.NUMERIC_SCALE</code>.
     */
    public final TableField<Record, ULong> NUMERIC_SCALE = createField(DSL.name("NUMERIC_SCALE"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.COLUMNS.DATETIME_PRECISION</code>.
     */
    public final TableField<Record, UInteger> DATETIME_PRECISION = createField(DSL.name("DATETIME_PRECISION"), SQLDataType.INTEGERUNSIGNED, this, "");

    /**
     * The column <code>information_schema.COLUMNS.CHARACTER_SET_NAME</code>.
     */
    public final TableField<Record, String> CHARACTER_SET_NAME = createField(DSL.name("CHARACTER_SET_NAME"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.COLUMNS.COLLATION_NAME</code>.
     */
    public final TableField<Record, String> COLLATION_NAME = createField(DSL.name("COLLATION_NAME"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.COLUMNS.COLUMN_TYPE</code>.
     */
    public final TableField<Record, String> COLUMN_TYPE = createField(DSL.name("COLUMN_TYPE"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>information_schema.COLUMNS.COLUMN_KEY</code>.
     */
    public final TableField<Record, ColumnsColumnKey> COLUMN_KEY = createField(DSL.name("COLUMN_KEY"), SQLDataType.VARCHAR(3).nullable(false).asEnumDataType(nu.studer.sample.information_schema.enums.ColumnsColumnKey.class), this, "");

    /**
     * The column <code>information_schema.COLUMNS.EXTRA</code>.
     */
    public final TableField<Record, String> EXTRA = createField(DSL.name("EXTRA"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>information_schema.COLUMNS.PRIVILEGES</code>.
     */
    public final TableField<Record, String> PRIVILEGES = createField(DSL.name("PRIVILEGES"), SQLDataType.VARCHAR(154), this, "");

    /**
     * The column <code>information_schema.COLUMNS.COLUMN_COMMENT</code>.
     */
    public final TableField<Record, String> COLUMN_COMMENT = createField(DSL.name("COLUMN_COMMENT"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>information_schema.COLUMNS.GENERATION_EXPRESSION</code>.
     */
    public final TableField<Record, String> GENERATION_EXPRESSION = createField(DSL.name("GENERATION_EXPRESSION"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>information_schema.COLUMNS.SRS_ID</code>.
     */
    public final TableField<Record, UInteger> SRS_ID = createField(DSL.name("SRS_ID"), SQLDataType.INTEGERUNSIGNED, this, "");

    private Columns(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Columns(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.COLUMNS</code> table reference
     */
    public Columns(String alias) {
        this(DSL.name(alias), COLUMNS);
    }

    /**
     * Create an aliased <code>information_schema.COLUMNS</code> table reference
     */
    public Columns(Name alias) {
        this(alias, COLUMNS);
    }

    /**
     * Create a <code>information_schema.COLUMNS</code> table reference
     */
    public Columns() {
        this(DSL.name("COLUMNS"), null);
    }

    public <O extends Record> Columns(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, COLUMNS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Columns as(String alias) {
        return new Columns(DSL.name(alias), this);
    }

    @Override
    public Columns as(Name alias) {
        return new Columns(alias, this);
    }

    @Override
    public Columns as(Table<?> alias) {
        return new Columns(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Columns rename(String name) {
        return new Columns(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Columns rename(Name name) {
        return new Columns(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Columns rename(Table<?> name) {
        return new Columns(name.getQualifiedName(), null);
    }
}
