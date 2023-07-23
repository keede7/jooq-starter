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
public class SchemaRedundantIndexes extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.schema_redundant_indexes</code>
     */
    public static final SchemaRedundantIndexes SCHEMA_REDUNDANT_INDEXES = new SchemaRedundantIndexes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>sys.schema_redundant_indexes.table_schema</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>sys.schema_redundant_indexes.table_name</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("table_name"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column
     * <code>sys.schema_redundant_indexes.redundant_index_name</code>.
     */
    public final TableField<Record, String> REDUNDANT_INDEX_NAME = createField(DSL.name("redundant_index_name"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column
     * <code>sys.schema_redundant_indexes.redundant_index_columns</code>.
     */
    public final TableField<Record, String> REDUNDANT_INDEX_COLUMNS = createField(DSL.name("redundant_index_columns"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>sys.schema_redundant_indexes.redundant_index_non_unique</code>.
     */
    public final TableField<Record, Integer> REDUNDANT_INDEX_NON_UNIQUE = createField(DSL.name("redundant_index_non_unique"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>sys.schema_redundant_indexes.dominant_index_name</code>.
     */
    public final TableField<Record, String> DOMINANT_INDEX_NAME = createField(DSL.name("dominant_index_name"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column
     * <code>sys.schema_redundant_indexes.dominant_index_columns</code>.
     */
    public final TableField<Record, String> DOMINANT_INDEX_COLUMNS = createField(DSL.name("dominant_index_columns"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>sys.schema_redundant_indexes.dominant_index_non_unique</code>.
     */
    public final TableField<Record, Integer> DOMINANT_INDEX_NON_UNIQUE = createField(DSL.name("dominant_index_non_unique"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>sys.schema_redundant_indexes.subpart_exists</code>.
     */
    public final TableField<Record, Integer> SUBPART_EXISTS = createField(DSL.name("subpart_exists"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>sys.schema_redundant_indexes.sql_drop_index</code>.
     */
    public final TableField<Record, String> SQL_DROP_INDEX = createField(DSL.name("sql_drop_index"), SQLDataType.VARCHAR(223), this, "");

    private SchemaRedundantIndexes(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private SchemaRedundantIndexes(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `schema_redundant_indexes` as select `sys`.`redundant_keys`.`table_schema` AS `table_schema`,`sys`.`redundant_keys`.`table_name` AS `table_name`,`sys`.`redundant_keys`.`index_name` AS `redundant_index_name`,`sys`.`redundant_keys`.`index_columns` AS `redundant_index_columns`,`sys`.`redundant_keys`.`non_unique` AS `redundant_index_non_unique`,`sys`.`dominant_keys`.`index_name` AS `dominant_index_name`,`sys`.`dominant_keys`.`index_columns` AS `dominant_index_columns`,`sys`.`dominant_keys`.`non_unique` AS `dominant_index_non_unique`,if(((0 <> `sys`.`redundant_keys`.`subpart_exists`) or (0 <> `sys`.`dominant_keys`.`subpart_exists`)),1,0) AS `subpart_exists`,concat('ALTER TABLE `',`sys`.`redundant_keys`.`table_schema`,'`.`',`sys`.`redundant_keys`.`table_name`,'` DROP INDEX `',`sys`.`redundant_keys`.`index_name`,'`') AS `sql_drop_index` from (`sys`.`x$schema_flattened_keys` `redundant_keys` join `sys`.`x$schema_flattened_keys` `dominant_keys` on(((`sys`.`redundant_keys`.`table_schema` = `sys`.`dominant_keys`.`table_schema`) and (`sys`.`redundant_keys`.`table_name` = `sys`.`dominant_keys`.`table_name`)))) where ((`sys`.`redundant_keys`.`index_name` <> `sys`.`dominant_keys`.`index_name`) and (((`sys`.`redundant_keys`.`index_columns` = `sys`.`dominant_keys`.`index_columns`) and ((`sys`.`redundant_keys`.`non_unique` > `sys`.`dominant_keys`.`non_unique`) or ((`sys`.`redundant_keys`.`non_unique` = `sys`.`dominant_keys`.`non_unique`) and (if((`sys`.`redundant_keys`.`index_name` = 'PRIMARY'),'',`sys`.`redundant_keys`.`index_name`) > if((`sys`.`dominant_keys`.`index_name` = 'PRIMARY'),'',`sys`.`dominant_keys`.`index_name`))))) or ((locate(concat(`sys`.`redundant_keys`.`index_columns`,','),`sys`.`dominant_keys`.`index_columns`) = 1) and (`sys`.`redundant_keys`.`non_unique` = 1)) or ((locate(concat(`sys`.`dominant_keys`.`index_columns`,','),`sys`.`redundant_keys`.`index_columns`) = 1) and (`sys`.`dominant_keys`.`non_unique` = 0))))"));
    }

    /**
     * Create an aliased <code>sys.schema_redundant_indexes</code> table
     * reference
     */
    public SchemaRedundantIndexes(String alias) {
        this(DSL.name(alias), SCHEMA_REDUNDANT_INDEXES);
    }

    /**
     * Create an aliased <code>sys.schema_redundant_indexes</code> table
     * reference
     */
    public SchemaRedundantIndexes(Name alias) {
        this(alias, SCHEMA_REDUNDANT_INDEXES);
    }

    /**
     * Create a <code>sys.schema_redundant_indexes</code> table reference
     */
    public SchemaRedundantIndexes() {
        this(DSL.name("schema_redundant_indexes"), null);
    }

    public <O extends Record> SchemaRedundantIndexes(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, SCHEMA_REDUNDANT_INDEXES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Sys.SYS;
    }

    @Override
    public SchemaRedundantIndexes as(String alias) {
        return new SchemaRedundantIndexes(DSL.name(alias), this);
    }

    @Override
    public SchemaRedundantIndexes as(Name alias) {
        return new SchemaRedundantIndexes(alias, this);
    }

    @Override
    public SchemaRedundantIndexes as(Table<?> alias) {
        return new SchemaRedundantIndexes(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemaRedundantIndexes rename(String name) {
        return new SchemaRedundantIndexes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemaRedundantIndexes rename(Name name) {
        return new SchemaRedundantIndexes(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemaRedundantIndexes rename(Table<?> name) {
        return new SchemaRedundantIndexes(name.getQualifiedName(), null);
    }
}
