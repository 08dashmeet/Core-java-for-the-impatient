//Example of unchecked  Exception

public class ChapterException {

    public static void main(String args[])
    {
        try{
           int a= 500;
            double result = 500/0;
            System.out.println(" "+result);
            }

      catch(ArithmeticException e){
            System.out.println("arithmetic exception occur");
        }


        double result2 = 500/20;
        System.out.println(" "+result2);
    }
}
