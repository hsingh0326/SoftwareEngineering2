/*
 * To change this license header, choose License Headers in Project Properties
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

/**
 * <h1 color="red"> Temperature Class </h1>
 * <p> This class contains a temperature value</p>
 * @author Jose_02
 * @since 2016/03/21
 * @version 1.1
 */
public class TemperatureObject{ 

 /** Temperature of the object*/
 public int temperature;

 public TemperatureObject( int temp ) {
    	temperature = temp;
    }

 /**
  * This function passes a test where if object temperature is smaller than t1
  * the method throws an TooCold exception. If object temperature is greater 
  * that t2 the test method throws a TooHot exception.
  * 
  * @param   t1 Minimum temperature for test
  * @param   t2 Maximum temperature for test 
  * @throws TooHot
  * @throws TooCold 
  */
 public void test(int t1, int t2) throws BadTemperature {
    	if ( temperature < t1 ) throw new TooCold("Very Cold");
       // if ( temperature > t2 ) throw new TooHot("Very Hot");
        if ( temperature > t2 ) throw new BadTemperature("Very Hot");
    }
 }