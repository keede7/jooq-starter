/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.performance_schema.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum ReplicationConnectionConfigurationAutoPosition implements EnumType {

    _1("1"),

    _0("0");

    private final String literal;

    private ReplicationConnectionConfigurationAutoPosition(String literal) {
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
    public static ReplicationConnectionConfigurationAutoPosition lookupLiteral(String literal) {
        return EnumType.lookupLiteral(ReplicationConnectionConfigurationAutoPosition.class, literal);
    }
}
