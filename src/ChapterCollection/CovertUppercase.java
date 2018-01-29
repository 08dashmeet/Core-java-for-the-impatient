/*In an array list of strings, make each string uppercase. Do this with (a) an iterator,
(b) a loop over the index values, and (c) the replaceAll method.*/

package ChapterCollection;

import java.util.*;

public class CovertUppercase {
    public static void main(String args[]) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("welcome");
        arr.add("to");
        arr.add("the");
        arr.add("kingdom");
        System.out.println(arr);

        System.out.println("First method");

        Iterator<String> itr = arr.iterator();   //first method
        while(itr.hasNext())
        {
            String s1 = itr.next();
            String s2 = s1.toUpperCase();
             System.out.print(s2+" ");
        }
        System.out.println();

        System.out.println("Second  method");
        for(int i =0 ;i<arr.size();i++){
            String t1 = arr.get(i);
            String t2 = t1.toUpperCase();
            System.out.print(t2+" ");
        }
        System.out.println();
        arr.replaceAll(s-> s.toUpperCase());
        System.out.print(arr);

    }
}