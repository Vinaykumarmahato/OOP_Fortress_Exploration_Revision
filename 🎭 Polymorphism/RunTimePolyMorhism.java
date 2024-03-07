class Helicopter {

    public void takeoff() {
        System.out.println("Helicopter is Taking Off");
    }

    public void Fly() {

        System.out.println("Helicopter is Flying in the Sky");
    }

}

class GoodHelicopter extends Helicopter {

    public void takeoff() {

        System.out.println("Good Helicopter Taking Off");
    }

    public void Fly() {
        System.out.println("Good Helicopter flies at medium height");

    }
}

class BadHelicopter extends Helicopter {

    public void takeoff() {

        System.out.println("Bad Helicopter taking off");

    }

    public void Fly() {
        System.out.println("Bad Helicopter flies at Lower height");

    }

}

class Airport{

    public void PolyMorphism(Helicopter Reference){

        Reference.takeoff();
        Reference.Fly();

        System.out.println("--------------------------------------------");
    }
}

public class RunTimePolyMorhism {

    public static void main(String[] args) {

        BadHelicopter bh=new BadHelicopter();
        GoodHelicopter gh=new GoodHelicopter();


        Airport a=new Airport();
        a.PolyMorphism(bh);
        a.PolyMorphism(gh);


    }
}
