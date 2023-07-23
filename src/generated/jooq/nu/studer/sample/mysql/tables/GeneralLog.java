/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.mysql.tables;


import java.time.LocalDateTime;

import nu.studer.sample.mysql.Mysql;

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
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * General log
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GeneralLog extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>mysql.general_log</code>
     */
    public static final GeneralLog GENERAL_LOG = new GeneralLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>mysql.general_log.event_time</code>.
     */
    public final TableField<Record, LocalDateTime> EVENT_TIME = createField(DSL.name("event_time"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field(DSL.raw("CURRENT_TIMESTAMP(6)"), SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>mysql.general_log.user_host</code>.
     */
    public final TableField<Record, String> USER_HOST = createField(DSL.name("user_host"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>mysql.general_log.thread_id</code>.
     */
    public final TableField<Record, ULong> THREAD_ID = createField(DSL.name("thread_id"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.general_log.server_id</code>.
     */
    public final TableField<Record, UInteger> SERVER_ID = createField(DSL.name("server_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.general_log.command_type</code>.
     */
    public final TableField<Record, String> COMMAND_TYPE = createField(DSL.name("command_type"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>mysql.general_log.argument</code>.
     */
    public final TableField<Record, byte[]> ARGUMENT = createField(DSL.name("argument"), SQLDataType.BLOB.nullable(false), this, "");

    private GeneralLog(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private GeneralLog(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("General log"), TableOptions.table());
    }

    /**
     * Create an aliased <code>mysql.general_log</code> table reference
     */
    public GeneralLog(String alias) {
        this(DSL.name(alias), GENERAL_LOG);
    }

    /**
     * Create an aliased <code>mysql.general_log</code> table reference
     */
    public GeneralLog(Name alias) {
        this(alias, GENERAL_LOG);
    }

    /**
     * Create a <code>mysql.general_log</code> table reference
     */
    public GeneralLog() {
        this(DSL.name("general_log"), null);
    }

    public <O extends Record> GeneralLog(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, GENERAL_LOG);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Mysql.MYSQL;
    }

    @Override
    public GeneralLog as(String alias) {
        return new GeneralLog(DSL.name(alias), this);
    }

    @Override
    public GeneralLog as(Name alias) {
        return new GeneralLog(alias, this);
    }

    @Override
    public GeneralLog as(Table<?> alias) {
        return new GeneralLog(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public GeneralLog rename(String name) {
        return new GeneralLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GeneralLog rename(Name name) {
        return new GeneralLog(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public GeneralLog rename(Table<?> name) {
        return new GeneralLog(name.getQualifiedName(), null);
    }
}