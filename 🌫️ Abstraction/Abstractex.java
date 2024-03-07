abstract class Aeroplane {

    abstract public void TakeOff();

    abstract public void Fly();

    // abstract int age=20; Variable can not be Abstract

    // Note: Constructor also can not be a abstract because by default include super
    // method and body will be there but in abstract we will not have the body

    public void Landing() {
        System.out.println("Aeroplane is landing");
        // to add this method without abstract then we say that we can not achieve 100%
        // Abstraction but we can do it by Interface
        // in abstract class abstract method and non abstract method both allowed.
    }

    /*
     * In java whenever we write the method without definition without body then we
     * should do it abstract
     * 
     * this bod no-one is using that's why we can remove the method body and make it
     * abstract.
     * 
     * Abstract method: the method which will have only signature not The body then
     * that is called as Abstract Method.
     * 
     * 
     * Note: in java if any method is declared as abstract then must should be Class
     * also as Abstract.
     * 
     * If the Class will be abstract then at least one abstract method should be
     * there.
     * 
     * if you will have a abstract class and method and there is no body then that
     * is called as 100% Abstraction Achieved.
     */

}

class CargoPlane extends Aeroplane {

    public void TakeOff() {
        System.out.println("Cargoplane require longer runway");

    }

    public void Fly() {
        System.out.println("CargoPlane Flies at Lower height");
    }

}

class PassengerPlane extends Aeroplane {

    public void TakeOff() {

        System.out.println("Passenger Plane Require Midium size runway");
    }

    public void Fly() {
        System.out.println("Pasenger Plane flies at Medium Hieght");
    }

}

public class Abstractex {

    public static void main(String[] args) {

        Aeroplane ref1 = new CargoPlane();
        Aeroplane ref2 = new PassengerPlane();

        ref1.TakeOff(); // Using parent type method we can call overridden method, inherited method but
                        // not specialized method.
        ref1.Fly();
        ref1.Landing();
        ((CargoPlane) ref1).alert();// this is called Down Casting in java

        System.out.println("-------------------");

        ref2.TakeOff();
        ref2.Fly();
        ref2.Landing();

        // we can not create the object of a abstract method because the method has no
        // body.
        // Abstract method also a incomplete class Thats why we cant create the object
        // of the abstract method.

    }

}