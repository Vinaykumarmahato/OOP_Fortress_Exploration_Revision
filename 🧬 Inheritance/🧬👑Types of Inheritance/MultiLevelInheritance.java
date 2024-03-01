
class Demo1{
	void Display() {
		
		System.out.println("Display method return in Demo1 Class");
	}
	
}

class Demo2 extends Demo1{
	
	
}

class Demo3 extends Demo2{
	
	
}

class Demo4 extends Demo3{
	
	
}


public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		
		Demo4 Demoinfo=new Demo4();
		
		Demoinfo.Display();
	

	}

}
