
class MyException extends Exception{

    public void MyException(){} // we need to create this constructor for creating our own custom Exception

    public  MyException(String msg){

        super(msg);// used for call parent class constructor in the child class constructor using Super keywords
    } // 

}

public class CustomExceptionAndThrowKeyWord {

    public static void main(String[] args) {
        // Don't Confuse with throws keyword and Throw keyword this two key words are
        // different.
        int num1 = 10;
        int num2 = 0;
        int Result = 0;
        try {

            if(num2<0){

                //Exception e=new ArithmeticException("Due to Negative Number");

                Exception e=new MyException("Negative Number");
                throw e;
            }

            Result = num1 / num2;
            System.out.println(Result);

        } catch (Exception e) {
            System.out.println("Please Enter a Valid Number");
        }
    }
}
