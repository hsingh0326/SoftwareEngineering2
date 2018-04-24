

import java.util.*;
 
class C2F{
  public static void main(String[] args) {
    //Declaration
	float temperature;
	
	//Input
    Scanner in = new Scanner(System.in);      
    System.out.print("\nEnter temperature in Celsius: ");
    temperature = in.nextInt();
     
	//Process 
    temperature = (temperature*9.0f/5) + 32;

	//Output
    System.out.println("\nTemperatue in Fahrenheit = " + String.format("%.2f",temperature));
  }
}