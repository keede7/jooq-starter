/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.mysql.tables;


import java.util.Arrays;
import java.util.List;

import nu.studer.sample.mysql.Indexes;
import nu.studer.sample.mysql.Keys;
import nu.studer.sample.mysql.Mysql;

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
import org.jooq.types.UByte;


/**
 * The member actions configuration.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReplicationGroupMemberActions extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>mysql.replication_group_member_actions</code>
     */
    public static final ReplicationGroupMemberActions REPLICATION_GROUP_MEMBER_ACTIONS = new ReplicationGroupMemberActions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>mysql.replication_group_member_actions.name</code>. The
     * action name.
     */
    public final TableField<Record, String> NAME = createField(DSL.name("name"), SQLDataType.CHAR(255).nullable(false), this, "The action name.");

    /**
     * The column <code>mysql.replication_group_member_actions.event</code>. The
     * event that will trigger the action.
     */
    public final TableField<Record, String> EVENT = createField(DSL.name("event"), SQLDataType.CHAR(64).nullable(false), this, "The event that will trigger the action.");

    /**
     * The column <code>mysql.replication_group_member_actions.enabled</code>.
     * Whether the action is enabled.
     */
    public final TableField<Record, Byte> ENABLED = createField(DSL.name("enabled"), SQLDataType.TINYINT.nullable(false), this, "Whether the action is enabled.");

    /**
     * The column <code>mysql.replication_group_member_actions.type</code>. The
     * action type.
     */
    public final TableField<Record, String> TYPE = createField(DSL.name("type"), SQLDataType.CHAR(64).nullable(false), this, "The action type.");

    /**
     * The column <code>mysql.replication_group_member_actions.priority</code>.
     * The order on which the action will be run, value between 1 and 100, lower
     * values first.
     */
    public final TableField<Record, UByte> PRIORITY = createField(DSL.name("priority"), SQLDataType.TINYINTUNSIGNED.nullable(false), this, "The order on which the action will be run, value between 1 and 100, lower values first.");

    /**
     * The column
     * <code>mysql.replication_group_member_actions.error_handling</code>. On
     * errors during the action will be handled: IGNORE, CRITICAL.
     */
    public final TableField<Record, String> ERROR_HANDLING = createField(DSL.name("error_handling"), SQLDataType.CHAR(64).nullable(false), this, "On errors during the action will be handled: IGNORE, CRITICAL.");

    private ReplicationGroupMemberActions(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private ReplicationGroupMemberActions(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("The member actions configuration."), TableOptions.table());
    }

    /**
     * Create an aliased <code>mysql.replication_group_member_actions</code>
     * table reference
     */
    public ReplicationGroupMemberActions(String alias) {
        this(DSL.name(alias), REPLICATION_GROUP_MEMBER_ACTIONS);
    }

    /**
     * Create an aliased <code>mysql.replication_group_member_actions</code>
     * table reference
     */
    public ReplicationGroupMemberActions(Name alias) {
        this(alias, REPLICATION_GROUP_MEMBER_ACTIONS);
    }

    /**
     * Create a <code>mysql.replication_group_member_actions</code> table
     * reference
     */
    public ReplicationGroupMemberActions() {
        this(DSL.name("replication_group_member_actions"), null);
    }

    public <O extends Record> ReplicationGroupMemberActions(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, REPLICATION_GROUP_MEMBER_ACTIONS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Mysql.MYSQL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.REPLICATION_GROUP_MEMBER_ACTIONS_EVENT);
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.KEY_REPLICATION_GROUP_MEMBER_ACTIONS_PRIMARY;
    }

    @Override
    public ReplicationGroupMemberActions as(String alias) {
        return new ReplicationGroupMemberActions(DSL.name(alias), this);
    }

    @Override
    public ReplicationGroupMemberActions as(Name alias) {
        return new ReplicationGroupMemberActions(alias, this);
    }

    @Override
    public ReplicationGroupMemberActions as(Table<?> alias) {
        return new ReplicationGroupMemberActions(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReplicationGroupMemberActions rename(String name) {
        return new ReplicationGroupMemberActions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReplicationGroupMemberActions rename(Name name) {
        return new ReplicationGroupMemberActions(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReplicationGroupMemberActions rename(Table<?> name) {
        return new ReplicationGroupMemberActions(name.getQualifiedName(), null);
    }
}