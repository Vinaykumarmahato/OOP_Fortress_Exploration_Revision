class Library implements Runnable {

    String Resource1 = new String("Java");
    String Resource2 = new String("SQL");
    String Resource3 = new String("DSA");

    public void run() {

        String name = Thread.currentThread().getName();

        if (name.equals("Vinay")) {
            try {
                Thread.sleep(2000);
                synchronized (Resource1) {
                    System.out.println("Vinay has acquired: " + Resource1);
                    Thread.sleep(2000);
                    synchronized (Resource2) {
                        System.out.println("Vinay has acquired: " + Resource2);
                        Thread.sleep(2000);
                        synchronized (Resource3) {
                            System.out.println("Vinay has acquired: " + Resource3);
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Some problem");
            }
        } else if (name.equals("Rohit")) {
            try {
                Thread.sleep(2000);
                synchronized (Resource3) {
                    System.out.println("Rohit has acquired: " + Resource3);
                    Thread.sleep(2000);
                    synchronized (Resource2) {
                        System.out.println("Rohit has acquired: " + Resource2);
                        Thread.sleep(2000);
                        synchronized (Resource1) {
                            System.out.println("Rohit has acquired: " + Resource1);
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Some problem");
            }
        }
    }
}

public class DeadLockInjava {

    public static void main(String[] args) {

        Library Lib = new Library();

        Thread t1 = new Thread(Lib);
        Thread t2 = new Thread(Lib);
        t1.setName("Vinay");
        t2.setName("Rohit");
        t1.start();
        t2.start();
    }
}


// This code simulates a potential real-life deadlock situation using a scenario where two threads, "Vinay" and "Rohit," attempt to acquire resources in a specific order. The program is designed to demonstrate how a deadlock can occur in a multi-threaded environment when synchronization is not handled correctly.

// step-by-step explanation of the code:

// 1. Library Class (`Runnable`):
//    - The `Library` class implements the `Runnable` interface, indicating that it can be executed by a thread.
//    - It has three resources (`Resource1`, `Resource2`, and `Resource3`), which represent objects that both "Vinay" and "Rohit" want to acquire.

// 2. **`run()` Method:**
//    - The `run` method is where the logic for each thread's execution is defined.
//    - It starts by getting the name of the current thread (`Vinay` or `Rohit`).
//    - If the thread is named "Vinay," it attempts to acquire `Resource1`, then `Resource2`, and finally `Resource3`.
//    - If the thread is named "Rohit," it attempts to acquire `Resource3`, then `Resource2`, and finally `Resource1`.

// 3. `main` Method (in `DeadLockInjava` class):
//    - The `main` method creates an instance of the `Library` class (`Lib`).
//    - It creates two threads (`t1` and `t2`) using the same instance of `Library`.
//    - The names of the threads are set to "Vinay" and "Rohit" using `setName`.
//    - Both threads are started simultaneously using `start()`.

// Now, let's analyze why this code can lead to a deadlock:

// - If `t1` and `t2` start simultaneously:
//   - `t1` acquires `Resource1`, and `t2` acquires `Resource3`.
//   - `t1` then attempts to acquire `Resource2`, but `t2` already holds it.
//   - Simultaneously, `t2` attempts to acquire `Resource2`, but `t1` already holds it.
//   - Both threads are now waiting for each other to release resources, leading to a cyclic dependency and a deadlock.

