/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.mysql.tables;


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
import org.jooq.types.UByte;
import org.jooq.types.UInteger;


/**
 * Time zone transition types
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TimeZoneTransitionType extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>mysql.time_zone_transition_type</code>
     */
    public static final TimeZoneTransitionType TIME_ZONE_TRANSITION_TYPE = new TimeZoneTransitionType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>mysql.time_zone_transition_type.Time_zone_id</code>.
     */
    public final TableField<Record, UInteger> TIME_ZONE_ID = createField(DSL.name("Time_zone_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>mysql.time_zone_transition_type.Transition_type_id</code>.
     */
    public final TableField<Record, UInteger> TRANSITION_TYPE_ID = createField(DSL.name("Transition_type_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.time_zone_transition_type.Offset</code>.
     */
    public final TableField<Record, Integer> OFFSET = createField(DSL.name("Offset"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mysql.time_zone_transition_type.Is_DST</code>.
     */
    public final TableField<Record, UByte> IS_DST = createField(DSL.name("Is_DST"), SQLDataType.TINYINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.TINYINTUNSIGNED)), this, "");

    /**
     * The column <code>mysql.time_zone_transition_type.Abbreviation</code>.
     */
    public final TableField<Record, String> ABBREVIATION = createField(DSL.name("Abbreviation"), SQLDataType.CHAR(8).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    private TimeZoneTransitionType(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private TimeZoneTransitionType(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Time zone transition types"), TableOptions.table());
    }

    /**
     * Create an aliased <code>mysql.time_zone_transition_type</code> table
     * reference
     */
    public TimeZoneTransitionType(String alias) {
        this(DSL.name(alias), TIME_ZONE_TRANSITION_TYPE);
    }

    /**
     * Create an aliased <code>mysql.time_zone_transition_type</code> table
     * reference
     */
    public TimeZoneTransitionType(Name alias) {
        this(alias, TIME_ZONE_TRANSITION_TYPE);
    }

    /**
     * Create a <code>mysql.time_zone_transition_type</code> table reference
     */
    public TimeZoneTransitionType() {
        this(DSL.name("time_zone_transition_type"), null);
    }

    public <O extends Record> TimeZoneTransitionType(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, TIME_ZONE_TRANSITION_TYPE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Mysql.MYSQL;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.KEY_TIME_ZONE_TRANSITION_TYPE_PRIMARY;
    }

    @Override
    public TimeZoneTransitionType as(String alias) {
        return new TimeZoneTransitionType(DSL.name(alias), this);
    }

    @Override
    public TimeZoneTransitionType as(Name alias) {
        return new TimeZoneTransitionType(alias, this);
    }

    @Override
    public TimeZoneTransitionType as(Table<?> alias) {
        return new TimeZoneTransitionType(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public TimeZoneTransitionType rename(String name) {
        return new TimeZoneTransitionType(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TimeZoneTransitionType rename(Name name) {
        return new TimeZoneTransitionType(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public TimeZoneTransitionType rename(Table<?> name) {
        return new TimeZoneTransitionType(name.getQualifiedName(), null);
    }
}