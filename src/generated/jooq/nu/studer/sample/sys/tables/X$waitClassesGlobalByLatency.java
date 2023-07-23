/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.sys.tables;


import java.math.BigDecimal;
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
import org.jooq.types.ULong;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class X$waitClassesGlobalByLatency extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>sys.x$wait_classes_global_by_latency</code>
     */
    public static final X$waitClassesGlobalByLatency X$WAIT_CLASSES_GLOBAL_BY_LATENCY = new X$waitClassesGlobalByLatency();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>sys.x$wait_classes_global_by_latency.event_class</code>.
     */
    public final TableField<Record, String> EVENT_CLASS = createField(DSL.name("event_class"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>sys.x$wait_classes_global_by_latency.total</code>.
     */
    public final TableField<Record, BigInteger> TOTAL = createField(DSL.name("total"), SQLDataType.DECIMAL_INTEGER(42), this, "");

    /**
     * The column
     * <code>sys.x$wait_classes_global_by_latency.total_latency</code>.
     */
    public final TableField<Record, BigInteger> TOTAL_LATENCY = createField(DSL.name("total_latency"), SQLDataType.DECIMAL_INTEGER(42), this, "");

    /**
     * The column <code>sys.x$wait_classes_global_by_latency.min_latency</code>.
     */
    public final TableField<Record, ULong> MIN_LATENCY = createField(DSL.name("min_latency"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$wait_classes_global_by_latency.avg_latency</code>.
     */
    public final TableField<Record, BigDecimal> AVG_LATENCY = createField(DSL.name("avg_latency"), SQLDataType.DECIMAL(46, 4).nullable(false).defaultValue(DSL.inline("0.0000", SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>sys.x$wait_classes_global_by_latency.max_latency</code>.
     */
    public final TableField<Record, ULong> MAX_LATENCY = createField(DSL.name("max_latency"), SQLDataType.BIGINTUNSIGNED, this, "");

    private X$waitClassesGlobalByLatency(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private X$waitClassesGlobalByLatency(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `x$wait_classes_global_by_latency` as select substring_index(`performance_schema`.`events_waits_summary_global_by_event_name`.`EVENT_NAME`,'/',3) AS `event_class`,sum(`performance_schema`.`events_waits_summary_global_by_event_name`.`COUNT_STAR`) AS `total`,sum(`performance_schema`.`events_waits_summary_global_by_event_name`.`SUM_TIMER_WAIT`) AS `total_latency`,min(`performance_schema`.`events_waits_summary_global_by_event_name`.`MIN_TIMER_WAIT`) AS `min_latency`,ifnull((sum(`performance_schema`.`events_waits_summary_global_by_event_name`.`SUM_TIMER_WAIT`) / nullif(sum(`performance_schema`.`events_waits_summary_global_by_event_name`.`COUNT_STAR`),0)),0) AS `avg_latency`,max(`performance_schema`.`events_waits_summary_global_by_event_name`.`MAX_TIMER_WAIT`) AS `max_latency` from `performance_schema`.`events_waits_summary_global_by_event_name` where ((`performance_schema`.`events_waits_summary_global_by_event_name`.`SUM_TIMER_WAIT` > 0) and (`performance_schema`.`events_waits_summary_global_by_event_name`.`EVENT_NAME` <> 'idle')) group by substring_index(`performance_schema`.`events_waits_summary_global_by_event_name`.`EVENT_NAME`,'/',3) order by sum(`performance_schema`.`events_waits_summary_global_by_event_name`.`SUM_TIMER_WAIT`) desc"));
    }

    /**
     * Create an aliased <code>sys.x$wait_classes_global_by_latency</code> table
     * reference
     */
    public X$waitClassesGlobalByLatency(String alias) {
        this(DSL.name(alias), X$WAIT_CLASSES_GLOBAL_BY_LATENCY);
    }

    /**
     * Create an aliased <code>sys.x$wait_classes_global_by_latency</code> table
     * reference
     */
    public X$waitClassesGlobalByLatency(Name alias) {
        this(alias, X$WAIT_CLASSES_GLOBAL_BY_LATENCY);
    }

    /**
     * Create a <code>sys.x$wait_classes_global_by_latency</code> table
     * reference
     */
    public X$waitClassesGlobalByLatency() {
        this(DSL.name("x$wait_classes_global_by_latency"), null);
    }

    public <O extends Record> X$waitClassesGlobalByLatency(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, X$WAIT_CLASSES_GLOBAL_BY_LATENCY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Sys.SYS;
    }

    @Override
    public X$waitClassesGlobalByLatency as(String alias) {
        return new X$waitClassesGlobalByLatency(DSL.name(alias), this);
    }

    @Override
    public X$waitClassesGlobalByLatency as(Name alias) {
        return new X$waitClassesGlobalByLatency(alias, this);
    }

    @Override
    public X$waitClassesGlobalByLatency as(Table<?> alias) {
        return new X$waitClassesGlobalByLatency(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$waitClassesGlobalByLatency rename(String name) {
        return new X$waitClassesGlobalByLatency(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$waitClassesGlobalByLatency rename(Name name) {
        return new X$waitClassesGlobalByLatency(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$waitClassesGlobalByLatency rename(Table<?> name) {
        return new X$waitClassesGlobalByLatency(name.getQualifiedName(), null);
    }
}
