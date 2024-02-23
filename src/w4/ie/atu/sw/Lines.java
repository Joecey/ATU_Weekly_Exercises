package w4.ie.atu.sw;

public class Lines {
    // example of recurssion in action
    public static void nLines(int n){
        // if n is equal to or less than zero, stop printing lines
        if (n > 0){
            // else, print a line, then repeat this function with (n-1)
            System.out.println();
            nLines(n-1);
        }
    }
}
