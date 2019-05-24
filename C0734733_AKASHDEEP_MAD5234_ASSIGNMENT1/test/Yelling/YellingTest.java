/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Yelling;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Akashdeep Singh
 */
public class YellingTest {
    
    public YellingTest() {
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
     * Test of scream method, of class Yelling.
     */
    @Test
    public void testScream() {
        
        
        System.out.println("scream");
        String name = null;
        // REQUIREMENT 1
        Yelling instance = new Yelling();
        String result = instance.scream("Peter");
        String expResult = "Peter is yelling";
        assertEquals(expResult, result);
        
          // REQUIREMENT 2 
        result = instance.scream("PETER");
        expResult = "PETER IS YELLING";
        assertEquals(expResult, result);
        
           // REQUIREMENT 3 
        result = instance.scream(null);
        expResult = "Nobody is yelling";
        assertEquals(expResult, result);
        
              // REQUIREMENT 4
        result = instance.scream("Jenelle","Kadeem");
        expResult = "Jenelle and Kadeem are yelling ";
        assertEquals(expResult, result);
      
    }
    
}
