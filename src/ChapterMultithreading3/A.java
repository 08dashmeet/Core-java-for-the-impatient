package ChapterMultithreading3;

public class A implements Runnable{


    public void run(){
        for(int i=0;i<4;i++){


        try{Thread.sleep(1000);}
        catch(Exception e){}
        System.out.println("Hi");  }

    }




}
