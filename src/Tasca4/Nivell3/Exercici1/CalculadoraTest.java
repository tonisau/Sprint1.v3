package Tasca4.Nivell3.Exercici1;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sumar(2, 3));
        assertEquals(0, calc.sumar(-1, 1));
        assertEquals(0, calc.sumar(0, 0));
    }

    @Test
    public void testRestar() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.restar(5, 3));
        assertEquals(-1, calc.restar(0, 1));
        assertEquals(0, calc.restar(-1, -1));
    }

    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        assertEquals(6, calc.multiplicar(2, 3));
        assertEquals(0, calc.multiplicar(0, 5));
        assertEquals(1, calc.multiplicar(-1, -1));
    }

    @Test
    public void testDividir() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.dividir(6, 3), 0);
        assertEquals(2.5, calc.dividir(5, 2), 0);
        try {
            calc.dividir(5, 0);
            fail("S'esperava una ArithmeticException");
        } catch (ArithmeticException e) {
            // Prova passada
        }
    }
}
