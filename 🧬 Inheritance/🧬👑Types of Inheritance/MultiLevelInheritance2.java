// Parent1 class with a show method.
class Parent1 {
    public void show() {
        System.out.println("parent 1");
    }
}

// Parent2 class with a show method.
class Parent2 {
    public void show() {
        System.out.println("Parent 2");
    }
}

// The following line will cause a compilation error in Java because Java does not support multiple inheritance with classes.
// class child extends Parent1, Parent2 {
// }

public class MultiLevelInheritance2 {
    public static void main(String[] args) {
        // When one class tries to inherit from two parent classes, it can lead to ambiguity.
        // This is because both parent classes may have methods with the same signature,
        // and the JVM would not know which method to use.
        // In Java, this type of inheritance is not allowed to avoid such ambiguity.
        // Java uses interfaces to achieve similar functionality without the ambiguity.
    }
}
