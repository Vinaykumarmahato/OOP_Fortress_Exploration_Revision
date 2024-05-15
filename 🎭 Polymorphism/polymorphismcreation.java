class Student {
    public void disciplined() {
        System.out.println("Student is disciplined");
    }

    public void undisciplined() {
        System.out.println("Student is not disciplined");
    }
}

class Deepak extends Student {
    @Override
    public void disciplined() {
        System.out.println("Deepak is disciplined");
    }

    @Override
    public void undisciplined() {
        System.out.println("Deepak is not an undisciplined boy");
    }
}

class Gautam extends Student {
    @Override
    public void disciplined() {
        System.out.println("Gautam is disciplined & well-educated in the technical field");
    }

    @Override
    public void undisciplined() {
        System.out.println("Gautam is not an undisciplined boy");
    }
}

class Polymorphism {
    public static void polymorphismCreation(Student ref) {
        ref.disciplined();
        ref.undisciplined();
    }

    public static void main(String[] args) {
        Deepak d = new Deepak();
        Gautam g = new Gautam();

        polymorphismCreation(d);
        polymorphismCreation(g);
    }
}
