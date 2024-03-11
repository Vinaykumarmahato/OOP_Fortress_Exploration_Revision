class MyThread extends Thread{

    public void run(){
        System.out.println("Child Thread");
    }

}

public class HowToCreateThreadInJava {
    
    public static void main(String[] args) {

        /* There are two ways of creating a Thread in Java:
         * 
         * (1) By Extending Thread class
         * (2) By Implementing Runnable Interface
         * 
         * In Java, there is an inbuilt Interface called 'Runnable Interface.'
         * This interface contains several abstract methods that need to be defined.
         * 
         * The Thread class implements the Runnable interface to use the methods available under the Runnable interface.
         * 
         * Thread Scheduler : It is the boss of all the Thread 
         * 
        */

        MyThread t=new MyThread();
        t.run();// if i will write this run method then it will behave as a Single thread 
        t.start();

        
    }
}
