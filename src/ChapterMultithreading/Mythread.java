package ChapterMultithreading;

public class Mythread extends Thread {

     public void run() {
         for (int i = 0; i < 3; i++) {
             System.out.println("thread 1");
             try{ sleep(2000);}
             catch(Exception e){  }
         }
     }

}
