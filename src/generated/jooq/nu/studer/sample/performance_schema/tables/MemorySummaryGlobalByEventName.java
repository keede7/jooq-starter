/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.performance_schema.tables;


import nu.studer.sample.performance_schema.Keys;
import nu.studer.sample.performance_schema.PerformanceSchema;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MemorySummaryGlobalByEventName extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>performance_schema.memory_summary_global_by_event_name</code>
     */
    public static final MemorySummaryGlobalByEventName MEMORY_SUMMARY_GLOBAL_BY_EVENT_NAME = new MemorySummaryGlobalByEventName();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column
     * <code>performance_schema.memory_summary_global_by_event_name.EVENT_NAME</code>.
     */
    public final TableField<Record, String> EVENT_NAME = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.memory_summary_global_by_event_name.COUNT_ALLOC</code>.
     */
    public final TableField<Record, ULong> COUNT_ALLOC = createField(DSL.name("COUNT_ALLOC"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.memory_summary_global_by_event_name.COUNT_FREE</code>.
     */
    public final TableField<Record, ULong> COUNT_FREE = createField(DSL.name("COUNT_FREE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.memory_summary_global_by_event_name.SUM_NUMBER_OF_BYTES_ALLOC</code>.
     */
    public final TableField<Record, ULong> SUM_NUMBER_OF_BYTES_ALLOC = createField(DSL.name("SUM_NUMBER_OF_BYTES_ALLOC"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.memory_summary_global_by_event_name.SUM_NUMBER_OF_BYTES_FREE</code>.
     */
    public final TableField<Record, ULong> SUM_NUMBER_OF_BYTES_FREE = createField(DSL.name("SUM_NUMBER_OF_BYTES_FREE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.memory_summary_global_by_event_name.LOW_COUNT_USED</code>.
     */
    public final TableField<Record, Long> LOW_COUNT_USED = createField(DSL.name("LOW_COUNT_USED"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.memory_summary_global_by_event_name.CURRENT_COUNT_USED</code>.
     */
    public final TableField<Record, Long> CURRENT_COUNT_USED = createField(DSL.name("CURRENT_COUNT_USED"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.memory_summary_global_by_event_name.HIGH_COUNT_USED</code>.
     */
    public final TableField<Record, Long> HIGH_COUNT_USED = createField(DSL.name("HIGH_COUNT_USED"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.memory_summary_global_by_event_name.LOW_NUMBER_OF_BYTES_USED</code>.
     */
    public final TableField<Record, Long> LOW_NUMBER_OF_BYTES_USED = createField(DSL.name("LOW_NUMBER_OF_BYTES_USED"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.memory_summary_global_by_event_name.CURRENT_NUMBER_OF_BYTES_USED</code>.
     */
    public final TableField<Record, Long> CURRENT_NUMBER_OF_BYTES_USED = createField(DSL.name("CURRENT_NUMBER_OF_BYTES_USED"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.memory_summary_global_by_event_name.HIGH_NUMBER_OF_BYTES_USED</code>.
     */
    public final TableField<Record, Long> HIGH_NUMBER_OF_BYTES_USED = createField(DSL.name("HIGH_NUMBER_OF_BYTES_USED"), SQLDataType.BIGINT.nullable(false), this, "");

    private MemorySummaryGlobalByEventName(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private MemorySummaryGlobalByEventName(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>performance_schema.memory_summary_global_by_event_name</code> table
     * reference
     */
    public MemorySummaryGlobalByEventName(String alias) {
        this(DSL.name(alias), MEMORY_SUMMARY_GLOBAL_BY_EVENT_NAME);
    }

    /**
     * Create an aliased
     * <code>performance_schema.memory_summary_global_by_event_name</code> table
     * reference
     */
    public MemorySummaryGlobalByEventName(Name alias) {
        this(alias, MEMORY_SUMMARY_GLOBAL_BY_EVENT_NAME);
    }

    /**
     * Create a
     * <code>performance_schema.memory_summary_global_by_event_name</code> table
     * reference
     */
    public MemorySummaryGlobalByEventName() {
        this(DSL.name("memory_summary_global_by_event_name"), null);
    }

    public <O extends Record> MemorySummaryGlobalByEventName(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, MEMORY_SUMMARY_GLOBAL_BY_EVENT_NAME);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.KEY_MEMORY_SUMMARY_GLOBAL_BY_EVENT_NAME_PRIMARY;
    }

    @Override
    public MemorySummaryGlobalByEventName as(String alias) {
        return new MemorySummaryGlobalByEventName(DSL.name(alias), this);
    }

    @Override
    public MemorySummaryGlobalByEventName as(Name alias) {
        return new MemorySummaryGlobalByEventName(alias, this);
    }

    @Override
    public MemorySummaryGlobalByEventName as(Table<?> alias) {
        return new MemorySummaryGlobalByEventName(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public MemorySummaryGlobalByEventName rename(String name) {
        return new MemorySummaryGlobalByEventName(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MemorySummaryGlobalByEventName rename(Name name) {
        return new MemorySummaryGlobalByEventName(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public MemorySummaryGlobalByEventName rename(Table<?> name) {
        return new MemorySummaryGlobalByEventName(name.getQualifiedName(), null);
    }
}
