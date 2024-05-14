


class Student {
    private String name;
    private int age;

    // Default constructor
    public Student() {
        this("Vinay Kumar", 20); // this method ka istemal karke parameterized constructor ko bulaya gaya hai
    }

    // Parameterized constructor with name parameter
    public Student(String name) {
        this(name, 18); // this method ka istemal karke parameterized constructor ko bulaya gaya hai
    }

    // Parameterized constructor with name and age parameters
    public Student(String name, int age) {
        super(); // Parent class ka constructor ko bulane ke liye super ka istemal kiya gaya hai
        this.name = name; // this method ka istemal karke vartaman class ke variable ko refer kiya gaya hai
        this.age = age; // this method ka istemal karke vartaman class ke variable ko refer kiya gaya hai
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class This_vs_Super_method {
    
    public static void main(String[] args)  {
        Student s1 = new Student(); // Default constructor ka istemal kiya gaya hai
        s1.display();
        
        Student s2 = new Student("Vinay"); // Parameterized constructor with name ka istemal kiya gaya hai
        s2.display();
        
        Student s3 = new Student("Vinu", 20); // Parameterized constructor with name and age ka istemal kiya gaya hai
        s3.display();
    }
}





















// class Student {


//     /*how do we call one constructor to another constructor for that we 
//      * use super method and this method
//      * 
//      * super method is used to call the constructor of the parent class
//      * this method is used to call the constructor of the same class
//      */
//     private String name;
//     private int age;

//     public Student() {
//         super();

//         // in the first line when we write the code this supper method behind the 
//         // scene it automatic creates the super method

//         // super(); // Calls the constructor of the parent class (Object class by default)

//         // this(); // Calls the constructor of the same class (Student class in this case

//         // when the this method will be in the code then super method will not be there

//         // 
//         System.out.println("Default constructor is called");
//         name = "Vinay Kumar";
//         age = 20;
//     }

//     public Student(String name) {
//         this.name = name;
//     }

//     public Student(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     public void display() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//     }
// }

// public class This_vs_Super_method {
    
//     public static void main(String[] args)  {

//         Student s1 = new Student();
//         s1.display();
        
//         Student s2 = new Student("Vinay");
//         s2.display();
        
//         Student s3 = new Student("Vinu", 20);
//         s3.display();
//     }
// }
