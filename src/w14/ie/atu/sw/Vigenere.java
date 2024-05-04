package w14.ie.atu.sw;

public class Vigenere {
    private static final char[][] TABULA_RECTA = TabulaRecta.tabulaRecta;
    private final char[] key; // probably easy to do this

    public Vigenere(String key) {
        this.key = key.trim().toUpperCase().toCharArray();
    }

    private char[] expandedKey(String preText) {
        char[] currentKey = key;

        while (preText.length() > currentKey.length) {
//            System.out.println("Updating key length...");
            char[] newKey = new char[currentKey.length * 2];
            System.arraycopy(currentKey, 0, newKey, 0, currentKey.length);

            // now we fill in the remaining pieces
            for (int i = 0; i < currentKey.length; i++) {
                newKey[currentKey.length + i] = currentKey[i];
            }
            currentKey = newKey;
        }
        return currentKey;
    }

    public String vigenereProcess(String preText, boolean encrypt) {
        char[] currentKey = expandedKey(preText);
//        System.out.println(currentKey);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < preText.length(); i++) {
            if (preText.charAt(i) == ' ') {
                sb.append(' ');
            } else {
                char newChar;
                if (encrypt) {
                    newChar = getEncryptedCharacter(preText.charAt(i), currentKey[i]);
                } else {
                    newChar = getDecryptedCharacter(currentKey[i], preText.charAt(i));
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
        return TABULA_RECTA[plainCharIndex][keyCharIndex];
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
        return TABULA_RECTA[originalCharLocation][0];
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