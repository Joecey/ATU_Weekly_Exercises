package w13.ie.atu.sw;

public class CeasarCypher {
    // use a key to shift a letter by a numbers
    private final int key;
    public CeasarCypher(int key) {
        this.key = key;
    }
    public String encrypt(String plainText){
        return transform(plainText, true);
    }
    public String decrypt(String cypherText){
        return transform(cypherText, false);

    }
    private String transform (String s, boolean encrypt){
        StringBuilder result = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                // get UNICODE - then cast to Char
                char letter;
                if (encrypt) {
                    letter = (char) (s.codePointAt(i) + key);
                }
                else {
                    letter = (char) (s.codePointAt(i) - key);
                }
                result.append(letter);
            }
        // return stringBuilder as string
        return String.valueOf(result);
    }
}
