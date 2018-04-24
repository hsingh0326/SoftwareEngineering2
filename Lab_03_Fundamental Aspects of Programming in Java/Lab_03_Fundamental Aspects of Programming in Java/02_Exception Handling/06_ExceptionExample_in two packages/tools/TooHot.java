
package tools;

/**
 * @since 2016/03/21
 * @version 1.2
 * @author Jose Poveda
 */
public class TooHot extends  BadTemperature{
   public  TooHot(){
       super ("Default message : Hot");
    }


    public TooHot(String message){
        super (message);
    }
}