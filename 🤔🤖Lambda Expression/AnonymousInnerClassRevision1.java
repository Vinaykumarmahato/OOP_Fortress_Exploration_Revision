
interface Car{

    void Drive();
}

// class Suzuki implements Car{

//     public void Drive(){
//         System.out.println("Car is Driving....");
//     }
// }

/* Agar koe class bana huaa hai jiska kam hi hai interface ko implement karna aur wo bas ek bar hi use ho raha hai to hm waha pe Anonymous inner class ka use kar sakte hai */
public class AnonymousInnerClassRevision1 {
    
    public static void main(String[] args) {
        
        Car c=new Car()
        
        {

            public void Drive(){
                System.out.println("Driving........");
            }
        };
/*
 * Kya yaha par interface ka object bana hai eska matlb wo sare book galat hai jo bolte hai intyerface ka object nahi ban sakta hai
 * the things is nahi yaha par interface ka object nahi bana hai ,
 * 
 * yaha par object class ka bana hai but ab tum bologe yaha to class hai hi nahi to kaise banahai object ,
 * 
 * Are are bhai yaha pe jo class hai uska koe name nahi hai dikh nahi raha hai es liye usko anonymous class bolte hai
 */
        c.Drive();

    }
}
