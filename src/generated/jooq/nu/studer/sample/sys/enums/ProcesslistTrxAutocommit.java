/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.sys.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum ProcesslistTrxAutocommit implements EnumType {

    YES("YES"),

    NO("NO");

    private final String literal;

    private ProcesslistTrxAutocommit(String literal) {
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
    public static ProcesslistTrxAutocommit lookupLiteral(String literal) {
        return EnumType.lookupLiteral(ProcesslistTrxAutocommit.class, literal);
    }
}
