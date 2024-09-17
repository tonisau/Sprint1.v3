package Tasca3.Nivell2.Exercici2;



import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Restaurant> restaurants = new TreeSet<>();

        // Añadir algunos restaurantes
        restaurants.add(new Restaurant("El Celler de Can Roca", 5));
        restaurants.add(new Restaurant("El Celler de Can Roca", 4));
        restaurants.add(new Restaurant("Noma", 5));
        restaurants.add(new Restaurant("Osteria Francescana", 5));
        restaurants.add(new Restaurant("El Celler de Can Roca", 5)); // Duplicado, no se añadirá

        // Mostrar los restaurantes
        for (
                Restaurant r : restaurants) {
            System.out.println(r);

        }
    }
}