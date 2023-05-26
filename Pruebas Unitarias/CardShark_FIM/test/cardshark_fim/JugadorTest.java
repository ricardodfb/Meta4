/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package cardshark_fim;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ricardo Ferrel
 */
public class JugadorTest {
    
    public JugadorTest() {
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
     * Test of eliminarCarta method, of class Jugador.
     */
    @Test
    public void testEliminarCarta() {
        System.out.println("eliminarCarta");
        Carta carta = null;
        Jugador instance = null;
        instance.eliminarCarta(carta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarMano method, of class Jugador.
     */
    @Test
    public void testGenerarMano() {
        System.out.println("generarMano");
        Jugador instance = null;
        instance.generarMano();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdentificador method, of class Jugador.
     */
    @Test
    public void testGetIdentificador() {
        System.out.println("getIdentificador");
        Jugador instance = null;
        String expResult = "";
        String result = instance.getIdentificador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMano method, of class Jugador.
     */
    @Test
    public void testGetMano() {
        System.out.println("getMano");
        Jugador instance = null;
        ArrayList<Carta> expResult = null;
        ArrayList<Carta> result = instance.getMano();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMazo method, of class Jugador.
     */
    @Test
    public void testSetMazo() {
        System.out.println("setMazo");
        ArrayList<Carta> mazo = null;
        Jugador instance = null;
        instance.setMazo(mazo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of suma method, of class Jugador.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        Jugador instance = null;
        instance.suma();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPuntaje method, of class Jugador.
     */
    @Test
    public void testGetPuntaje() {
        System.out.println("getPuntaje");
        Jugador instance = null;
        int expResult = 0;
        int result = instance.getPuntaje();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of empate method, of class Jugador.
     */
    @Test
    public void testEmpate() {
        System.out.println("empate");
        Jugador instance = null;
        instance.empate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarCarta method, of class Jugador.
     */
    @Test
    public void testGenerarCarta() {
        System.out.println("generarCarta");
        Jugador jugador = null;
        int indiceCarta = 0;
        Carta expResult = null;
        Carta result = Jugador.generarCarta(jugador, indiceCarta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Jugador.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Jugador instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
