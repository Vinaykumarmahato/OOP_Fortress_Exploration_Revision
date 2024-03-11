
public class MainThreadInJava {
    
    public static void main(String[] args) {

        System.out.println("Main Thread!");
        System.out.println("Before Changing");

        // This is main thread which is by default Created in java
       String name1= Thread.currentThread().getName();
       System.out.println("Name of The Thread is: "+name1);
       System.out.println("The Priority of main thread is:"+Thread.currentThread().getPriority());
       /* Can i change the name of the thread and priority of the thread 
        * The answer is yes we can do it
        */

        System.out.println("After Changing");
        Thread t=Thread.currentThread();
        t.setName("My Thread");
        t.setPriority(9);
        String name2= Thread.currentThread().getName();
       System.out.println("Name of The Thread is: "+name);
       System.out.println("The Priority of main thread is:"+Thread.currentThread().getPriority());
        
    }
}
