package Tasca1.Nivell1;

// Classe Vent que hereta de Instrument
class Vent extends Instrument {
    public Vent(String nom, double preu) {
        super(nom, preu);
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de vent");
    }
}