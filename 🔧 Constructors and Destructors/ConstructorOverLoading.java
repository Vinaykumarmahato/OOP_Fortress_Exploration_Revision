
class Student {

    private String name;
    private int age;


    
    public Student() {
        System.out.println("Default Constructor is called");

        name = "Vinay Kumar";
        age = 21;
    }

    public Student(String name) {
        System.out.println("Parameterized Constructor is called");
        this.name = name;
        age = 19;
    }

    public Student(String name, int age) {

        this.name = name;
        this.age = age;

    }

    public void dis() {
        System.out.println(age);
        System.out.println(name);
    }
}

public class ConstructorOverLoading {

    public static void main(String[] args) {

        Student obj1 = new Student();
        obj1.dis();

        Student obj2 = new Student("Vinay Kumar");
        obj2.dis();

        Student obj3 = new Student("Arjun Sahani", 22);
        obj3.dis();
        // writing different constructor with different parametters and same name of
        // Constructor called as constructor overloading

    }
}
