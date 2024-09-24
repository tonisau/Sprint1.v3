package Tasca6.Nivell3ENG;

public class Generica {

    public static <T extends Telefon> void executaTelefon(T t) {
        t.trucar();
        //No pot cridar t.ferFotos();
    }

    public static <T extends Smartphone> void executaSmartphone(T t) {
        t.trucar();
        t.ferFotos();
    }

}