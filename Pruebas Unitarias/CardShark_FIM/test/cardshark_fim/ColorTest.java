package cardshark_fim;

import org.junit.Test;
import static org.junit.Assert.*;

public class ColorTest {

    @Test
    public void testEnumValues() {
        Color rojo = Color.ROJO;
        Color negro = Color.NEGRO;

        assertNotNull(rojo);
        assertNotNull(negro);
    }
}
