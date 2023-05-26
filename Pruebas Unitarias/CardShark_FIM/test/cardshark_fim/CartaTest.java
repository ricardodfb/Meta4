package cardshark_fim;

import org.junit.Test;
import static org.junit.Assert.*;

public class CartaTest {

    @Test
    public void testGetValor() throws FueraDeRangoException {
        Carta carta = new Carta(5, Figura.CORAZONES);
        assertEquals(5, carta.getValor());
    }

    @Test
    public void testGetFigura() throws FueraDeRangoException {
        Carta carta = new Carta(8, Figura.TREBOLES);
        assertEquals(Figura.TREBOLES, carta.getFigura());
    }

    @Test
    public void testGetColor() throws FueraDeRangoException {
        Carta cartaRoja = new Carta(9, Figura.CORAZONES);
        Carta cartaNegra = new Carta(2, Figura.PICAS);
        assertEquals(Color.ROJO, cartaRoja.getColor());
        assertEquals(Color.NEGRO, cartaNegra.getColor());
    }

    @Test
    public void testToString() throws FueraDeRangoException {
        Carta carta = new Carta(11, Figura.DIAMANTES);
        assertEquals("J:DIAMANTES", carta.toString());
    }

    @Test
    public void testCompareTo() throws FueraDeRangoException {
        Carta carta1 = new Carta(7, Figura.TREBOLES);
        Carta carta2 = new Carta(7, Figura.CORAZONES);
        Carta carta3 = new Carta(9, Figura.PICAS);

        assertTrue(carta1.compareTo(carta2) == 0);
        assertTrue(carta1.compareTo(carta3) < 0);
        assertTrue(carta3.compareTo(carta1) > 0);
    }
}
