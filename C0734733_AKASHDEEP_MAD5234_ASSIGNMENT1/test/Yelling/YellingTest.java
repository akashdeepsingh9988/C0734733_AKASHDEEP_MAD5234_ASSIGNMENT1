/*
 * STUDENT NAME : AKASHDEEP SINGH
 * STUDENT #ID : C0734733
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

    Yelling instance;
    String result = "";
    String expResult = "";

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
        instance = new Yelling();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of scream method, of class Yelling.
     */
   
    
    // ======================    METHOD 1 =========================================================
    @Test
    public void testScreamTC1() {
        // TEST CASE 1 -  REQUIREMENT 1
        result = instance.scream("Peter");
        expResult = "Peter is yelling";
        assertEquals(expResult, result);

    }

    @Test
    public void testScreamTC2() {
        // TEST CASE 2 - REQUIREMENT 2 
        result = instance.scream("PETER");
        expResult = "PETER IS YELLING";
        assertEquals(expResult, result);
    }

    @Test
    public void testScreamTC3() {
        //TEST CASE 3 -  REQUIREMENT 3 
        result = instance.scream(null);
        expResult = "Nobody is yelling";
        assertEquals(expResult, result);

    }

    @Test
    public void testScreamTC4() {
        //TEST CASE 4 - REQUIREMENT 4
        result = instance.scream("Jenelle", "Kadeem");
        expResult = "Jenelle and Kadeem are yelling";
        assertEquals(expResult, result);
    }

    @Test
    public void testScreamTC5() {
        //TEST CASE 5 - REQUIREMENT 5
        result = instance.scream("Jenelle", "Kadeem", "Akash");
        expResult = "Jenelle,Kadeem and Akash are yelling";
        assertEquals(expResult, result);

    }

    @Test
    public void testScreamTC6() {
        //TEST CASE 6 - REQUIREMENT 6
        /*
            four inputs with one CAPITAL name
         */
        result = instance.scream("AKASH", "Kadeem", "Akash", "Java");
        expResult = "SO IS AKASH. Kadeem,Akash and Java is yelling";
        assertEquals(expResult, result);
    }

    //=========================== METHOD 2 =====================================================
   
    /*
    @Test
    public void testScream() {

        System.out.println("scream");
        // TEST CASE 1 -  REQUIREMENT 1
        result = instance.scream("Peter");
        expResult = "Peter is yelling";
        assertEquals(expResult, result);
        
         // TEST CASE 2 - REQUIREMENT 2 
        result = instance.scream("PETER");
        expResult = "PETER IS YELLING";
        assertEquals(expResult, result);

        //TEST CASE 3 -  REQUIREMENT 3 
        result = instance.scream(null);
        expResult = "Nobody is yelling";
        assertEquals(expResult, result);

        //TEST CASE 4 - REQUIREMENT 4
        result = instance.scream("Jenelle", "Kadeem");
        expResult = "Jenelle and Kadeem are yelling";
        assertEquals(expResult, result);

        //TEST CASE 5 - REQUIREMENT 5
        result = instance.scream("Jenelle", "Kadeem", "Akash");
        expResult = "Jenelle,Kadeem and Akash are yelling";
        assertEquals(expResult, result);

        //TEST CASE 6 - REQUIREMENT 6
        //
          //  four inputs with one CAPITAL name
         //
        result = instance.scream("AKASH", "Kadeem", "Akash", "Java");
        expResult = "SO IS AKASH. Kadeem,Akash and Java is yelling";
        assertEquals(expResult, result);

    }
*/

    
    
}
