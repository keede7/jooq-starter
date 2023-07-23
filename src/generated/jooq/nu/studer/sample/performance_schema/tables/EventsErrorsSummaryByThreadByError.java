/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.performance_schema.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

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
public class EventsErrorsSummaryByThreadByError extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>performance_schema.events_errors_summary_by_thread_by_error</code>
     */
    public static final EventsErrorsSummaryByThreadByError EVENTS_ERRORS_SUMMARY_BY_THREAD_BY_ERROR = new EventsErrorsSummaryByThreadByError();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column
     * <code>performance_schema.events_errors_summary_by_thread_by_error.THREAD_ID</code>.
     */
    public final TableField<Record, ULong> THREAD_ID = createField(DSL.name("THREAD_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_errors_summary_by_thread_by_error.ERROR_NUMBER</code>.
     */
    public final TableField<Record, Integer> ERROR_NUMBER = createField(DSL.name("ERROR_NUMBER"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>performance_schema.events_errors_summary_by_thread_by_error.ERROR_NAME</code>.
     */
    public final TableField<Record, String> ERROR_NAME = createField(DSL.name("ERROR_NAME"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column
     * <code>performance_schema.events_errors_summary_by_thread_by_error.SQL_STATE</code>.
     */
    public final TableField<Record, String> SQL_STATE = createField(DSL.name("SQL_STATE"), SQLDataType.VARCHAR(5), this, "");

    /**
     * The column
     * <code>performance_schema.events_errors_summary_by_thread_by_error.SUM_ERROR_RAISED</code>.
     */
    public final TableField<Record, ULong> SUM_ERROR_RAISED = createField(DSL.name("SUM_ERROR_RAISED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_errors_summary_by_thread_by_error.SUM_ERROR_HANDLED</code>.
     */
    public final TableField<Record, ULong> SUM_ERROR_HANDLED = createField(DSL.name("SUM_ERROR_HANDLED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_errors_summary_by_thread_by_error.FIRST_SEEN</code>.
     */
    public final TableField<Record, LocalDateTime> FIRST_SEEN = createField(DSL.name("FIRST_SEEN"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column
     * <code>performance_schema.events_errors_summary_by_thread_by_error.LAST_SEEN</code>.
     */
    public final TableField<Record, LocalDateTime> LAST_SEEN = createField(DSL.name("LAST_SEEN"), SQLDataType.LOCALDATETIME(0), this, "");

    private EventsErrorsSummaryByThreadByError(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private EventsErrorsSummaryByThreadByError(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>performance_schema.events_errors_summary_by_thread_by_error</code>
     * table reference
     */
    public EventsErrorsSummaryByThreadByError(String alias) {
        this(DSL.name(alias), EVENTS_ERRORS_SUMMARY_BY_THREAD_BY_ERROR);
    }

    /**
     * Create an aliased
     * <code>performance_schema.events_errors_summary_by_thread_by_error</code>
     * table reference
     */
    public EventsErrorsSummaryByThreadByError(Name alias) {
        this(alias, EVENTS_ERRORS_SUMMARY_BY_THREAD_BY_ERROR);
    }

    /**
     * Create a
     * <code>performance_schema.events_errors_summary_by_thread_by_error</code>
     * table reference
     */
    public EventsErrorsSummaryByThreadByError() {
        this(DSL.name("events_errors_summary_by_thread_by_error"), null);
    }

    public <O extends Record> EventsErrorsSummaryByThreadByError(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, EVENTS_ERRORS_SUMMARY_BY_THREAD_BY_ERROR);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public List<UniqueKey<Record>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_EVENTS_ERRORS_SUMMARY_BY_THREAD_BY_ERROR_THREAD_ID);
    }

    @Override
    public EventsErrorsSummaryByThreadByError as(String alias) {
        return new EventsErrorsSummaryByThreadByError(DSL.name(alias), this);
    }

    @Override
    public EventsErrorsSummaryByThreadByError as(Name alias) {
        return new EventsErrorsSummaryByThreadByError(alias, this);
    }

    @Override
    public EventsErrorsSummaryByThreadByError as(Table<?> alias) {
        return new EventsErrorsSummaryByThreadByError(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsErrorsSummaryByThreadByError rename(String name) {
        return new EventsErrorsSummaryByThreadByError(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsErrorsSummaryByThreadByError rename(Name name) {
        return new EventsErrorsSummaryByThreadByError(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsErrorsSummaryByThreadByError rename(Table<?> name) {
        return new EventsErrorsSummaryByThreadByError(name.getQualifiedName(), null);
    }
}
