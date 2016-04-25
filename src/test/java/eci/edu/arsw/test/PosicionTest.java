package eci.edu.arsw.test;

import eci.edu.arsw.ecimaps.Posicion;
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
public class PosicionTest {
    
    public PosicionTest() {
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
     * Test of getX method, of class Posicion.
     */
    @Test
    public void testGetX() {
        Posicion instance = new Posicion(0, 0);
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
    }

    /**
     * Test of setX method, of class Posicion.
     */
    @Test
    public void testSetX() {
        int x = 10;
        Posicion instance = new Posicion(0, 0);
        instance.setX(x);
        int expResult = 10;
        int result = instance.getX();
        assertEquals(expResult, result);
    }

    /**
     * Test of getY method, of class Posicion.
     */
    @Test
    public void testGetY() {
        Posicion instance = new Posicion(0, 0);
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
    }

    /**
     * Test of setY method, of class Posicion.
     */
    @Test
    public void testSetY() {
        int y = 0;
        Posicion instance = new Posicion(10, 10);
        instance.setY(y);
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Posicion.
     */
    @Test
    public void testEquals() {
        
        // Diferentes
        Posicion p1 = new Posicion(0, 0);
        Posicion p2 = new Posicion(0, 1);
        boolean expResult = false;
        boolean result = p2.equals(p1);
        assertEquals(expResult, result);
        result = p1.equals(p2);
        assertEquals(expResult, result);
        p1 = null;
        result = p2.equals(p1);
        assertEquals(expResult, result);
        
        // Iguales
        p1 = new Posicion(0, 1);
        result = p2.equals(p1);
        expResult = true;
        assertEquals(expResult, result);
    }
}
