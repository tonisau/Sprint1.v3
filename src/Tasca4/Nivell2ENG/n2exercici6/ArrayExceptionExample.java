package Tasca4.Nivell2ENG.n2exercici6;

public class ArrayExceptionExample {

    // Mètode que provoca una ArrayIndexOutOfBoundsException
    public int getElementFromArray(int[] array, int index) {
        // Si l'índex està fora dels límits de l'array, s'activarà automàticament l'excepció
        return array[index];
    }
}
