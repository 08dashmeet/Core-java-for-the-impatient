package ChapterMultithreading.Runnableinterface;

public class NewthreadTester {
    public static void main(String args[]){
        Newthread obj1= new Newthread();
        Newthread2 obj2= new Newthread2();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();


    }
}
