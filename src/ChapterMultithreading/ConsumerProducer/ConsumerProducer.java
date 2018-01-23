package ChapterMultithreading.ConsumerProducer;

import java.util.*;


public class ConsumerProducer {
    int s = 1;
    ArrayList<Integer> arr = new ArrayList<>(s);

    public  synchronized void  Producer()throws InterruptedException {

        while(true) {
            if (arr.size() == s) {
                wait();
            } else {
                int val = new Random().nextInt(100);
                arr.add(val);
                System.out.println("Producer " + arr);
                notify();
                Thread.sleep(500);
            }
        }

    }



    public synchronized void Consumer() throws InterruptedException {
        while(true){

                if(arr.size()== 0) {
                    wait();
                }

                else{
                    System.out.println("Consumer " + arr.remove(0));
                    notify();
                   // Thread.sleep(500);
                    }
    }
}}