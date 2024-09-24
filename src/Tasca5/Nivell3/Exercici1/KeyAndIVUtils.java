package Tasca5.Nivell3.Exercici1;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;

public class KeyAndIVUtils {

    // Guardar una clau AES en un fitxer
    public static void saveKey(SecretKey key, File file) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(key.getEncoded());
        }
    }

    // Llegir una clau AES des d'un fitxer
    public static SecretKey readKey(File file) throws IOException {
        byte[] keyBytes = new byte[(int) file.length()];
        try (FileInputStream fis = new FileInputStream(file)) {
            fis.read(keyBytes);
        }
        return new SecretKeySpec(keyBytes, "AES");
    }

    // Guardar un IV en un fitxer
    public static void saveIV(byte[] iv, File file) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(iv);
        }
    }

    // Llegir un IV des d'un fitxer
    public static byte[] readIV(File file) throws IOException {
        byte[] iv = new byte[16];
        try (FileInputStream fis = new FileInputStream(file)) {
            fis.read(iv);
        }
        return iv;
    }
}
