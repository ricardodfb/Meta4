package cardshark_fim;

import org.junit.Test;
import static org.junit.Assert.*;

public class FueraDeRangoExceptionTest {

    @Test
    public void testConstructor() {
        String mensaje = "Valor fuera de rango";
        FueraDeRangoException exception = new FueraDeRangoException(mensaje);
        assertEquals(mensaje, exception.getMessage());
    }
}
