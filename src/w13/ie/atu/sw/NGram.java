package w13.ie.atu.sw;

public class NGram {
    private NGram() {
    }

    public static String[] NGramGeneratorAlt(String s, int n) {
        String[] result = new String[(int) (s.length() / n) + 1]; // array has the max number of indexes we need
        int index = -1;
        StringBuilder substring = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % n == 0) {
                if (index >= 0) {
                    result[index] = String.valueOf(substring);
                }
                index++;
                substring.setLength(0);
            }
            substring.append(s.charAt(i));
        }
        result[index] = String.valueOf(substring);
        return result;
    }

    public static String[] NGramGenerator(String s, int n) {
        String[] result = new String[s.length()];
        int index = 0;
        StringBuilder substring = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < Math.min(s.length(),(i+n)); j++) {
                substring.append(s.charAt(j));
            }
            result[index] = String.valueOf(substring);
            substring.setLength(0);
            index++;
        }
        return result;
    }


}
