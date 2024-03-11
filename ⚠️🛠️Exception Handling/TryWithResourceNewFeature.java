import java.util.Scanner;

public class TryWithResourceNewFeature {
    
    public static void main(String[] args) {
        /* Try-with-Resources: A Convenient Resource Management Feature
         * 
         * If your intention is solely to close the resource, you can use try-with-resources.
         * This is an upgraded version of the traditional Finally Block, providing cleaner
         * and more concise resource management.
         */
        int num;

        // The Scanner resource is declared within the parentheses of the try statement.
        try (Scanner sc = new Scanner(System.in);) {
            /*
             * Resource Utilization in Try Block
             * 
             * The critical statement (here, reading an integer from the user) is placed in
             * the try block. The resource (Scanner) is automatically closed when the try block
             * is exited, whether normally or due to an exception.
             */
            num = sc.nextInt();
        }

        // Displaying the user input (even if it is the default value of 0)
        System.out.println("User Input: " + num);
    }
}
