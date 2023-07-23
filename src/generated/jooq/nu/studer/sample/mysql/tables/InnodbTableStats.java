/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.mysql.tables;


import java.time.LocalDateTime;

import nu.studer.sample.mysql.Keys;
import nu.studer.sample.mysql.Mysql;

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
public class InnodbTableStats extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>mysql.innodb_table_stats</code>
     */
    public static final InnodbTableStats INNODB_TABLE_STATS = new InnodbTableStats();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>mysql.innodb_table_stats.database_name</code>.
     */
    public final TableField<Record, String> DATABASE_NAME = createField(DSL.name("database_name"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>mysql.innodb_table_stats.table_name</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("table_name"), SQLDataType.VARCHAR(199).nullable(false), this, "");

    /**
     * The column <code>mysql.innodb_table_stats.last_update</code>.
     */
    public final TableField<Record, LocalDateTime> LAST_UPDATE = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field(DSL.raw("CURRENT_TIMESTAMP"), SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>mysql.innodb_table_stats.n_rows</code>.
     */
    public final TableField<Record, ULong> N_ROWS = createField(DSL.name("n_rows"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.innodb_table_stats.clustered_index_size</code>.
     */
    public final TableField<Record, ULong> CLUSTERED_INDEX_SIZE = createField(DSL.name("clustered_index_size"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>mysql.innodb_table_stats.sum_of_other_index_sizes</code>.
     */
    public final TableField<Record, ULong> SUM_OF_OTHER_INDEX_SIZES = createField(DSL.name("sum_of_other_index_sizes"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    private InnodbTableStats(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private InnodbTableStats(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>mysql.innodb_table_stats</code> table reference
     */
    public InnodbTableStats(String alias) {
        this(DSL.name(alias), INNODB_TABLE_STATS);
    }

    /**
     * Create an aliased <code>mysql.innodb_table_stats</code> table reference
     */
    public InnodbTableStats(Name alias) {
        this(alias, INNODB_TABLE_STATS);
    }

    /**
     * Create a <code>mysql.innodb_table_stats</code> table reference
     */
    public InnodbTableStats() {
        this(DSL.name("innodb_table_stats"), null);
    }

    public <O extends Record> InnodbTableStats(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, INNODB_TABLE_STATS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Mysql.MYSQL;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.KEY_INNODB_TABLE_STATS_PRIMARY;
    }

    @Override
    public InnodbTableStats as(String alias) {
        return new InnodbTableStats(DSL.name(alias), this);
    }

    @Override
    public InnodbTableStats as(Name alias) {
        return new InnodbTableStats(alias, this);
    }

    @Override
    public InnodbTableStats as(Table<?> alias) {
        return new InnodbTableStats(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbTableStats rename(String name) {
        return new InnodbTableStats(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbTableStats rename(Name name) {
        return new InnodbTableStats(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbTableStats rename(Table<?> name) {
        return new InnodbTableStats(name.getQualifiedName(), null);
    }
}