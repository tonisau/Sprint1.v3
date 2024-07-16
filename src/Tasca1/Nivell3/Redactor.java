package Tasca1.Nivell3;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Redactor {
    private String nom;
    private final String DNI;
    private static double sou = 1500.0;
    private ArrayList<Noticia> noticies;

    public Redactor(String nom, String DNI) {
        this.nom = nom;
        this.DNI = DNI;
        this.noticies = new ArrayList<Noticia>();
    }

    public String getName() {
        return nom;
    }
    public void setName(String name) {
        this.nom = nom;
    }


    public String getDNI() {
        return DNI;
    }

    public static double getSou() {
        return sou;
    }

    public static void setSou(double nouSou) {
        sou = nouSou;
    }

    public void afegirNoticia(Noticia noticia) {
        noticies.add(noticia);
    }

    public void eliminarNoticia(String titular) {
        noticies.removeIf(noticia -> noticia.getTitular().equalsIgnoreCase(titular));
    }

    public ArrayList<Noticia> getNoticies() {
        return noticies;
    }
}
