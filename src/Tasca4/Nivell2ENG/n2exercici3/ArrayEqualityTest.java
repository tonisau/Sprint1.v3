package Tasca4.Nivell2ENG.n2exercici3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayEqualityTest {

    @Test
    public void testArrayEquality() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        // Aserció que demostra que els dos arrays d'enters són idèntics
        assertArrayEquals(array1, array2, "The arrays should be identical.");
    }
}
