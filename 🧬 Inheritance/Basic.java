
class Human {

    void sleep() {

        System.out.println("Human Need Good Sleep");
    }

}

class Student extends Human {

    /*
     * when we will call this class with another class from which class this class
     * is extends , all the properties
     * of the first class will be in the second class.
     * 
     * 
     * here this is also called as code Reusability
     * 
     * 
     * 
     */

}

public class Basic {

    public static void main(String[] args) {

        Student obj = new Student();
        obj.sleep();

    }

}
