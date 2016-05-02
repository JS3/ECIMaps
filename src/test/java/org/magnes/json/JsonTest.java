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
        String result = "{}";
        
        assertEquals(instance.toString(), result);
    }

    /**
     * Test of add method, of class Json.
     */
    @Test
    public void testAdd_String_String() {
        String name = "Saludo";
        String value = "Hola";
        Json instance = new Json();
        instance.add(name, value);
        instance.endhJson();
        String result = "{\"Saludo\":\"Hola\"}";
        assertEquals(instance.toString(), result);
    }

    /**
     * Test of add method, of class Json.
     */
    @Test
    public void testAdd_String_Integer() {
        String name = "Edad";
        Integer value = 25;
        Json instance = new Json();
        instance.add(name, value);
        instance.endhJson();
        String result = "{\"Edad\":25}";
        assertEquals(instance.toString(), result);
    }

    /**
     * Test of add method, of class Json.
     */
    @Test
    public void testAdd_String_Double() {
        String name = "Peso";
        Double value = 70.2;
        Json instance = new Json();
        instance.add(name, value);
        instance.endhJson();
        String result = "{\"Peso\":70.2}";
        assertEquals(instance.toString(), result);
    }

    /**
     * Test of addNullValue method, of class Json.
     */
    @Test
    public void testAddNullValue() {
        String name = "Nulo";
        Json instance = new Json();
        instance.addNullValue(name);
        instance.endhJson();
        String result = "{\"Nulo\":null}";
        assertEquals(instance.toString(), result);
    }

    /**
     * Test of add method, of class Json.
     */
    @Test
    public void testAdd_String() {
        String name = "Posicion";
        Json instance = new Json();
        instance.add(name);
        String x = "x";
        instance.addNullValue(x);
        instance.endhJson();
        instance.endhJson();
        String result = "{\"Posicion\":{\"x\":null}}";
        assertEquals(instance.toString(), result);
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
