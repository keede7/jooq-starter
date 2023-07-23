/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.information_schema.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum TriggersActionTiming implements EnumType {

    BEFORE("BEFORE"),

    AFTER("AFTER");

    private final String literal;

    private TriggersActionTiming(String literal) {
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
    public static TriggersActionTiming lookupLiteral(String literal) {
        return EnumType.lookupLiteral(TriggersActionTiming.class, literal);
    }
}
