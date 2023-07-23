/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.performance_schema.tables;


import nu.studer.sample.performance_schema.PerformanceSchema;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.JSON;
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
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReplicationAsynchronousConnectionFailoverManaged extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>performance_schema.replication_asynchronous_connection_failover_managed</code>
     */
    public static final ReplicationAsynchronousConnectionFailoverManaged REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED = new ReplicationAsynchronousConnectionFailoverManaged();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column
     * <code>performance_schema.replication_asynchronous_connection_failover_managed.CHANNEL_NAME</code>.
     * The replication channel name that connects source and replica.
     */
    public final TableField<Record, String> CHANNEL_NAME = createField(DSL.name("CHANNEL_NAME"), SQLDataType.CHAR(64).nullable(false), this, "The replication channel name that connects source and replica.");

    /**
     * The column
     * <code>performance_schema.replication_asynchronous_connection_failover_managed.MANAGED_NAME</code>.
     * The name of the source which needs to be managed.
     */
    public final TableField<Record, String> MANAGED_NAME = createField(DSL.name("MANAGED_NAME"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "The name of the source which needs to be managed.");

    /**
     * The column
     * <code>performance_schema.replication_asynchronous_connection_failover_managed.MANAGED_TYPE</code>.
     * Determines the managed type.
     */
    public final TableField<Record, String> MANAGED_TYPE = createField(DSL.name("MANAGED_TYPE"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "Determines the managed type.");

    /**
     * The column
     * <code>performance_schema.replication_asynchronous_connection_failover_managed.CONFIGURATION</code>.
     * The data to help manage group. For Managed_type = GroupReplication,
     * Configuration value should contain {"Primary_weight": 80,
     * "Secondary_weight": 60}, so that it assigns weight=80 to PRIMARY of the
     * group, and weight=60 for rest of the members in
     * mysql.replication_asynchronous_connection_failover table.
     */
    public final TableField<Record, JSON> CONFIGURATION = createField(DSL.name("CONFIGURATION"), SQLDataType.JSON, this, "The data to help manage group. For Managed_type = GroupReplication, Configuration value should contain {\"Primary_weight\": 80, \"Secondary_weight\": 60}, so that it assigns weight=80 to PRIMARY of the group, and weight=60 for rest of the members in mysql.replication_asynchronous_connection_failover table.");

    private ReplicationAsynchronousConnectionFailoverManaged(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private ReplicationAsynchronousConnectionFailoverManaged(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>performance_schema.replication_asynchronous_connection_failover_managed</code>
     * table reference
     */
    public ReplicationAsynchronousConnectionFailoverManaged(String alias) {
        this(DSL.name(alias), REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED);
    }

    /**
     * Create an aliased
     * <code>performance_schema.replication_asynchronous_connection_failover_managed</code>
     * table reference
     */
    public ReplicationAsynchronousConnectionFailoverManaged(Name alias) {
        this(alias, REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED);
    }

    /**
     * Create a
     * <code>performance_schema.replication_asynchronous_connection_failover_managed</code>
     * table reference
     */
    public ReplicationAsynchronousConnectionFailoverManaged() {
        this(DSL.name("replication_asynchronous_connection_failover_managed"), null);
    }

    public <O extends Record> ReplicationAsynchronousConnectionFailoverManaged(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public ReplicationAsynchronousConnectionFailoverManaged as(String alias) {
        return new ReplicationAsynchronousConnectionFailoverManaged(DSL.name(alias), this);
    }

    @Override
    public ReplicationAsynchronousConnectionFailoverManaged as(Name alias) {
        return new ReplicationAsynchronousConnectionFailoverManaged(alias, this);
    }

    @Override
    public ReplicationAsynchronousConnectionFailoverManaged as(Table<?> alias) {
        return new ReplicationAsynchronousConnectionFailoverManaged(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReplicationAsynchronousConnectionFailoverManaged rename(String name) {
        return new ReplicationAsynchronousConnectionFailoverManaged(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReplicationAsynchronousConnectionFailoverManaged rename(Name name) {
        return new ReplicationAsynchronousConnectionFailoverManaged(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReplicationAsynchronousConnectionFailoverManaged rename(Table<?> name) {
        return new ReplicationAsynchronousConnectionFailoverManaged(name.getQualifiedName(), null);
    }
}
