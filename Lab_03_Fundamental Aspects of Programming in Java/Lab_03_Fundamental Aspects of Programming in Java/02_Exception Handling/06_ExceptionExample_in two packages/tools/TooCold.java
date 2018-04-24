
package tools;

/**
 * @since 2016/03/21
 * @author Jose Poveda
 */
public class TooCold extends BadTemperature{ 

    public TooCold(){
        super("Default message : Cold");
    }

    public TooCold(String message){
        super (message);
    }
}
