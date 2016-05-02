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
     * Test of endJson method, of class Json.
     */
    @Test
    public void testEndJson() {
        Json instance = new Json();
        instance.endJson();
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
        instance.endJson();
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
        instance.endJson();
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
        instance.endJson();
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
        instance.endJson();
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
        instance.endJson();
        instance.endJson();
        String result = "{\"Posicion\":{\"x\":null}}";
        assertEquals(instance.toString(), result);
    }
    
    /**
     * Test of addArrayJson method, of class Json.
     */
    @Test
    public void testAddArrayJson() {
        String name = "Hijos";
        Json instance = new Json();
        instance.addArrayJson(name);
        String nulo = "Nulo";
        instance.startJson();
        instance.addNullValue(nulo);
        instance.addOtherValue();
        String peso = "Peso";
        Double pesos = 1.25;
        instance.add(peso, pesos);
        instance.endJson();
        instance.endArray();
        instance.addOtherValue();
        instance.addNullValue("Wola");
        instance.endJson();
        String result = "{\"Hijos\":[{\"Nulo\":null,\"Peso\":1.25}],\"Wola\":null}";
        assertEquals(instance.toString(), result);
    }
    
    /**
     * Test of endArray method, of class Json.
     */
    @Test
    public void testEndArray() {
        String name = "Array Vacio";
        Json instance = new Json();
        instance.addArrayJson(name);
        instance.endArray();
        instance.endJson();
        String result = "{\"Array Vacio\":[]}";
        assertEquals(instance.toString(), result);
    }
}
