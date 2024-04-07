package w11.ie.atu.sw;

import java.util.Arrays;

public class OneTimePad {
    private String key;
    public OneTimePad(String userKey){
        System.out.println("Created new one time password");
        setKey(userKey);
    }
    public void setKey(String key) {
        this.key = key;
    }
    public String encrypt(String message){
        char[] parsedPassword = new char[message.length()];
        for (int i = 0; i < message.length(); i++) {
            // cast the resulting int value as char
            parsedPassword[i] = (char) (key.charAt(i) ^ message.charAt(i));
        }

        return new String(parsedPassword);
    }
}
