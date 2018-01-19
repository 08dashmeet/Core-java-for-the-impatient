package ChapterMultithreading.Runnableinterface;

    public class Newthread2 implements Runnable{
        public void run(){

            System.out.println("Thread 2");
            try{ Thread.sleep(3000);}
            catch(Exception e){}
        }

    }


