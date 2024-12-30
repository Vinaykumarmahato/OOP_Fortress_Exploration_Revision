class Aeroplane {

    public void TakeOff() {

        System.out.println("Aeroplane is Taking Off");
    }

    public void Fly() {

        System.out.println("Aeroplane is flying");
    }

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

public class DynamicPolymorphism {

    public static void main(String[] args) {

        // Aeroplane onj=new Aeroplane();

        // CargoPlane cp = new CargoPlane();
        /*
         * when we create the object then we should write same class both side
         * as "CargoPlane cp = new CargoPlane(); "
         * But there is a case when we can change,
         * 
         * with the parent class we can change it
         * 
         */
        // Aeroplane cp=new CargoPlane();
        // cp.TakeOff();
        // cp.Fly();
        // PassengerPlane pl = new PassengerPlane();
        // pl.TakeOff();
        // pl.Fly();

        /*
         * Now i want to call TakeOff() Method one time and Fly
         * method One time and it should be execute multiple time according to user need
         * (PolyMorphism)
         */
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();

        Aeroplane ref;
        ref = cp;
        ref.TakeOff(); // we are calling same method takeoff() and Fly()
        ref.Fly();
        System.out.println("--------------------------------------------------------------------------");
        ref = pp;
        ref.TakeOff(); // here also we are calling same method takeoff() and Fly() it means same things
                       // calling in many format that is called polymorphism. it is possible here due to method Overriding.
                       // but we write polymorphism for reduce the code but here we are not doing that lets see in another example 
        ref.Fly();

    }

}
