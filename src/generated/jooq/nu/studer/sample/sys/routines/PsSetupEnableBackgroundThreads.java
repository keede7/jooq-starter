/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.sys.routines;


import nu.studer.sample.sys.Sys;

import org.jooq.impl.AbstractRoutine;


/**
 * 
 * Description
 * -----------
 * 
 * Enable all background thread instrumentation within Performance Schema.
 * 
 * Parameters
 * -----------
 * 
 * None.
 * 
 * Example
 * -----------
 * 
 * mysql&gt; CALL sys.ps_setup_enable_background_threads();
 * +-------------------------------+
 * | summary                       |
 * +-------------------------------+
 * | Enabled 18 background threads |
 * +-------------------------------+
 * 1 row in set (0.00 sec)

 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PsSetupEnableBackgroundThreads extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * Create a new routine call instance
     */
    public PsSetupEnableBackgroundThreads() {
        super("ps_setup_enable_background_threads", Sys.SYS);
    }
}