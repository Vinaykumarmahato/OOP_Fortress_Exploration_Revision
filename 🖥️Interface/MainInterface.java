interface Computer {
    public void CompileCode();

}

class Laptop implements Computer {

    public void CompileCode() {

        System.out.println("Hey! Don't Do The Silly Error!");
    }
}

class DeskTop implements Computer {

    public void CompileCode() {

        System.out.println("Hey! Don't Do The Silly Error! It Will Be Fast!");
    }
}

class Developer{

    public void BuildApp(DeskTop obj) {

        System.out.println("Building the app!");
        // CompileCode();
        obj.CompileCode();
    }

}

public class MainInterface {

    public static void main(String[] args) {
        Developer Dev = new Developer();
        // Laptop obj = new Laptop();

        DeskTop obj = new DeskTop();

        Dev.BuildApp(obj);

        /*
         * Interface is a point where two system meet and interact
         * 
         * Interface is a group of related method with Empty body
         * 
         * image you have TV and Human and you are controlling both the system with
         * Button it means here button is working as a interface.
         */

    }
}
