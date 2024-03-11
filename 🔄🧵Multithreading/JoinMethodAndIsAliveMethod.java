class Printing implements Runnable {

    // The run method is overridden to define the thread's behavior
    public void run() {
        try {
            // Loop to print a message and sleep for 2 seconds, repeated twice
            for (int i = 0; i < 2; i++) {
                System.out.println("Education is the most powerful weapon which you can use to Change The world.");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            // Handle InterruptedException if it occurs
            System.out.println("Some Problem Occurred in the Thread!");
        }
    }
}

public class JoinMethodAndIsAliveMethod {

    public static void main(String[] args) throws Exception {
        System.out.println("Main Thread Started!");

        // Creating an instance of the Printing class that implements Runnable
        Printing p = new Printing();

        // Creating a new thread associated with the Printing instance
        Thread t1 = new Thread(p);

        // Checking if the thread is alive before starting (should be false)
        System.out.println(t1.isAlive()); // Output: false

        // Starting the thread, now it should be alive
        t1.start();
        
        // Checking if the thread is alive after starting (should be true)
        System.out.println(t1.isAlive()); // Output: true

        // Using join() to wait for the t1 thread to finish before proceeding with the main thread
        t1.join();

        System.out.println("Main Thread Ended!");
    }
}
