// join method

package ChapterMultithreading3;

public class ATester {
    public static void main(String args[]) {

        A obj1 = new A();
        B obj2 = new B();
        Thread t1 = new Thread(obj1);

        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        try{      t1.join();
                  t2.join();
           }
        catch(Exception e){}

        try{    System.out.println(t1.isAlive());
                System.out.println(t2.isAlive());
        }
        catch(Exception e){}


        System.out.print("Main method ends here");


    }

}


