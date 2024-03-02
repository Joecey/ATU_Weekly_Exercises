package w6.ie.atu.sw;

import java.util.Scanner;

public class AreaCalculator {
    // Instance variables
    private final Scanner scanner; // used to take in stuff from console (make final)
//    private boolean running = true; // use this to implement constant area calculator

    public AreaCalculator(){
        scanner = new Scanner(System.in); // read from console now
        init();
        processInput();
    };

    public void calculateCircle(){
        System.out.println("Calculating circle...");
    }

    public void calculateTriangle(){
        System.out.println("Calculating triangle...");
    }

    // handle scanner input
    private void processInput(){
        int option = Integer.parseInt(scanner.next());
        if (option == 1){
            calculateCircle();
        }

        else if (option == 2){
            calculateTriangle();
        }
        else{
            System.out.println("Exiting...");
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
