package Tasca6.Nivell3;

// Classe genèrica amb mètodes limitats per tipus
class Generica {

    // Mètode genèric limitat per la interfície Telefon
    public <T extends Telefon> void metodeTelefon(T t) {
        t.trucar();
        // t.ferFotos();  <-- Això donaria error perquè el tipus està limitat per Telefon, i no té aquest mètode.
    }

    // Mètode genèric limitat per la classe Smartphone
    public <T extends Smartphone> void metodeSmartphone(T t) {
        t.trucar();
        t.ferFotos();  // Aquí podem cridar al mètode ferFotos perquè el tipus és Smartphone.
    }
}