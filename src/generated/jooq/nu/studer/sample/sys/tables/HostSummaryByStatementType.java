/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.sys.tables;


import nu.studer.sample.sys.Sys;

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
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HostSummaryByStatementType extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.host_summary_by_statement_type</code>
     */
    public static final HostSummaryByStatementType HOST_SUMMARY_BY_STATEMENT_TYPE = new HostSummaryByStatementType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>sys.host_summary_by_statement_type.host</code>.
     */
    public final TableField<Record, String> HOST = createField(DSL.name("host"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>sys.host_summary_by_statement_type.statement</code>.
     */
    public final TableField<Record, String> STATEMENT = createField(DSL.name("statement"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>sys.host_summary_by_statement_type.total</code>.
     */
    public final TableField<Record, ULong> TOTAL = createField(DSL.name("total"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.host_summary_by_statement_type.total_latency</code>.
     */
    public final TableField<Record, String> TOTAL_LATENCY = createField(DSL.name("total_latency"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.host_summary_by_statement_type.max_latency</code>.
     */
    public final TableField<Record, String> MAX_LATENCY = createField(DSL.name("max_latency"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.host_summary_by_statement_type.lock_latency</code>.
     */
    public final TableField<Record, String> LOCK_LATENCY = createField(DSL.name("lock_latency"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.host_summary_by_statement_type.cpu_latency</code>.
     */
    public final TableField<Record, String> CPU_LATENCY = createField(DSL.name("cpu_latency"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.host_summary_by_statement_type.rows_sent</code>.
     */
    public final TableField<Record, ULong> ROWS_SENT = createField(DSL.name("rows_sent"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.host_summary_by_statement_type.rows_examined</code>.
     */
    public final TableField<Record, ULong> ROWS_EXAMINED = createField(DSL.name("rows_examined"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.host_summary_by_statement_type.rows_affected</code>.
     */
    public final TableField<Record, ULong> ROWS_AFFECTED = createField(DSL.name("rows_affected"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.host_summary_by_statement_type.full_scans</code>.
     */
    public final TableField<Record, ULong> FULL_SCANS = createField(DSL.name("full_scans"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    private HostSummaryByStatementType(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private HostSummaryByStatementType(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `host_summary_by_statement_type` as select if((`performance_schema`.`events_statements_summary_by_host_by_event_name`.`HOST` is null),'background',`performance_schema`.`events_statements_summary_by_host_by_event_name`.`HOST`) AS `host`,substring_index(`performance_schema`.`events_statements_summary_by_host_by_event_name`.`EVENT_NAME`,'/',-(1)) AS `statement`,`performance_schema`.`events_statements_summary_by_host_by_event_name`.`COUNT_STAR` AS `total`,format_pico_time(`performance_schema`.`events_statements_summary_by_host_by_event_name`.`SUM_TIMER_WAIT`) AS `total_latency`,format_pico_time(`performance_schema`.`events_statements_summary_by_host_by_event_name`.`MAX_TIMER_WAIT`) AS `max_latency`,format_pico_time(`performance_schema`.`events_statements_summary_by_host_by_event_name`.`SUM_LOCK_TIME`) AS `lock_latency`,format_pico_time(`performance_schema`.`events_statements_summary_by_host_by_event_name`.`SUM_CPU_TIME`) AS `cpu_latency`,`performance_schema`.`events_statements_summary_by_host_by_event_name`.`SUM_ROWS_SENT` AS `rows_sent`,`performance_schema`.`events_statements_summary_by_host_by_event_name`.`SUM_ROWS_EXAMINED` AS `rows_examined`,`performance_schema`.`events_statements_summary_by_host_by_event_name`.`SUM_ROWS_AFFECTED` AS `rows_affected`,(`performance_schema`.`events_statements_summary_by_host_by_event_name`.`SUM_NO_INDEX_USED` + `performance_schema`.`events_statements_summary_by_host_by_event_name`.`SUM_NO_GOOD_INDEX_USED`) AS `full_scans` from `performance_schema`.`events_statements_summary_by_host_by_event_name` where (`performance_schema`.`events_statements_summary_by_host_by_event_name`.`SUM_TIMER_WAIT` <> 0) order by if((`performance_schema`.`events_statements_summary_by_host_by_event_name`.`HOST` is null),'background',`performance_schema`.`events_statements_summary_by_host_by_event_name`.`HOST`),`performance_schema`.`events_statements_summary_by_host_by_event_name`.`SUM_TIMER_WAIT` desc"));
    }

    /**
     * Create an aliased <code>sys.host_summary_by_statement_type</code> table
     * reference
     */
    public HostSummaryByStatementType(String alias) {
        this(DSL.name(alias), HOST_SUMMARY_BY_STATEMENT_TYPE);
    }

    /**
     * Create an aliased <code>sys.host_summary_by_statement_type</code> table
     * reference
     */
    public HostSummaryByStatementType(Name alias) {
        this(alias, HOST_SUMMARY_BY_STATEMENT_TYPE);
    }

    /**
     * Create a <code>sys.host_summary_by_statement_type</code> table reference
     */
    public HostSummaryByStatementType() {
        this(DSL.name("host_summary_by_statement_type"), null);
    }

    public <O extends Record> HostSummaryByStatementType(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, HOST_SUMMARY_BY_STATEMENT_TYPE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Sys.SYS;
    }

    @Override
    public HostSummaryByStatementType as(String alias) {
        return new HostSummaryByStatementType(DSL.name(alias), this);
    }

    @Override
    public HostSummaryByStatementType as(Name alias) {
        return new HostSummaryByStatementType(alias, this);
    }

    @Override
    public HostSummaryByStatementType as(Table<?> alias) {
        return new HostSummaryByStatementType(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public HostSummaryByStatementType rename(String name) {
        return new HostSummaryByStatementType(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public HostSummaryByStatementType rename(Name name) {
        return new HostSummaryByStatementType(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public HostSummaryByStatementType rename(Table<?> name) {
        return new HostSummaryByStatementType(name.getQualifiedName(), null);
    }
}
