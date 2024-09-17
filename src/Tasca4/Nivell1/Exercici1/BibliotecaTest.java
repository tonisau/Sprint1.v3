package Tasca4.Nivell1.Exercici1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BibliotecaTest {

    private Biblioteca biblioteca;

    @BeforeEach
    public void setUp() {
        biblioteca = new Biblioteca();
    }

    // Verifica que la llista no és nul·la després de crear un nou objecte
    @Test
    public void testLlistaNoEsNullDespresDeCrear() {
        assertNotNull(biblioteca.getLlibres());
    }

    // Confirma que la llista té la mida esperada després d'afegir diversos llibres
    @Test
    public void testMidaLlistaDespresDAfegirLlibres() {
        biblioteca.afegirLlibre("El Quixot");
        biblioteca.afegirLlibre("La Divina Comèdia");
        assertEquals(2, biblioteca.getMida());
    }

    // Assegura que la llista conté un llibre específic en la seva posició correcta
    @Test
    public void testLlibreEspecificEnPosicioCorrecta() {
        biblioteca.afegirLlibre("1984");
        biblioteca.afegirLlibre("El Quixot");
        assertEquals("1984", biblioteca.obtenirLlibre(0)); // La llista ha d'estar ordenada alfabèticament
    }

    // Verifica que no hi ha títols duplicats
    @Test
    public void testNoHiHaDuplicats() {
        biblioteca.afegirLlibre("1984");
        biblioteca.afegirLlibre("1984");
        assertEquals(1, biblioteca.getMida()); // Només hauria d'existir una còpia del llibre
    }

    // Comprova que es pot recuperar el títol d'un llibre per la seva posició
    @Test
    public void testRecuperarLlibrePerPosicio() {
        biblioteca.afegirLlibre("El Quixot");
        assertEquals("El Quixot", biblioteca.obtenirLlibre(0));
    }

    // Assegura que afegir un llibre modifica correctament la llista
    @Test
    public void testAfegirLlibreModificaLlista() {
        biblioteca.afegirLlibre("1984");
        assertEquals(1, biblioteca.getMida());
        assertTrue(biblioteca.getLlibres().contains("1984"));
    }

    // Confirma que eliminar un llibre disminueix la mida de la llista
    @Test
    public void testEliminarLlibreModificaMida() {
        biblioteca.afegirLlibre("El Quixot");
        biblioteca.eliminarLlibre("El Quixot");
        assertEquals(0, biblioteca.getMida());
    }

    // Verifica que la llista roman ordenada alfabèticament després d'afegir o eliminar llibres
    @Test
    public void testLlistaEsOrdenadaDespresDAfegirEliminar() {
        biblioteca.afegirLlibre("Cien años de soledad");
        biblioteca.afegirLlibre("1984");
        biblioteca.afegirLlibre("El Quixot");

        List<String> llibres = biblioteca.getLlibres();
        assertEquals("1984", llibres.get(0));
        assertEquals("Cien años de soledad", llibres.get(1));
        assertEquals("El Quixot", llibres.get(2));

        biblioteca.eliminarLlibre("1984");
        llibres = biblioteca.getLlibres();
        assertEquals("Cien años de soledad", llibres.get(0));
        assertEquals("El Quixot", llibres.get(1));
    }
}
