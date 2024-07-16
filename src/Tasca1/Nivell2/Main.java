package Tasca1.Nivell2;

// Classe principal per a la demostració
public class Main {
    public static void main(String[] args) {
        // Creació d'un objecte Smartphone
        Smartphone meuSmartphone = new Smartphone("Samsung", "Galaxy S21");

        // Crida als mètodes
        meuSmartphone.trucar("+34 620 21 22");
        meuSmartphone.fotografiar();
        meuSmartphone.alarma();
    }
}
