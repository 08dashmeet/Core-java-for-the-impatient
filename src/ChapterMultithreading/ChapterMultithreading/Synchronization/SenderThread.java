package ChapterMultithreading.ChapterMultithreading.Synchronization;

public class SenderThread extends Thread{
     Sender obj;
     String s;
    SenderThread(String m,Sender j){
        s=m;
        obj=j;
    }

    public void run(){
        synchronized(obj) {
            obj.sendmsg(s);
        }
        }


}
