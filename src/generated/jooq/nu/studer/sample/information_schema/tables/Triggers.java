/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.information_schema.tables;


import nu.studer.sample.information_schema.InformationSchema;

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
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Triggers extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.TRIGGERS</code>
     */
    public static final Triggers TRIGGERS = new Triggers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.TRIGGERS.TRIGGER_CATALOG</code>.
     */
    public final TableField<Record, String> TRIGGER_CATALOG = createField(DSL.name("TRIGGER_CATALOG"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TRIGGERS.TRIGGER_SCHEMA</code>.
     */
    public final TableField<Record, String> TRIGGER_SCHEMA = createField(DSL.name("TRIGGER_SCHEMA"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TRIGGERS.TRIGGER_NAME</code>.
     */
    public final TableField<Record, String> TRIGGER_NAME = createField(DSL.name("TRIGGER_NAME"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TRIGGERS.EVENT_MANIPULATION</code>.
     */
    public final TableField<Record, String> EVENT_MANIPULATION = createField(DSL.name("EVENT_MANIPULATION"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TRIGGERS.EVENT_OBJECT_CATALOG</code>.
     */
    public final TableField<Record, String> EVENT_OBJECT_CATALOG = createField(DSL.name("EVENT_OBJECT_CATALOG"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TRIGGERS.EVENT_OBJECT_SCHEMA</code>.
     */
    public final TableField<Record, String> EVENT_OBJECT_SCHEMA = createField(DSL.name("EVENT_OBJECT_SCHEMA"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TRIGGERS.EVENT_OBJECT_TABLE</code>.
     */
    public final TableField<Record, String> EVENT_OBJECT_TABLE = createField(DSL.name("EVENT_OBJECT_TABLE"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TRIGGERS.ACTION_ORIENTATION</code>.
     */
    public final TableField<Record, String> ACTION_ORIENTATION = createField(DSL.name("ACTION_ORIENTATION"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TRIGGERS.ACTION_TIMING</code>.
     */
    public final TableField<Record, String> ACTION_TIMING = createField(DSL.name("ACTION_TIMING"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TRIGGERS.IS_ROLLBACK</code>.
     */
    public final TableField<Record, Boolean> IS_ROLLBACK = createField(DSL.name("IS_ROLLBACK"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TRIGGERS.JAVA_CLASS</code>.
     */
    public final TableField<Record, String> JAVA_CLASS = createField(DSL.name("JAVA_CLASS"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TRIGGERS.QUEUE_SIZE</code>.
     */
    public final TableField<Record, Integer> QUEUE_SIZE = createField(DSL.name("QUEUE_SIZE"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TRIGGERS.NO_WAIT</code>.
     */
    public final TableField<Record, Boolean> NO_WAIT = createField(DSL.name("NO_WAIT"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TRIGGERS.REMARKS</code>.
     */
    public final TableField<Record, String> REMARKS = createField(DSL.name("REMARKS"), SQLDataType.VARCHAR(1000000000), this, "");

    private Triggers(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Triggers(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.TRIGGERS</code> table
     * reference
     */
    public Triggers(String alias) {
        this(DSL.name(alias), TRIGGERS);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.TRIGGERS</code> table
     * reference
     */
    public Triggers(Name alias) {
        this(alias, TRIGGERS);
    }

    /**
     * Create a <code>INFORMATION_SCHEMA.TRIGGERS</code> table reference
     */
    public Triggers() {
        this(DSL.name("TRIGGERS"), null);
    }

    public <O extends Record> Triggers(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, TRIGGERS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Triggers as(String alias) {
        return new Triggers(DSL.name(alias), this);
    }

    @Override
    public Triggers as(Name alias) {
        return new Triggers(alias, this);
    }

    @Override
    public Triggers as(Table<?> alias) {
        return new Triggers(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Triggers rename(String name) {
        return new Triggers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Triggers rename(Name name) {
        return new Triggers(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Triggers rename(Table<?> name) {
        return new Triggers(name.getQualifiedName(), null);
    }
}
