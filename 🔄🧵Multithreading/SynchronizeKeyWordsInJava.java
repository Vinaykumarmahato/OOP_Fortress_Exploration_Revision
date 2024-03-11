
class Car implements Runnable {

    synchronized public void run() {
        try {

            System.out.println(Thread.currentThread().getName() + "has Entered the parking lot");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + "Got into car to Drive");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + "Started to Drive The Car");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + "Came Back and Parked The Car");
        } catch (Exception e) {
            System.out.println("Some Problem!");
        }
    }
}

public class SynchronizeKeyWordsInJava {

    public static void main(String[] args) {

        Car c = new Car();

        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);
        t1.setName("Son-1");
        t2.setName("Son-2");
        t3.setName("Son-3");

        t1.start();
        t2.start();
        t3.start();

        /*
         * Whenever we will have one resource and that single resource will be
         * Executed by the Multilple Threads then we will get the Inlogical Output.
         * To Overcome this Problem we will use the Synchronized Keyword.
         * 
         * Technically it is also called as Race condition problem.multiple thread
         * will be execute the same resource at the same time.
         * 
         * for Overcome this problem we use Synchronized keyword
         */

        /*
         * OutPut;
         * Son-1has Entered the parking lot
         * Son-1Got into car to Drive
         * Son-1Started to Drive The Car
         * Son-1Came Back and Parked The Car
         * Son-3has Entered the parking lot
         * Son-3Got into car to Drive
         * Son-3Started to Drive The Car
         * Son-3Came Back and Parked The Car
         * Son-2has Entered the parking lot
         * Son-2Got into car to Drive
         * Son-2Started to Drive The Car
         * Son-2Came Back and Parked The Car
         */

    }
}
