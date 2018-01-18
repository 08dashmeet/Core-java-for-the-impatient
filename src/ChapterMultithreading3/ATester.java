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

        t1.setPriority(1);  //setting min priority
        t2.setPriority(10);  //setting max priority

       System.out.println("The priority of  "+t1.getName()+"-: "+t1.getPriority());
        System.out.println("The priority of  "+t2.getName()+"-: "+t2.getPriority());


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


