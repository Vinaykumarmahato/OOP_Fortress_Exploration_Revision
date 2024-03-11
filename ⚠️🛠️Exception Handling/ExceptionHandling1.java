public class ExceptionHandling1 {

    public static void main(String[] args) {
        // Exception handling is a run time error
        // Statement is divided into two type
        // (1)Normal Statement: int a=10; int b=30 , int C=a+b; This is normal statement

        // (Critical Statement): The Statement where Exception can be occur that is
        // called as Critical Statement.
        /*
         * 
         * Example:
         * 
         * int a=9;
         * int b=0;
         * int c=a/b; // This is critical statement because here the exception will be
         * occur.
         * we always need to focus on critical statement
         */
        int a = 9;
        int b = 3;
        int c = 0;
        try {
            c = a / b;
            System.out.println("In Try Block");/*
                                                * The Question is Can we write this in try block
                                                * the Answer depends on the coder.because when the exception will be
                                                * occur then the catch block will be execute.
                                                * Remember: When the Exception will be occur then the Statement which
                                                * will be in the try block that will be Skip that statement will not be
                                                * Execute.
                                                * 
                                                */
        }

        catch (Exception e) {
            System.out.println("Something went Wrong" + e);

            /*
             * here we can also print 'e ' For knowing what exactly error we are gating or
             * what exactly exception we are
             * getting in the code
             * 
             * after getting the exception if you want to show to the user
             * // what exception
             * exactly occurring in the code ypu can show that in catch Block.
             * 
             */
        }

        System.out.println(c);
    }
}
