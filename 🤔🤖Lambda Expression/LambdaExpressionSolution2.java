@FunctionalInterface
interface Bike{

    void Speed(int Average);
}

public class LambdaExpressionSolution2 {
    
    public static void main(String[] args) {

        Bike obj=Average -> System.out.println("The Average of the bike is: "+Average);

        obj.Speed(20);
   
    }
}

