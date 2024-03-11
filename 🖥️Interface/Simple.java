
interface A {

    void show();
}

interface X {

    void abc();
}

class B implements A,X{

    public void show() {

        System.out.println("In Show1 Method");
    }

    public void abc() {
        System.out.println("In abc Method!");
    }

   
}

public class Simple {

    public static void main(String[] args) {

        B obj = new B();
        obj.show();
        obj.abc();

    }
}
