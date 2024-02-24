package w5.ie.atu.sw;

import java.time.LocalDate;

public class StudentNew {
    private long sid;
    private String name = "Undefined";
    private LocalDate dateOfRegistation;
    private boolean registered = false;

    public StudentNew (int sidNew, String name, LocalDate dateOfRegistration){
        setSid(sidNew);
        setName(name);
        setDateOfRegistration(dateOfRegistration);
        System.out.println("Created new student with Class ID: " + this);

    }

    public void setSid(long sid) {
        this.sid = sid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfRegistration(LocalDate dateOfRegistration) {
        this.dateOfRegistation = dateOfRegistration;
    }

    public void setRegistered() {
        this.registered = true;
        System.out.println("registered: " + this.name);
    }

    public long getSid() {
        return sid;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfRegistation() {
        return dateOfRegistation;
    }

    public boolean isRegistered() {
        return registered;
    }

    protected String study(double hours, int level){
        double total = hours * level;
        return (this.name + " is doing a total study of " + total);
    }

    protected boolean exclaimCheck(String command){
        System.out.println("Execute " + command);

        return command.endsWith("!");
    }
}
