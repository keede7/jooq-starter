/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.performance_schema.tables;


import java.util.Arrays;
import java.util.List;

import nu.studer.sample.performance_schema.Keys;
import nu.studer.sample.performance_schema.PerformanceSchema;
import nu.studer.sample.performance_schema.enums.SetupObjectsEnabled;
import nu.studer.sample.performance_schema.enums.SetupObjectsObjectType;
import nu.studer.sample.performance_schema.enums.SetupObjectsTimed;

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


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SetupObjects extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>performance_schema.setup_objects</code>
     */
    public static final SetupObjects SETUP_OBJECTS = new SetupObjects();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>performance_schema.setup_objects.OBJECT_TYPE</code>.
     */
    public final TableField<Record, SetupObjectsObjectType> OBJECT_TYPE = createField(DSL.name("OBJECT_TYPE"), SQLDataType.VARCHAR(9).nullable(false).defaultValue(DSL.inline("TABLE", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.performance_schema.enums.SetupObjectsObjectType.class), this, "");

    /**
     * The column <code>performance_schema.setup_objects.OBJECT_SCHEMA</code>.
     */
    public final TableField<Record, String> OBJECT_SCHEMA = createField(DSL.name("OBJECT_SCHEMA"), SQLDataType.VARCHAR(64).defaultValue(DSL.inline("%", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>performance_schema.setup_objects.OBJECT_NAME</code>.
     */
    public final TableField<Record, String> OBJECT_NAME = createField(DSL.name("OBJECT_NAME"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("%", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>performance_schema.setup_objects.ENABLED</code>.
     */
    public final TableField<Record, SetupObjectsEnabled> ENABLED = createField(DSL.name("ENABLED"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("YES", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.performance_schema.enums.SetupObjectsEnabled.class), this, "");

    /**
     * The column <code>performance_schema.setup_objects.TIMED</code>.
     */
    public final TableField<Record, SetupObjectsTimed> TIMED = createField(DSL.name("TIMED"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("YES", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.performance_schema.enums.SetupObjectsTimed.class), this, "");

    private SetupObjects(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private SetupObjects(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.setup_objects</code> table
     * reference
     */
    public SetupObjects(String alias) {
        this(DSL.name(alias), SETUP_OBJECTS);
    }

    /**
     * Create an aliased <code>performance_schema.setup_objects</code> table
     * reference
     */
    public SetupObjects(Name alias) {
        this(alias, SETUP_OBJECTS);
    }

    /**
     * Create a <code>performance_schema.setup_objects</code> table reference
     */
    public SetupObjects() {
        this(DSL.name("setup_objects"), null);
    }

    public <O extends Record> SetupObjects(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, SETUP_OBJECTS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public List<UniqueKey<Record>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_SETUP_OBJECTS_OBJECT);
    }

    @Override
    public SetupObjects as(String alias) {
        return new SetupObjects(DSL.name(alias), this);
    }

    @Override
    public SetupObjects as(Name alias) {
        return new SetupObjects(alias, this);
    }

    @Override
    public SetupObjects as(Table<?> alias) {
        return new SetupObjects(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public SetupObjects rename(String name) {
        return new SetupObjects(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SetupObjects rename(Name name) {
        return new SetupObjects(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public SetupObjects rename(Table<?> name) {
        return new SetupObjects(name.getQualifiedName(), null);
    }
}