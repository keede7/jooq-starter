/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.sys.tables;


import java.math.BigInteger;

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
public class WaitClassesGlobalByAvgLatency extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>sys.wait_classes_global_by_avg_latency</code>
     */
    public static final WaitClassesGlobalByAvgLatency WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY = new WaitClassesGlobalByAvgLatency();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column
     * <code>sys.wait_classes_global_by_avg_latency.event_class</code>.
     */
    public final TableField<Record, String> EVENT_CLASS = createField(DSL.name("event_class"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>sys.wait_classes_global_by_avg_latency.total</code>.
     */
    public final TableField<Record, BigInteger> TOTAL = createField(DSL.name("total"), SQLDataType.DECIMAL_INTEGER(42), this, "");

    /**
     * The column
     * <code>sys.wait_classes_global_by_avg_latency.total_latency</code>.
     */
    public final TableField<Record, String> TOTAL_LATENCY = createField(DSL.name("total_latency"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column
     * <code>sys.wait_classes_global_by_avg_latency.min_latency</code>.
     */
    public final TableField<Record, String> MIN_LATENCY = createField(DSL.name("min_latency"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column
     * <code>sys.wait_classes_global_by_avg_latency.avg_latency</code>.
     */
    public final TableField<Record, String> AVG_LATENCY = createField(DSL.name("avg_latency"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column
     * <code>sys.wait_classes_global_by_avg_latency.max_latency</code>.
     */
    public final TableField<Record, String> MAX_LATENCY = createField(DSL.name("max_latency"), SQLDataType.VARCHAR(11), this, "");

    private WaitClassesGlobalByAvgLatency(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private WaitClassesGlobalByAvgLatency(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `wait_classes_global_by_avg_latency` as select substring_index(`performance_schema`.`events_waits_summary_global_by_event_name`.`EVENT_NAME`,'/',3) AS `event_class`,sum(`performance_schema`.`events_waits_summary_global_by_event_name`.`COUNT_STAR`) AS `total`,format_pico_time(cast(sum(`performance_schema`.`events_waits_summary_global_by_event_name`.`SUM_TIMER_WAIT`) as unsigned)) AS `total_latency`,format_pico_time(min(`performance_schema`.`events_waits_summary_global_by_event_name`.`MIN_TIMER_WAIT`)) AS `min_latency`,format_pico_time(ifnull((sum(`performance_schema`.`events_waits_summary_global_by_event_name`.`SUM_TIMER_WAIT`) / nullif(sum(`performance_schema`.`events_waits_summary_global_by_event_name`.`COUNT_STAR`),0)),0)) AS `avg_latency`,format_pico_time(cast(max(`performance_schema`.`events_waits_summary_global_by_event_name`.`MAX_TIMER_WAIT`) as unsigned)) AS `max_latency` from `performance_schema`.`events_waits_summary_global_by_event_name` where ((`performance_schema`.`events_waits_summary_global_by_event_name`.`SUM_TIMER_WAIT` > 0) and (`performance_schema`.`events_waits_summary_global_by_event_name`.`EVENT_NAME` <> 'idle')) group by `event_class` order by ifnull((sum(`performance_schema`.`events_waits_summary_global_by_event_name`.`SUM_TIMER_WAIT`) / nullif(sum(`performance_schema`.`events_waits_summary_global_by_event_name`.`COUNT_STAR`),0)),0) desc"));
    }

    /**
     * Create an aliased <code>sys.wait_classes_global_by_avg_latency</code>
     * table reference
     */
    public WaitClassesGlobalByAvgLatency(String alias) {
        this(DSL.name(alias), WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY);
    }

    /**
     * Create an aliased <code>sys.wait_classes_global_by_avg_latency</code>
     * table reference
     */
    public WaitClassesGlobalByAvgLatency(Name alias) {
        this(alias, WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY);
    }

    /**
     * Create a <code>sys.wait_classes_global_by_avg_latency</code> table
     * reference
     */
    public WaitClassesGlobalByAvgLatency() {
        this(DSL.name("wait_classes_global_by_avg_latency"), null);
    }

    public <O extends Record> WaitClassesGlobalByAvgLatency(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Sys.SYS;
    }

    @Override
    public WaitClassesGlobalByAvgLatency as(String alias) {
        return new WaitClassesGlobalByAvgLatency(DSL.name(alias), this);
    }

    @Override
    public WaitClassesGlobalByAvgLatency as(Name alias) {
        return new WaitClassesGlobalByAvgLatency(alias, this);
    }

    @Override
    public WaitClassesGlobalByAvgLatency as(Table<?> alias) {
        return new WaitClassesGlobalByAvgLatency(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public WaitClassesGlobalByAvgLatency rename(String name) {
        return new WaitClassesGlobalByAvgLatency(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public WaitClassesGlobalByAvgLatency rename(Name name) {
        return new WaitClassesGlobalByAvgLatency(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public WaitClassesGlobalByAvgLatency rename(Table<?> name) {
        return new WaitClassesGlobalByAvgLatency(name.getQualifiedName(), null);
    }
}
