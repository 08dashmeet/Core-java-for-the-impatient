
package ChapterMultithreading.ChapterMultithreading.Synchronization;

public class Sender{

    public void sendmsg(String str) {

      System.out.print("["+str);

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Exception");
        }

        System.out.println("]");
    }


}
