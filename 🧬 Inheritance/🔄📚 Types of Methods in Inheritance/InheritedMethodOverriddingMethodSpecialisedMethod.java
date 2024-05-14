class Aeroplane {

    public void fly() {

        System.out.println("Aeroplane is Plying");
    }

    public void takeoff() { // this is called overridden method

        System.out.println("Aeroplane is Taking off");
    }

}

class Cargoplane extends Aeroplane { // here inherited method comes , we can not change the parent class info in the
                                     // child class

    // Override method: it is a method that can be used to change the info of the
    // parent class in the child class, Not in parent class from the child class.

    public void fly() { // this is called as Overriding method

        System.out.println("Cargoplane flies at lower hight");
    }

    public void CarryGoods(){ // this method is not in parent calss so it is called as Specialised Method in java.

        System.out.println("Cargoplane is Caring goods");
    }
}

class PassengerPlane extends Aeroplane {

    public void fly(){

        System.out.println("Passenger plane flies at medium Height");
    }

    public void CarryPassenger(){ // this method is not in parent calss so it is called as Specialised Method in java.

        System.out.println("Passengerplane is Caring Passenger"); 
    }

}

// UML : Unified Modeling Language: Pictorial Representation of the Diagram is
// called UML Diagram.
public class InheritedMethodOverriddingMethodSpecialisedMethod {

    public static void main(String[] args) {

        Cargoplane cp = new Cargoplane();
        cp.fly();
        cp.takeoff();

        PassengerPlane pp = new PassengerPlane();
        pp.fly();
        pp.takeoff();

    }

}
