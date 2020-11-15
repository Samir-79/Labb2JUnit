import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @BeforeEach
    void beforeEachTest() {
        System.out.println("Körs före varje test");
    }

    @AfterEach
    void afterEachTest() {
        System.out.println("Körs efter varje test");
    }


    @Test
    @DisplayName("Testa add-metoden i Calculator-klassen")
    void testAdd() {
        Calculator calculator1 = new Calculator();
        assertEquals(4, calculator1.add(2, 2));

    }


    @Test
    @DisplayName("Testa mult-metoden i Calculator-klassen")
    void testMult() {
        Calculator calculator2 = new Calculator();
        assertEquals(4, calculator2.mult(2, 2));
    }

    @Disabled
    @Test
    @DisplayName("Testa sub-metoden i Calculator-klassen")
    void testSub() {
        Calculator calculator3 = new Calculator();
        assertEquals(0, calculator3.sub(2, 2));

    }

    //@Test

    @RepeatedTest(5)
    @DisplayName("Testa div-metoden i Calculator-klassen")
    void testDiv() {
        Calculator calculator4 = new Calculator();
        assertEquals(1, calculator4.div(2, 2));
        assertTrue(1==(calculator4.div(2,2)));

    }
}



