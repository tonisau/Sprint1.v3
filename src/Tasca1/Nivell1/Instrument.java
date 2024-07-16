package Tasca1.Nivell1;

abstract class Instrument {
    // Atributs de classe
    private String nom;
    private double preu;
    protected static int instancesCreated = 0;

    public Instrument(String nom, double preu) {
        this.nom = nom;
        this.preu = preu;
        instancesCreated++;
    }

    // Mètode abstracte
    public abstract void tocar();
}