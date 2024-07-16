package Tasca1.Nivell3;

public class NoticiaF1 extends Noticia {
    private String escuderia;

    public NoticiaF1(String titular, String escuderia) {
        super(titular);
        this.escuderia = escuderia;

    }

    @Override
    public void calcularPreuNoticia() {
        double preu = 100;
        if (escuderia.equalsIgnoreCase("Ferrari") || escuderia.equalsIgnoreCase("Mercedes"))
            preu += 50;
        setPreu(preu);
    }

    @Override
    public void calcularPuntuacioNoticia() {
        int punts = 4;
        if (escuderia.equalsIgnoreCase("Ferrari") || escuderia.equalsIgnoreCase("Mercedes"))
            punts += 2;
        setPuntuacio(punts);
    }
}