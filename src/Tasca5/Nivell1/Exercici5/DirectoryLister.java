package Tasca5.Nivell1.Exercici5;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DirectoryLister {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage:");
            System.out.println("1) java DirectoryLister <directory_path> <output_file> -> List directory to file");
            System.out.println("2) java DirectoryLister -read <input_file> -> Read and print file");
            System.out.println("3) java DirectoryLister -serialize <output_file> -> Serialize a Person object");
            System.out.println("4) java DirectoryLister -deserialize <input_file> -> Deserialize a Person object");
            return;
        }

        switch (args[0]) {
            case "-read":
                // Funcionalitat de lectura del fitxer TXT
                String inputFilePath = args[1];
                readTextFile(inputFilePath);
                break;

            case "-serialize":
                // Serialitzar un objecte Person a un fitxer
                String outputFilePath = args[1];
                serializePerson(outputFilePath);
                break;

            case "-deserialize":
                // Desserialitzar un objecte Person des d'un fitxer
                String serializeFilePath = args[1];
                deserializePerson(serializeFilePath);
                break;

            default:
                // Funcionalitat de llistar el directori i guardar-ho en un fitxer
                String directoryPath = args[0];
                outputFilePath = args[1];
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
                break;
        }
    }

    /**
     * Funció per llistar el contingut d'un directori recursivament i guardar-ho en un fitxer.
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

    /**
     * Funció per serialitzar un objecte Person a un fitxer .ser.
     */
    public static void serializePerson(String outputFilePath) {
        Person person = new Person("John Doe", 30);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(outputFilePath))) {
            oos.writeObject(person);
            System.out.println("Person object has been serialized to " + outputFilePath);
        } catch (IOException e) {
            System.out.println("An error occurred during serialization: " + e.getMessage());
        }
    }

    /**
     * Funció per desserialitzar un objecte Person des d'un fitxer .ser.
     */
    public static void deserializePerson(String inputFilePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(inputFilePath))) {
            Person person = (Person) ois.readObject();
            System.out.println("Person object has been deserialized:");
            System.out.println(person);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred during deserialization: " + e.getMessage());
        }
    }
}
