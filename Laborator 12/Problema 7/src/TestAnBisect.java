import org.junit.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestAnBisect {
    static AnBisect anBisect;
    private static int nrTesteExecutate = 0;
    private static int nrTesteCuSucces = 0;

    public TestAnBisect() {
        System.out.println("Constructor inaintea fiecarui test!");
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("O singura data inaintea executiei setului de teste din clasa !");
        anBisect = new AnBisect();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("O singura data dupa terminarea executiei setului de teste din clasa !");
        System.out.println("S-au executat " + nrTesteExecutate + " teste din care"+ nrTesteCuSucces + " au avut succes !");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Incepe un nou test!");
        nrTesteExecutate++;
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("S-a terminat testul curent!");
    }

    @Test
    public void testAnBisect() {
        assertTrue(anBisect.esteAnBisect(4));
        assertTrue(anBisect.esteAnBisect(400));
        assertTrue(anBisect.esteAnBisect(1600));

        nrTesteCuSucces++;
    }

    @Test
    public void testAnComun() {
        assertFalse(anBisect.esteAnBisect(203));
        assertFalse(anBisect.esteAnBisect(99));
        assertFalse(anBisect.esteAnBisect(100));
        assertFalse(anBisect.esteAnBisect(200));
        assertFalse(anBisect.esteAnBisect(500));
        assertFalse(anBisect.esteAnBisect(1000));
        assertFalse(anBisect.esteAnBisect(2015));

        nrTesteCuSucces++;
    }

}
