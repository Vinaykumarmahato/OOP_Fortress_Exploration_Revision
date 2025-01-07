class MyException extends Exception {

    // This part is like a special note we give to our custom exception
    // It helps set a message when something goes wrong
    public void MyException() {
        // This part doesn't really do anything important, so you can ignore it for now.
        // It's like a note we wrote but didn't use.
    }


    

    // This is like a special note that also carries a message when things go wrong
    public MyException(String msg) {
        super(msg); // This part is like telling the computer to remember the message we wrote in our special note
    }

}

public class CustomExceptionAndThrowKeyWord {

    public static void main(String[] args) {
        // These are just normal numbers we're using for something later

        int num1 = 10;
        int num2 = 0;
        int Result = 0;

        try {
            // Now, we're checking if one of our numbers is less than 0
            if (num2 < 0) {
                // If it is, we're telling the computer that something really special happened
                // We're using our special note to explain it, saying it's because of a "Negative Number"
                Exception e = new MyException("Negative Number");
                // And then, we're making the computer pay attention to our special note
                throw e;
            }

            // If nothing special happened, we're doing some math stuff
            Result = num1 / num2;
            // And telling the computer to show us the result
            System.out.println(Result);

        } catch (Exception e) {
            // If something special did happen, the computer will tell us to enter a valid number
            System.out.println("Please Enter a Valid Number");
        }
    }
}
