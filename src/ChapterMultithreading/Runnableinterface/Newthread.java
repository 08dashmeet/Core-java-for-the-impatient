package ChapterMultithreading.Runnableinterface;

public class Newthread implements Runnable{
    public void run(){

        System.out.println("Thread 1");
       try{ Thread.sleep(3000);}
       catch(Exception e){}
    }

}
