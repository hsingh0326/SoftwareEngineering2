/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emathtesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CJ
 */
public class EMathTestingTest {
    
    public EMathTestingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of absolute method, of class EMathTesting.
     */
   @Test
    public void testAbsolute() {
            
         System.out.println("absolute");
        String s1 = "-1";
        EMathTesting instance = new EMathTesting();
        int expResult = 1;
        int result = instance.absolute(s1);
        assertEquals(expResult, result);
        
     
        // TODO review the generated test code and remove the default call to fail.
        //fail("The Test Failed.");
    
      }

    /**
     * Test of modulo method, of class EMathTesting.
     */
    @Test
    public void testModulo() {
        
        /*Test 1 */
        System.out.println("modulo1");
        String sa = "-2";
        String sb = "3";
        int expResult = 2;
        int result = EMathTesting.modulo(sa, sb);
        System.out.println("The Modulo Test 1 Result :" + result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
         
  /*Test 2 */
       System.out.println("modulo2");
        String s2a = "a";
        String s2b = "b";
        expResult = 1;
        result = EMathTesting.modulo(s2a, s2b);
        System.out.println("Number Format Exception :" + result);
        assertEquals(expResult, result);
            
    }

    /**
     * Test of gcd method, of class EMathTesting.
     */
   @Test
    public void testGcd() {
        
        
      /*  int result = EMathTesting.gcd("5", "10");

        assertEquals(5, result, 0.00001);*/
        System.out.println("gcd");
        String sa = "b";
        String sb = "15";
        int expResult = 1;
        int result = EMathTesting.gcd(sa, sb);
        assertEquals(expResult, result);
        
        
    }
    
}
