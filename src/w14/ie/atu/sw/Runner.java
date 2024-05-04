package w14.ie.atu.sw;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        boolean testing = false;
        Scanner s = new Scanner(System.in);

        String key = "ShortKeyTest";
        int maxMessage = key.length();
        String plainTextTest = "Attack the castle wall at dawn";
        String plainText;
        if (testing) {
            plainText = plainTextTest;
        } else {
            System.out.println("Please provide message to encrypt");
            plainText = s.nextLine();
        }

        // how encatrypt
        // Step 1) for each letter in plaintext, find intersection of row given by keyword letter
        // and column given by the plaintext letter

        Vigenere cipher = new Vigenere(key);
        String cipherText = cipher.vigenereProcess(plainText.toUpperCase(), true);
        System.out.println(cipherText);

        // how to decrypt
        // Step 2) move down column with keyword letter to find row containing the ciphertext letter.
        // Read off the letter in the first column of that row
        System.out.println(cipher.vigenereProcess(cipherText, false));

        /* notes
         * What happens if we have a space in plainText? - solved */

    }
}
