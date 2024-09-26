package Tasca3.Nivell1.Exercici3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class CapitalsGame {

    public static void main(String[] args) {
        // Leer el archivo countries.txt y almacenar los datos en un HashMap
        HashMap<String, String> countriesMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\anton\\IdeaProjects\\Sprint1.v3\\src\\Tasca3\\Nivell1\\Exercici3\\countries.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    countriesMap.put(parts[0], parts[1]);
                }
            }
        } catch (IOException e) {
            System.err.println("Error leyendo el archivo: " + e.getMessage());
            return;
        }

        // Pedir el nombre del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombreUsuario = scanner.nextLine();

        // Inicializar la puntuación y el generador de números aleatorios
        int puntuacion = 0;
        Random random = new Random();
        Set<Map.Entry<String, String>> entrySet = countriesMap.entrySet();

        // Preguntar por 10 países de forma aleatoria
        for (int i = 0; i < 10; i++) {
            int randomIndex = random.nextInt(entrySet.size());
            Map.Entry<String, String> entry = entrySet.stream().skip(randomIndex).findFirst().get();
            String pais = entry.getKey();
            String capitalCorrecta = entry.getValue();

            System.out.print("¿Cuál es la capital de " + pais + "? ");
            String respuestaUsuario = scanner.nextLine();

            if (respuestaUsuario.equalsIgnoreCase(capitalCorrecta)) {
                puntuacion++;
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Incorrecto. La capital de " + pais + " es " + capitalCorrecta);
            }
        }

        // Guardar la puntuación en el archivo classificacio.txt
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\anton\\IdeaProjects\\Sprint1.v3\\src\\Tasca3\\Nivell1\\Exercici3\\classificacio.txt", true))) {
            bw.write(nombreUsuario + ": " + puntuacion + " puntos\n");
        } catch (IOException e) {
            System.err.println("Error escribiendo en el archivo: " + e.getMessage());
        }

        System.out.println("Tu puntuación final es: " + puntuacion);
        scanner.close();
    }
}
