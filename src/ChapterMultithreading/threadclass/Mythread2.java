package ChapterMultithreading.threadclass;

public class Mythread2 extends Thread {
    public void run(){

        for(int i=0;i<3;i++)
        {
            System.out.println("Thread 2");
            try{
                sleep(2000);}
            catch(Exception e){  }
        }

    }
}
