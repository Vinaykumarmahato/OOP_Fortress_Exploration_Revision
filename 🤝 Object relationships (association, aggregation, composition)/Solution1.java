class Student{

    int a=10;
    int b=30;
  

    public void Show(){
        int c=a+b;
        System.out.println("Addition od A + B:"+c);
    }
}


public class Solution1 {

    public static void main(String[] args) {
        
        Student obj=new Student();
        obj.Show();
    }
    
}
