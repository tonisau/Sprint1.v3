package Tasca4.Nivell2ENG.n2exercici6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayExceptionExampleTest {

    @Test
    public void testArrayIndexOutOfBoundsException() {
        ArrayExceptionExample example = new ArrayExceptionExample();
        int[] array = {1, 2, 3};

        // Verifica que es llença ArrayIndexOutOfBoundsException quan s'accedeix fora dels límits
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            example.getElementFromArray(array, 5); // Índex fora de límits
        });
    }
}
