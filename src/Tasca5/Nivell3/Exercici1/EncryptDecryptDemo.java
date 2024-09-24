package Tasca5.Nivell3.Exercici1;

import javax.crypto.SecretKey;
import java.io.File;
import java.security.NoSuchAlgorithmException;

public class EncryptDecryptDemo {

    public static void main(String[] args) {
        try {
            // Fitxers
            File originalFile = new File("path/to/originalFile.txt");
            File encryptedFile = new File("path/to/encryptedFile.enc");
            File decryptedFile = new File("path/to/decryptedFile.txt");
            File keyFile = new File("path/to/aes.key");
            File ivFile = new File("path/to/aes.iv");

            // Generar clau i IV
            SecretKey key = FileEncryptor.generateKey();
            byte[] iv = FileEncryptor.generateIV();

            // Guardar clau i IV
            KeyAndIVUtils.saveKey(key, keyFile);
            KeyAndIVUtils.saveIV(iv, ivFile);

            // Encriptar fitxer
            FileEncryptor.encryptFile(originalFile, encryptedFile, key, iv);

            // Desencriptar fitxer
            SecretKey loadedKey = KeyAndIVUtils.readKey(keyFile);
            byte[] loadedIV = KeyAndIVUtils.readIV(ivFile);
            FileEncryptor.decryptFile(encryptedFile, decryptedFile, loadedKey, loadedIV);

            System.out.println("Encryption and decryption completed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
