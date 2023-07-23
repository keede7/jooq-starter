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
public enum ReplicationApplierGlobalFiltersConfiguredBy implements EnumType {

    STARTUP_OPTIONS("STARTUP_OPTIONS"),

    CHANGE_REPLICATION_FILTER("CHANGE_REPLICATION_FILTER");

    private final String literal;

    private ReplicationApplierGlobalFiltersConfiguredBy(String literal) {
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
    public static ReplicationApplierGlobalFiltersConfiguredBy lookupLiteral(String literal) {
        return EnumType.lookupLiteral(ReplicationApplierGlobalFiltersConfiguredBy.class, literal);
    }
}
