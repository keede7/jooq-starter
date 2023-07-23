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
public class MemoryByHostByCurrentBytes extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>sys.memory_by_host_by_current_bytes</code>
     */
    public static final MemoryByHostByCurrentBytes MEMORY_BY_HOST_BY_CURRENT_BYTES = new MemoryByHostByCurrentBytes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>sys.memory_by_host_by_current_bytes.host</code>.
     */
    public final TableField<Record, String> HOST = createField(DSL.name("host"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column
     * <code>sys.memory_by_host_by_current_bytes.current_count_used</code>.
     */
    public final TableField<Record, BigInteger> CURRENT_COUNT_USED = createField(DSL.name("current_count_used"), SQLDataType.DECIMAL_INTEGER(41), this, "");

    /**
     * The column
     * <code>sys.memory_by_host_by_current_bytes.current_allocated</code>.
     */
    public final TableField<Record, String> CURRENT_ALLOCATED = createField(DSL.name("current_allocated"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column
     * <code>sys.memory_by_host_by_current_bytes.current_avg_alloc</code>.
     */
    public final TableField<Record, String> CURRENT_AVG_ALLOC = createField(DSL.name("current_avg_alloc"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column
     * <code>sys.memory_by_host_by_current_bytes.current_max_alloc</code>.
     */
    public final TableField<Record, String> CURRENT_MAX_ALLOC = createField(DSL.name("current_max_alloc"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column
     * <code>sys.memory_by_host_by_current_bytes.total_allocated</code>.
     */
    public final TableField<Record, String> TOTAL_ALLOCATED = createField(DSL.name("total_allocated"), SQLDataType.VARCHAR(11), this, "");

    private MemoryByHostByCurrentBytes(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private MemoryByHostByCurrentBytes(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `memory_by_host_by_current_bytes` as select if((`performance_schema`.`memory_summary_by_host_by_event_name`.`HOST` is null),'background',`performance_schema`.`memory_summary_by_host_by_event_name`.`HOST`) AS `host`,sum(`performance_schema`.`memory_summary_by_host_by_event_name`.`CURRENT_COUNT_USED`) AS `current_count_used`,format_bytes(sum(`performance_schema`.`memory_summary_by_host_by_event_name`.`CURRENT_NUMBER_OF_BYTES_USED`)) AS `current_allocated`,format_bytes(ifnull((sum(`performance_schema`.`memory_summary_by_host_by_event_name`.`CURRENT_NUMBER_OF_BYTES_USED`) / nullif(sum(`performance_schema`.`memory_summary_by_host_by_event_name`.`CURRENT_COUNT_USED`),0)),0)) AS `current_avg_alloc`,format_bytes(max(`performance_schema`.`memory_summary_by_host_by_event_name`.`CURRENT_NUMBER_OF_BYTES_USED`)) AS `current_max_alloc`,format_bytes(sum(`performance_schema`.`memory_summary_by_host_by_event_name`.`SUM_NUMBER_OF_BYTES_ALLOC`)) AS `total_allocated` from `performance_schema`.`memory_summary_by_host_by_event_name` group by if((`performance_schema`.`memory_summary_by_host_by_event_name`.`HOST` is null),'background',`performance_schema`.`memory_summary_by_host_by_event_name`.`HOST`) order by sum(`performance_schema`.`memory_summary_by_host_by_event_name`.`CURRENT_NUMBER_OF_BYTES_USED`) desc"));
    }

    /**
     * Create an aliased <code>sys.memory_by_host_by_current_bytes</code> table
     * reference
     */
    public MemoryByHostByCurrentBytes(String alias) {
        this(DSL.name(alias), MEMORY_BY_HOST_BY_CURRENT_BYTES);
    }

    /**
     * Create an aliased <code>sys.memory_by_host_by_current_bytes</code> table
     * reference
     */
    public MemoryByHostByCurrentBytes(Name alias) {
        this(alias, MEMORY_BY_HOST_BY_CURRENT_BYTES);
    }

    /**
     * Create a <code>sys.memory_by_host_by_current_bytes</code> table reference
     */
    public MemoryByHostByCurrentBytes() {
        this(DSL.name("memory_by_host_by_current_bytes"), null);
    }

    public <O extends Record> MemoryByHostByCurrentBytes(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, MEMORY_BY_HOST_BY_CURRENT_BYTES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Sys.SYS;
    }

    @Override
    public MemoryByHostByCurrentBytes as(String alias) {
        return new MemoryByHostByCurrentBytes(DSL.name(alias), this);
    }

    @Override
    public MemoryByHostByCurrentBytes as(Name alias) {
        return new MemoryByHostByCurrentBytes(alias, this);
    }

    @Override
    public MemoryByHostByCurrentBytes as(Table<?> alias) {
        return new MemoryByHostByCurrentBytes(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public MemoryByHostByCurrentBytes rename(String name) {
        return new MemoryByHostByCurrentBytes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MemoryByHostByCurrentBytes rename(Name name) {
        return new MemoryByHostByCurrentBytes(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public MemoryByHostByCurrentBytes rename(Table<?> name) {
        return new MemoryByHostByCurrentBytes(name.getQualifiedName(), null);
    }
}
