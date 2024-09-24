package Tasca5.Nivell1.Exercici1;

import java.io.File;
import java.util.Arrays;

public class DirectoryLister {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java DirectoryLister <directory_path>");
            return;
        }

        // Obtenir el directori des del primer argument
        String directoryPath = args[0];
        File directory = new File(directoryPath);

        // Comprovar si el directori existeix i si és un directori vàlid
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("The provided path is not a valid directory.");
            return;
        }

        // Obtenir la llista de fitxers/directoris dins del directori
        String[] contents = directory.list();

        if (contents != null) {
            // Ordenar alfabèticament la llista de contingut
            Arrays.sort(contents);

            // Llistar el contingut
            System.out.println("Directory contents of " + directoryPath + ":");
            for (String item : contents) {
                System.out.println(item);
            }
        } else {
            System.out.println("The directory is empty or cannot be read.");
        }
    }
}
