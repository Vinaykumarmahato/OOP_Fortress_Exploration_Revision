
/* Interface is similar to the abstract method which is used to achieve 100% Abstraction
 * we can't create a object of interface in interface.
 * No constructor in interface
 * 
 */

interface A {

   public static final int num = 20; //  by default it will be public static final 

    void show();

}

public class InterfaceExplanation {
    public static void main(String[] args) {
        

        System.out.println(A.num);

    }

}
