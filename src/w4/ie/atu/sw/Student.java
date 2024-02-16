package w4.ie.atu.sw;

import java.time.LocalDate;

public class Student {
    // define some instance variables
    public long sid; // instance variable as public is kinda cringe
    public String name = "Undefined";
    public LocalDate dobi;
    public boolean registered = false;

    // this constructor method should always be the same name as the class
    public Student() {
        System.out.println("The id of the studnet is: " + this);
    }

    // create some methods
    public void register(){
        this.registered = true;
        System.out.println("student is now registered");
    }

    public void study(){
        System.out.println("Studying...");
    }

    public void execute(){
        System.out.println("Execute");
    }
}
