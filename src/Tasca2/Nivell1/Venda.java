package Tasca2.Nivell1;

// Classe Venda
import java.util.ArrayList;
import java.util.List;

class Venda {
    private List<Producte> productes;
    private double preuTotal;

    // Constructor
    public Venda() {
        this.productes = new ArrayList<>();
        this.preuTotal = 0.0;
    }

    // Afegir producte a la venda
    public void afegirProducte(Producte producte) {
        this.productes.add(producte);
    }

    // Mètode calcularTotal
    public void calcularTotal() throws VendaBuidaException {
        if (productes.isEmpty()) {
            throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");
        }
        this.preuTotal = 0.0;
        for (Producte producte : productes) {
            this.preuTotal += producte.getPreu();
        }
    }

    // Getter per preuTotal
    public double getPreuTotal() {
        return preuTotal;
    }
}