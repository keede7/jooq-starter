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
public class Constants extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.CONSTANTS</code>
     */
    public static final Constants CONSTANTS = new Constants();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTANTS.CONSTANT_CATALOG</code>.
     */
    public final TableField<Record, String> CONSTANT_CATALOG = createField(DSL.name("CONSTANT_CATALOG"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTANTS.CONSTANT_SCHEMA</code>.
     */
    public final TableField<Record, String> CONSTANT_SCHEMA = createField(DSL.name("CONSTANT_SCHEMA"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTANTS.CONSTANT_NAME</code>.
     */
    public final TableField<Record, String> CONSTANT_NAME = createField(DSL.name("CONSTANT_NAME"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTANTS.VALUE_DEFINITION</code>.
     */
    public final TableField<Record, String> VALUE_DEFINITION = createField(DSL.name("VALUE_DEFINITION"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTANTS.DATA_TYPE</code>.
     */
    public final TableField<Record, String> DATA_TYPE = createField(DSL.name("DATA_TYPE"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.CONSTANTS.CHARACTER_MAXIMUM_LENGTH</code>.
     */
    public final TableField<Record, Long> CHARACTER_MAXIMUM_LENGTH = createField(DSL.name("CHARACTER_MAXIMUM_LENGTH"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.CONSTANTS.CHARACTER_OCTET_LENGTH</code>.
     */
    public final TableField<Record, Long> CHARACTER_OCTET_LENGTH = createField(DSL.name("CHARACTER_OCTET_LENGTH"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.CONSTANTS.CHARACTER_SET_CATALOG</code>.
     */
    public final TableField<Record, String> CHARACTER_SET_CATALOG = createField(DSL.name("CHARACTER_SET_CATALOG"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.CONSTANTS.CHARACTER_SET_SCHEMA</code>.
     */
    public final TableField<Record, String> CHARACTER_SET_SCHEMA = createField(DSL.name("CHARACTER_SET_SCHEMA"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTANTS.CHARACTER_SET_NAME</code>.
     */
    public final TableField<Record, String> CHARACTER_SET_NAME = createField(DSL.name("CHARACTER_SET_NAME"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTANTS.COLLATION_CATALOG</code>.
     */
    public final TableField<Record, String> COLLATION_CATALOG = createField(DSL.name("COLLATION_CATALOG"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTANTS.COLLATION_SCHEMA</code>.
     */
    public final TableField<Record, String> COLLATION_SCHEMA = createField(DSL.name("COLLATION_SCHEMA"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTANTS.COLLATION_NAME</code>.
     */
    public final TableField<Record, String> COLLATION_NAME = createField(DSL.name("COLLATION_NAME"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTANTS.NUMERIC_PRECISION</code>.
     */
    public final TableField<Record, Integer> NUMERIC_PRECISION = createField(DSL.name("NUMERIC_PRECISION"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.CONSTANTS.NUMERIC_PRECISION_RADIX</code>.
     */
    public final TableField<Record, Integer> NUMERIC_PRECISION_RADIX = createField(DSL.name("NUMERIC_PRECISION_RADIX"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTANTS.NUMERIC_SCALE</code>.
     */
    public final TableField<Record, Integer> NUMERIC_SCALE = createField(DSL.name("NUMERIC_SCALE"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTANTS.DATETIME_PRECISION</code>.
     */
    public final TableField<Record, Integer> DATETIME_PRECISION = createField(DSL.name("DATETIME_PRECISION"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTANTS.INTERVAL_TYPE</code>.
     */
    public final TableField<Record, String> INTERVAL_TYPE = createField(DSL.name("INTERVAL_TYPE"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTANTS.INTERVAL_PRECISION</code>.
     */
    public final TableField<Record, Integer> INTERVAL_PRECISION = createField(DSL.name("INTERVAL_PRECISION"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTANTS.MAXIMUM_CARDINALITY</code>.
     */
    public final TableField<Record, Integer> MAXIMUM_CARDINALITY = createField(DSL.name("MAXIMUM_CARDINALITY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTANTS.DTD_IDENTIFIER</code>.
     */
    public final TableField<Record, String> DTD_IDENTIFIER = createField(DSL.name("DTD_IDENTIFIER"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTANTS.DECLARED_DATA_TYPE</code>.
     */
    public final TableField<Record, String> DECLARED_DATA_TYPE = createField(DSL.name("DECLARED_DATA_TYPE"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.CONSTANTS.DECLARED_NUMERIC_PRECISION</code>.
     */
    public final TableField<Record, Integer> DECLARED_NUMERIC_PRECISION = createField(DSL.name("DECLARED_NUMERIC_PRECISION"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.CONSTANTS.DECLARED_NUMERIC_SCALE</code>.
     */
    public final TableField<Record, Integer> DECLARED_NUMERIC_SCALE = createField(DSL.name("DECLARED_NUMERIC_SCALE"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTANTS.GEOMETRY_TYPE</code>.
     */
    public final TableField<Record, String> GEOMETRY_TYPE = createField(DSL.name("GEOMETRY_TYPE"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTANTS.GEOMETRY_SRID</code>.
     */
    public final TableField<Record, Integer> GEOMETRY_SRID = createField(DSL.name("GEOMETRY_SRID"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTANTS.REMARKS</code>.
     */
    public final TableField<Record, String> REMARKS = createField(DSL.name("REMARKS"), SQLDataType.VARCHAR(1000000000), this, "");

    private Constants(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Constants(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.CONSTANTS</code> table
     * reference
     */
    public Constants(String alias) {
        this(DSL.name(alias), CONSTANTS);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.CONSTANTS</code> table
     * reference
     */
    public Constants(Name alias) {
        this(alias, CONSTANTS);
    }

    /**
     * Create a <code>INFORMATION_SCHEMA.CONSTANTS</code> table reference
     */
    public Constants() {
        this(DSL.name("CONSTANTS"), null);
    }

    public <O extends Record> Constants(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, CONSTANTS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Constants as(String alias) {
        return new Constants(DSL.name(alias), this);
    }

    @Override
    public Constants as(Name alias) {
        return new Constants(alias, this);
    }

    @Override
    public Constants as(Table<?> alias) {
        return new Constants(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Constants rename(String name) {
        return new Constants(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Constants rename(Name name) {
        return new Constants(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Constants rename(Table<?> name) {
        return new Constants(name.getQualifiedName(), null);
    }
}