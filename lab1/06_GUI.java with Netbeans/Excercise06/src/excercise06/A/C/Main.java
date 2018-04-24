package A.C;

import A.B.D.*;
import A.B.E.*;



public class Main{
   public static void main(String arg[]){
     int num=Integer.parseInt(arg[0]);
     System.out.println("The square of "+num+" is: "+TestD.square(num));
     System.out.println("The cube of "+num+" is: "+TestE.cube(num));
   }
 }