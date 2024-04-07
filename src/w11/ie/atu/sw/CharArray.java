package w11.ie.atu.sw;

import java.util.concurrent.ThreadLocalRandom;

public class CharArray {
    private char[] text = null;
    private static final int MIN_CHAR = 33;
    private static final int MAX_CHAR = 54;
    public CharArray(int size){
        text = new char[size];
        init();
    }
    public String getCharacterArrayAsString(){
        return new String (text);
    }

    private void init(){
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        for (int i = 0; i < text.length; i++) {
            // we are casting the numbers to a char
            text[i] = (char) rnd.nextInt(MIN_CHAR, MAX_CHAR); // using ASCII codes
        }
    }
}
