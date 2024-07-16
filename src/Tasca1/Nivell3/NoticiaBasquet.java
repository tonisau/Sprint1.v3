package Tasca1.Nivell3;

public class NoticiaBasquet extends Noticia {
    private String competicio;
    private String club;

    public NoticiaBasquet(String titular, String competicio, String club) {
        super(titular);
        this.competicio = competicio;
        this.club = club;
    }

    public void calcularPreuNoticia() {
        double preu = 250;
        if (competicio.equalsIgnoreCase("Eurolliga"))
            preu += 250;
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid"))
            preu += 75;
        setPreu(preu);
    }

    @Override
    public void calcularPuntuacioNoticia() {
        int punts = 4;
        if (competicio.equalsIgnoreCase("Eurolliga"))
            punts += 3;
        if (competicio.equalsIgnoreCase("ABC"))
            punts += 2;
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid"))
            punts += 1;
        setPuntuacio(punts);
    }
}
