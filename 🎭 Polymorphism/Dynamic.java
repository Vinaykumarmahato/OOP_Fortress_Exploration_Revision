class Human {

    public void Play() {
        System.out.println("Human Can do Anything");

    }

    public void D0() {
        System.out.println("Human needs good sleep");
    }
}

class IntelligentHuman extends Human {
    public void Play() {
        System.out.println("Intelligent Human Play Better");
    }

    public void D0() {

        System.out.println("Intelligent Human can be passs all the Exams");
    }

}

class FoolishHuman extends Human{

    public void Plane() {

        System.out.println("Foolish human Idiot");
    }

    public void D0() {
        System.out.println("Foolish Man Can't do anything");
    }
}

class oversmarthuman extends Human{

    public void Play() {
        System.out.println("OverSmart Human Play better");
    }

    public void D0() {
        System.out.println("Over Smart Human can do a lot of work in minimum time");
    }
}

class man{
    public void poly(Human ref){

        ref.Play();
        ref.D0();
    }
}


public class Dynamic {

    public static void main(String[] args)throws Exception {

        IntelligentHuman ih = new IntelligentHuman();
        FoolishHuman fh = new FoolishHuman();
        oversmarthuman osh = new oversmarthuman();

        man m=new man();
        m.poly(ih);
        System.out.println("---------------------------------------------");
        m.poly(fh);
        System.out.println("---------------------------------------------------");
        m.poly(osh);
        System.out.println("--------------------------------------------------");


        // System.out.println("-----------------------------------------");

        // ih.Play();
        // ih.D0();
        // System.out.println("-----------------------------------------");
        // fh.Plane();
        // fh.D0();
        // System.out.println("-----------------------------------------");

        // osh.Play();
        // osh.D0();
        // System.out.println("-----------------------------------------");
        
        
        
        
    }
}
