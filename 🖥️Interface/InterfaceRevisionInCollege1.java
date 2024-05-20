interface A {
    void show();
}
// INTERFACE KO BHI EXTENDS KAR SAKTE HAI HAM ESME JUST LIKE, INTERFACE A extends Interface B 
interface B {
    void human();
}


 // agarhaya par implement nahi hoga show to error deg kyo ki bolta hai ki must
    // be implement in implemented class
    // ek class ak se adhik interface ko bhi implements kar sakta hai bas ek kam
    // karna parega dono class ko implement karna pare value in implemented class

class HumanClass implements A, B {
    @Override
    public void show() {
        System.out.println("In Human Class");
    }

    @Override
    public void human() {
        System.out.println("In Human Class");
    }
}

public class InterfaceRevisionInCollege1 {
    public static void main(String[] args) {

        A hc=new HumanClass();
        // hc.human();  yaha par parent se object create hi nahi hoga child se hoga to esko fix karte hai dekho ACHHA SE 
        hc.show();

        // ref1.human();
        // ref1.show();
    }
}
