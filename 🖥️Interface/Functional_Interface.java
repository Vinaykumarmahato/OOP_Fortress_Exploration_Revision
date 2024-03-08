// Functional Interface with a single abstract method
@FunctionalInterface
interface MyFunctionalInterface {
    void myAbstractMethod();
}

public class Functional_Interface {

    /*
     * There are three types of Interface in Java:
     * 
     * Single abstract interface: An interface with only one abstract method. In Java 8,
     * this type of interface is referred to as a functional interface.
     * Normal interface: An interface with multiple abstract methods.
     * Marker Interface: An interface with no abstract method.
     */

    public static void main(String[] args) {
        // Using a lambda expression to implement the abstract method
        MyFunctionalInterface myFunctionalInterface = () -> {
            System.out.println("Executing myAbstractMethod");
        };

        // Calling the abstract method through the functional interface
        myFunctionalInterface.myAbstractMethod();
    }
}
