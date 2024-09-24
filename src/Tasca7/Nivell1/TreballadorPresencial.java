package Tasca7.Nivell1;

// Classe TreballadorPresencial, que hereta de Treballador
class TreballadorPresencial extends Treballador {
    // Atribut static per la benzina
    private static double benzina = 100.0;

    public TreballadorPresencial(String nom, String cognom, double preuHora) {
        super(nom, cognom, preuHora);
    }

    // Sobreescriure el mètode calcularSou
    @Override
    public  double calcularSou(int horesTreballades) {
        // Suma el valor de la benzina
        return (horesTreballades * preuHora) + benzina;
    }
}