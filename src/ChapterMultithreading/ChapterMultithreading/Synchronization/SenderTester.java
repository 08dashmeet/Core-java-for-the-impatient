package ChapterMultithreading.ChapterMultithreading.Synchronization;

public class SenderTester {
    public static void main(String args[]){
            Sender s = new Sender();

        SenderThread obj1 = new SenderThread("hii World",s);
        SenderThread obj2 = new SenderThread("hii World",s);

        obj1.start();
        obj2.start();
       /*try {
           obj1.join();
           obj2.join();
       }
       catch(Exception e){}*/

    }
}
