/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.sys.routines;


import nu.studer.sample.sys.Sys;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.types.UByte;


/**
 * 
 * Description
 * -----------
 * 
 * Returns the major version of MySQL Server.
 * 
 * Returns
 * -----------
 * 
 * TINYINT UNSIGNED
 * 
 * Example
 * -----------
 * 
 * mysql&gt; SELECT VERSION(), sys.version_major();
 * +--------------------------------------+---------------------+
 * | VERSION()                            | sys.version_major() |
 * +--------------------------------------+---------------------+
 * | 5.7.9-enterprise-commercial-advanced | 5                   |
 * +--------------------------------------+---------------------+
 * 1 row in set (0.00 sec)

 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VersionMajor extends AbstractRoutine<UByte> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>sys.version_major.RETURN_VALUE</code>.
     */
    public static final Parameter<UByte> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.TINYINTUNSIGNED, false, false);

    /**
     * Create a new routine call instance
     */
    public VersionMajor() {
        super("version_major", Sys.SYS, SQLDataType.TINYINTUNSIGNED);

        setReturnParameter(RETURN_VALUE);
    }
}
