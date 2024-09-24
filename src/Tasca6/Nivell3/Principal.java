package Tasca6.Nivell3;

// Classe principal per provar el codi
public class Principal {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();  // Crear un objecte de la classe Smartphone
        Generica generica = new Generica();  // Crear un objecte de la classe Generica

        // Passar l'objecte smartphone al mètode limitat per Telefon
        System.out.println("Mètode limitat per Telefon:");
        generica.metodeTelefon(smartphone);  // Només pot cridar trucar()

        // Passar l'objecte smartphone al mètode limitat per Smartphone
        System.out.println("\nMètode limitat per Smartphone:");
        generica.metodeSmartphone(smartphone);  // Pot cridar trucar() i ferFotos()
    }
}