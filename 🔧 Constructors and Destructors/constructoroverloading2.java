class Student { // Student class starts here

    private String name; // Private variable to store student's name
    private int age; // Private variable to store student's age

    // Default constructor: Initializes name to "Vinay Kumar" and age to 20
    public Student() { // Constructor starts here
        super(); // Calls the constructor of the parent class (Object class by default)
        System.out.println("Default constructor is called"); // Prints a message indicating default constructor is called
        name = "Vinay Kumar"; // Sets the default name
        age = 20; // Sets the default age
    } // Constructor ends here

    // Parameterized constructor: Initializes name with the provided value
    public Student(String name) { // Constructor starts here
        this.name = name; // Assigns the provided name to the instance variable
    } // Constructor ends here

    // Parameterized constructor: Initializes name and age with the provided values
    public Student(String name, int age) { // Constructor starts here
        this.name = name; // Assigns the provided name to the instance variable
        this.age = age; // Assigns the provided age to the instance variable
    } // Constructor ends here

    // Method to display student's name and age
    public void display() { // Method starts here
        System.out.println("Name: " + name); // Prints the student's name
        System.out.println("Age: " + age); // Prints the student's age
    } // Method ends here

} // Student class ends here

public class constructoroverloading2 { // Main class starts here
    
    public static void main(String[] args)  { // Main method starts here

        // Creating Student objects using different constructors and displaying their details

        Student s1 = new Student(); // Creating a Student object using the default constructor
        s1.display(); // Displaying details of s1

        Student s2 = new Student("Vinay"); // Creating a Student object using parameterized constructor with name
        s2.display(); // Displaying details of s2

        Student s3 = new Student("Vinu", 20); // Creating a Student object using parameterized constructor with name and age
        s3.display(); // Displaying details of s3

    } // Main method ends here
} // Main class ends here
