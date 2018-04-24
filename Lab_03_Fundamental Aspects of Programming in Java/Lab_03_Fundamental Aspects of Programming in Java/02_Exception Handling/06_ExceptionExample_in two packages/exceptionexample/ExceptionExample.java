/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionexample;

import tools.BadTemperature;
import tools.TooHot;
import tools.TooCold;
import tools.TemperatureObject;


public class ExceptionExample{   

    private static void temperatureReport( TemperatureObject t ){
        try{   
             t.test(75,90);
             System.out.println( "Perfect Temperature" );
        }
        catch ( BadTemperature bt ){
             System.out.println( bt.getMessage( ) );
        }
    }

    public static void main( String[] args ){
    	temperatureReport( new TemperatureObject( 100 ) );
        temperatureReport( new TemperatureObject( 50 ) );
        temperatureReport( new TemperatureObject( 75 ) );
    }
}
