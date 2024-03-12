class MyThread extends Thread {
    public void run() {

        String name=Thread.currentThread().getName();
        System.out.println(name+" is running");

        if (name.equals("Important Message")) {
            importantMessage();
        }
        else if (name.equals("Education")) {
            Education();
        }
        else if (name.equals("Bad Things")) {
            BadThings();
        }
        
    }


    public void importantMessage(){
        System.out.println("This is an important message");
    
    }

    public void Education(){
        System.out.println("Education is the key of success");
    
    }

    public void BadThings(){
        System.out.println("Bad things happen for a reason");
    
    
}
}


        

public class MultipleTaskWithinSingleRunMethodExample1 {
    
    public static void main(String[] args) {
        
        MyThread m=new MyThread();

        MyThread Threadm1=new MyThread();
        MyThread Threadm2=new MyThread();
        MyThread Threadm3=new MyThread();

        Threadm1.setName("Important Message");
        Threadm2.setName("Education");
        Threadm3.setName("Bad Things");
        Threadm1.start();
        Threadm2.start();
        Threadm3.start();

        
    
    }
}