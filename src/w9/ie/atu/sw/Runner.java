package w9.ie.atu.sw;

import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {
        System.out.println("hello");

        System.out.println(SeasonChecker.getSeason(LocalDate.now()));

        String[] theBoys = {"Joe", "Kevin", "Alex", "Evan", "Obama"};

        for (int i = 0; i < theBoys.length; i++){
            SwitchExample.RunExtendedExample(theBoys[i]);
        }
    }
}
