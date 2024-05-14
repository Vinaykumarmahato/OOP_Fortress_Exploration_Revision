class Demo {

    private int a;
    private int b;

    Demo() { // this is default constructor which will be non paramiterized

    }

    void disp() {

        System.out.println(a);
        System.out.println(b);
    }
}

public class constructor2 {

    public static void main(String[] args) {
        Demo d = new Demo();// zero parameter because it is default constructor call it is the call of
                            // constructor that is default constructor call

    }
}
