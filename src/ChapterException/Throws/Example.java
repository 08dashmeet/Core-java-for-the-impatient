package ChapterException.Throws;

public class Example {

    public void divide(int a, int b) throws ArithmeticException{
        int c= a/b;
        System.out.println("the result is "+c);
    }
    public void add(int a, int b) {
        int c= a+b;
        System.out.println("the result is "+c);
    }


}
