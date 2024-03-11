// A class implementing the Runnable interface
class Example implements Runnable {

    // The run method is overridden to define the thread's behavior
    public void run() {
        // Loop to print a message and sleep for 3 seconds, repeated 3 times
        for (int i = 0; i < 3; i++) {
            System.out.println("Education is the key to success!");

            // Try to sleep the thread for 3 seconds
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // Handle InterruptedException if it occurs
                System.out.println("Thread is Interrupted");
            }
        }
    }
}

// Main class to demonstrate the use of interrupt()
public class InterruptMethod {

    public static void main(String[] args) {

        // Creating an instance of the Example class that implements Runnable
        Example E = new Example();

        // Creating a new thread associated with the Example instance
        Thread t1 = new Thread(E);

        // Starting the thread
        t1.start();

        // Interrupting the thread when it is in Waiting State or Running State
        t1.interrupt();
    }
}
