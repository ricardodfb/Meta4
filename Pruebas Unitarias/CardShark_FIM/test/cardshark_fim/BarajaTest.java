package cardshark_fim;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BarajaTest {
    private Baraja baraja;

    @Before
    public void setUp() {
        baraja = new Baraja();
    }

    @Test
    public void testInicializa() {
        assertEquals(52, baraja.getCartas().size());
    }

    @Test
    public void testBarajar() {
        ArrayList<Carta> cartasAntesBarajar = new ArrayList<>(baraja.getCartas());
        baraja.barajar();
        ArrayList<Carta> cartasDespuesBarajar = baraja.getCartas();
        assertNotEquals(cartasAntesBarajar, cartasDespuesBarajar);
    }

    @Test
    public void testRepartir() {
        int n = 5; // Número de cartas a repartir
        ArrayList<Carta> mano = baraja.repartir(n);
        assertEquals(n, mano.size());
        assertEquals(52 - n, baraja.getCartas().size());
    }

    @Test
    public void testAgregarCarta() throws FueraDeRangoException {
        int cartasAntes = baraja.getCartas().size();
        Carta nuevaCarta = new Carta(14, Figura.PICAS); // Crear una nueva carta
        baraja.agregarCarta(nuevaCarta);
        int cartasDespues = baraja.getCartas().size();
        assertEquals(cartasAntes + 1, cartasDespues);
        assertTrue(baraja.getCartas().contains(nuevaCarta));
    }

    @Test
    public void testToString() {
        String mazoStr = baraja.toString();
        assertNotNull(mazoStr);
        assertTrue(mazoStr.length() > 0);
    }
}
