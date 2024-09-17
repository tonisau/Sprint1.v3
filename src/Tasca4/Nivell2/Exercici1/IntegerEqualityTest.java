package Tasca4.Nivell2.Exercici1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class IntegerEqualityTest {

    @Test
    public void testIntegerEquality() {
        Integer num1 = 5;
        Integer num2 = 5;

        // Aserció que demostra que els valors dels dos objectes sencers són iguals
        assertEquals(num1, num2, "The two integers should be equal.");
    }

    @Test
    public void testIntegerInequality() {
        Integer num1 = 5;
        Integer num2 = 10;

        // Aserció que demostra que els valors dels dos objectes sencers no són iguals
        assertNotEquals(num1, num2, "The two integers should not be equal.");
    }
}
