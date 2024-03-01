
class Animal{
	
	void sleep() {
		
		System.out.println("Tiger Need Sleep");
	}
	
	
}

class Tiger extends Animal{
	
	
}

public class SingleLevelInheritance {

	public static void main(String[] args) {
		
		
		
		Tiger t=new Tiger();
		t.sleep();
	}

}
