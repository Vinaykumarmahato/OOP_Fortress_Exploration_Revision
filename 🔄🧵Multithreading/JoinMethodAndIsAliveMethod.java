class Printing implements Runnable {

    public void run() {

        
            try {
                for (int i = 0; i < 2; i++) {
                    System.out.println("Education is the most powerful weapon which you can use to Change The world.");
                Thread.sleep(2000);
            } 
            
            }
            catch (InterruptedException e) {
                System.out.println("Some Problem Occured in the Thread!");
        }
    }
}

public class JoinMethodAndIsAliveMethod {

    public static void main(String[] args)throws Exception {

        System.out.println("Main Thread Started!");

        Printing p=new Printing();
        Thread t1=new Thread(p);
        System.out.println(t1.isAlive());// (O/p False) it is used to check the Thread is Alive or Not.

        t1.start();
        System.out.println(t1.isAlive());// (O/p True) it is used to check the Thread is Alive or Not.

        t1.join();// it used to Stop the Excution of the Main Thread until the
        // t1 Thread is not Finished.


        System.out.println("Main Thread Ended!");

    }
}
