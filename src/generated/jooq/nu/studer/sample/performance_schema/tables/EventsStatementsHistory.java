/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.performance_schema.tables;


import nu.studer.sample.performance_schema.Keys;
import nu.studer.sample.performance_schema.PerformanceSchema;
import nu.studer.sample.performance_schema.enums.EventsStatementsHistoryExecutionEngine;
import nu.studer.sample.performance_schema.enums.EventsStatementsHistoryNestingEventType;

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
public class EventsStatementsHistory extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>performance_schema.events_statements_history</code>
     */
    public static final EventsStatementsHistory EVENTS_STATEMENTS_HISTORY = new EventsStatementsHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column
     * <code>performance_schema.events_statements_history.THREAD_ID</code>.
     */
    public final TableField<Record, ULong> THREAD_ID = createField(DSL.name("THREAD_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.EVENT_ID</code>.
     */
    public final TableField<Record, ULong> EVENT_ID = createField(DSL.name("EVENT_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.END_EVENT_ID</code>.
     */
    public final TableField<Record, ULong> END_EVENT_ID = createField(DSL.name("END_EVENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.EVENT_NAME</code>.
     */
    public final TableField<Record, String> EVENT_NAME = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.SOURCE</code>.
     */
    public final TableField<Record, String> SOURCE = createField(DSL.name("SOURCE"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.TIMER_START</code>.
     */
    public final TableField<Record, ULong> TIMER_START = createField(DSL.name("TIMER_START"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.TIMER_END</code>.
     */
    public final TableField<Record, ULong> TIMER_END = createField(DSL.name("TIMER_END"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.TIMER_WAIT</code>.
     */
    public final TableField<Record, ULong> TIMER_WAIT = createField(DSL.name("TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.LOCK_TIME</code>.
     */
    public final TableField<Record, ULong> LOCK_TIME = createField(DSL.name("LOCK_TIME"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.SQL_TEXT</code>.
     */
    public final TableField<Record, String> SQL_TEXT = createField(DSL.name("SQL_TEXT"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.DIGEST</code>.
     */
    public final TableField<Record, String> DIGEST = createField(DSL.name("DIGEST"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.DIGEST_TEXT</code>.
     */
    public final TableField<Record, String> DIGEST_TEXT = createField(DSL.name("DIGEST_TEXT"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.CURRENT_SCHEMA</code>.
     */
    public final TableField<Record, String> CURRENT_SCHEMA = createField(DSL.name("CURRENT_SCHEMA"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.OBJECT_TYPE</code>.
     */
    public final TableField<Record, String> OBJECT_TYPE = createField(DSL.name("OBJECT_TYPE"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.OBJECT_SCHEMA</code>.
     */
    public final TableField<Record, String> OBJECT_SCHEMA = createField(DSL.name("OBJECT_SCHEMA"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.OBJECT_NAME</code>.
     */
    public final TableField<Record, String> OBJECT_NAME = createField(DSL.name("OBJECT_NAME"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.OBJECT_INSTANCE_BEGIN</code>.
     */
    public final TableField<Record, ULong> OBJECT_INSTANCE_BEGIN = createField(DSL.name("OBJECT_INSTANCE_BEGIN"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.MYSQL_ERRNO</code>.
     */
    public final TableField<Record, Integer> MYSQL_ERRNO = createField(DSL.name("MYSQL_ERRNO"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.RETURNED_SQLSTATE</code>.
     */
    public final TableField<Record, String> RETURNED_SQLSTATE = createField(DSL.name("RETURNED_SQLSTATE"), SQLDataType.VARCHAR(5), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.MESSAGE_TEXT</code>.
     */
    public final TableField<Record, String> MESSAGE_TEXT = createField(DSL.name("MESSAGE_TEXT"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.ERRORS</code>.
     */
    public final TableField<Record, ULong> ERRORS = createField(DSL.name("ERRORS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.WARNINGS</code>.
     */
    public final TableField<Record, ULong> WARNINGS = createField(DSL.name("WARNINGS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.ROWS_AFFECTED</code>.
     */
    public final TableField<Record, ULong> ROWS_AFFECTED = createField(DSL.name("ROWS_AFFECTED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.ROWS_SENT</code>.
     */
    public final TableField<Record, ULong> ROWS_SENT = createField(DSL.name("ROWS_SENT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.ROWS_EXAMINED</code>.
     */
    public final TableField<Record, ULong> ROWS_EXAMINED = createField(DSL.name("ROWS_EXAMINED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.CREATED_TMP_DISK_TABLES</code>.
     */
    public final TableField<Record, ULong> CREATED_TMP_DISK_TABLES = createField(DSL.name("CREATED_TMP_DISK_TABLES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.CREATED_TMP_TABLES</code>.
     */
    public final TableField<Record, ULong> CREATED_TMP_TABLES = createField(DSL.name("CREATED_TMP_TABLES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.SELECT_FULL_JOIN</code>.
     */
    public final TableField<Record, ULong> SELECT_FULL_JOIN = createField(DSL.name("SELECT_FULL_JOIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.SELECT_FULL_RANGE_JOIN</code>.
     */
    public final TableField<Record, ULong> SELECT_FULL_RANGE_JOIN = createField(DSL.name("SELECT_FULL_RANGE_JOIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.SELECT_RANGE</code>.
     */
    public final TableField<Record, ULong> SELECT_RANGE = createField(DSL.name("SELECT_RANGE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.SELECT_RANGE_CHECK</code>.
     */
    public final TableField<Record, ULong> SELECT_RANGE_CHECK = createField(DSL.name("SELECT_RANGE_CHECK"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.SELECT_SCAN</code>.
     */
    public final TableField<Record, ULong> SELECT_SCAN = createField(DSL.name("SELECT_SCAN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.SORT_MERGE_PASSES</code>.
     */
    public final TableField<Record, ULong> SORT_MERGE_PASSES = createField(DSL.name("SORT_MERGE_PASSES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.SORT_RANGE</code>.
     */
    public final TableField<Record, ULong> SORT_RANGE = createField(DSL.name("SORT_RANGE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.SORT_ROWS</code>.
     */
    public final TableField<Record, ULong> SORT_ROWS = createField(DSL.name("SORT_ROWS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.SORT_SCAN</code>.
     */
    public final TableField<Record, ULong> SORT_SCAN = createField(DSL.name("SORT_SCAN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.NO_INDEX_USED</code>.
     */
    public final TableField<Record, ULong> NO_INDEX_USED = createField(DSL.name("NO_INDEX_USED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.NO_GOOD_INDEX_USED</code>.
     */
    public final TableField<Record, ULong> NO_GOOD_INDEX_USED = createField(DSL.name("NO_GOOD_INDEX_USED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.NESTING_EVENT_ID</code>.
     */
    public final TableField<Record, ULong> NESTING_EVENT_ID = createField(DSL.name("NESTING_EVENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.NESTING_EVENT_TYPE</code>.
     */
    public final TableField<Record, EventsStatementsHistoryNestingEventType> NESTING_EVENT_TYPE = createField(DSL.name("NESTING_EVENT_TYPE"), SQLDataType.VARCHAR(11).asEnumDataType(nu.studer.sample.performance_schema.enums.EventsStatementsHistoryNestingEventType.class), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.NESTING_EVENT_LEVEL</code>.
     */
    public final TableField<Record, Integer> NESTING_EVENT_LEVEL = createField(DSL.name("NESTING_EVENT_LEVEL"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.STATEMENT_ID</code>.
     */
    public final TableField<Record, ULong> STATEMENT_ID = createField(DSL.name("STATEMENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.CPU_TIME</code>.
     */
    public final TableField<Record, ULong> CPU_TIME = createField(DSL.name("CPU_TIME"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.MAX_CONTROLLED_MEMORY</code>.
     */
    public final TableField<Record, ULong> MAX_CONTROLLED_MEMORY = createField(DSL.name("MAX_CONTROLLED_MEMORY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.MAX_TOTAL_MEMORY</code>.
     */
    public final TableField<Record, ULong> MAX_TOTAL_MEMORY = createField(DSL.name("MAX_TOTAL_MEMORY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_history.EXECUTION_ENGINE</code>.
     */
    public final TableField<Record, EventsStatementsHistoryExecutionEngine> EXECUTION_ENGINE = createField(DSL.name("EXECUTION_ENGINE"), SQLDataType.VARCHAR(9).asEnumDataType(nu.studer.sample.performance_schema.enums.EventsStatementsHistoryExecutionEngine.class), this, "");

    private EventsStatementsHistory(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private EventsStatementsHistory(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>performance_schema.events_statements_history</code> table reference
     */
    public EventsStatementsHistory(String alias) {
        this(DSL.name(alias), EVENTS_STATEMENTS_HISTORY);
    }

    /**
     * Create an aliased
     * <code>performance_schema.events_statements_history</code> table reference
     */
    public EventsStatementsHistory(Name alias) {
        this(alias, EVENTS_STATEMENTS_HISTORY);
    }

    /**
     * Create a <code>performance_schema.events_statements_history</code> table
     * reference
     */
    public EventsStatementsHistory() {
        this(DSL.name("events_statements_history"), null);
    }

    public <O extends Record> EventsStatementsHistory(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, EVENTS_STATEMENTS_HISTORY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.KEY_EVENTS_STATEMENTS_HISTORY_PRIMARY;
    }

    @Override
    public EventsStatementsHistory as(String alias) {
        return new EventsStatementsHistory(DSL.name(alias), this);
    }

    @Override
    public EventsStatementsHistory as(Name alias) {
        return new EventsStatementsHistory(alias, this);
    }

    @Override
    public EventsStatementsHistory as(Table<?> alias) {
        return new EventsStatementsHistory(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsStatementsHistory rename(String name) {
        return new EventsStatementsHistory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsStatementsHistory rename(Name name) {
        return new EventsStatementsHistory(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsStatementsHistory rename(Table<?> name) {
        return new EventsStatementsHistory(name.getQualifiedName(), null);
    }
}
