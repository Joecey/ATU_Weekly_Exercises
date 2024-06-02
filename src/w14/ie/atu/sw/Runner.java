package w14.ie.atu.sw;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String key = "ShortKeyTest";
        String plainText = null;
        String file = null;


        // Just using this to test listing multiple files
        System.out.println("Please provide message to encrypt");
        plainText = s.nextLine();


        // how encatrypt
        // Step 1) for each letter in plaintext, find intersection of row given by keyword letter
        // and column given by the plaintext letter
        try {

            Vigenere cipher;
            try {
                cipher = new Vigenere(key);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            String cipherText;
            try {
                cipherText = cipher.vigenereProcess(plainText.toUpperCase(), true);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println(cipherText);

            // how to decrypt
            // Step 2) move down column with keyword letter to find row containing the ciphertext letter.
            // Read off the letter in the first column of that row
            try {
                System.out.println(cipher.vigenereProcess(cipherText, false));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        /* notes
         * What happens if we have a space in plainText? - solved */

    }
}
