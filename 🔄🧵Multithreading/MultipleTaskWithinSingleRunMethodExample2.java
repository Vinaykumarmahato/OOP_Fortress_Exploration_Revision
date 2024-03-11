import java.util.Scanner;

class MyThread extends Thread{

    public void run() {

        String name= Thread.currentThread().getName();
        System.out.println(name+"is Runniing");
        if (name.equals("MyThread")) {
            System.out.println("This is an important message");
            
        }

       else if(name.equals("Calculation")){
            calculator();
        }
        else if(name.equals("StudentInputTake")){
            StudentInputTake();
        }
        else if(name.equals("PrintTenTimeILoveYou")){

            PrintTenTimeILoveYou();
        }

        else if(name.equals("HelloWorld")){
            HelloWorld();
        }
    }


    

    public void calculator() {
        System.out.println("Thread is running");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("The sum of two numbers is: " + c);
    }

    public void StudentInputTake() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the student");
        String name = scan.nextLine();
        System.out.println("Enter the roll number of the student");
        int roll = scan.nextInt();
        System.out.println("Enter the marks of the student");
        int marks = scan.nextInt();
        System.out.println("The name of the student is: " + name);
        System.out.println("The roll number of the student is: " + roll);
        System.out.println("The marks of the student is: " + marks);
    }

    public void PrintTenTimeILoveYou() {
        for (int i = 0; i < 10; i++) {
            System.out.println("I love you");
        }
    }

    public void HelloWorld() {
        System.out.println("Hello World");
    }

}

public class MultipleTaskWithinSingleRunMethodExample2 {

    public static void main(String[] args) {

        MyThread m=new MyThread();

        MyThread Thread1 = new MyThread();
        MyThread Thread2 = new MyThread();
        MyThread Thread3 = new MyThread();
        MyThread Thread4=new MyThread();
        m.setName("MyThread");
        Thread1.setName("Calculator");
        Thread2.setName("StudentInputTake");
        Thread3.setName("PrintTenTimeILoveYou");
        Thread4.setName("HelloWorld");

        m.start();
        Thread1.start();
        Thread2.start();
        Thread3.start();
        Thread4.start();
        

        

    }
}
