/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.information_schema.tables;


import java.math.BigDecimal;

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
public class Profiling extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.PROFILING</code>
     */
    public static final Profiling PROFILING = new Profiling();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.PROFILING.QUERY_ID</code>.
     */
    public final TableField<Record, Integer> QUERY_ID = createField(DSL.name("QUERY_ID"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.SEQ</code>.
     */
    public final TableField<Record, Integer> SEQ = createField(DSL.name("SEQ"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.STATE</code>.
     */
    public final TableField<Record, String> STATE = createField(DSL.name("STATE"), SQLDataType.VARCHAR(10).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PROFILING.DURATION</code>.
     */
    public final TableField<Record, BigDecimal> DURATION = createField(DSL.name("DURATION"), SQLDataType.DECIMAL.nullable(false).defaultValue(DSL.inline("", SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>information_schema.PROFILING.CPU_USER</code>.
     */
    public final TableField<Record, BigDecimal> CPU_USER = createField(DSL.name("CPU_USER"), SQLDataType.DECIMAL.defaultValue(DSL.inline("", SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>information_schema.PROFILING.CPU_SYSTEM</code>.
     */
    public final TableField<Record, BigDecimal> CPU_SYSTEM = createField(DSL.name("CPU_SYSTEM"), SQLDataType.DECIMAL.defaultValue(DSL.inline("", SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>information_schema.PROFILING.CONTEXT_VOLUNTARY</code>.
     */
    public final TableField<Record, Integer> CONTEXT_VOLUNTARY = createField(DSL.name("CONTEXT_VOLUNTARY"), SQLDataType.INTEGER.defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.CONTEXT_INVOLUNTARY</code>.
     */
    public final TableField<Record, Integer> CONTEXT_INVOLUNTARY = createField(DSL.name("CONTEXT_INVOLUNTARY"), SQLDataType.INTEGER.defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.BLOCK_OPS_IN</code>.
     */
    public final TableField<Record, Integer> BLOCK_OPS_IN = createField(DSL.name("BLOCK_OPS_IN"), SQLDataType.INTEGER.defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.BLOCK_OPS_OUT</code>.
     */
    public final TableField<Record, Integer> BLOCK_OPS_OUT = createField(DSL.name("BLOCK_OPS_OUT"), SQLDataType.INTEGER.defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.MESSAGES_SENT</code>.
     */
    public final TableField<Record, Integer> MESSAGES_SENT = createField(DSL.name("MESSAGES_SENT"), SQLDataType.INTEGER.defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.MESSAGES_RECEIVED</code>.
     */
    public final TableField<Record, Integer> MESSAGES_RECEIVED = createField(DSL.name("MESSAGES_RECEIVED"), SQLDataType.INTEGER.defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.PAGE_FAULTS_MAJOR</code>.
     */
    public final TableField<Record, Integer> PAGE_FAULTS_MAJOR = createField(DSL.name("PAGE_FAULTS_MAJOR"), SQLDataType.INTEGER.defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.PAGE_FAULTS_MINOR</code>.
     */
    public final TableField<Record, Integer> PAGE_FAULTS_MINOR = createField(DSL.name("PAGE_FAULTS_MINOR"), SQLDataType.INTEGER.defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.SWAPS</code>.
     */
    public final TableField<Record, Integer> SWAPS = createField(DSL.name("SWAPS"), SQLDataType.INTEGER.defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.SOURCE_FUNCTION</code>.
     */
    public final TableField<Record, String> SOURCE_FUNCTION = createField(DSL.name("SOURCE_FUNCTION"), SQLDataType.VARCHAR(10).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PROFILING.SOURCE_FILE</code>.
     */
    public final TableField<Record, String> SOURCE_FILE = createField(DSL.name("SOURCE_FILE"), SQLDataType.VARCHAR(6).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PROFILING.SOURCE_LINE</code>.
     */
    public final TableField<Record, Integer> SOURCE_LINE = createField(DSL.name("SOURCE_LINE"), SQLDataType.INTEGER.defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    private Profiling(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Profiling(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.PROFILING</code> table
     * reference
     */
    public Profiling(String alias) {
        this(DSL.name(alias), PROFILING);
    }

    /**
     * Create an aliased <code>information_schema.PROFILING</code> table
     * reference
     */
    public Profiling(Name alias) {
        this(alias, PROFILING);
    }

    /**
     * Create a <code>information_schema.PROFILING</code> table reference
     */
    public Profiling() {
        this(DSL.name("PROFILING"), null);
    }

    public <O extends Record> Profiling(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, PROFILING);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Profiling as(String alias) {
        return new Profiling(DSL.name(alias), this);
    }

    @Override
    public Profiling as(Name alias) {
        return new Profiling(alias, this);
    }

    @Override
    public Profiling as(Table<?> alias) {
        return new Profiling(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Profiling rename(String name) {
        return new Profiling(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Profiling rename(Name name) {
        return new Profiling(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Profiling rename(Table<?> name) {
        return new Profiling(name.getQualifiedName(), null);
    }
}
