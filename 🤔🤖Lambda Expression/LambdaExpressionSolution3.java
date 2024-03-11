@FunctionalInterface

interface Human {

    void Walk(int Slow, int fast);
}

public class LambdaExpressionSolution3 {

    public static void main(String[] args) {

        Human obj= (Slow, fast)->System.out.println("Human can walk slow and fast both: "+Slow +" "+fast);
        
              obj.Walk(20,96);
    }
}
