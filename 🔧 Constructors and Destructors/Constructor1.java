class Student {

    // public void SetName(String name){

    // this.name=name;
    // }
    // /*Etna jyada mai initialise mai nahi karunnga direct mai object creation ke
    // samay hi sab kuchh initialise kar lunga to waha pe constructor ka concept
    // aayega */
    // public void SetAge(int age){

    // this.age=age;
    // }

    // Cunstructor will be same name as class name and it has no any return type.
    private String name;
    private int age;

    Student(String name  , int age) {

        this.name=name;
        this.age=age;

    }

    public String Getname() {
        return name;

    }

    public int GetAge() {
        return age;
    }

}

public class Constructor1 {

    public static void main(String[] args) {

        Student st=new Student("vinay Kumar", 20);
        System.out.println(st);



                                        /* here we are initializing the value but if i will, say you can initialise the
                                        * value during the object creation it self then it is callled as Constructor
                                        */
        // vinay.SetName("Vinay Kumar");
        // vinay.SetAge(23);

        // System.out.println("The name of the Vinay Kumar is: " + vinay.Getname());
        // System.out.println("The age of the Vinay kumar is: " + vinay.GetAge());

    }

}