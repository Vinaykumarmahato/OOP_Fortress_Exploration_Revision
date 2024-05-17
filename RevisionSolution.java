class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String GetName() {
        return name;
    }

    public int GetAge() {
        return age;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class RevisionSolution {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Vinay Kumar", 20);
        students[1] = new Student("Anish Kumar", 23);
        students[2] = new Student("Arjun Sahani", 23); // Fixed index 2
        // students[3] remains uninitialized (you can add another student here)

        for(Student student:students){
            System.out.println(student);
        }
      
    }
}
