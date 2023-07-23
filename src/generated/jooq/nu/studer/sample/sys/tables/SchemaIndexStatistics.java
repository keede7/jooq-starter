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
public class SchemaIndexStatistics extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.schema_index_statistics</code>
     */
    public static final SchemaIndexStatistics SCHEMA_INDEX_STATISTICS = new SchemaIndexStatistics();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>sys.schema_index_statistics.table_schema</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.schema_index_statistics.table_name</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("table_name"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.schema_index_statistics.index_name</code>.
     */
    public final TableField<Record, String> INDEX_NAME = createField(DSL.name("index_name"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.schema_index_statistics.rows_selected</code>.
     */
    public final TableField<Record, ULong> ROWS_SELECTED = createField(DSL.name("rows_selected"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.schema_index_statistics.select_latency</code>.
     */
    public final TableField<Record, String> SELECT_LATENCY = createField(DSL.name("select_latency"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.schema_index_statistics.rows_inserted</code>.
     */
    public final TableField<Record, ULong> ROWS_INSERTED = createField(DSL.name("rows_inserted"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.schema_index_statistics.insert_latency</code>.
     */
    public final TableField<Record, String> INSERT_LATENCY = createField(DSL.name("insert_latency"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.schema_index_statistics.rows_updated</code>.
     */
    public final TableField<Record, ULong> ROWS_UPDATED = createField(DSL.name("rows_updated"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.schema_index_statistics.update_latency</code>.
     */
    public final TableField<Record, String> UPDATE_LATENCY = createField(DSL.name("update_latency"), SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.schema_index_statistics.rows_deleted</code>.
     */
    public final TableField<Record, ULong> ROWS_DELETED = createField(DSL.name("rows_deleted"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.schema_index_statistics.delete_latency</code>.
     */
    public final TableField<Record, String> DELETE_LATENCY = createField(DSL.name("delete_latency"), SQLDataType.VARCHAR(11), this, "");

    private SchemaIndexStatistics(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private SchemaIndexStatistics(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `schema_index_statistics` as select `performance_schema`.`table_io_waits_summary_by_index_usage`.`OBJECT_SCHEMA` AS `table_schema`,`performance_schema`.`table_io_waits_summary_by_index_usage`.`OBJECT_NAME` AS `table_name`,`performance_schema`.`table_io_waits_summary_by_index_usage`.`INDEX_NAME` AS `index_name`,`performance_schema`.`table_io_waits_summary_by_index_usage`.`COUNT_FETCH` AS `rows_selected`,format_pico_time(`performance_schema`.`table_io_waits_summary_by_index_usage`.`SUM_TIMER_FETCH`) AS `select_latency`,`performance_schema`.`table_io_waits_summary_by_index_usage`.`COUNT_INSERT` AS `rows_inserted`,format_pico_time(`performance_schema`.`table_io_waits_summary_by_index_usage`.`SUM_TIMER_INSERT`) AS `insert_latency`,`performance_schema`.`table_io_waits_summary_by_index_usage`.`COUNT_UPDATE` AS `rows_updated`,format_pico_time(`performance_schema`.`table_io_waits_summary_by_index_usage`.`SUM_TIMER_UPDATE`) AS `update_latency`,`performance_schema`.`table_io_waits_summary_by_index_usage`.`COUNT_DELETE` AS `rows_deleted`,format_pico_time(`performance_schema`.`table_io_waits_summary_by_index_usage`.`SUM_TIMER_DELETE`) AS `delete_latency` from `performance_schema`.`table_io_waits_summary_by_index_usage` where (`performance_schema`.`table_io_waits_summary_by_index_usage`.`INDEX_NAME` is not null) order by `performance_schema`.`table_io_waits_summary_by_index_usage`.`SUM_TIMER_WAIT` desc"));
    }

    /**
     * Create an aliased <code>sys.schema_index_statistics</code> table
     * reference
     */
    public SchemaIndexStatistics(String alias) {
        this(DSL.name(alias), SCHEMA_INDEX_STATISTICS);
    }

    /**
     * Create an aliased <code>sys.schema_index_statistics</code> table
     * reference
     */
    public SchemaIndexStatistics(Name alias) {
        this(alias, SCHEMA_INDEX_STATISTICS);
    }

    /**
     * Create a <code>sys.schema_index_statistics</code> table reference
     */
    public SchemaIndexStatistics() {
        this(DSL.name("schema_index_statistics"), null);
    }

    public <O extends Record> SchemaIndexStatistics(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, SCHEMA_INDEX_STATISTICS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Sys.SYS;
    }

    @Override
    public SchemaIndexStatistics as(String alias) {
        return new SchemaIndexStatistics(DSL.name(alias), this);
    }

    @Override
    public SchemaIndexStatistics as(Name alias) {
        return new SchemaIndexStatistics(alias, this);
    }

    @Override
    public SchemaIndexStatistics as(Table<?> alias) {
        return new SchemaIndexStatistics(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemaIndexStatistics rename(String name) {
        return new SchemaIndexStatistics(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemaIndexStatistics rename(Name name) {
        return new SchemaIndexStatistics(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemaIndexStatistics rename(Table<?> name) {
        return new SchemaIndexStatistics(name.getQualifiedName(), null);
    }
}
