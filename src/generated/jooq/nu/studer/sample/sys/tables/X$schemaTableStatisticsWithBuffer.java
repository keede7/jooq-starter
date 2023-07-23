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
import org.jooq.types.ULong;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class X$schemaTableStatisticsWithBuffer extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>sys.x$schema_table_statistics_with_buffer</code>
     */
    public static final X$schemaTableStatisticsWithBuffer X$SCHEMA_TABLE_STATISTICS_WITH_BUFFER = new X$schemaTableStatisticsWithBuffer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column
     * <code>sys.x$schema_table_statistics_with_buffer.table_schema</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column
     * <code>sys.x$schema_table_statistics_with_buffer.table_name</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("table_name"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column
     * <code>sys.x$schema_table_statistics_with_buffer.rows_fetched</code>.
     */
    public final TableField<Record, ULong> ROWS_FETCHED = createField(DSL.name("rows_fetched"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>sys.x$schema_table_statistics_with_buffer.fetch_latency</code>.
     */
    public final TableField<Record, ULong> FETCH_LATENCY = createField(DSL.name("fetch_latency"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>sys.x$schema_table_statistics_with_buffer.rows_inserted</code>.
     */
    public final TableField<Record, ULong> ROWS_INSERTED = createField(DSL.name("rows_inserted"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>sys.x$schema_table_statistics_with_buffer.insert_latency</code>.
     */
    public final TableField<Record, ULong> INSERT_LATENCY = createField(DSL.name("insert_latency"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>sys.x$schema_table_statistics_with_buffer.rows_updated</code>.
     */
    public final TableField<Record, ULong> ROWS_UPDATED = createField(DSL.name("rows_updated"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>sys.x$schema_table_statistics_with_buffer.update_latency</code>.
     */
    public final TableField<Record, ULong> UPDATE_LATENCY = createField(DSL.name("update_latency"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>sys.x$schema_table_statistics_with_buffer.rows_deleted</code>.
     */
    public final TableField<Record, ULong> ROWS_DELETED = createField(DSL.name("rows_deleted"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>sys.x$schema_table_statistics_with_buffer.delete_latency</code>.
     */
    public final TableField<Record, ULong> DELETE_LATENCY = createField(DSL.name("delete_latency"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>sys.x$schema_table_statistics_with_buffer.io_read_requests</code>.
     */
    public final TableField<Record, BigInteger> IO_READ_REQUESTS = createField(DSL.name("io_read_requests"), SQLDataType.DECIMAL_INTEGER(42), this, "");

    /**
     * The column
     * <code>sys.x$schema_table_statistics_with_buffer.io_read</code>.
     */
    public final TableField<Record, BigInteger> IO_READ = createField(DSL.name("io_read"), SQLDataType.DECIMAL_INTEGER(41), this, "");

    /**
     * The column
     * <code>sys.x$schema_table_statistics_with_buffer.io_read_latency</code>.
     */
    public final TableField<Record, BigInteger> IO_READ_LATENCY = createField(DSL.name("io_read_latency"), SQLDataType.DECIMAL_INTEGER(42), this, "");

    /**
     * The column
     * <code>sys.x$schema_table_statistics_with_buffer.io_write_requests</code>.
     */
    public final TableField<Record, BigInteger> IO_WRITE_REQUESTS = createField(DSL.name("io_write_requests"), SQLDataType.DECIMAL_INTEGER(42), this, "");

    /**
     * The column
     * <code>sys.x$schema_table_statistics_with_buffer.io_write</code>.
     */
    public final TableField<Record, BigInteger> IO_WRITE = createField(DSL.name("io_write"), SQLDataType.DECIMAL_INTEGER(41), this, "");

    /**
     * The column
     * <code>sys.x$schema_table_statistics_with_buffer.io_write_latency</code>.
     */
    public final TableField<Record, BigInteger> IO_WRITE_LATENCY = createField(DSL.name("io_write_latency"), SQLDataType.DECIMAL_INTEGER(42), this, "");

    /**
     * The column
     * <code>sys.x$schema_table_statistics_with_buffer.io_misc_requests</code>.
     */
    public final TableField<Record, BigInteger> IO_MISC_REQUESTS = createField(DSL.name("io_misc_requests"), SQLDataType.DECIMAL_INTEGER(42), this, "");

    /**
     * The column
     * <code>sys.x$schema_table_statistics_with_buffer.io_misc_latency</code>.
     */
    public final TableField<Record, BigInteger> IO_MISC_LATENCY = createField(DSL.name("io_misc_latency"), SQLDataType.DECIMAL_INTEGER(42), this, "");

    /**
     * The column
     * <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_allocated</code>.
     */
    public final TableField<Record, BigInteger> INNODB_BUFFER_ALLOCATED = createField(DSL.name("innodb_buffer_allocated"), SQLDataType.DECIMAL_INTEGER(44), this, "");

    /**
     * The column
     * <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_data</code>.
     */
    public final TableField<Record, BigInteger> INNODB_BUFFER_DATA = createField(DSL.name("innodb_buffer_data"), SQLDataType.DECIMAL_INTEGER(44), this, "");

    /**
     * The column
     * <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_free</code>.
     */
    public final TableField<Record, BigInteger> INNODB_BUFFER_FREE = createField(DSL.name("innodb_buffer_free"), SQLDataType.DECIMAL_INTEGER(45), this, "");

    /**
     * The column
     * <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_pages</code>.
     */
    public final TableField<Record, Long> INNODB_BUFFER_PAGES = createField(DSL.name("innodb_buffer_pages"), SQLDataType.BIGINT.defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "");

    /**
     * The column
     * <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_pages_hashed</code>.
     */
    public final TableField<Record, Long> INNODB_BUFFER_PAGES_HASHED = createField(DSL.name("innodb_buffer_pages_hashed"), SQLDataType.BIGINT.defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "");

    /**
     * The column
     * <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_pages_old</code>.
     */
    public final TableField<Record, Long> INNODB_BUFFER_PAGES_OLD = createField(DSL.name("innodb_buffer_pages_old"), SQLDataType.BIGINT.defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "");

    /**
     * The column
     * <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_rows_cached</code>.
     */
    public final TableField<Record, BigInteger> INNODB_BUFFER_ROWS_CACHED = createField(DSL.name("innodb_buffer_rows_cached"), SQLDataType.DECIMAL_INTEGER(45).defaultValue(DSL.inline("0", SQLDataType.DECIMAL_INTEGER)), this, "");

    private X$schemaTableStatisticsWithBuffer(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private X$schemaTableStatisticsWithBuffer(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `x$schema_table_statistics_with_buffer` as select `pst`.`OBJECT_SCHEMA` AS `table_schema`,`pst`.`OBJECT_NAME` AS `table_name`,`pst`.`COUNT_FETCH` AS `rows_fetched`,`pst`.`SUM_TIMER_FETCH` AS `fetch_latency`,`pst`.`COUNT_INSERT` AS `rows_inserted`,`pst`.`SUM_TIMER_INSERT` AS `insert_latency`,`pst`.`COUNT_UPDATE` AS `rows_updated`,`pst`.`SUM_TIMER_UPDATE` AS `update_latency`,`pst`.`COUNT_DELETE` AS `rows_deleted`,`pst`.`SUM_TIMER_DELETE` AS `delete_latency`,`sys`.`fsbi`.`count_read` AS `io_read_requests`,`sys`.`fsbi`.`sum_number_of_bytes_read` AS `io_read`,`sys`.`fsbi`.`sum_timer_read` AS `io_read_latency`,`sys`.`fsbi`.`count_write` AS `io_write_requests`,`sys`.`fsbi`.`sum_number_of_bytes_write` AS `io_write`,`sys`.`fsbi`.`sum_timer_write` AS `io_write_latency`,`sys`.`fsbi`.`count_misc` AS `io_misc_requests`,`sys`.`fsbi`.`sum_timer_misc` AS `io_misc_latency`,`sys`.`ibp`.`allocated` AS `innodb_buffer_allocated`,`sys`.`ibp`.`data` AS `innodb_buffer_data`,(`sys`.`ibp`.`allocated` - `sys`.`ibp`.`data`) AS `innodb_buffer_free`,`sys`.`ibp`.`pages` AS `innodb_buffer_pages`,`sys`.`ibp`.`pages_hashed` AS `innodb_buffer_pages_hashed`,`sys`.`ibp`.`pages_old` AS `innodb_buffer_pages_old`,`sys`.`ibp`.`rows_cached` AS `innodb_buffer_rows_cached` from ((`performance_schema`.`table_io_waits_summary_by_table` `pst` left join `sys`.`x$ps_schema_table_statistics_io` `fsbi` on(((`pst`.`OBJECT_SCHEMA` = `sys`.`fsbi`.`table_schema`) and (`pst`.`OBJECT_NAME` = `sys`.`fsbi`.`table_name`)))) left join `sys`.`x$innodb_buffer_stats_by_table` `ibp` on(((`pst`.`OBJECT_SCHEMA` = `sys`.`ibp`.`object_schema`) and (`pst`.`OBJECT_NAME` = `sys`.`ibp`.`object_name`)))) order by `pst`.`SUM_TIMER_WAIT` desc"));
    }

    /**
     * Create an aliased <code>sys.x$schema_table_statistics_with_buffer</code>
     * table reference
     */
    public X$schemaTableStatisticsWithBuffer(String alias) {
        this(DSL.name(alias), X$SCHEMA_TABLE_STATISTICS_WITH_BUFFER);
    }

    /**
     * Create an aliased <code>sys.x$schema_table_statistics_with_buffer</code>
     * table reference
     */
    public X$schemaTableStatisticsWithBuffer(Name alias) {
        this(alias, X$SCHEMA_TABLE_STATISTICS_WITH_BUFFER);
    }

    /**
     * Create a <code>sys.x$schema_table_statistics_with_buffer</code> table
     * reference
     */
    public X$schemaTableStatisticsWithBuffer() {
        this(DSL.name("x$schema_table_statistics_with_buffer"), null);
    }

    public <O extends Record> X$schemaTableStatisticsWithBuffer(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, X$SCHEMA_TABLE_STATISTICS_WITH_BUFFER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Sys.SYS;
    }

    @Override
    public X$schemaTableStatisticsWithBuffer as(String alias) {
        return new X$schemaTableStatisticsWithBuffer(DSL.name(alias), this);
    }

    @Override
    public X$schemaTableStatisticsWithBuffer as(Name alias) {
        return new X$schemaTableStatisticsWithBuffer(alias, this);
    }

    @Override
    public X$schemaTableStatisticsWithBuffer as(Table<?> alias) {
        return new X$schemaTableStatisticsWithBuffer(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$schemaTableStatisticsWithBuffer rename(String name) {
        return new X$schemaTableStatisticsWithBuffer(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$schemaTableStatisticsWithBuffer rename(Name name) {
        return new X$schemaTableStatisticsWithBuffer(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$schemaTableStatisticsWithBuffer rename(Table<?> name) {
        return new X$schemaTableStatisticsWithBuffer(name.getQualifiedName(), null);
    }
}
