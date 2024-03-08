// Abstract class representing an electronic device
abstract class ElectronicDevice {
    // Common method for all electronic devices to turn on
    public void turnOn() {
        System.out.println("The electronic device is turning on.");
    }

    // Abstract method to represent different types of interactions
    public abstract void interact();
}

// Interface representing features of a smart device's connectivity
interface SmartConnectivity {
    void connectToWiFi();
    void useBluetooth();
}

// Concrete class for a smartphone implementing the ElectronicDevice abstract class and SmartConnectivity interface
class Smartphone extends ElectronicDevice implements SmartConnectivity {
    @Override
    public void interact() {
        System.out.println("The user is interacting with the smartphone's touchscreen.");
    }

    @Override
    public void connectToWiFi() {
        System.out.println("The smartphone is connected to a WiFi network.");
    }

    @Override
    public void useBluetooth() {
        System.out.println("The smartphone is using Bluetooth for communication.");
    }
}

// Concrete class for a smartwatch implementing the ElectronicDevice abstract class and SmartConnectivity interface
class Smartwatch extends ElectronicDevice implements SmartConnectivity {
    @Override
    public void interact() {
        
        System.out.println("The user is interacting with the smartwatch's small touchscreen.");
    }

    @Override
    public void connectToWiFi() {
        System.out.println("The smartwatch is connected to a WiFi network.");
    }

    @Override
    public void useBluetooth() {
        System.out.println("The smartwatch is using Bluetooth for communication.");
    }
}

public class Abstract_VS_Interface_RealLifeExample {
    public static void main(String[] args) {
        // Example usage of the Smartphone class
        Smartphone myPhone = new Smartphone();
        myPhone.turnOn();
        myPhone.interact();
        myPhone.connectToWiFi();
        myPhone.useBluetooth();

        System.out.println();

        // Example usage of the Smartwatch class
        Smartwatch myWatch = new Smartwatch();
        myWatch.turnOn();
        myWatch.interact();
        myWatch.connectToWiFi();
        myWatch.useBluetooth();
    }
}
