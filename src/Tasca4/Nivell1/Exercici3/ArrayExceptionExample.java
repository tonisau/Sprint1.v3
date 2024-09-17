package Tasca4.Nivell1.Exercici3;

public class ArrayExceptionExample {

    // Mètode que provoca una ArrayIndexOutOfBoundsException
    public int getElementFromArray(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " is out of bounds for array of length " + array.length);
        }
        return array[index];
    }
}
