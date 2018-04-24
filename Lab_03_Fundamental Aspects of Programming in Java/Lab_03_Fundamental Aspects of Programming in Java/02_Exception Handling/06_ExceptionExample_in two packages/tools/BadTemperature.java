
package tools;

/**
 * @since 2016/03/21
 * @author Jose Poveda
 * @version 1.2
 */
public class BadTemperature extends Exception{
    BadTemperature( String reason ){
        super ( reason );
    }
}

