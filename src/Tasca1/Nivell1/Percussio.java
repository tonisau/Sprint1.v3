package Tasca1.Nivell1;

// Classe Percussio que hereta de Instrument
class Percussio extends Instrument {
    public Percussio(String nom, double preu) {

        super(nom, preu);
    }

    @Override
    public void tocar() {

        System.out.println("Està sonant un instrument de percussió");
    }
}