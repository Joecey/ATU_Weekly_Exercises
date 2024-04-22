package w12.ie.atu.sw;

import static w12.ie.atu.sw.Runner.LogLevel;

public class Runner {
    // NOTE: an enum is a type with a set of predefined grouped constants
    public enum LogLevel{
        // specify your fields here
        INFO (100, "Information"),
        DEBUG (103, "Debug - test only"),
        WARN (199, "Warning. Check Before Continuing"),
        ERROR (500, "Error. Check immediately"),
        FATAL (999, "Fatal Error. Fix immediately");

        // specify field values
        private final int code;
        private final String message;

        // constructor used to set field values
        LogLevel(int code, String message){
            this.code = code;
            this.message = message;
        }

        // then we create methods to access fields
        public int getCode(){
            return  code;
        }

        public String getMessage(){
            return message;
        }
    }

    // example of enums
    public static void main(String[] args) {
        System.out.println("Example of using Enums (constructing and conditional)");
        System.out.println("First, conditionals");
        System.out.println(getWeight(LogLevel.INFO));
        System.out.println(getWeight(LogLevel.DEBUG));
        System.out.println(getWeight(LogLevel.WARN));
        System.out.println(getWeight(LogLevel.ERROR));
        System.out.println(getWeight(LogLevel.FATAL));


        System.out.println("next, looping. use .value() \n");
        LogLevel[] levels = LogLevel.values();
        //enhanced for loop
        for (LogLevel level: levels){
            System.out.println(level.name() + "\t" +
            level.ordinal() + "\t" +
            level.getCode() + "\t" +
            level.getMessage());
        }
    }

    public static int getWeight(LogLevel level){
        return switch (level){
            case INFO, DEBUG -> level.getCode();
            case WARN, ERROR -> level.getCode() + 10;
            case FATAL -> level.getCode() * 10;
        };
    }

}



