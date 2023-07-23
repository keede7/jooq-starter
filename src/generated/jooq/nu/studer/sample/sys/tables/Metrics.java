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


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Metrics extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.metrics</code>
     */
    public static final Metrics METRICS = new Metrics();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>sys.metrics.Variable_name</code>.
     */
    public final TableField<Record, String> VARIABLE_NAME = createField(DSL.name("Variable_name"), SQLDataType.VARCHAR(193).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sys.metrics.Variable_value</code>.
     */
    public final TableField<Record, String> VARIABLE_VALUE = createField(DSL.name("Variable_value"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.metrics.Type</code>.
     */
    public final TableField<Record, String> TYPE = createField(DSL.name("Type"), SQLDataType.VARCHAR(210).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sys.metrics.Enabled</code>.
     */
    public final TableField<Record, String> ENABLED = createField(DSL.name("Enabled"), SQLDataType.VARCHAR(7).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    private Metrics(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Metrics(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `metrics` as select lower(`performance_schema`.`global_status`.`VARIABLE_NAME`) AS `Variable_name`,`performance_schema`.`global_status`.`VARIABLE_VALUE` AS `Variable_value`,'Global Status' AS `Type`,'YES' AS `Enabled` from `performance_schema`.`global_status` union all select `information_schema`.`INNODB_METRICS`.`NAME` AS `Variable_name`,`information_schema`.`INNODB_METRICS`.`COUNT` AS `Variable_value`,concat('InnoDB Metrics - ',`information_schema`.`INNODB_METRICS`.`SUBSYSTEM`) AS `Type`,if((`information_schema`.`INNODB_METRICS`.`STATUS` = 'enabled'),'YES','NO') AS `Enabled` from `information_schema`.`INNODB_METRICS` where (`information_schema`.`INNODB_METRICS`.`NAME` not in ('lock_row_lock_time','lock_row_lock_time_avg','lock_row_lock_time_max','lock_row_lock_waits','buffer_pool_reads','buffer_pool_read_requests','buffer_pool_write_requests','buffer_pool_wait_free','buffer_pool_read_ahead','buffer_pool_read_ahead_evicted','buffer_pool_pages_total','buffer_pool_pages_misc','buffer_pool_pages_data','buffer_pool_bytes_data','buffer_pool_pages_dirty','buffer_pool_bytes_dirty','buffer_pool_pages_free','buffer_pages_created','buffer_pages_written','buffer_pages_read','buffer_data_reads','buffer_data_written','file_num_open_files','os_log_bytes_written','os_log_fsyncs','os_log_pending_fsyncs','os_log_pending_writes','log_waits','log_write_requests','log_writes','innodb_dblwr_writes','innodb_dblwr_pages_written','innodb_page_size')) union all select 'memory_current_allocated' AS `Variable_name`,sum(`performance_schema`.`memory_summary_global_by_event_name`.`CURRENT_NUMBER_OF_BYTES_USED`) AS `Variable_value`,'Performance Schema' AS `Type`,if(((select count(0) from `performance_schema`.`setup_instruments` where ((`performance_schema`.`setup_instruments`.`NAME` like 'memory/%') and (`performance_schema`.`setup_instruments`.`ENABLED` = 'YES'))) = 0),'NO',if(((select count(0) from `performance_schema`.`setup_instruments` where ((`performance_schema`.`setup_instruments`.`NAME` like 'memory/%') and (`performance_schema`.`setup_instruments`.`ENABLED` = 'NO'))) = 0),'YES','PARTIAL')) AS `Enabled` from `performance_schema`.`memory_summary_global_by_event_name` union all select 'memory_total_allocated' AS `Variable_name`,sum(`performance_schema`.`memory_summary_global_by_event_name`.`SUM_NUMBER_OF_BYTES_ALLOC`) AS `Variable_value`,'Performance Schema' AS `Type`,if(((select count(0) from `performance_schema`.`setup_instruments` where ((`performance_schema`.`setup_instruments`.`NAME` like 'memory/%') and (`performance_schema`.`setup_instruments`.`ENABLED` = 'YES'))) = 0),'NO',if(((select count(0) from `performance_schema`.`setup_instruments` where ((`performance_schema`.`setup_instruments`.`NAME` like 'memory/%') and (`performance_schema`.`setup_instruments`.`ENABLED` = 'NO'))) = 0),'YES','PARTIAL')) AS `Enabled` from `performance_schema`.`memory_summary_global_by_event_name` union all select 'NOW()' AS `Variable_name`,now(3) AS `Variable_value`,'System Time' AS `Type`,'YES' AS `Enabled` union all select 'UNIX_TIMESTAMP()' AS `Variable_name`,round(unix_timestamp(now(3)),3) AS `Variable_value`,'System Time' AS `Type`,'YES' AS `Enabled` order by `Type`,`Variable_name`"));
    }

    /**
     * Create an aliased <code>sys.metrics</code> table reference
     */
    public Metrics(String alias) {
        this(DSL.name(alias), METRICS);
    }

    /**
     * Create an aliased <code>sys.metrics</code> table reference
     */
    public Metrics(Name alias) {
        this(alias, METRICS);
    }

    /**
     * Create a <code>sys.metrics</code> table reference
     */
    public Metrics() {
        this(DSL.name("metrics"), null);
    }

    public <O extends Record> Metrics(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, METRICS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Sys.SYS;
    }

    @Override
    public Metrics as(String alias) {
        return new Metrics(DSL.name(alias), this);
    }

    @Override
    public Metrics as(Name alias) {
        return new Metrics(alias, this);
    }

    @Override
    public Metrics as(Table<?> alias) {
        return new Metrics(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Metrics rename(String name) {
        return new Metrics(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Metrics rename(Name name) {
        return new Metrics(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Metrics rename(Table<?> name) {
        return new Metrics(name.getQualifiedName(), null);
    }
}
