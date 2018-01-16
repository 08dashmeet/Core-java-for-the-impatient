package Chapter.Throws;

public class ExampleTester {
    public static void main(String args[]){
        try {
            Example obj1 = new Example();
            Example obj2 = new Example();
            obj2.add(3,4);

            obj1.divide(9, 0);
        }

        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception in Divide Method");

        }


    }
}
