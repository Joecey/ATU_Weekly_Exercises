package w6.ie.atu.sw;

import java.util.Scanner;

public class AreaCalculator {
    // Instance variables
    private final Scanner scanner; // used to take in stuff from console (make final)
//    private boolean running = true; // use this to implement constant area calculator

    public AreaCalculator(){
        scanner = new Scanner(System.in); // read from console now = specify scanner as reading from system in
        init();
        processInput();
    };

    public void calculateCircle(){
        System.out.println("Calculating circle... Enter Radius");
        double radius = Double.parseDouble(scanner.next());

        if (radius < 0) {
            System.out.println("Cannot calculate area with negative number");
        } else {
            double area = Math.PI * Math.pow(radius, 2);
            System.out.println("Area of circle is: " + area + " units squared");
        }

    }


    public void calculateTriangle(){
        System.out.println("Calculating triangle...Enter base");
        double base = Double.parseDouble(scanner.next());

        if (base < 0){
            System.out.println("Cannot calculate area with negative number");
            return;
        }
        System.out.println("Calculating triangle...Enter height");
        double height = Double.parseDouble(scanner.next());

        if (height < 0){
            System.out.println("Cannot calculate area with negative number");
        } else {
            double area = 0.5 * base * height;
            System.out.println("Area of triangle is: " + area + " units squared");
        }
    }

    // handle scanner input
    private void processInput(){
        int option = Integer.parseInt(scanner.next());

        switch (option) {
            case 1 -> calculateCircle();
            case 2 -> calculateTriangle();
            case 3 -> System.out.println("Exiting...");
            default -> System.out.println("Invalid selection bozo!!!");
        }
    }
    private void init(){
        System.out.println("-- Area Calculator --");
        NLines.createNLines(1);
        System.out.println("(1) Area of Circle");
        System.out.println("(2) Area of Triangle");
        System.out.println("(3) Quit");
        System.out.println("Select (1-3) > ");

    }
}
