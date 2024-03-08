interface A {

    void show1();

}

interface B {
    void show2();

}

interface C {
    void show3();

}

interface D {
    void show4();

}

class Alphabet implements A, B, C, D {

    // Remember it is necessary to implement all the methods which is assigned into the interface classes,
    // we can also implement the interface classes(Extends=implements)

    public void show1() {

        System.out.println("In Show1 Method!");
    }

    public void show2() {

        System.out.println("In show2 method!");
    }

    public void show3() {

        System.out.println("In Show3 Method!");
    }

    public void show4() {
        System.out.println("In Show4 Method!");
    }

}

public class AnotherSolutionByMyself {

    public static void main(String[] args) {

        Alphabet obj = new Alphabet();
        obj.show1();
        obj.show2();
        obj.show3();
        obj.show4();

    }
}
