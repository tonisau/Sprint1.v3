package Tasca2.Nivell2;

import static Tasca2.Nivell2.Entrada.*;

public class Main {
    public static void main(String[] args) {
        // Provar els mètodes
        byte edat = llegirByte("Introdueix la teva edat:");
        System.out.println("Edat: " + edat);

        int enter = llegirInt("Introdueix un número enter:");
        System.out.println("Enter: " + enter);

        float decimal = llegirFloat("Introdueix un número decimal (float):");
        System.out.println("Decimal (float): " + decimal);

        double decimalGran = llegirDouble("Introdueix un número decimal (double):");
        System.out.println("Decimal (double): " + decimalGran);

        char car = llegirChar("Introdueix un sol caràcter:");
        System.out.println("Caràcter: " + car);

        String cadena = llegirString("Introdueix una cadena de text:");
        System.out.println("Cadena: " + cadena);

        boolean siNo = llegirSiNo("Vols continuar?");
        System.out.println("Continuar: " + (siNo ? "Sí" : "No"));
    }
}