package w11.ie.atu.sw;

public class MainArgs {
    public static void main(String[] args) {
        System.out.println(args + "--->" + args.length);
        // now let's show program parameters
        // run as java w11.ie.atu.sw.MainArgs this is an argument
        for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }

        // if you don't need the index, use a forEach loop
        for (String arg : args) {
            System.out.println(arg);
        }

    }



}
