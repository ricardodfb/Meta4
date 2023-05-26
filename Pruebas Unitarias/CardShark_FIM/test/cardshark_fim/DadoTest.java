package cardshark_fim;

import org.junit.Test;
import static org.junit.Assert.*;

public class DadoTest {

    @Test
    public void testLanzar() {
        // Crear una instancia del dado
        Dado dado = new Dado();

        // Realizar múltiples lanzamientos y verificar que el resultado esté dentro del rango esperado
        for (int i = 0; i < 1000; i++) {
            int resultado = dado.lanzar();
            assertTrue("El resultado debe estar en el rango de 1 a 6", resultado >= 1 && resultado <= 6);
        }
    }
}
