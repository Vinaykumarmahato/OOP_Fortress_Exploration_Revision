
@FunctionalInterface
interface car {

    void Drive(int avg);
    /*
     * is this a functional interface then the answer is yes this is the functional
     * interface
     * because it has only one method in interface class.
     * 
     * Lambda express work on only functional interface.
     * 
     * It helps you to reduces the code
     * 
     * 
     * Lets see the syntax for Lambda expression:
     * 
     * Syntax:
     * 
     * (parameter-list)->{Body}
     */
}

public class LambdaExpressionSolution1 {

    public static void main(String[] args) {

        car obj= avg  -> System.out.println("Car is ready for drive with avg:"+avg);


        // car obj = () -> System.out.println("Car is Ready for Drive");// this is the lambda expression
        
        obj.Drive(56);
    }
}
