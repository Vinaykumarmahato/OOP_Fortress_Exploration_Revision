class Copy {
    public void blackCopy() {
        System.out.println("Black copy");
    }

    public void whiteCopy() {
        System.out.println("White copy");
    }
}

class ClassMateCopy extends Copy {
    @Override
    public void whiteCopy() {
        System.out.println("Classmate copy will have white pages");
    }

    @Override
    public void blackCopy() {
        System.out.println("Classmate copy has no black page");
    }
}

class Navdeep extends Copy {
    @Override
    public void whiteCopy() {
        System.out.println("Navdeep has white but not completely clean pages");
    }

    @Override 
    public void blackCopy() {
        System.out.println("Navdeep has black pages but not completely clean pages");
    }
}

class Natraj extends Copy {
    @Override
    public void whiteCopy() {
        System.out.println("Natraj copy has white pages and a clean look");
    }

    @Override
    public void blackCopy() {
        System.out.println("Natraj copy has no black page");
    }
}

class Polymore {
    public static void poly(Copy ref) {
        ref.blackCopy();
        ref.whiteCopy();
    }
}

public class polymorphism2 {
    public static void main(String[] args) {

        ClassMateCopy cm = new ClassMateCopy();
        Navdeep n = new Navdeep();
        Natraj na = new Natraj();

        Polymore p=new Polymore();
        p.poly(cm);
        p.poly(n);



       
    }
}
