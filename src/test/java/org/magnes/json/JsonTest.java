package org.magnes.json;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juan Sebastian Martinez Serna
 * @author Diana Maria del Pilar Socha Diaz
 */
public class JsonTest {
    
    public JsonTest() {
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
     * Test of endhJson method, of class Json.
     */
    @Test
    public void testEndhJson() {
        Json instance = new Json();
        instance.endhJson();
        String result = "{  }";
        
        assertEquals(instance.toString(), result);
    }

    /**
     * Test of add method, of class Json.
     */
    @Test
    public void testAdd_String_String() {
        String name = "";
        String value = "";
        Json instance = new Json();
        instance.add(name, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Json.
     */
    @Test
    public void testAdd_String_Integer() {
        String name = "";
        Integer value = null;
        Json instance = new Json();
        instance.add(name, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Json.
     */
    @Test
    public void testAdd_String_Double() {
        String name = "";
        Double value = null;
        Json instance = new Json();
        instance.add(name, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNullValue method, of class Json.
     */
    @Test
    public void testAddNullValue() {
        String name = "";
        Json instance = new Json();
        instance.addNullValue(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNewJson method, of class Json.
     */
    @Test
    public void testAddNewJson() {
        Json instance = new Json();
        instance.addNewJson();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of addArrayJson method, of class Json.
     */
    @Test
    public void testAddArrayJson() {
        String name = "";
        Json instance = new Json();
        instance.addArrayJson(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of endArray method, of class Json.
     */
    @Test
    public void testEndArray() {
        String name = "";
        Json instance = new Json();
        instance.endArray();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
