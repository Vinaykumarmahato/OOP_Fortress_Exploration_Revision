class Animal {

    public void Eat() {
        System.out.println("Animal eats so many things");
    }

    public void sleep() {

        System.out.println("Animal need Good Sleep");
    }
}

class Dog extends Animal {
    @Override
    public void Eat() {
        System.out.println("Dog eats meat");
    }

    @Override
    public void sleep() {
        System.out.println("Dog need Good Sleep");
    }
}

class Cat extends Animal {
    @Override
    public void Eat() {
        System.out.println("Cat eats fish");
    }

    @Override
    public void sleep() {
        System.out.println("Cat need Good Sleep");
    }
}

class MainForPoly {
    public static void poly(Animal ref) {
        ref.Eat();
        ref.sleep();
    }
}

public class revision1 {

    public static void main(String[] args) {

        Dog d=new Dog();
        Cat c=new Cat();

        MainForPoly m=new MainForPoly();
        m.poly(c);
        m.poly(d);

    }
}
