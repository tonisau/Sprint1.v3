package Tasca4.Nivell1.Exercici2;

public class CalculoDni {

    // Array de lletres per al càlcul de la lletra del DNI
    private static final char[] LETRAS = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J',
            'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    // Mètode per calcular la lletra donat un número de DNI
    public static char calcularLletra(int numeroDni) {
        if (numeroDni < 0 || numeroDni > 99999999) {
            throw new IllegalArgumentException("El número de DNI ha de ser un valor entre 0 i 99999999.");
        }
        int index = numeroDni % 23;
        return LETRAS[index];
    }
}
