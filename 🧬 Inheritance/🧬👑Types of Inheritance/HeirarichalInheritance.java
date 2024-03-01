
class Student{
	
	void Sleep() {
		
		System.out.println("Student Need Sleep");
	}
}

 class VinayKumar extends Student  {


}

class ArjunSahani extends Student{


}

class DivakarBharti extends Student{


}


public class HeirarichalInheritance {
	
	public static void main(String[] args) {
		
		Student obj=new Student();
        obj.Sleep();

		/*
		 * 
		 * if one class inherited by multiple child class then it is called as hierarchal Inheritance.
		 * in Example Student is a parent class and so many students are using that one class so it is called as a 
		 * Hierarchal inheritance.
		 * 
		 * 
		 * 
		 */
	}

}
