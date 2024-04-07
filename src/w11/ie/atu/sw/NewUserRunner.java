package w11.ie.atu.sw;

import java.util.Scanner;

public class NewUserRunner {
    public static void main(String[] args) {
        System.out.println("Week 11 Exercises: One time password");
        Scanner scanner = new Scanner(System.in);
        /* Steps:
        XOR cypher explained - https://www.youtube.com/watch?v=xK_SqWG9w-Y
        * 1: create a new class called OneTimePad
        * 2: create instance variable for key > set this as the getCharacterArrayAsString
        * 3: create a new password - on intialisation, set the key
        * 4: encrypt a message using XOR
        * 5: decrypt a message using XOR */
        // set our new key
        int keyLength = 10;
        CharArray keyArray = new CharArray(keyLength);
        String newKey = keyArray.getCharacterArrayAsString();
        System.out.println(newKey);

        // create new one time password
        OneTimePad newUser = new OneTimePad(newKey);
        // now encrypt password (this should be less than keyArray)
        boolean validPassword = false;
        String password = null;

        while (!validPassword){
            System.out.println("Enter a password: ");
            password = scanner.nextLine();

            if (password.length() > newKey.length()){
                System.out.println("password must be less than "+ keyLength +" characters long!");
            }else{
                validPassword = true;

            }

        }
        System.out.println("Encrypt");
        String encrypted = newUser.encrypt(password);
        System.out.println(encrypted);
        System.out.println("Decrypt");
        System.out.println(newUser.encrypt(encrypted));
    }
}
