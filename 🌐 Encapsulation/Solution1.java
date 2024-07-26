/**
 * Solution1
 */


class Encapsulation {

    private String name;
    private int age;
    private String Position;
    private String company;

    public void SetName(String Name){

        Name=name;
    }

    public void SetAge(int Age){

        Age=age;
    }
    

    public void StePosition(String PositionOfStudent){

        PositionOfStudent = Position;
    }

    public void SetCompany(String CompanyName){

        CompanyName=company;
    }


    public String GetNameOfStudent(){
        return name;
    }

    public int GetAgeOfStudent(){
        return age;

    }
    
    public String GetPositionOfStudent(){

        return Position;
    }

    public String GetCompanyNameOfTheStudent(){

        return company;
    }

    
}

public class Solution1 {

    public static void main(String[] args) {
        Encapsulation arjun = new Encapsulation();

        arjun.SetName("Arjun Sahani");
        arjun.SetAge(21);
        arjun.StePosition("Front-End Developer");
        arjun.SetCompany("Microsoft");

        System.out.println(arjun.GetNameOfStudent());
        System.out.println(arjun.GetAgeOfStudent());
        System.out.println(arjun.GetPositionOfStudent());
        System.out.println(arjun.GetCompanyNameOfTheStudent());

    }
}
