package ChapterMultithreading.ConsumerProducer;

public class Mythread  implements Runnable{

    A obj = new A();

    public void run() {

       try{ obj.Pro();}
       catch (Exception e){}

        try{ obj.Con();}
        catch (Exception e){}


    }

    public static void main(String args[]){


        Mythread obj1 = new Mythread();
        Mythread obj2 = new Mythread();
        Mythread obj3 = new Mythread();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        Thread t3 = new Thread(obj3);

        t1.start();
        t2.start();
        t3.start();



      try{ t1.join();
       t2.join();
      t3.join();}
       catch (Exception e){}


    }
}
