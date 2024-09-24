package Tasca7.Nivell1;

// Classe base Treballador
class Treballador {
    protected String nom;
    protected String cognom;
    protected double preuHora;

    public Treballador(String nom, String cognom, double preuHora) {
        this.nom = nom;
        this.cognom = cognom;
        this.preuHora = preuHora;
    }

    // Mètode per calcular el sou, que es sobreescriurà en les subclasses
    public double calcularSou(int horesTreballades) {
        return horesTreballades * preuHora;

    }
}
