package w11.ie.atu.sw;

import java.util.concurrent.ThreadLocalRandom;

public class ArrayFunctions {
    private ArrayFunctions(){}

    public static int FindInIntArray(int[] intArray, int target) {
        int returnIndex = -1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == target) {
                returnIndex = i;
            }
        }
        return returnIndex;
    }

    public static int[] generateRandom(int arraySize){
        int[] newArray = new int[arraySize];
        ThreadLocalRandom rnd = ThreadLocalRandom.current();

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = rnd.nextInt(1,100);
        }

        return newArray;
    }
}
