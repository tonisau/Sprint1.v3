package Tasca7.Nivell1;


// Classe TreballadorOnline, que hereta de Treballador
class TreballadorOnline extends Treballador {
    // Constant per la tarifa plana d'Internet
    private static final double TARIFA_INTERNET = 50.0;

    public TreballadorOnline(String nom, String cognom, double preuHora) {
        super(nom, cognom, preuHora);
    }

    // Sobreescriure el mètode calcularSou
    @Override
    public double calcularSou(int horesTreballades) {
        // Suma el preu de la tarifa plana d'internet
        return (horesTreballades * preuHora) + TARIFA_INTERNET;
    }
}