class Teacher {

    public void Do(){

        System.out.println("Teacher Teach Something");
    }
}

class JaypriyaMam extends Teacher {

    public void Do() {
        System.out.println("She Teach OOPs ");
    }
}

class MonikaMam extends Teacher {

    public void Do() {

        System.out.println("She Teach Cloud Computing");
    }
}

class VaraLakshmiMam extends Teacher {

    public void Do() {
        System.out.println("She Teach Digital Marketing");
    }
}

public class HeirarichalInheritance2 {

    public static void main(String[] args) {
        
        Teacher t=new Teacher();
        t.Do();

        Teacher mam1=new JaypriyaMam();
        mam1.Do();

        Teacher mam2=new MonikaMam();
        mam2.Do();

        Teacher mam3=new VaraLakshmiMam();
        mam3.Do();


        

        
    }
}

/*
 * we have to understand
 * 
 * To print all the methods in the parent class itself, you can use Java’s
 * reflection API. This allows you to inspect and manipulate classes at runtime.
 * 
 * 
 */
