import java.util.InputMismatchException;
import java.util.Scanner;

public class TryFinallyAndTryWithResources {

    public static void main(String[] args) {

        // Creating a variable to store user input
        int num = 0;

        /*
         * Resource Usage Example: Scanner
         * 
         * In programming, resources can be anything that needs to be managed, like
         * input/output streams. Here, Scanner is a resource, and we need to make sure
         * to close it to release system resources.
         */
        Scanner sc = new Scanner(System.in); // Resource Created

        try {
            /*
             * Critical Statement in Try Block
             * 
             * We put the critical statement (here, reading an integer from the user) in
             * the try block to handle any potential exceptions that may occur during its
             * execution.
             */
            num = sc.nextInt(); // Resource used (this is the Critical statement)

        } catch (InputMismatchException e) {
            /*
             * Exception Handling
             * 
             * If the user does not enter a valid integer, an InputMismatchException will
             * be caught, and a friendly error message will be displayed.
             */
            System.out.println("Please Enter a Number");
        }

        finally {
            /*
             * Finally Block for Resource Cleanup
             * 
             * The finally block ensures that the resource (Scanner) is closed properly to
             * release system resources. It is executed whether an exception occurs or not,
             * making it suitable for resource cleanup.
             */
            sc.close(); /*
                         * Now Exception occurs or not, this finally block will always be
                         * executed. Most of the time, we close resources in the finally block,
                         * whether it is a database connection or any other type of resource.
                         */
        }
    }
}

/*
 * There are some Interview Questions:
 * 
 * (1) Can we Write Catch Block and Finally block without Try Block Ans: No
 * 
 * (2) Can I remove the finally Block? Ans: Yes
 * 
 * (3) Can I remove the catch block? Ans: Yes, we can remove the catch block, but
 * our main aim should be to close the resource, not just handling the exception,
 * as it will not handle the exception when the catch block is removed.
 * 
 * Code word for Vinay: Cafe wala example with account-related.
 */
