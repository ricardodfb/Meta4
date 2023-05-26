package cardshark_fim;

import org.junit.Test;
import static org.junit.Assert.*;

public class FiguraTest {

    @Test
    public void testEnumValues() {
        Figura corazones = Figura.CORAZONES;
        Figura picas = Figura.PICAS;
        Figura diamantes = Figura.DIAMANTES;
        Figura treboles = Figura.TREBOLES;

        assertNotNull(corazones);
        assertNotNull(picas);
        assertNotNull(diamantes);
        assertNotNull(treboles);
    }
}
