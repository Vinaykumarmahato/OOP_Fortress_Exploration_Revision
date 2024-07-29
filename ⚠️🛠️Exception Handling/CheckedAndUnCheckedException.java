import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CheckedAndUnCheckedException {
    
    public static void main(String[] args) {
        
        
        int Result = 7 / 0;
        // In this line, the compiler doesn't force you to handle the Exception, and it will show an exception error during runtime.
        // This type of exception is called an Unchecked Exception.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String name = br.readLine();
            // Here, the compiler insists that you handle the Exception, and it will show an exception error during compile time.
            // This type of exception is called a Checked Exception.
        } catch (Exception e) {
            // You can handle the exception here.
        }
        
        /* Now the question is how to know which one is Checked and which one is Unchecked Exception.
         * For this, we need to see the Hierarchy of Exception. Let's see:
         * 
         * Throwable
         *   |- Error
         *   |- Exception
         *        |- RuntimeException (Unchecked) Under the Runtime Exception whatever exception will be all called unchecked Exception
         *        |     |- ArithmeticException (Unchecked)
         *        |     |- NullPointerException (Unchecked)
         *        |     ...
         *        |
         *        |- IOException (Checked)
         *              |- FileNotFoundException (Checked)
         *              ...
         */
    }
}
