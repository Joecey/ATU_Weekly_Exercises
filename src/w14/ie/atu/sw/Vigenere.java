package w14.ie.atu.sw;

public class Vigenere {
    private static final char[][] TABULA_RECTA = TabulaRecta.tabulaRecta;
    public static final int MIN_KEY_SIZE = 10;
    public static final int MAX_KEY_SIZE = 100;
    private final char[] key; // probably easy to do this

    public Vigenere(String key) throws Exception {
        validateKey(key);
        charactersOnly(key);
        this.key = key.trim().toUpperCase().toCharArray();
    }

    private void charactersOnly(String toCheck) throws Exception {
        for (char c : toCheck.toCharArray()) {
            if (Character.isDigit(c)) {
                throw new Exception("You can't have any digits in your key or message");
            }
        }
    }

    // creating a checked exception
    private void validateKey(String key) throws Exception {
        if (key == null) {
            throw new Exception("Vignere error: Key cannot be null");
        } else if (key.length() < MIN_KEY_SIZE || key.length() > MAX_KEY_SIZE) {
            throw new Exception("Vignere error: key size must be between " +
                    MIN_KEY_SIZE + " and " + MAX_KEY_SIZE);
        }

    }
    private void validateString(String message) throws Exception {
        if (message.length() < MIN_KEY_SIZE) {
            throw new Exception("Message is too short bozo");
        }
    }

    public String vigenereProcess(String preText, boolean encrypt) throws Exception {
        validateString(preText);
        charactersOnly(preText);

        char[] currentKey = key;
//        System.out.println(currentKey);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < preText.length(); i++) {
            if (preText.charAt(i) == ' ') {
                sb.append(' ');
            } else {
                char newChar;
                int keyIndex = i == 0 ? i : (key.length - 1)% i;
                if (encrypt) {
                    newChar = getEncryptedCharacter(preText.charAt(i), currentKey[keyIndex]);
                } else {
                    newChar = getDecryptedCharacter(currentKey[keyIndex], preText.charAt(i));
                }
                sb.append(newChar);
            }
        }

        return String.valueOf(sb);
    }


    private char getEncryptedCharacter(char keyChar, char plainChar) {
        // go through each row with plainChar
        int plainCharIndex = findCharRowColumn(plainChar, false);

        // go through each value in row 0 with keyChar
        int keyCharIndex = findCharRowColumn(keyChar, true);
        //System.out.println(keyChar + ", " + plainChar + ", " + TABULA_RECTA[plainCharIndex][keyCharIndex] );
        if (keyCharIndex == -1 || plainCharIndex == -1){
            return keyChar;
        } else{
            return TABULA_RECTA[plainCharIndex][keyCharIndex];
        }
    }


    private int findCharRowColumn(char charCheck, boolean isKey) {
        int index = -1;
        if (!isKey) {
            for (int i = 0; i < TABULA_RECTA.length; i++) {
                if (TABULA_RECTA[i][0] == charCheck) {
                    index = i;
                    break;
                }
            }
        } else {
            for (int i = 0; i < TABULA_RECTA[0].length; i++) {
                if (TABULA_RECTA[0][i] == charCheck) {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }

    private char getDecryptedCharacter(char keyChar, char cipherChar) {

        // go through each value in row 0 with keyChar
        int keyCharIndex = findCharRowColumn(keyChar, true);

        // now we know column, find correct row
        int originalCharLocation = findOriginalCharLocale(cipherChar, keyCharIndex);


        //System.out.println(keyChar + ", " + cipherChar + ", " + TABULA_RECTA[originalCharLocation][0]);
        if (originalCharLocation != -1){
            return TABULA_RECTA[originalCharLocation][0];
        } else{
            return cipherChar;
        }
    }

    private int findOriginalCharLocale(char cipherChar, int keyCharIndex) {
        int indexRow = -1;
        for (int i = 0; i < TABULA_RECTA.length; i++) {
            if (TABULA_RECTA[i][keyCharIndex] == cipherChar) {
                indexRow = i;
                break;
            }
        }
        return indexRow;
    }

}
