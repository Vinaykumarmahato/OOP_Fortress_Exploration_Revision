

class MyFather{

    public void MyFather(){

        String MyFatherName="Vijay Mahao";
    }
}

class SonOfMyFather extends MyFather{

    public void Son(){

        System.out.println("Vinay Kumar");
    }
}
public class SingleLevelInheritanceSolution1 {

    public static void main(String[] args) {

        SonOfMyFather obj=new SonOfMyFather();
        obj.Son();
        

    }
    
}
