package Tasca2.Nivell1;

// Classe Producte
class Producte {
    private String nom;
    private double preu;

    // Constructor
    public Producte(String nom, double preu) {
        this.nom = nom;
        this.preu = preu;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public double getPreu() {
        return preu;
    }
}

// Excepció personalitzada VendaBuidaException
class VendaBuidaException extends Exception {
    public VendaBuidaException(String message) {
        super(message);
    }
}
