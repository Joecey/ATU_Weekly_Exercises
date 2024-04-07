package w11.ie.atu.sw;

public class Runner {
    public static void main(String[] args) {
        // **** Using numbers in arrays ***
        System.out.println("Week 11");
        int[] numbers = {1,3,5,7,8};
        int targetNumber = 10;

        print(numbers);
        System.out.println(targetNumber + " is located at index " + ArrayFunctions.FindInIntArray(numbers, targetNumber));

        // now let's add 10 to the end of the array
        int[] uberNumbers = new int[numbers.length + 1];
        for (int i = 0; i < numbers.length; i++){
            uberNumbers[i] = numbers[i];
        }
        uberNumbers[uberNumbers.length - 1] = 10;
        print(uberNumbers);
        System.out.println(targetNumber + " is located at index " + ArrayFunctions.FindInIntArray(uberNumbers, targetNumber));

        int[] randomArray = ArrayFunctions.generateRandom(4);
        print(randomArray);

        // *** using characters in arrays - get parmeters from main args***
        if (args.length>0){
            CharArray randomChar = new CharArray(Integer.parseInt(args[0]));
            System.out.println(randomChar.getCharacterArrayAsString());
        }else {
            System.out.println("Incorrect Usage, please use: java ie.atu.sw.Runner <CharArraySize>");
        }

    }
    private static void print(int[] nums){
        for (int num : nums) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }

}
