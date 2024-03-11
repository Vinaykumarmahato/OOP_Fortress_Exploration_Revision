public class TryWithMultipleCatchBlock {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;
        int Result = 0;

        int values[] = { 4, 5, 2, 9 };

        String name = null;

        try {

            Result = num1 / num2;
            // System.out.println(values[5]); // it will also give the exception which will
            // be out of bound exception
            System.out.println(num1 / name.length());
        } catch (ArithmeticException Vinay) {
            System.out.println("A Number Can not Divided by Zero" + Vinay);
        } catch (ArrayIndexOutOfBoundsException shahu) {

            System.out.println("Hey Stay in your limits!" + shahu);
        }
        catch(Exception e){
            System.out.println("Something went wrong..");
        }

        System.out.println(Result);

        /*
         * Thing you have a lot of exception in your code and you are thinking which one
         * should i handle what can i do now
         * 
         * at this time you can do one things lets see that one.
         */


    }
}
