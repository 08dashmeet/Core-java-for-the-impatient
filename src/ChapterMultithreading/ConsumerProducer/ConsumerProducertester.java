package ChapterMultithreading.ConsumerProducer;

public class ConsumerProducertester {

    public static void main(String args[]){

        ConsumerProducer obj = new ConsumerProducer();

        Thread t1 = new Thread(new Runnable()
        {
            public void run(){
                try{
                    obj.Producer();
                }
                catch(Exception e){}
            }
        });


        Thread t2 = new Thread(new Runnable()
        {
            public void run(){
                try{
                    obj.Consumer();
                }
                catch(Exception e){}
            }
        });

        t1.start();
        t2.start();


        /*try{ t1.join();
            t2.join();}

            catch(Exception e){}*/





      /*  Mythread t1 = new Mythread();
        Mythread1 t2 = new Mythread1();
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch (Exception e){}*/


    }
}
