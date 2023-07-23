/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.performance_schema.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * Indicates if this channel only uses GTIDs and does not persist positions.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum ReplicationConnectionConfigurationGtidOnly implements EnumType {

    _1("1"),

    _0("0");

    private final String literal;

    private ReplicationConnectionConfigurationGtidOnly(String literal) {
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
    public static ReplicationConnectionConfigurationGtidOnly lookupLiteral(String literal) {
        return EnumType.lookupLiteral(ReplicationConnectionConfigurationGtidOnly.class, literal);
    }
}
