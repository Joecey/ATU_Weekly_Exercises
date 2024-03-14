package w6.ie.atu.sw;

public class BoolCheck {
    private BoolCheck(){}

    public static void main(String[] args) {
        boolean result = !('S' > 65) || !(!false);

        System.out.println(result);
        long t = 13000000000L; // if you're using long value, don't forget L suffix
        double b = t / 2.00754d;
        System.out.println(b);

        short t2 = 6500;
        float b2 = t2 / 2.7f;
        System.out.println(b2);

    }
}
