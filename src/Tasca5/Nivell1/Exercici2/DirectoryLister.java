package Tasca5.Nivell1.Exercici2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

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

        // Llistar recursivament el contingut del directori
        listDirectoryContents(directory, 0);
    }

    /**
     * Llista el contingut d'un directori i els seus subdirectoris recursivament.
     *
     * @param dir    El directori a llistar.
     * @param level  El nivell d'indentació actual (per representar la profunditat).
     */
    public static void listDirectoryContents(File dir, int level) {
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

                // Imprimir la informació de l'element
                System.out.println(indent + type + " " + item.getName() + " - Last modified: " + lastModified);

                // Si és un directori, llistar el seu contingut recursivament
                if (item.isDirectory()) {
                    listDirectoryContents(item, level + 1);
                }
            }
        }
    }
}
