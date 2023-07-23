/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.sys.routines;


import nu.studer.sample.sys.Sys;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * 
 * Description
 * -----------
 * 
 * Takes a raw picoseconds value, and converts it to a human readable form.
 * 
 * Picoseconds are the precision that all latency values are printed in
 * within Performance Schema, however are not user friendly when wanting
 * to scan output from the command line.
 * 
 * Parameters
 * -----------
 * 
 * picoseconds (TEXT):
 *   The raw picoseconds value to convert.
 * 
 * Returns
 * -----------
 * 
 * TEXT CHARSET UTF8MB4
 * 
 * Example
 * -----------
 * 
 * mysql&gt; select format_time(342342342342345);
 * +------------------------------+
 * | format_time(342342342342345) |
 * +------------------------------+
 * | 00:05:42                     |
 * +------------------------------+
 * 1 row in set (0.00 sec)
 * 
 * mysql&gt; select format_time(342342342);
 * +------------------------+
 * | format_time(342342342) |
 * +------------------------+
 * | 342.34 us              |
 * +------------------------+
 * 1 row in set (0.00 sec)
 * 
 * mysql&gt; select format_time(34234);
 * +--------------------+
 * | format_time(34234) |
 * +--------------------+
 * | 34.23 ns           |
 * +--------------------+
 * 1 row in set (0.00 sec)

 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FormatTime extends AbstractRoutine<String> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>sys.format_time.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>sys.format_time.picoseconds</code>.
     */
    public static final Parameter<String> PICOSECONDS = Internal.createParameter("picoseconds", SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public FormatTime() {
        super("format_time", Sys.SYS, SQLDataType.CLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(PICOSECONDS);
    }

    /**
     * Set the <code>picoseconds</code> parameter IN value to the routine
     */
    public void setPicoseconds(String value) {
        setValue(PICOSECONDS, value);
    }

    /**
     * Set the <code>picoseconds</code> parameter to the function to be used
     * with a {@link org.jooq.Select} statement
     */
    public void setPicoseconds(Field<String> field) {
        setField(PICOSECONDS, field);
    }
}
