// join method

package ChapterMultithreading3;

public class ATester {
    public static void main(String args[]){

        A obj1 = new A("One ");
        A obj2 = new A("Two");
        A obj3 = new A("Three");

        try{Thread.sleep(1000);}
        catch(Exception e){}

        System.out.println("Main method Ending");





    }
}
