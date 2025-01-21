// Define a class named 'Helicopter'
class Helicopter {

    // Method for taking off
    public void takeoff() {
        System.out.println("Helicopter is Taking Off");
    }

    // Method for flying
    public void Fly() {
        System.out.println("Helicopter is Flying in the Sky");
    }

}

// Define a class named 'GoodHelicopter' that extends 'Helicopter'
class GoodHelicopter extends Helicopter {

    // Override the 'takeoff' method for 'GoodHelicopter'
    public void takeoff() {
        System.out.println("Good Helicopter Taking Off");
    }

    // Override the 'Fly' method for 'GoodHelicopter'
    public void Fly() {
        System.out.println("Good Helicopter flies at medium height");
    }
}

// Define a class named 'BadHelicopter' that also extends 'Helicopter'
class BadHelicopter extends Helicopter {

    // Override the 'takeoff' method for 'BadHelicopter'
    public void takeoff() {
        System.out.println("Bad Helicopter taking off");
    }

    // Override the 'Fly' method for 'BadHelicopter'
    public void Fly() {
        System.out.println("Bad Helicopter flies at Lower height");
    }
}

// Define a class named 'Airport'
class Airport{

    // Method that demonstrates polymorphism using a 'Helicopter' reference
    public void PolyMorphism(Helicopter Reference){
        // The type of the actual object determines which method is called
        Reference.takeoff();
        Reference.Fly();

        // Print a separator line
        System.out.println("--------------------------------------------");
    }
}

// Define the main class 'RunTimePolyMorhism'
public class RunTimePolyMorhism {

    // Main method where the program execution begins
    public static void main(String[] args) {

        // Create an instance of 'BadHelicopter'
        BadHelicopter bh=new BadHelicopter();
        // Create an instance of 'GoodHelicopter'
        GoodHelicopter gh=new GoodHelicopter();

        // Create an instance of 'Airport'
        Airport a=new Airport();
        // Call the 'PolyMorphism' method with a 'BadHelicopter' reference
        a.PolyMorphism(bh);
        // Call the 'PolyMorphism' method with a 'GoodHelicopter' reference
        a.PolyMorphism(gh);
    }
}
