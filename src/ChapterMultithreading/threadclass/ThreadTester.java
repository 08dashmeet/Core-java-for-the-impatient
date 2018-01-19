package ChapterMultithreading.threadclass;

public class ThreadTester {

    public static void main(String args[]) {

        Mythread obj1 = new Mythread();
        Mythread2 obj2 = new Mythread2();

        obj1.start();
        try{ obj1.sleep(1000);}
       catch(Exception e)  { }

        obj2.start();


    }
}