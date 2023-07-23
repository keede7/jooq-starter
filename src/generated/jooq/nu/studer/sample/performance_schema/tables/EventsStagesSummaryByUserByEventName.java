/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.performance_schema.tables;


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
public class EventsStagesSummaryByUserByEventName extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>performance_schema.events_stages_summary_by_user_by_event_name</code>
     */
    public static final EventsStagesSummaryByUserByEventName EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME = new EventsStagesSummaryByUserByEventName();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column
     * <code>performance_schema.events_stages_summary_by_user_by_event_name.USER</code>.
     */
    public final TableField<Record, String> USER = createField(DSL.name("USER"), SQLDataType.CHAR(32), this, "");

    /**
     * The column
     * <code>performance_schema.events_stages_summary_by_user_by_event_name.EVENT_NAME</code>.
     */
    public final TableField<Record, String> EVENT_NAME = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_stages_summary_by_user_by_event_name.COUNT_STAR</code>.
     */
    public final TableField<Record, ULong> COUNT_STAR = createField(DSL.name("COUNT_STAR"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_stages_summary_by_user_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public final TableField<Record, ULong> SUM_TIMER_WAIT = createField(DSL.name("SUM_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_stages_summary_by_user_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public final TableField<Record, ULong> MIN_TIMER_WAIT = createField(DSL.name("MIN_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_stages_summary_by_user_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public final TableField<Record, ULong> AVG_TIMER_WAIT = createField(DSL.name("AVG_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_stages_summary_by_user_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public final TableField<Record, ULong> MAX_TIMER_WAIT = createField(DSL.name("MAX_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    private EventsStagesSummaryByUserByEventName(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private EventsStagesSummaryByUserByEventName(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>performance_schema.events_stages_summary_by_user_by_event_name</code>
     * table reference
     */
    public EventsStagesSummaryByUserByEventName(String alias) {
        this(DSL.name(alias), EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME);
    }

    /**
     * Create an aliased
     * <code>performance_schema.events_stages_summary_by_user_by_event_name</code>
     * table reference
     */
    public EventsStagesSummaryByUserByEventName(Name alias) {
        this(alias, EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME);
    }

    /**
     * Create a
     * <code>performance_schema.events_stages_summary_by_user_by_event_name</code>
     * table reference
     */
    public EventsStagesSummaryByUserByEventName() {
        this(DSL.name("events_stages_summary_by_user_by_event_name"), null);
    }

    public <O extends Record> EventsStagesSummaryByUserByEventName(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public List<UniqueKey<Record>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME_USER);
    }

    @Override
    public EventsStagesSummaryByUserByEventName as(String alias) {
        return new EventsStagesSummaryByUserByEventName(DSL.name(alias), this);
    }

    @Override
    public EventsStagesSummaryByUserByEventName as(Name alias) {
        return new EventsStagesSummaryByUserByEventName(alias, this);
    }

    @Override
    public EventsStagesSummaryByUserByEventName as(Table<?> alias) {
        return new EventsStagesSummaryByUserByEventName(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsStagesSummaryByUserByEventName rename(String name) {
        return new EventsStagesSummaryByUserByEventName(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsStagesSummaryByUserByEventName rename(Name name) {
        return new EventsStagesSummaryByUserByEventName(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsStagesSummaryByUserByEventName rename(Table<?> name) {
        return new EventsStagesSummaryByUserByEventName(name.getQualifiedName(), null);
    }
}