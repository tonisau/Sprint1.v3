package Tasca1.Nivell3;

public class NoticiaFutbol extends Noticia {
    private String competicio;
    private String club;
    private String jugador;

    public NoticiaFutbol(String titular, String competicio, String club, String jugador) {
        super(titular);
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;
    }

    @Override
    public void calcularPreuNoticia() {
        double preu = 300;
        if (competicio.equalsIgnoreCase("Lliga de Campions")) {
            preu += 100;
        }
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            preu += 100;
        }
        if (jugador.equalsIgnoreCase("Ferran Torres") || jugador.equalsIgnoreCase("Benzema")) {
            preu += 50;
        }
        setPreu(preu);
    }

    @Override
    public void calcularPuntuacioNoticia() {
        int punts = 5;
        if (competicio.equalsIgnoreCase("Lliga de Campions"))
            punts += 3;
        if (competicio.equalsIgnoreCase("Lliga"))
            punts += 2;
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid"))
            punts += 1;
        if (jugador.equalsIgnoreCase("Ferran Torres") || jugador.equalsIgnoreCase("Benzema"))
            punts += 1;
        setPuntuacio(punts);
    }

    public String toString() {
        return "* Noticia de fútbol:\nTitular:" + this.getTitular() + "\nCompetición:" + this.competicio + "\nClub:"
                + this.club + "\nJugador:" + this.jugador + "\nTexto:" + this.getText() + "\n";
    }
}

// Implementa de manera similar les altres subclasses de Noticia (NoticiaBasquet, NoticiaTenis, NoticiaF1, NoticiaMotociclisme)
