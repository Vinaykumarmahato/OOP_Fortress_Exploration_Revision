class Employee{
    /*
     * 
     * 
     * Lets see why do we use the encapsulation?
     * 
     * maniye ki hmlog ke pass bahut sara variable hai with access specifier private
     * but hmlog usko access karna chahte hai dusre class me to by using
     * encapsulation we can do that it provide the security .
     * 
     */

     private String name;
     private int age;
     private long number;
     private int salary;
     private String EmployeeId;
 
     public void SetName(String Name) {
         Name = name;
     }
 
     public void SetAge(int Age) {
         Age = age;
 
     }
 
     public void SetEmployeeId(String EmpId) {
 
         EmpId = EmployeeId;
     }
 
     public void SetSalary(int Salary) {
 
         Salary = salary;
     }
 
     public void SetNumber(long Number){
         Number =number;
     }
 
     // Getter
 
     public String GetName(){
 
         return name;
     }
 
     public int GetAge(){
         return age;
     }
 
     public int GetSalary(){
         return salary;
     }
 
     public String GetEmpId(){
 
         return EmployeeId;
     }

     public Long GetNumber(){
        return number;
     }
}

public class Solution2 {

    
    public static void main(String[] args) {

        Employee Rohit=new Employee();
        Rohit.SetName("Rohit Kumar");
        Rohit.SetAge(23);
        Rohit.SetEmployeeId("ADV860964");
        Rohit.SetNumber(1234567899);
        Rohit.SetSalary(250000000);

        System.out.println(Rohit.GetName());
        System.out.println(Rohit.GetAge());
        System.out.println(Rohit.GetSalary());
        System.out.println(Rohit.GetEmpId());
        System.out.println(Rohit.GetNumber());

        

    }
}
