package w4.ie.atu.sw;

import java.time.LocalDate;

public class Student {
    // define some instance variables - ALWAYS PRIVATE
    private long sid; // instance variable as public is kinda cringe
    private String name = "Undefined";
    private LocalDate dateOfRegistration;
    private boolean registered = false;
    private int age;

    // this constructor method should always be the same name as the class
    public Student() {
        System.out.println("The id of the studnet is: " + this);
    }

    // create some methods (use alt+insert to creater setters and getters)
    public void setSid(long sid) {
        this.sid = sid;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDateOfRegistration(LocalDate dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public long getSid() {
        return sid;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfRegistration() {
        return dateOfRegistration;
    }

    public boolean isRegistered() {
        return registered;
    }

    public int getAge() {
        return age;
    }

    public void register(int studentAge){
        this.registered = true;
        this.age = studentAge;
        System.out.println("student is now registered");
    }

    protected void study(){
        System.out.println("Studying...");
    }

    public void execute(){
        System.out.println("Execute");
    }
}
