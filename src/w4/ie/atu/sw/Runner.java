package w4.ie.atu.sw;

import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("student from runner: " + s1); // we got a cool ahhhh package ID


        // access some data and modify
        s1.setName("Big Wang");
        s1.setDateOfRegistration(LocalDate.now());
        s1.setSid(123);


        // calling the methods - here we can see that using methods, we can change class variables
//        System.out.println(s1.registered);
        int ageOfRegistration = 17;
        s1.register(ageOfRegistration);
//        System.out.println(s1.registered);

        // running other methods in class
        s1.study();
        s1.execute();

        // can this student drink?
        Bottles.drink(s1.getAge(), 2);

        // make a new student so they can
        Student s2 = new Student();

        s1.setName("Small Wang");
        s1.setDateOfRegistration(LocalDate.now());
        s1.setSid(321);
        s2.register(21);
        Bottles.drink(s2.getAge(), 10);
    }
}
