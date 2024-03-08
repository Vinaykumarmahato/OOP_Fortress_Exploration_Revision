// Class inside the class called as inner class.


 // it is member inner class if i will make it as static then it is called as
        // Static inner class.

        /*
         * But there is a question we can make the variable as static , method as a
         * static
         * but can we write class as a static
         * 
         * the answer is yes absolutely we can write if the class will be inner class.
         */
class A {


    void show(){
        System.out.println("In show");
    }

    class B {

        void Dis(){
            System.out.println("In Display");
        }

       

    }

}

/*
 * Inner class has three type
 * member (Non static)
 * static
 * Anonymous
 */

public class InnerClassInJava {

    public static void main(String[] args) {

        A obj = new A();
        obj.show();
    }
}
