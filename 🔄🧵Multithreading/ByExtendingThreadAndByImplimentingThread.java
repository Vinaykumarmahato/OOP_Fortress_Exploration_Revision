import java.util.Scanner;

class calculator extends Thread implements Runnable{
    public void run(){
        System.out.println("Thread is running");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("The sum of two numbers is: "+c);

    }
    
}

class motivation extends Thread{

    public void run(){
        System.out.println("Education is the key of success");
    }
}

class HelloWorld extends Thread{

    public void run(){
        try{

            System.out.println("Hello World");
        Thread.sleep(2000);

        }
        catch(Exception e){
            System.out.println("Error");
        }
        
    
    }
}

public class ByExtendingThreadAndByImplimentingThread {

    public static void main(String[] args) {

        calculator c = new calculator();

        
        Thread t1=new Thread(c);
        t1.start();

        motivation m = new motivation();
        m.start();

        HelloWorld h = new HelloWorld();
        h.start();
    }
}
