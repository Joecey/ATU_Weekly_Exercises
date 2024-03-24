package w9.ie.atu.sw;

public class SwitchExample {
    private SwitchExample(){};

    public static void RunExtendedExample(String name){
        switch (name){
            case "Joe" -> System.out.println(name + " Is cringe");
            case "Alex" -> System.out.println(name + " Is still playing league of legends");
            case "Kevin" -> System.out.println(name + " Still mentally challenged and eating crayons");
            case "Evan" -> System.out.println(name +" Isn't back yet");
            default -> {System.out.println("That's weird, this person is not on the list");
                System.out.println("They must be a nice person");}
        }
    }
}
