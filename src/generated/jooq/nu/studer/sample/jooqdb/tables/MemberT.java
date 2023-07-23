/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.jooqdb.tables;


import nu.studer.sample.jooqdb.Jooqdb;
import nu.studer.sample.jooqdb.Keys;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
public class MemberT extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>jooqdb.member_t</code>
     */
    public static final MemberT MEMBER_T = new MemberT();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>jooqdb.member_t.id</code>.
     */
    public final TableField<Record, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>jooqdb.member_t.name</code>.
     */
    public final TableField<Record, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(30), this, "");

    private MemberT(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private MemberT(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>jooqdb.member_t</code> table reference
     */
    public MemberT(String alias) {
        this(DSL.name(alias), MEMBER_T);
    }

    /**
     * Create an aliased <code>jooqdb.member_t</code> table reference
     */
    public MemberT(Name alias) {
        this(alias, MEMBER_T);
    }

    /**
     * Create a <code>jooqdb.member_t</code> table reference
     */
    public MemberT() {
        this(DSL.name("member_t"), null);
    }

    public <O extends Record> MemberT(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, MEMBER_T);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Jooqdb.JOOQDB;
    }

    @Override
    public Identity<Record, Long> getIdentity() {
        return (Identity<Record, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.KEY_MEMBER_T_PRIMARY;
    }

    @Override
    public MemberT as(String alias) {
        return new MemberT(DSL.name(alias), this);
    }

    @Override
    public MemberT as(Name alias) {
        return new MemberT(alias, this);
    }

    @Override
    public MemberT as(Table<?> alias) {
        return new MemberT(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public MemberT rename(String name) {
        return new MemberT(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MemberT rename(Name name) {
        return new MemberT(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public MemberT rename(Table<?> name) {
        return new MemberT(name.getQualifiedName(), null);
    }
}