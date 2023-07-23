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
public class SchemaObjectOverview extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.schema_object_overview</code>
     */
    public static final SchemaObjectOverview SCHEMA_OBJECT_OVERVIEW = new SchemaObjectOverview();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>sys.schema_object_overview.db</code>.
     */
    public final TableField<Record, String> DB = createField(DSL.name("db"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sys.schema_object_overview.object_type</code>.
     */
    public final TableField<Record, String> OBJECT_TYPE = createField(DSL.name("object_type"), SQLDataType.VARCHAR(19), this, "");

    /**
     * The column <code>sys.schema_object_overview.count</code>.
     */
    public final TableField<Record, Long> COUNT = createField(DSL.name("count"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "");

    private SchemaObjectOverview(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private SchemaObjectOverview(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `schema_object_overview` as select `information_schema`.`routines`.`ROUTINE_SCHEMA` AS `db`,`information_schema`.`routines`.`ROUTINE_TYPE` AS `object_type`,count(0) AS `count` from `information_schema`.`ROUTINES` `routines` group by `information_schema`.`routines`.`ROUTINE_SCHEMA`,`information_schema`.`routines`.`ROUTINE_TYPE` union select `information_schema`.`tables`.`TABLE_SCHEMA` AS `TABLE_SCHEMA`,`information_schema`.`tables`.`TABLE_TYPE` AS `TABLE_TYPE`,count(0) AS `COUNT(*)` from `information_schema`.`TABLES` `tables` group by `information_schema`.`tables`.`TABLE_SCHEMA`,`information_schema`.`tables`.`TABLE_TYPE` union select `information_schema`.`statistics`.`TABLE_SCHEMA` AS `TABLE_SCHEMA`,concat('INDEX (',`information_schema`.`statistics`.`INDEX_TYPE`,')') AS `CONCAT('INDEX (', INDEX_TYPE, ')')`,count(0) AS `COUNT(*)` from `information_schema`.`STATISTICS` `statistics` group by `information_schema`.`statistics`.`TABLE_SCHEMA`,`information_schema`.`statistics`.`INDEX_TYPE` union select `information_schema`.`triggers`.`TRIGGER_SCHEMA` AS `TRIGGER_SCHEMA`,'TRIGGER' AS `TRIGGER`,count(0) AS `COUNT(*)` from `information_schema`.`TRIGGERS` `triggers` group by `information_schema`.`triggers`.`TRIGGER_SCHEMA` union select `information_schema`.`events`.`EVENT_SCHEMA` AS `EVENT_SCHEMA`,'EVENT' AS `EVENT`,count(0) AS `COUNT(*)` from `information_schema`.`EVENTS` `events` group by `information_schema`.`events`.`EVENT_SCHEMA` order by `db`,`object_type`"));
    }

    /**
     * Create an aliased <code>sys.schema_object_overview</code> table reference
     */
    public SchemaObjectOverview(String alias) {
        this(DSL.name(alias), SCHEMA_OBJECT_OVERVIEW);
    }

    /**
     * Create an aliased <code>sys.schema_object_overview</code> table reference
     */
    public SchemaObjectOverview(Name alias) {
        this(alias, SCHEMA_OBJECT_OVERVIEW);
    }

    /**
     * Create a <code>sys.schema_object_overview</code> table reference
     */
    public SchemaObjectOverview() {
        this(DSL.name("schema_object_overview"), null);
    }

    public <O extends Record> SchemaObjectOverview(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, SCHEMA_OBJECT_OVERVIEW);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Sys.SYS;
    }

    @Override
    public SchemaObjectOverview as(String alias) {
        return new SchemaObjectOverview(DSL.name(alias), this);
    }

    @Override
    public SchemaObjectOverview as(Name alias) {
        return new SchemaObjectOverview(alias, this);
    }

    @Override
    public SchemaObjectOverview as(Table<?> alias) {
        return new SchemaObjectOverview(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemaObjectOverview rename(String name) {
        return new SchemaObjectOverview(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemaObjectOverview rename(Name name) {
        return new SchemaObjectOverview(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemaObjectOverview rename(Table<?> name) {
        return new SchemaObjectOverview(name.getQualifiedName(), null);
    }
}