package w4.ie.atu.sw;

import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("student from runner: " + s1); // we got a cool ahhhh package ID

        // access some data and modify
        s1.sid = 123;
        s1.name = "Joe Biden";
        s1.dateOfRegistration = LocalDate.now();

        // calling the methods - here we can see that using methods, we can change class variables
        System.out.println(s1.registered);
        int ageOfRegistration = 17;
        s1.register(ageOfRegistration);
        System.out.println(s1.registered);

        // running other methods in class
        s1.study();
        s1.execute();

        // access some more data
        System.out.println(s1.sid);
        System.out.println(s1.name);
        System.out.println(s1.dateOfRegistration);

        // can this student drink?
        Bottles.drink(s1.age, 2);

        // make a new student
        Student s2 = new Student();
        s2.sid = 321;
        s2.name = "Mega Biden";
        s2.dateOfRegistration = LocalDate.now();

        s2.register(21);
        Bottles.drink(s2.age, 10);
    }
}
