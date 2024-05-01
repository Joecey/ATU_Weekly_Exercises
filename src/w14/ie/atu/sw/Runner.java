package w14.ie.atu.sw;

public class Runner {
    public static void main(String[] args) {
        System.out.println(TabulaRecta.tabulaRecta[0][0]);
        // how encrypt
        // Step 1) for each letter in plaintext, find intersection of row given by keyword letter
        // and column given by the plaintext letter

        // how to decrypt
        // Step 2) move down column with keyword letter to find row containing the ciphertext letter.
        // Read off the letter in the first column of that row

        /* notes
        * What happens if we have a space in plainText?
        * How do we generate a keyword dynamically? Is there a way to do this dynamically?*/

    }
}
