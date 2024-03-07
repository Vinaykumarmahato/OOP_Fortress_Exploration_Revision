class human {

	private String name;
	int age;

	void human() { // constructor

		System.out.println("This is Human class constructor");
	}

    public void D0() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'D0'");
    }

    public void Play() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Play'");
    }
}

class Student extends human {

	void Display() {

		System.out.println("The Age is:" + age);
		// System.out.println("The Name is:"+name);// error because name is not
		// inherited here because name is private
		// Note: Private property or member not participates in inheritance.
		/*
		 * In Encapsulation we get the private values using the setter and getter and
		 * then we got access if in inheritance it will not be like Encapsulation then
		 * people will think why should i use this i will use inheritance .
		 * 
		 * 
		 * 
		 * In inheritance constructor automatic created in the background  we can't see that  behind the scene 
		 * Student name constructor also is in this class
		 * 

		 * 
		 */
	}
	
	/*
	 
	  
	  void student() {
		super(); here super method has used to call the the constructor of the parent class
	}
	
	 in child class constructor can not be inherit  it is called by the super key method. it cant access in child class 
	 so the conclusion is constructor can not be inherited it will be access in child class with the help of super();
	 in every child class default constructor will there 
	
	*/

}

public class MoreOnInheritance {

	public static void main(String[] args) {
		human obj1 = new human(); // parent class
		obj1.human(); // it will give the output as "This is Human class constructor"
		// because it is in same class but in child class what will be happened lets see.
		
		Student obj = new Student(); // in child class constructor can not be inherit 

		obj.human();
		
		
		
	}
}
