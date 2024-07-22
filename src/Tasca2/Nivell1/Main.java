package Tasca2.Nivell1;

// Classe principal per provar el codi
public class Main {
    public static void main(String[] args) {
        // Creem una venda buida per provar l'excepció
        Venda venda = new Venda();

        Producte producte1 = new Producte("Producte 1", 10.0);
        Producte producte2 = new Producte("Producte 2", 20.0);


        try {
            venda.calcularTotal();
        } catch (VendaBuidaException e) {
            System.out.println(e.getMessage());
        }

        // Afegim productes a la venda i calculem el total
        venda.afegirProducte(producte1);
        venda.afegirProducte(producte2);

        try {
            venda.calcularTotal();
            System.out.println("El preu total de la venda és: " + venda.getPreuTotal());
        } catch (VendaBuidaException e) {
            System.out.println(e.getMessage());
        }

        // Generar i capturar una excepció de tipus ArrayIndexOutOfBoundsException
        int[] array = {1, 2, 3};
        try {
            int valor = array[5]; // Aquest índex no existeix
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("S'ha produït una excepció: " + e.getMessage());
        }
    }
}
