package Tasca5.Nivell2.Exercici1;


import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Properties;

public class DirectoryLister {

    private static String directoryPath;
    private static String outputFilePath;

    public static void main(String[] args) {
        // Carregar la configuració des del fitxer
        loadConfiguration();

        if (directoryPath == null || outputFilePath == null) {
            System.out.println("Configuration is missing required properties.");
            return;
        }

        File directory = new File(directoryPath);
        File outputFile = new File(outputFilePath);

        // Comprovar si el directori existeix i si és un directori vàlid
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("The provided path is not a valid directory.");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            // Llistar recursivament el contingut del directori i escriure-ho al fitxer
            listDirectoryContents(directory, 0, writer);
            System.out.println("Directory contents have been written to " + outputFilePath);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    /**
     * Carrega la configuració des del fitxer config.properties.
     */
    private static void loadConfiguration() {
        Properties properties = new Properties();
        try (InputStream input = new FileInputStream("config.properties")) {
            properties.load(input);
            directoryPath = properties.getProperty("directory.path");
            outputFilePath = properties.getProperty("output.file");
        } catch (IOException e) {
            System.out.println("An error occurred while loading the configuration: " + e.getMessage());
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
