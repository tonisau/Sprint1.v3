package Tasca3.Nivell3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Person> persones = new ArrayList<>();

    public static void main(String[] args) {
        carregarPersones("C:\\Users\\anton\\IdeaProjects\\Sprint1.v3\\src\\Tasca3\\Nivell3\\persones.csv");

        Scanner scanner = new Scanner(System.in);
        int opcio;

        do {
            mostrarMenu();
            opcio = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (opcio) {
                case 1:
                    introduirPersona(scanner);
                    break;
                case 2:
                    mostrarPersonesOrdenades(Comparator.comparing(Person::getName));
                    break;
                case 3:
                    mostrarPersonesOrdenades(Comparator.comparing(Person::getName).reversed());
                    break;
                case 4:
                    mostrarPersonesOrdenades(Comparator.comparing(Person::getSurname));
                    break;
                case 5:
                    mostrarPersonesOrdenades(Comparator.comparing(Person::getSurname).reversed());
                    break;
                case 6:
                    mostrarPersonesOrdenades(Comparator.comparing(Person::getDni));
                    break;
                case 7:
                    mostrarPersonesOrdenades(Comparator.comparing(Person::getDni).reversed());
                    break;
                case 0:
                    System.out.println("Sortint...");
                    break;
                default:
                    System.out.println("Opció invàlida");
            }

        } while (opcio != 0);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("1.- Introduir persona.");
        System.out.println("2.- Mostrar les persones ordenades per nom (A-Z).");
        System.out.println("3.- Mostrar les persones ordenades per nom (Z-A).");
        System.out.println("4.- Mostrar les persones ordenades per cognoms (A-Z).");
        System.out.println("5.- Mostrar les persones ordenades per cognoms (Z-A).");
        System.out.println("6.- Mostrar les persones ordenades per DNI (1-9).");
        System.out.println("7.- Mostrar les persones ordenades per DNI (9-1).");
        System.out.println("0.- Sortir.");
        System.out.print("Selecciona una opció: ");
    }

    private static void introduirPersona(Scanner scanner) {
        System.out.print("Introdueix el nom: ");
        String nom = scanner.nextLine();
        System.out.print("Introdueix el cognom: ");
        String cognom = scanner.nextLine();
        System.out.print("Introdueix el DNI: ");
        String DNI = scanner.nextLine();

        persones.add(new Person(nom, cognom, DNI));
    }

    private static void mostrarPersonesOrdenades(Comparator<Person> comparator) {
        List<Person> personesOrdenades = new ArrayList<>(persones);
        personesOrdenades.sort(comparator);
        System.out.println("___Nom___ ____Cognoms___ __NIF__");
        for (Person persona : personesOrdenades) {
            System.out.println(persona);
        }
    }

    private static void carregarPersones(String nomFitxer) {
        try (BufferedReader br = new BufferedReader(new FileReader(nomFitxer))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    persones.add(new Person(parts[0].trim(), parts[1].trim(), parts[2].trim()));
                }
            }
        } catch (IOException e) {
            System.err.println("Error llegint el fitxer: " + e.getMessage());
        }
    }
}
