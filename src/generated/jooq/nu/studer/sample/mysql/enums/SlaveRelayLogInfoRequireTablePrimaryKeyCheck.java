/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.mysql.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * Indicates what is the channel policy regarding tables without primary keys on
 * create and alter table queries
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum SlaveRelayLogInfoRequireTablePrimaryKeyCheck implements EnumType {

    STREAM("STREAM"),

    ON("ON"),

    OFF("OFF"),

    GENERATE("GENERATE");

    private final String literal;

    private SlaveRelayLogInfoRequireTablePrimaryKeyCheck(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return null;
    }

    @Override
    public Schema getSchema() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal
     */
    public static SlaveRelayLogInfoRequireTablePrimaryKeyCheck lookupLiteral(String literal) {
        return EnumType.lookupLiteral(SlaveRelayLogInfoRequireTablePrimaryKeyCheck.class, literal);
    }
}
