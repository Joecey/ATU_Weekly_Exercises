package w4.ie.atu.sw;

import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("student from runner: " + s); // we got a cool ahhhh package ID

        // access some data
        s.sid = 123;
        s.name = "Joe Biden";
        s.dobi = LocalDate.now();

        // calling the methods
        System.out.println(s.registered);
        s.register();
        System.out.println(s.registered);
        s.study();
        s.execute();

        System.out.println(s.sid);
        System.out.println(s.name);
        System.out.println(s.dobi);
    }
}
