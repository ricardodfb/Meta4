/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package cardshark_fim;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Ricardo Ferrel
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({cardshark_fim.JugadorTest.class, cardshark_fim.BarajaTest.class, cardshark_fim.FueraDeRangoExceptionTest.class, cardshark_fim.FiguraTest.class, cardshark_fim.ColorTest.class, cardshark_fim.CardShark_FIMTest.class, cardshark_fim.DadoTest.class, cardshark_fim.CartaTest.class})
public class Cardshark_fimSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
