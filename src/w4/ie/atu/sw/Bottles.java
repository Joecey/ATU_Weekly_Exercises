package w4.ie.atu.sw;

/*
This program will be used to
* */
public class Bottles {
    // STATIC = means that method belongs to class, rather than a single instance of a class
    public static void drink(int studentAge, int bottles) {
        System.out.println("This student is " + studentAge);
        Lines.nLines(2);
        if (studentAge < 18){
            System.out.println("This student is too young to drink...Too bad!");
            Lines.nLines(2);
        } else {
            System.out.println("This student can drink!");
            Lines.nLines(1);
            System.out.println("They have ordered " + bottles + " bottles of beer");
            Lines.nLines(2);
            bottleSong(bottles);
        }
    }

    public static void bottleSong(int n){
        if (n == 0){
            System.out.println("No bottles of beer on the wall, no bottles of beer, ya’ can’t take\n" +
                    "one down, ya’ can’t pass it around, ’cause there are no more\n" +
                    "bottles of beer on the wall!");
            Lines.nLines(1);
        } else {
            System.out.println(n + " bottles of beer on the wall, 99 bottles of beer, ya’ take one\n" +
                    "down, ya’ pass it around, " + (n-1) + " bottles of beer on the wall.");
            Lines.nLines(1);
            bottleSong(n-1);
        }
    }
}
