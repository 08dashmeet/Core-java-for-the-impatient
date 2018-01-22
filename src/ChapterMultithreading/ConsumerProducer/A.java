package ChapterMultithreading.ConsumerProducer;

import java.util.*;


public class A {

    ArrayList<Integer> arr = new ArrayList<>();

    public synchronized void Pro()throws InterruptedException {

            if(arr.size()==0) {
                int val = new Random().nextInt(100);
                arr.add(val);
                System.out.println("Producer " + arr);
                notify();

            }
            else {
                System.out.println("List is full");
                 wait();
                 }
    }




    public synchronized void Con() throws InterruptedException {

            if (arr.size()== 0) {
                System.out.println("List is empty");
                wait();
            }
            else{
                System.out.println("Consumer "+arr);
                arr.remove(0);

                notify();
            }

        }



}