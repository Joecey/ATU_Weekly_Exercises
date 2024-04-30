package w13.ie.atu.sw;

public class CustomStringBuilder {
    private char[] text;
    private int index;

    // if we pass nothing, create a new char array of 4
    public CustomStringBuilder() {
        text = new char[4];
    }

    // if we do pass a string, initialise
    public CustomStringBuilder(String s) {
        this(); // call my null constructor
        append(s);
    }

    private void ensureCapacity(){
        if (index >= text.length){
            char [] temp = new char[text.length * 2];
            // original, original starting, target, target starting, original end point
            System.arraycopy(text, 0, temp, 0, text.length);
            text = temp;
        }
    }
    public String toString(){
        // use trim() to get rid of any trailing nulls that remain
        return new String(text).trim();
    }
    public void append (String s){
        for (int i = 0; i < s.length(); i++) {
            append(s.charAt(i));
        }
    }
    public void append (char c){
        ensureCapacity();
        // add char to index then increment
        text[index] = c;
        index++;
    }

    public String reverse (){
        char[] reverse = new char[text.length];
        for (int i = index - 1; i >= 0; i--) {
            reverse[index - i -1] = text[i];
        }
        return new String(reverse).trim();
    }
}
