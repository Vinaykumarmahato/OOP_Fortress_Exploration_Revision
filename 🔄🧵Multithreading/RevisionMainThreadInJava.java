public class RevisionMainThreadInJava {
    
    public static void main(String[] args) {
        
System.out.println("Main Thread Before Changing");  
System.out.println("---------------------------------");

String name=Thread.currentThread().getName();
System.out.println("Main Thread Name: "+name);
System.out.println("---------------------------------");


System.out.println(Thread.currentThread().getPriority());


System.out.println("Main Thread After Changing");
System.out.println("---------------------------------");


Thread t1=Thread.currentThread();
t1.setName("My Thread");
System.out.println(t1);
t1.setPriority(9);

String NameAfterChanignThread=Thread.currentThread().getName();
System.out.println("After Changing the Thread name: "+NameAfterChanignThread);
System.out.println("---------------------------------");


int NewPriorityAfterChangingThread=Thread.currentThread().getPriority();
System.out.println(NewPriorityAfterChangingThread);

}
}
