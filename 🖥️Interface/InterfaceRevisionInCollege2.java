 interface Computer{

     void CompileCode();

}
class Laptop  implements Computer{

    public void CompileCode() {

        System.out.println("You Got 5 Error in your code please try Again");
    }
}

class Desktop implements Computer{

    public void CompileCode() {

        System.out.println("You Got 5 Error.. Very Faster.........");
    }
}


class Developer {
    public void BuildApp(Computer ref) {
        System.out.println("Building the App Please wait....");
        ref.CompileCode();
     

    }
}

public class InterfaceRevisionInCollege2 {

    public static void main(String[] args) {
        Computer ref=new Desktop();
        Developer dev = new Developer();
        dev.BuildApp(ref);

    }
    /*Interface has three type 
     * 1) Functional Interface 
     * 2) Normal Interface 
     * 3) Marker Interface
     */
}
