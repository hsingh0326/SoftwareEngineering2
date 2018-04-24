
import java.io.DataInputStream;
import java.io.IOException;
import javax.swing.JOptionPane;


public class ExceptionExample{
    static int numerator, denominator;

    public ExceptionExample( int t, int b ){
	numerator = t;
	denominator = b;
    }

    public int divide( ) throws ArithmeticException{
    	return numerator/denominator;
    }

    public static void main( String args[] ){

    	String num, denom;

    	num = JOptionPane.showInputDialog(null, "Enter the Numerator");
    	denom = JOptionPane.showInputDialog(null, "Enter the Denominator");

		try{
		    numerator = Integer.parseInt( num );
		    denominator = Integer.parseInt( denom );
		}
		catch ( NumberFormatException nfe ){
		    System.out.println( "One of the inputs is not an integer" );
		    return;
		}
        catch ( Exception e ){
		    System.out.println( "Exception: " + e.getMessage( ) );
		    return;
        }

		ExceptionExample d = new ExceptionExample( numerator, denominator );
		try{
		    double result = d.divide( );
		    JOptionPane.showMessageDialog(null, "Result : " + result);
		}
		catch ( ArithmeticException ae ){
			System.out.println( "You can't divide by zero" );
		}
		finally{
			System.out.println( "Finally Block is always Executed" );
	    }
    }
}
