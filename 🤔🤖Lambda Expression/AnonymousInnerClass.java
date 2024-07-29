// Define an interface named car with a method drive
interface Car {
    void drive();
}



// Main class demonstrating the usage of an Anonymous Inner Class
public class AnonymousInnerClass {

    public static void main(String[] args) {
        // Create an object of the interface car using an Anonymous Inner Class
        Car obj = new Car() {
            // Implement the drive method of the car interface
            public void drive() {
                System.out.println("Car is ready for Drive");
            }
            // Here, we are not creating an object of the interface directly, but rather
            // creating an object of a class with no name, making it an Anonymous Inner
            // Class.
        };

        // Call the drive method of the Anonymous Inner Class
        obj.drive();
    }
}


// Interface (Car):

// Defines an interface named Car with a method drive.
// Main Class (AnonymousInnerClass):

// Demonstrates the usage of an Anonymous Inner Class.
// Anonymous Inner Class:

// Creates an object (obj) of the Car interface using an Anonymous Inner Class.
// Implements the drive method of the Car interface within the Anonymous Inner Class.
// Here, we are not creating an object of the interface directly but creating an object of a class with no name, making it an Anonymous Inner Class.
