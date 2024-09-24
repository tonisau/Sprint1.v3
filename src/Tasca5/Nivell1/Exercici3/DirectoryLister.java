package Tasca5.Nivell1.Exercici3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DirectoryLister {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java DirectoryLister <directory_path> <output_file>");
            return;
        }

        // Obtenir el directori i el fitxer de sortida des dels arguments
        String directoryPath = args[0];
        String outputPath = args[1];
        File directory = new File(directoryPath);
        File outputFile = new File(outputPath);

        // Comprovar si el directori existeix i si és un directori vàlid
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("The provided path is not a valid directory.");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            // Llistar recursivament el contingut del directori i escriure-ho al fitxer
            listDirectoryContents(directory, 0, writer);
            System.out.println("Directory contents have been written to " + outputPath);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    /**
     * Llista el contingut d'un directori i els seus subdirectoris recursivament, escrivint-ho en un fitxer.
     *
     * @param dir    El directori a llistar.
     * @param level  El nivell d'indentació actual (per representar la profunditat).
     * @param writer L'objecte BufferedWriter per escriure al fitxer.
     * @throws IOException Si hi ha un error d'entrada/sortida.
     */
    public static void listDirectoryContents(File dir, int level, BufferedWriter writer) throws IOException {
        // Obtenir la llista de fitxers i directoris dins del directori
        File[] contents = dir.listFiles();

        if (contents != null) {
            // Ordenar alfabèticament la llista de contingut
            Arrays.sort(contents);

            // Iterar sobre els continguts
            for (File item : contents) {
                // Afegir indentació segons el nivell de profunditat
                String indent = "    ".repeat(level);

                // Comprovar si l'element és un directori o un fitxer
                String type = item.isDirectory() ? "(D)" : "(F)";

                // Obtenir l'última data de modificació
                String lastModified = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(item.lastModified()));

                // Escriure la informació de l'element al fitxer
                writer.write(indent + type + " " + item.getName() + " - Last modified: " + lastModified);
                writer.newLine();

                // Si és un directori, llistar el seu contingut recursivament
                if (item.isDirectory()) {
                    listDirectoryContents(item, level + 1, writer);
                }
            }
        }
    }
}
