package Tasca6.Nivell3;

class Smartphone implements Telefon {

    @Override
    public void trucar() {
        System.out.println("Trucant des del smartphone...");
    }

    // Mètode addicional de Smartphone
    public void ferFotos() {
        System.out.println("Fent una foto amb el smartphone...");
    }
}