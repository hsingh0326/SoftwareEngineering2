/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emathtesting;

/**
 * Homework 02.2: Unit Testing with NetBeans and JUnit
 * @author Dr. Jose Poveda
 */
public class EMathTesting {
   
       public static int absolute(String s1) throws NumberFormatException{
           try {
            int number=Integer.parseInt(s1);    
            return((number>0)? number: -number);
           } catch (NumberFormatException e)
           {
               System.out.println("Number Format Exception!");
               return -1;
           }
    }
    
    
    public static int modulo(String sa, String sb) throws NumberFormatException{
        
        try { 
           int a=absolute(sa);
           int b=absolute(sb);
           return(a-(a/b)*b);
        } catch (NumberFormatException e)
        {
            System.out.println("Number Format Exception!");
            return -1;
        }
        
     
    }
    
    public static int gcd(String sa, String sb)throws ArithmeticException, NumberFormatException{
     
       
      try{ 
        int numA=absolute(sa);
        int numB=absolute(sb);
        try {
           while (numA != numB) {
                if (numB > numA) numB -=numA;
                else numA -=numB;
           }
            return (numA);  
        } catch (ArithmeticException e1)
        {
            System.out.println("There was a Arithmetic Exception");
            return -1;
        }
      } catch (NumberFormatException e)
      {
          System.out.println("Number Format Exception !");
          return -1;
      }
      
     
    }

    
}
