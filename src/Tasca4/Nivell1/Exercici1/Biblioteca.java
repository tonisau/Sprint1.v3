package Tasca4.Nivell1.Exercici1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Biblioteca {
    private List<String> llibres;

    public Biblioteca() {
        this.llibres = new ArrayList<>();
    }

    // Afegir llibre al final de la llista
    public void afegirLlibre(String titol) {
        if (!llibres.contains(titol)) {
            llibres.add(titol);
            Collections.sort(llibres); // Ordena la llista alfabèticament
        }
    }

    // Recuperar llista completa de llibres
    public List<String> getLlibres() {
        return new ArrayList<>(llibres); // Retorna una còpia per evitar modificar la llista original
    }

    // Obtenir llibre per posició
    public String obtenirLlibre(int posicio) {
        if (posicio >= 0 && posicio < llibres.size()) {
            return llibres.get(posicio);
        }
        throw new IndexOutOfBoundsException("Posició fora de rang.");
    }

    // Afegir llibre a una posició específica
    public void afegirLlibreEnPosicio(String titol, int posicio) {
        if (!llibres.contains(titol)) {
            llibres.add(posicio, titol);
            Collections.sort(llibres); // Ordena la llista alfabèticament
        }
    }

    // Eliminar un llibre per títol
    public void eliminarLlibre(String titol) {
        llibres.remove(titol);
    }

    // Obtenir la mida de la llista
    public int getMida() {
        return llibres.size();
    }
}
