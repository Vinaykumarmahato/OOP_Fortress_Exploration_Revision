class Human {

    public void Sleep() {
        System.out.println("Human Need good Sleep");
    }

    public void WakeUp() {
        System.out.println("Human need to Wake Up On time in morning");
    }
}

class VinayKumar extends Human {

    @Override
    public void Sleep() {
        System.out.println("Vinay Always Sleep late in Night");
    }

    @Override
    public void WakeUp() {
        System.out.println("Vinay Need to Wake Up On Time In The morning");
    }

}

class AnishKumar extends Human{
@Override
public void Sleep(){
    System.out.println("Anish need better Sleep");
}

@Override
public void WakeUp(){
    System.out.println("Anish Always Wake Up on time in the morning");
}
}

class information{

    public static void poly(Human ref){
        ref.Sleep();
        ref.WakeUp();
        
    }

}

public class PolymorphismRevisionInCollege {
    public static void main(String[] args) {

        VinayKumar v=new VinayKumar();
        AnishKumar a=new AnishKumar();

        information in=new information();
        in.poly(a);
        in.poly(v);


    }
}
