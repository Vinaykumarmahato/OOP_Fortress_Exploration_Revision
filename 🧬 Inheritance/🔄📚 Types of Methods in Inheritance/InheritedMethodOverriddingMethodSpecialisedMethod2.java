// Base class 'Car' with two methods.
class Car {

    // Method to simulate a car running fast.
    public void CarRunFast() {
        System.out.println("Car can run Fast");
    }

    // Method to simulate a car running slow.
    public void CarRunSlow() {
        System.out.println("Car can Run Slow");
    }
}

// 'BMW' class that extends 'Car' and overrides its methods.
class BMW extends Car {

    // Overridden method to provide a specific implementation for BMW.
    @Override
    public void CarRunFast() {
        System.out.println("BMW is a faster Car");
    }

    // Overridden method to provide a specific implementation for BMW.
    @Override
    public void CarRunSlow() {
        System.out.println("BM sometimes Runs Slow");
    }
}

// 'Bugatti' class that extends 'Car' and overrides one of its methods.
class Bugatti extends Car {

    // Overridden method to provide a specific implementation for Bugatti.
    @Override
    public void CarRunFast(){
        System.out.println("Bugatti is a nice car");
    }
}

// Main class with the 'main' method to run the program.
public class InheritedMethodOverriddingMethodSpecialisedMethod2 {

    public static void main(String[] args) {

        // Creating an object 'c' of type 'Car' but pointing to a 'BMW' instance.
        Car c = new BMW();
        // Creating an object 'b' of type 'BMW'.
        BMW b = new BMW();

        // Calling methods on the 'BMW' instance 'b'.
        b.CarRunFast(); // Outputs: BMW is a faster Car
        b.CarRunSlow(); // Outputs: BM sometimes Runs Slow

        // Calling methods on the 'Car' reference 'c' pointing to a 'BMW' instance.
        c.CarRunFast(); // Outputs: BMW is a faster Car
        c.CarRunSlow(); // Outputs: BM sometimes Runs Slow
    }
}
