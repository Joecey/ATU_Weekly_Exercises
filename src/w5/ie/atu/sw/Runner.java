package w5.ie.atu.sw;

import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {
        StudentNew s = new StudentNew(123, "Clex Aoober", LocalDate.now());
        s.setRegistered() ;

        double hours = 2.3;
        int level = 25;
        String command = "kjasjhdjklajdaklj!";

        System.out.println(s.study(hours, level));
        System.out.println(s.exclaimCheck(command));
    }
}
