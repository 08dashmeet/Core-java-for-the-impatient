//Eg of priorityqueue of type Student class

package ChapterCollection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class ChapterPriorityqueue implements Comparable<ChapterPriorityqueue> {
    int rollno;
    String name;
    ChapterPriorityqueue(int r, String n){
        rollno = r;
        name = n;
    }

    public int compareTo(ChapterPriorityqueue s){
        if(rollno > s.rollno){
            return 1;
        }
        else if(rollno < s.rollno){
            return -1;
        }
        else{
            return 0;
        }

    }
}

class School{
    public static void main(String args[]){

        ChapterPriorityqueue s1 = new ChapterPriorityqueue(900,"Allen");
        ChapterPriorityqueue s2 = new ChapterPriorityqueue(100,"Iris");
        ChapterPriorityqueue s3 = new ChapterPriorityqueue(200,"Ted");

        PriorityQueue<ChapterPriorityqueue> ss = new PriorityQueue<>();
        ss.add(s1);
        ss.add(s2);
        ss.add(s3);

        Iterator<ChapterPriorityqueue> itr = ss.iterator();
        while(itr.hasNext()){

            ChapterPriorityqueue d= itr.next();
            System.out.println(d.rollno+" "+d.name);
        }



    }

}