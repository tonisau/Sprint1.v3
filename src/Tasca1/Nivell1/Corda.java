package Tasca1.Nivell1;
// Classe Corda que hereta de Instrument

class Corda extends Instrument {
    public Corda(String nom, double preu) {
        super(nom, preu);
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de corda");
    }
}