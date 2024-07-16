package Tasca1.Nivell3;

public class NoticiaTenis extends Noticia {
    private String competicio;
    private String tenista;

    public NoticiaTenis(String titular, String competicio, String tenista) {
        super(titular);
        this.competicio = competicio;
        this.tenista= tenista;
    }

    @Override
    public void calcularPreuNoticia() {
        double preu = 150;
        if (tenista.equalsIgnoreCase("Federer") || tenista.equalsIgnoreCase("Nadal")|| tenista.equalsIgnoreCase("Djokovic"))
            preu += 100;
        setPreu(preu);
    }

    @Override
    public void calcularPuntuacioNoticia() {
        int punts = 4;
        if (tenista.equalsIgnoreCase("Federer") || tenista.equalsIgnoreCase("Nadal")|| tenista.equalsIgnoreCase("Djokovic"))
            punts += 1;
        setPuntuacio(punts);
    }
}