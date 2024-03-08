
interface A {
    // void config(){

    // here it will give the errors so lets see the solution.
    // }
    void show();

    default void config() {

        System.out.println("In Config Method!");
    }

    static public void abc() {

        System.out.println("In abc Method!");

    }
}

class mainform implements A{
    public void show(){
        System.out.println(" In Show Method!");
    }
}

public class How_Can_We_Define_Method_In_Interface_Lets_see {

    public static void main(String[] args) {

        // This is java 8 Feature

        A.abc();// its not giving the error because it is abc is a static method

        // A.config(); // now it will give the error because it is a non static method
        // how to fix it lets see. in this situation we need to create the new class and
        // then we will call that method which we are trying to access in the main
        // method
        mainform obj=new mainform();
        obj.show();
        obj.config();



    }
}
