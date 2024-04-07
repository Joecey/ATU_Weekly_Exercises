package w11.ie.atu.sw;

import java.util.Arrays;

public class PrimeParser {
    public static void main(String[] args) {
        System.out.println("Week 11 Array Exercises: Prime Parser");
        if (args.length < 1){
            System.out.println("Usage: java w11.ie.atu.sw.PrimeParser 2 3 5 10 ... etc");
        } else{
            int[] validPrimes = new int[args.length];
            int check;
            boolean valid;
            for (int currentIndex = 0; currentIndex < args.length; currentIndex++){
                valid = false;
                check = Integer.parseInt(args[currentIndex]);
                // loop way of checking for prime (prime has to be greater than 1)
                if (check > 1){
                    valid = true;
                    for (int i=2; i <= check; i++){
                        // is i not check?
                        // is checked divisible by 1
                        if (i != check && check % i == 0){
                            valid = false;
                            break;
                        }
                    }

                }
                if (valid){
                    validPrimes[currentIndex] = check;
                }
            }
            // convert to string and show valid primes
            System.out.println(Arrays.toString(validPrimes));
        }
    }
}
