/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.performance_schema.tables;


import java.util.Arrays;
import java.util.List;

import nu.studer.sample.performance_schema.Indexes;
import nu.studer.sample.performance_schema.Keys;
import nu.studer.sample.performance_schema.PerformanceSchema;
import nu.studer.sample.performance_schema.enums.ThreadsExecutionEngine;
import nu.studer.sample.performance_schema.enums.ThreadsHistory;
import nu.studer.sample.performance_schema.enums.ThreadsInstrumented;
import nu.studer.sample.performance_schema.enums.ThreadsTelemetryActive;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
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
public class Threads extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>performance_schema.threads</code>
     */
    public static final Threads THREADS = new Threads();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>performance_schema.threads.THREAD_ID</code>.
     */
    public final TableField<Record, ULong> THREAD_ID = createField(DSL.name("THREAD_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.threads.NAME</code>.
     */
    public final TableField<Record, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.threads.TYPE</code>.
     */
    public final TableField<Record, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>performance_schema.threads.PROCESSLIST_ID</code>.
     */
    public final TableField<Record, ULong> PROCESSLIST_ID = createField(DSL.name("PROCESSLIST_ID"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.threads.PROCESSLIST_USER</code>.
     */
    public final TableField<Record, String> PROCESSLIST_USER = createField(DSL.name("PROCESSLIST_USER"), SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>performance_schema.threads.PROCESSLIST_HOST</code>.
     */
    public final TableField<Record, String> PROCESSLIST_HOST = createField(DSL.name("PROCESSLIST_HOST"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>performance_schema.threads.PROCESSLIST_DB</code>.
     */
    public final TableField<Record, String> PROCESSLIST_DB = createField(DSL.name("PROCESSLIST_DB"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.threads.PROCESSLIST_COMMAND</code>.
     */
    public final TableField<Record, String> PROCESSLIST_COMMAND = createField(DSL.name("PROCESSLIST_COMMAND"), SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>performance_schema.threads.PROCESSLIST_TIME</code>.
     */
    public final TableField<Record, Long> PROCESSLIST_TIME = createField(DSL.name("PROCESSLIST_TIME"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>performance_schema.threads.PROCESSLIST_STATE</code>.
     */
    public final TableField<Record, String> PROCESSLIST_STATE = createField(DSL.name("PROCESSLIST_STATE"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.threads.PROCESSLIST_INFO</code>.
     */
    public final TableField<Record, String> PROCESSLIST_INFO = createField(DSL.name("PROCESSLIST_INFO"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>performance_schema.threads.PARENT_THREAD_ID</code>.
     */
    public final TableField<Record, ULong> PARENT_THREAD_ID = createField(DSL.name("PARENT_THREAD_ID"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.threads.ROLE</code>.
     */
    public final TableField<Record, String> ROLE = createField(DSL.name("ROLE"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.threads.INSTRUMENTED</code>.
     */
    public final TableField<Record, ThreadsInstrumented> INSTRUMENTED = createField(DSL.name("INSTRUMENTED"), SQLDataType.VARCHAR(3).nullable(false).asEnumDataType(nu.studer.sample.performance_schema.enums.ThreadsInstrumented.class), this, "");

    /**
     * The column <code>performance_schema.threads.HISTORY</code>.
     */
    public final TableField<Record, ThreadsHistory> HISTORY = createField(DSL.name("HISTORY"), SQLDataType.VARCHAR(3).nullable(false).asEnumDataType(nu.studer.sample.performance_schema.enums.ThreadsHistory.class), this, "");

    /**
     * The column <code>performance_schema.threads.CONNECTION_TYPE</code>.
     */
    public final TableField<Record, String> CONNECTION_TYPE = createField(DSL.name("CONNECTION_TYPE"), SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>performance_schema.threads.THREAD_OS_ID</code>.
     */
    public final TableField<Record, ULong> THREAD_OS_ID = createField(DSL.name("THREAD_OS_ID"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.threads.RESOURCE_GROUP</code>.
     */
    public final TableField<Record, String> RESOURCE_GROUP = createField(DSL.name("RESOURCE_GROUP"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.threads.EXECUTION_ENGINE</code>.
     */
    public final TableField<Record, ThreadsExecutionEngine> EXECUTION_ENGINE = createField(DSL.name("EXECUTION_ENGINE"), SQLDataType.VARCHAR(9).asEnumDataType(nu.studer.sample.performance_schema.enums.ThreadsExecutionEngine.class), this, "");

    /**
     * The column <code>performance_schema.threads.CONTROLLED_MEMORY</code>.
     */
    public final TableField<Record, ULong> CONTROLLED_MEMORY = createField(DSL.name("CONTROLLED_MEMORY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.threads.MAX_CONTROLLED_MEMORY</code>.
     */
    public final TableField<Record, ULong> MAX_CONTROLLED_MEMORY = createField(DSL.name("MAX_CONTROLLED_MEMORY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.threads.TOTAL_MEMORY</code>.
     */
    public final TableField<Record, ULong> TOTAL_MEMORY = createField(DSL.name("TOTAL_MEMORY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.threads.MAX_TOTAL_MEMORY</code>.
     */
    public final TableField<Record, ULong> MAX_TOTAL_MEMORY = createField(DSL.name("MAX_TOTAL_MEMORY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.threads.TELEMETRY_ACTIVE</code>.
     */
    public final TableField<Record, ThreadsTelemetryActive> TELEMETRY_ACTIVE = createField(DSL.name("TELEMETRY_ACTIVE"), SQLDataType.VARCHAR(3).nullable(false).asEnumDataType(nu.studer.sample.performance_schema.enums.ThreadsTelemetryActive.class), this, "");

    private Threads(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Threads(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.threads</code> table reference
     */
    public Threads(String alias) {
        this(DSL.name(alias), THREADS);
    }

    /**
     * Create an aliased <code>performance_schema.threads</code> table reference
     */
    public Threads(Name alias) {
        this(alias, THREADS);
    }

    /**
     * Create a <code>performance_schema.threads</code> table reference
     */
    public Threads() {
        this(DSL.name("threads"), null);
    }

    public <O extends Record> Threads(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, THREADS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.THREADS_NAME, Indexes.THREADS_PROCESSLIST_ACCOUNT, Indexes.THREADS_PROCESSLIST_HOST, Indexes.THREADS_PROCESSLIST_ID, Indexes.THREADS_RESOURCE_GROUP, Indexes.THREADS_THREAD_OS_ID);
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.KEY_THREADS_PRIMARY;
    }

    @Override
    public Threads as(String alias) {
        return new Threads(DSL.name(alias), this);
    }

    @Override
    public Threads as(Name alias) {
        return new Threads(alias, this);
    }

    @Override
    public Threads as(Table<?> alias) {
        return new Threads(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Threads rename(String name) {
        return new Threads(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Threads rename(Name name) {
        return new Threads(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Threads rename(Table<?> name) {
        return new Threads(name.getQualifiedName(), null);
    }
}