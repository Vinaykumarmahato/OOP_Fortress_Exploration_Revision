


@FunctionalInterface
interface car{
    // void Drive();
    void tempu(int agv,int  ts);
}
public class LambdaExpressionRevision1 {
    
    public static void main(String[] args) {
        
        car c= (avg , ts)-> System.out.println("Driving"+" "+avg+":"+ts);
        c.tempu(20 , 140);

    }
}
