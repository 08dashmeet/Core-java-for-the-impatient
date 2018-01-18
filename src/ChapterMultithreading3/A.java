package ChapterMultithreading3;

public class A implements Runnable{
    String name;
    Thread t;
     A(String ename){
         name = ename;
         t = new Thread(this,name);
         System.out.println("New Thread: "+ t);
         t.start();

     }

    public void run(){

             System.out.println(name);
        try{Thread.sleep(1000);}
        catch(Exception e){}

        System.out.println(name+" Existing");


    }




}
