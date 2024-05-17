
abstract class Aeroplane {

    abstract public void fly();
    abstract public void takeoff();

    public void landing(){
        System.out.println("Aeroplane is landing.......");
    }

    // in this situation , aap kabhi bhi 100% abstraction achieve nahi kar paoge
    //  kyo ki es class me abstract method bhi haiaur non abstract method bhi hai
    // Variable ko abstract nahi bana sakte hai
    // constructor ko bhi abstract nahi bana sakte hai kyo usme super method call 
    // hota hai jisme boddy hota hai jabki abstract class me jo method hoga uska body nahi hoga


}

class Cargoplane extends Aeroplane{

    @Override
    public void fly() {
       System.out.println("Cargoplane is flying");
    }

    @Override
    public void takeoff() {
       System.out.println("Cargoplane is Taking Off");
    }

}

class passengerplane extends Aeroplane{

    @Override
    public void fly() {
        System.out.println("Passenger plane is flying");
    }

    @Override
    public void takeoff() {
        System.out.println("Passenger plane is taking off");
    }

    public void alert(){   // ek aesa method jo parent class  me nahi hai but wo child class me hai to usko specialized method kahte hai.
        System.out.println("Alert.......");
    }
    
}


public class AbstractionRevisionInCollege {
    
    public static void main(String[] args) {

        Aeroplane cr=new Cargoplane();
        cr.fly();
        cr.takeoff();
        cr.landing();

        Aeroplane pl=new passengerplane();
        pl.fly();
        pl.takeoff();
        pl.landing();
        // we cant access the alert method here because here we are creating the parent class object
        // and alert method is not in the parent class .

        //Aeroplane ae=new Aeroplane(); we can not create the object of the abstract class




        
/*
 * Agara hamare pass multiple class hai aur sabhi class parent class ko inherits kiya hai aur parent class me kuchh method hai 
 * jo har child class use kar raha hai usko override kar ke but ho ye raha hai ki sb koe esko edit hi kar raha hai koe bhi 
 * parent class ke method ke implementtation ko use nahi kar raha hai es situation me hmlog parent class ko jo implementation hota hai usko 
 * remove kar sakte hai 
 * but jais ehi remove karenge waise hi us method ko as a abstract declare karna parega 
 * aur jb method abstact hoga to class bhi abstact hota hai .
 * 
 * Abstract method : ek aesa method jiska koe bhi implementation nahi hota hai to usko abstact method kahte hai 
 * 
 * 
 */







    }
}
