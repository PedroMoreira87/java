package aula07_rsa;

import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.Cipher;

public class RSA {

    public static final String ALGORITIMO = "RSA";

    public static byte[] cifrar(String texto, Key chave) {
        byte[] cipherText = null;
        try {
            Cipher cifrador = Cipher.getInstance(ALGORITIMO);
            cifrador.init(Cipher.ENCRYPT_MODE, chave);
            cipherText = cifrador.doFinal(texto.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cipherText;
    }

    public static String decifrar(byte[] texto, Key chave) {
        byte[] dectyptedText = null;
        try {
            Cipher cifrador = Cipher.getInstance(ALGORITIMO);
            cifrador.init(Cipher.DECRYPT_MODE, chave);
            dectyptedText = cifrador.doFinal(texto);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return new String(dectyptedText);
    }
    public static void Imprimir(String texto)
    {
        System.out.println(texto);
    }

    public static void Imprimir(byte[] texto)
    {
        System.out.println(new String(texto));
    }

    public static void main(String[] args)
    {
        try
        {
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance(ALGORITIMO);
            //Tamanho da chave
            keyGen.initialize(1024);
            KeyPair key = keyGen.generateKeyPair();

            PublicKey publicKey = key.getPublic();
            PrivateKey privateKey = key.getPrivate();

            String originalText = "Boa noite!";

            byte[] cipherText = cifrar(originalText, publicKey);
            String plainText = decifrar(cipherText, privateKey);

            System.out.print("Original: ");
            Imprimir(originalText);
            System.out.print("Cifrado: ");
            Imprimir(cipherText);
            System.out.print("Decifrado: ");
            Imprimir(plainText);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
