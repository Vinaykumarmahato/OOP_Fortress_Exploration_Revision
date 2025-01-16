class Animal{

    private String name;
    private String colour;
    private int age;

    Animal(String name, int age , String colour){

        this.name=name;
        this.age=age;
        this.colour=colour;

    }

    
    public String toString(){
        return "Name: "+name+" Age: "+age+" Colour: "+colour;
    
    }
}

public class MoreOnConstructor {
    
    public static void main(String[] args) {

        Animal dog=new Animal("Bull Dog", 10, "Black");
        System.out.println(dog);
        
        // In Java, when you print an object directly using System.out.println(), it prints the object's reference, not its contents. To print the contents of the Animal object, you need to override the toString() method in the Animal class. 

    }
}
