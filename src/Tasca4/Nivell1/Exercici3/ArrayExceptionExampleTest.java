package Tasca4.Nivell1.Exercici3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArrayExceptionExampleTest {

    // Test que verifica si es llença l'excepció ArrayIndexOutOfBoundsException
    @Test
    public void testArrayIndexOutOfBoundsException() {
        ArrayExceptionExample example = new ArrayExceptionExample();
        int[] array = {1, 2, 3};

        // Verifica que es llença ArrayIndexOutOfBoundsException quan l'índex és fora de límits
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            example.getElementFromArray(array, 5); // Índex fora de límits
        });
    }

    // Test que verifica el correcte retorn de valors quan l'índex és vàlid
    @Test
    public void testGetElementWithValidIndex() {
        ArrayExceptionExample example = new ArrayExceptionExample();
        int[] array = {1, 2, 3};

        assertEquals(1, example.getElementFromArray(array, 0));
        assertEquals(2, example.getElementFromArray(array, 1));
        assertEquals(3, example.getElementFromArray(array, 2));
    }
}
