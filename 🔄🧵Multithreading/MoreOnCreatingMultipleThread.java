import java.util.Scanner;

class Calculation extends Thread {
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

class Pattern extends Thread {
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

class Motivation extends Thread {
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

public class MoreOnCreatingMultipleThread {

    public static void main(String[] args) {
        // Main program creating and starting multiple threads

        Calculation threadCalculation = new Calculation();
        Pattern threadPattern = new Pattern();
        Motivation threadMotivation = new Motivation();

        // Start the threads
        threadCalculation.start();
        threadPattern.start();
        threadMotivation.start();

        /*
         * When you run this code, three threads (threadCalculation, threadPattern, and
         * threadMotivation)
         * go to the thread scheduler. The scheduler decides which process to execute
         * based on the
         * time each process takes to complete. The process with less execution time
         * gets executed first.
         * 
         * Threads are also known as lightweight processes.
         */
    }
}
