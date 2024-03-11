/*
Handling Vs Ducking in java
 * Assume we have one main class from there the execution of the code will be Start
 * and also we have create multiple method 
 * Such as:
 * a()
 * b()
 * c()
 * 
 * assume we have also created this three method and each method will have body in that also will be the operation 
 * 
 * ok lets assume in 'c()' Method we are having an exception but we don't want to handle in 'c()'
 * we are saying hey method b() you are calling me  you can handle it , like wise all the method will say and finally 
 * if noone will handle then it gives the error and this scenario called as ducking.
 */

class Demo {

    public void a() {

    }

    public void b() { throw Exception // this will be used for says the method b() hey man just handle this i will not handle this exception 

        c();
    }

    public void c(){ 

        int num1=10;
        int num2=0;
        try{
            int Result=num1 / num2;
        System.out.println(Result);
        }
        catch(ArithmeticException e){
            System.out.println("Error.."+e.getMessage());
        }

    }
}

public class HandlingVsDuckingException {

    public static void main(String[] args) {

        Demo obj = new Demo();
        obj.b();

    }
}
