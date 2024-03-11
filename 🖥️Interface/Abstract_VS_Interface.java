// Abstract class representing a vehicle
abstract class Vehicle {
    // Common method for all vehicles to start
    public void start() {
        System.out.println("The vehicle is starting.");
    }

    // Abstract method to represent different types of movement
    public abstract void move();
}

// Interface representing features of a vehicle's entertainment system
interface EntertainmentSystem {
    void playMusic();
    void displayVideo();
}

// Concrete class for a car implementing the Vehicle abstract class and EntertainmentSystem interface
class Car extends Vehicle implements EntertainmentSystem {
    @Override
    public void move() {
        System.out.println("The car is moving on the road.");
    }

    @Override
    public void playMusic() {
        System.out.println("The car's music is playing.");
    }

    @Override
    public void displayVideo() {
        System.out.println("The car's video is being displayed.");
    }
}

// Concrete class for an airplane implementing the Vehicle abstract class
class Airplane extends Vehicle {
    @Override
    public void move() {
        System.out.println("The airplane is flying in the sky.");
    }
}

public class Abstract_VS_Interface {
    public static void main(String[] args) {
        // Example usage of the Car class
        Car myCar = new Car();
        myCar.start();
        myCar.move();
        myCar.playMusic();
        myCar.displayVideo();

        System.out.println("-------------------------------------------");

        // Example usage of the Airplane class
        Airplane myAirplane = new Airplane();
        myAirplane.start();
        myAirplane.move();
    }
}
