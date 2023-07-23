/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.sys.tables;


import java.math.BigInteger;
import java.time.LocalDateTime;

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
public class X$statementsWithTempTables extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.x$statements_with_temp_tables</code>
     */
    public static final X$statementsWithTempTables X$STATEMENTS_WITH_TEMP_TABLES = new X$statementsWithTempTables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>sys.x$statements_with_temp_tables.query</code>.
     */
    public final TableField<Record, String> QUERY = createField(DSL.name("query"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.x$statements_with_temp_tables.db</code>.
     */
    public final TableField<Record, String> DB = createField(DSL.name("db"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.x$statements_with_temp_tables.exec_count</code>.
     */
    public final TableField<Record, ULong> EXEC_COUNT = createField(DSL.name("exec_count"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$statements_with_temp_tables.total_latency</code>.
     */
    public final TableField<Record, ULong> TOTAL_LATENCY = createField(DSL.name("total_latency"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>sys.x$statements_with_temp_tables.memory_tmp_tables</code>.
     */
    public final TableField<Record, ULong> MEMORY_TMP_TABLES = createField(DSL.name("memory_tmp_tables"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>sys.x$statements_with_temp_tables.disk_tmp_tables</code>.
     */
    public final TableField<Record, ULong> DISK_TMP_TABLES = createField(DSL.name("disk_tmp_tables"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>sys.x$statements_with_temp_tables.avg_tmp_tables_per_query</code>.
     */
    public final TableField<Record, BigInteger> AVG_TMP_TABLES_PER_QUERY = createField(DSL.name("avg_tmp_tables_per_query"), SQLDataType.DECIMAL_INTEGER(21).nullable(false).defaultValue(DSL.inline("0", SQLDataType.DECIMAL_INTEGER)), this, "");

    /**
     * The column
     * <code>sys.x$statements_with_temp_tables.tmp_tables_to_disk_pct</code>.
     */
    public final TableField<Record, BigInteger> TMP_TABLES_TO_DISK_PCT = createField(DSL.name("tmp_tables_to_disk_pct"), SQLDataType.DECIMAL_INTEGER(24).nullable(false).defaultValue(DSL.inline("0", SQLDataType.DECIMAL_INTEGER)), this, "");

    /**
     * The column <code>sys.x$statements_with_temp_tables.first_seen</code>.
     */
    public final TableField<Record, LocalDateTime> FIRST_SEEN = createField(DSL.name("first_seen"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    /**
     * The column <code>sys.x$statements_with_temp_tables.last_seen</code>.
     */
    public final TableField<Record, LocalDateTime> LAST_SEEN = createField(DSL.name("last_seen"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    /**
     * The column <code>sys.x$statements_with_temp_tables.digest</code>.
     */
    public final TableField<Record, String> DIGEST = createField(DSL.name("digest"), SQLDataType.VARCHAR(64), this, "");

    private X$statementsWithTempTables(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private X$statementsWithTempTables(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `x$statements_with_temp_tables` as select `performance_schema`.`events_statements_summary_by_digest`.`DIGEST_TEXT` AS `query`,`performance_schema`.`events_statements_summary_by_digest`.`SCHEMA_NAME` AS `db`,`performance_schema`.`events_statements_summary_by_digest`.`COUNT_STAR` AS `exec_count`,`performance_schema`.`events_statements_summary_by_digest`.`SUM_TIMER_WAIT` AS `total_latency`,`performance_schema`.`events_statements_summary_by_digest`.`SUM_CREATED_TMP_TABLES` AS `memory_tmp_tables`,`performance_schema`.`events_statements_summary_by_digest`.`SUM_CREATED_TMP_DISK_TABLES` AS `disk_tmp_tables`,round(ifnull((`performance_schema`.`events_statements_summary_by_digest`.`SUM_CREATED_TMP_TABLES` / nullif(`performance_schema`.`events_statements_summary_by_digest`.`COUNT_STAR`,0)),0),0) AS `avg_tmp_tables_per_query`,round((ifnull((`performance_schema`.`events_statements_summary_by_digest`.`SUM_CREATED_TMP_DISK_TABLES` / nullif(`performance_schema`.`events_statements_summary_by_digest`.`SUM_CREATED_TMP_TABLES`,0)),0) * 100),0) AS `tmp_tables_to_disk_pct`,`performance_schema`.`events_statements_summary_by_digest`.`FIRST_SEEN` AS `first_seen`,`performance_schema`.`events_statements_summary_by_digest`.`LAST_SEEN` AS `last_seen`,`performance_schema`.`events_statements_summary_by_digest`.`DIGEST` AS `digest` from `performance_schema`.`events_statements_summary_by_digest` where (`performance_schema`.`events_statements_summary_by_digest`.`SUM_CREATED_TMP_TABLES` > 0) order by `performance_schema`.`events_statements_summary_by_digest`.`SUM_CREATED_TMP_DISK_TABLES` desc,`performance_schema`.`events_statements_summary_by_digest`.`SUM_CREATED_TMP_TABLES` desc"));
    }

    /**
     * Create an aliased <code>sys.x$statements_with_temp_tables</code> table
     * reference
     */
    public X$statementsWithTempTables(String alias) {
        this(DSL.name(alias), X$STATEMENTS_WITH_TEMP_TABLES);
    }

    /**
     * Create an aliased <code>sys.x$statements_with_temp_tables</code> table
     * reference
     */
    public X$statementsWithTempTables(Name alias) {
        this(alias, X$STATEMENTS_WITH_TEMP_TABLES);
    }

    /**
     * Create a <code>sys.x$statements_with_temp_tables</code> table reference
     */
    public X$statementsWithTempTables() {
        this(DSL.name("x$statements_with_temp_tables"), null);
    }

    public <O extends Record> X$statementsWithTempTables(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, X$STATEMENTS_WITH_TEMP_TABLES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Sys.SYS;
    }

    @Override
    public X$statementsWithTempTables as(String alias) {
        return new X$statementsWithTempTables(DSL.name(alias), this);
    }

    @Override
    public X$statementsWithTempTables as(Name alias) {
        return new X$statementsWithTempTables(alias, this);
    }

    @Override
    public X$statementsWithTempTables as(Table<?> alias) {
        return new X$statementsWithTempTables(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$statementsWithTempTables rename(String name) {
        return new X$statementsWithTempTables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$statementsWithTempTables rename(Name name) {
        return new X$statementsWithTempTables(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$statementsWithTempTables rename(Table<?> name) {
        return new X$statementsWithTempTables(name.getQualifiedName(), null);
    }
}