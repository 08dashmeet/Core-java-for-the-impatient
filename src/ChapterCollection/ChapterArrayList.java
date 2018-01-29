package ChapterCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ChapterArrayList {

    public static void main(String args[]){


        ArrayList<String> arr = new   ArrayList<>();
        arr.add("Dashmeet");
        arr.add("Singh");
        arr.add("Kaler");
        arr.add(3,"Welcome");
        int a1 = arr.lastIndexOf("Dashmeet");
        String s1 = arr.get(0);
        System.out.println(s1);

        String[]  a=  new String[arr.size()];
        a = arr.toArray(a);

        Iterator<String>  itr = arr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

