


class A {

    String name;
    int age;

    Address add;
    // String City;
    // String state; these three comes under the address so lets merge it how can we do it lets create another class.
    // int pincode;

    // if we don't want to maintain so much of the classes then we can use inner class 

    void show1() {
        System.out.println("In Show1 method!");
    }

    class Address{

        String village;
        String city;
        int pincode;
    }


    class B{
        void show2(){
            System.out.println("In show2 Method!");
        }
    }
}

public class WhyInnerClass {

    public static void main(String[] args) {

        A obj=new A();
        obj.show1();

        A.B obj1=obj.new B();

        obj1.show2();
        

    }
}


// Explanation using comments:

// Outer Class (A):

// Represents a person with basic information like name and age.
// Contains an inner class Address to handle address-related details.
// Also contains another inner class B for specific functionality.
// Inner Class (Address):

// Encapsulates address-related information such as village, city, and pincode.
// Inner Class (B):

// Represents specific functionality related to class A.
// In this case, it has a method show2 to display information.
// Main Class (WhyInnerClass):

// Creates an instance of the outer class A using A obj = new A();.
// Calls the show1 method of the outer class using obj.show1();.
// Creates an instance of the inner class B using A.B obj1 = obj.new B();.
// Calls the show2 method of the inner class using obj1.show2();.