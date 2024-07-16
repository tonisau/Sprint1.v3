package Tasca1.Nivell1;

public class Main {
    public static void main(String[] args) {
        // Demostració de la càrrega de la classe
        System.out.println("Creació de la primera instància:");
        Vent flauta = new Vent("Flauta", 150);
        flauta.tocar();
        System.out.println("\nCreació de la segona instància:");
        Corda guitarra = new Corda("guitarra", 300);
        guitarra.tocar();
        System.out.println("\nCreació de la tercera instància:");
        Percussio bateria=new Percussio("bateria",500);
        bateria.tocar();
        // Accés a un membre estàtic
        System.out.println("\nAccés a un membre estàtic:");
        System.out.println("Nombre d'instàncies creades: " + Instrument.instancesCreated);
    }
}
