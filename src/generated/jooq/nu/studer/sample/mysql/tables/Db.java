/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.mysql.tables;


import java.util.Arrays;
import java.util.List;

import nu.studer.sample.mysql.Indexes;
import nu.studer.sample.mysql.Keys;
import nu.studer.sample.mysql.Mysql;
import nu.studer.sample.mysql.enums.DbAlterPriv;
import nu.studer.sample.mysql.enums.DbAlterRoutinePriv;
import nu.studer.sample.mysql.enums.DbCreatePriv;
import nu.studer.sample.mysql.enums.DbCreateRoutinePriv;
import nu.studer.sample.mysql.enums.DbCreateTmpTablePriv;
import nu.studer.sample.mysql.enums.DbCreateViewPriv;
import nu.studer.sample.mysql.enums.DbDeletePriv;
import nu.studer.sample.mysql.enums.DbDropPriv;
import nu.studer.sample.mysql.enums.DbEventPriv;
import nu.studer.sample.mysql.enums.DbExecutePriv;
import nu.studer.sample.mysql.enums.DbGrantPriv;
import nu.studer.sample.mysql.enums.DbIndexPriv;
import nu.studer.sample.mysql.enums.DbInsertPriv;
import nu.studer.sample.mysql.enums.DbLockTablesPriv;
import nu.studer.sample.mysql.enums.DbReferencesPriv;
import nu.studer.sample.mysql.enums.DbSelectPriv;
import nu.studer.sample.mysql.enums.DbShowViewPriv;
import nu.studer.sample.mysql.enums.DbTriggerPriv;
import nu.studer.sample.mysql.enums.DbUpdatePriv;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
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


/**
 * Database privileges
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Db extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>mysql.db</code>
     */
    public static final Db DB = new Db();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>mysql.db.Host</code>.
     */
    public final TableField<Record, String> HOST = createField(DSL.name("Host"), SQLDataType.CHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.db.Db</code>.
     */
    public final TableField<Record, String> DB_ = createField(DSL.name("Db"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.db.User</code>.
     */
    public final TableField<Record, String> USER = createField(DSL.name("User"), SQLDataType.CHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.db.Select_priv</code>.
     */
    public final TableField<Record, DbSelectPriv> SELECT_PRIV = createField(DSL.name("Select_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbSelectPriv.class), this, "");

    /**
     * The column <code>mysql.db.Insert_priv</code>.
     */
    public final TableField<Record, DbInsertPriv> INSERT_PRIV = createField(DSL.name("Insert_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbInsertPriv.class), this, "");

    /**
     * The column <code>mysql.db.Update_priv</code>.
     */
    public final TableField<Record, DbUpdatePriv> UPDATE_PRIV = createField(DSL.name("Update_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbUpdatePriv.class), this, "");

    /**
     * The column <code>mysql.db.Delete_priv</code>.
     */
    public final TableField<Record, DbDeletePriv> DELETE_PRIV = createField(DSL.name("Delete_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbDeletePriv.class), this, "");

    /**
     * The column <code>mysql.db.Create_priv</code>.
     */
    public final TableField<Record, DbCreatePriv> CREATE_PRIV = createField(DSL.name("Create_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbCreatePriv.class), this, "");

    /**
     * The column <code>mysql.db.Drop_priv</code>.
     */
    public final TableField<Record, DbDropPriv> DROP_PRIV = createField(DSL.name("Drop_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbDropPriv.class), this, "");

    /**
     * The column <code>mysql.db.Grant_priv</code>.
     */
    public final TableField<Record, DbGrantPriv> GRANT_PRIV = createField(DSL.name("Grant_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbGrantPriv.class), this, "");

    /**
     * The column <code>mysql.db.References_priv</code>.
     */
    public final TableField<Record, DbReferencesPriv> REFERENCES_PRIV = createField(DSL.name("References_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbReferencesPriv.class), this, "");

    /**
     * The column <code>mysql.db.Index_priv</code>.
     */
    public final TableField<Record, DbIndexPriv> INDEX_PRIV = createField(DSL.name("Index_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbIndexPriv.class), this, "");

    /**
     * The column <code>mysql.db.Alter_priv</code>.
     */
    public final TableField<Record, DbAlterPriv> ALTER_PRIV = createField(DSL.name("Alter_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbAlterPriv.class), this, "");

    /**
     * The column <code>mysql.db.Create_tmp_table_priv</code>.
     */
    public final TableField<Record, DbCreateTmpTablePriv> CREATE_TMP_TABLE_PRIV = createField(DSL.name("Create_tmp_table_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbCreateTmpTablePriv.class), this, "");

    /**
     * The column <code>mysql.db.Lock_tables_priv</code>.
     */
    public final TableField<Record, DbLockTablesPriv> LOCK_TABLES_PRIV = createField(DSL.name("Lock_tables_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbLockTablesPriv.class), this, "");

    /**
     * The column <code>mysql.db.Create_view_priv</code>.
     */
    public final TableField<Record, DbCreateViewPriv> CREATE_VIEW_PRIV = createField(DSL.name("Create_view_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbCreateViewPriv.class), this, "");

    /**
     * The column <code>mysql.db.Show_view_priv</code>.
     */
    public final TableField<Record, DbShowViewPriv> SHOW_VIEW_PRIV = createField(DSL.name("Show_view_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbShowViewPriv.class), this, "");

    /**
     * The column <code>mysql.db.Create_routine_priv</code>.
     */
    public final TableField<Record, DbCreateRoutinePriv> CREATE_ROUTINE_PRIV = createField(DSL.name("Create_routine_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbCreateRoutinePriv.class), this, "");

    /**
     * The column <code>mysql.db.Alter_routine_priv</code>.
     */
    public final TableField<Record, DbAlterRoutinePriv> ALTER_ROUTINE_PRIV = createField(DSL.name("Alter_routine_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbAlterRoutinePriv.class), this, "");

    /**
     * The column <code>mysql.db.Execute_priv</code>.
     */
    public final TableField<Record, DbExecutePriv> EXECUTE_PRIV = createField(DSL.name("Execute_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbExecutePriv.class), this, "");

    /**
     * The column <code>mysql.db.Event_priv</code>.
     */
    public final TableField<Record, DbEventPriv> EVENT_PRIV = createField(DSL.name("Event_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbEventPriv.class), this, "");

    /**
     * The column <code>mysql.db.Trigger_priv</code>.
     */
    public final TableField<Record, DbTriggerPriv> TRIGGER_PRIV = createField(DSL.name("Trigger_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbTriggerPriv.class), this, "");

    private Db(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Db(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Database privileges"), TableOptions.table());
    }

    /**
     * Create an aliased <code>mysql.db</code> table reference
     */
    public Db(String alias) {
        this(DSL.name(alias), DB);
    }

    /**
     * Create an aliased <code>mysql.db</code> table reference
     */
    public Db(Name alias) {
        this(alias, DB);
    }

    /**
     * Create a <code>mysql.db</code> table reference
     */
    public Db() {
        this(DSL.name("db"), null);
    }

    public <O extends Record> Db(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, DB);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Mysql.MYSQL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.DB_USER);
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.KEY_DB_PRIMARY;
    }

    @Override
    public Db as(String alias) {
        return new Db(DSL.name(alias), this);
    }

    @Override
    public Db as(Name alias) {
        return new Db(alias, this);
    }

    @Override
    public Db as(Table<?> alias) {
        return new Db(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Db rename(String name) {
        return new Db(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Db rename(Name name) {
        return new Db(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Db rename(Table<?> name) {
        return new Db(name.getQualifiedName(), null);
    }
}
