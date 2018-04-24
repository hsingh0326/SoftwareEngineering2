public class StringConversion {

	public static void main(String args[] ){

                String s = "1234";
                int intValue;
                float floatValue;
                double doubleValue;

                //convert the string to Integer and then to int
                intValue = Integer.valueOf(s).intValue();

                //convert the string to Float and then to int
                floatValue = Float.valueOf(s).floatValue();

                //convert the string to Double and then to int
                doubleValue = Double.valueOf(s).doubleValue();

                //display the values to confirm
                System.out.println("\nInteger value is " + intValue);
                System.out.println("Float value is " + floatValue);
                System.out.println("Double value is " + doubleValue);
	}
}
