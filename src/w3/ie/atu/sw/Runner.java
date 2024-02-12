package w3.ie.atu.sw;

/* calling this Runner as good practice as this will
be the program that will run our final program
 */
public class Runner {
    public static void main(String[] args) {
        byte b = 65; //8 bits in a byte
        int i = b; // an int is 32 bits
        float f = i; // a float is 32 bits with 7-9 p.o.d percision
        long l = (long) f; // long is 64 bits (no p.o.d percision) - requires casting
        double d = l; // 64-bit number with 16-19 p.o.d
        char c = (char) d; // a char has 16 bits (required casting)

        System.out.println("Result: " + c);
        c++;
        System.out.println("Result: " + c);

    }
}
