package Tasca5.Nivell1.Exercici4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DirectoryLister {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage:");
            System.out.println("1) java DirectoryLister <directory_path> <output_file> -> List directory to file");
            System.out.println("2) java DirectoryLister -read <input_file> -> Read and print file");
            return;
        }

        if ("-read".equals(args[0])) {
            // Funcionalitat de lectura del fitxer TXT
            String inputFilePath = args[1];
            readTextFile(inputFilePath);
        } else {
            // Funcionalitat de llistar el directori i guardar-lo en un fitxer
            String directoryPath = args[0];
            String outputFilePath = args[1];
            File directory = new File(directoryPath);
            File outputFile = new File(outputFilePath);

            // Comprovar si el directori és vàlid
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
    }

    /**
     * Funció per llistar el contingut d'un directori recursivament i guardar-lo en un fitxer.
     *
     * @param dir    El directori a llistar.
     * @param level  El nivell d'indentació.
     * @param writer L'objecte BufferedWriter per escriure el resultat en un fitxer.
     * @throws IOException Si hi ha un error d'entrada/sortida.
     */
    public static void listDirectoryContents(File dir, int level, BufferedWriter writer) throws IOException {
        File[] contents = dir.listFiles();

        if (contents != null) {
            // Ordenar els fitxers alfabèticament
            Arrays.sort(contents);

            for (File item : contents) {
                String indent = "    ".repeat(level);
                String type = item.isDirectory() ? "(D)" : "(F)";
                String lastModified = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(item.lastModified()));

                // Escriure la informació al fitxer
                writer.write(indent + type + " " + item.getName() + " - Last modified: " + lastModified);
                writer.newLine();

                if (item.isDirectory()) {
                    listDirectoryContents(item, level + 1, writer);
                }
            }
        }
    }

    /**
     * Funció per llegir un fitxer TXT i mostrar el seu contingut per consola.
     *
     * @param inputFilePath La ruta del fitxer a llegir.
     */
    public static void readTextFile(String inputFilePath) {
        File inputFile = new File(inputFilePath);

        // Comprovar si el fitxer existeix i és un fitxer normal
        if (!inputFile.exists() || !inputFile.isFile()) {
            System.out.println("The provided path is not a valid file.");
            return;
        }

        // Llegir i mostrar el contingut del fitxer
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
