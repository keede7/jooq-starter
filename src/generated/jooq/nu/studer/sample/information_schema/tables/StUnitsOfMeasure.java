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
public class StUnitsOfMeasure extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.ST_UNITS_OF_MEASURE</code>
     */
    public static final StUnitsOfMeasure ST_UNITS_OF_MEASURE = new StUnitsOfMeasure();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.ST_UNITS_OF_MEASURE.UNIT_NAME</code>.
     */
    public final TableField<Record, String> UNIT_NAME = createField(DSL.name("UNIT_NAME"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>information_schema.ST_UNITS_OF_MEASURE.UNIT_TYPE</code>.
     */
    public final TableField<Record, String> UNIT_TYPE = createField(DSL.name("UNIT_TYPE"), SQLDataType.VARCHAR(7), this, "");

    /**
     * The column
     * <code>information_schema.ST_UNITS_OF_MEASURE.CONVERSION_FACTOR</code>.
     */
    public final TableField<Record, Double> CONVERSION_FACTOR = createField(DSL.name("CONVERSION_FACTOR"), SQLDataType.DOUBLE, this, "");

    /**
     * The column
     * <code>information_schema.ST_UNITS_OF_MEASURE.DESCRIPTION</code>.
     */
    public final TableField<Record, String> DESCRIPTION = createField(DSL.name("DESCRIPTION"), SQLDataType.VARCHAR(255), this, "");

    private StUnitsOfMeasure(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private StUnitsOfMeasure(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.ST_UNITS_OF_MEASURE</code>
     * table reference
     */
    public StUnitsOfMeasure(String alias) {
        this(DSL.name(alias), ST_UNITS_OF_MEASURE);
    }

    /**
     * Create an aliased <code>information_schema.ST_UNITS_OF_MEASURE</code>
     * table reference
     */
    public StUnitsOfMeasure(Name alias) {
        this(alias, ST_UNITS_OF_MEASURE);
    }

    /**
     * Create a <code>information_schema.ST_UNITS_OF_MEASURE</code> table
     * reference
     */
    public StUnitsOfMeasure() {
        this(DSL.name("ST_UNITS_OF_MEASURE"), null);
    }

    public <O extends Record> StUnitsOfMeasure(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, ST_UNITS_OF_MEASURE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public StUnitsOfMeasure as(String alias) {
        return new StUnitsOfMeasure(DSL.name(alias), this);
    }

    @Override
    public StUnitsOfMeasure as(Name alias) {
        return new StUnitsOfMeasure(alias, this);
    }

    @Override
    public StUnitsOfMeasure as(Table<?> alias) {
        return new StUnitsOfMeasure(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public StUnitsOfMeasure rename(String name) {
        return new StUnitsOfMeasure(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public StUnitsOfMeasure rename(Name name) {
        return new StUnitsOfMeasure(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public StUnitsOfMeasure rename(Table<?> name) {
        return new StUnitsOfMeasure(name.getQualifiedName(), null);
    }
}
