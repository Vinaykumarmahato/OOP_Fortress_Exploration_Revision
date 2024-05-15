
class Student{

    private String name;
    private int age;
    private long number;

    Student(String name , int age){

        this.name=name;
        this.age=age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getNumber() {
        return number;
    }

    public void show(){
        
    }

    




}

public class constructorRevision {
    
    public static void main(String[] args) {

        Student std=new Student("Vinay Kumar", 23);
        System.out.println(std);

        
    }
}
