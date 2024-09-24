package Tasca6.Nivell3ENG;

public class Smartphone implements Telefon{

    public void ferFotos(){
        System.out.println("He fet una foto!");
    }

    @Override
    public void trucar() {
        Telefon.super.trucar();
        System.out.println("riiiiiiiiiiiiiiiing");
    }

}