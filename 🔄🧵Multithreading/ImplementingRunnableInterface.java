import java.util.Scanner;

class Calculation implements Runnable {
    public void run() {
        // This thread calculates the sum of two numbers

        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's do some math!");
        
        // Get user input
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();
        int result = num1 + num2;

        // Display the result
        System.out.println("The sum of two numbers is: " + result);

        System.out.println("Math task complete!");
        System.out.println("-----------------------------------------");
    }
}

class Pattern implements Runnable {
    public void run() {
        // This thread prints a simple pattern

        try {
            System.out.println("Creating a pattern...");
            // Print a simple pattern
            for (int i = 0; i < 4; i++) {
                System.out.println("*");
            }
            Thread.sleep(2000); // Pause for 2 seconds

        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Pattern creation complete!");
        System.out.println("-----------------------------------------");
    }
}

class Motivation implements Runnable {
    public void run() {
        // This thread spreads some motivation

        System.out.println("Let's stay motivated!");

        // Print a motivational message
        for (int i = 0; i < 8; i++) {
            System.out.println("Education is the key to success!");
        }

        System.out.println("Motivational session ended!");
    }
}

public class ImplementingRunnableInterface {

    public static void main(String[] args) {
        // Main program creating and starting multiple threads

        Calculation cl = new Calculation();
        Pattern pt= new Pattern();
        Motivation mt = new Motivation();

        // Start the threads
        // threadCalculation.start();
        // threadPattern.start();
        // threadMotivation.start();
        Thread t1=new Thread(cl);
        Thread t2=new Thread(pt);
        Thread t3=new Thread(mt);
        t1.start();
        t2.start();
        t3.start(); 
    }
}
