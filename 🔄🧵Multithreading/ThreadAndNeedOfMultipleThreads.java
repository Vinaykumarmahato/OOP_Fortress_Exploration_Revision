import java.util.Scanner;

public class ThreadAndNeedOfMultipleThreads {

    public static void main(String[] args) {
        // Imagine a scenario where tasks are like steps in a recipe, and your computer is the chef.

        // One task at a time:
        // - The computer asks you for the first number, then the second number.
        // - It performs the addition, prints the result, and moves on to the next task.

        Scanner input = new Scanner(System.in);

        // Calculation Task:
        System.out.println("Calculation Task Started");
        System.out.println("Enter The First Number");
        int num1 = input.nextInt();

        System.out.println("Enter the Second Number");
        int num2 = input.nextInt();
        int Result = num1 + num2;
        System.out.println("Addition of two numbers is: " + Result);
        System.out.println("Calculation Task Ended");

        // Printing Task:
        System.out.println("-----------------------------------------");
        System.out.println("Printing Task Started!");

        for (int i = 0; i < 8; i++) {
            System.out.println("*");
        }

        System.out.println("Printing Task Ended!");
        System.out.println("-----------------------------------------");

        // Motivation Section:
        System.out.println("Motivation Section Started!");

        for (int i = 0; i < 8; i++) {
            System.out.println("Education is the Key Of Success");
        }

        System.out.println("Motivation Section Ended!");

        /*
         * In this code, we wait for user input, and after getting the input, each task is performed one after another.
         * There's only one thread executing the tasks sequentially.
         * 
         * Now, why do we need multithreading?
         * If we have many tasks and we want to perform them simultaneously, we use the concept of Multithreading.
         * It's like having multiple chefs in the kitchen, each handling a different part of the recipe at the same time.
         */
    }
}
