package Tasca4.Nivell3ENG;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
        assertEquals(0, calc.add(-1, 1));
        assertEquals(0, calc.add(0, 0));
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.subtract(5, 3));
        assertEquals(-1, calc.subtract(0, 1));
        assertEquals(0, calc.subtract(-1, -1));
    }

    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.multiply(2, 3));
        assertEquals(0, calc.multiply(0, 5));
        assertEquals(1, calc.multiply(-1, -1));
    }

    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.divide(6, 3), 0);
        assertEquals(2.5, calc.divide(5, 2), 0);
        try {
            calc.divide(5, 0);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // Test passed, as we expected this exception.
        }
    }
}
