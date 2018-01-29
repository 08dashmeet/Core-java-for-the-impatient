package ChapterCollection;

import java.util.HashSet;
import java.util.Set;

public class setheory {
    public static void main(String args[]) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);

        Set<Integer> s2 = new HashSet<>();
        s2.add(8);
        s2.add(2);
        s2.add(9);
        s2.add(4);

        Set<Integer> r1 = new HashSet<>();  // Union
        r1.addAll(s1);
        r1.addAll(s2);
        System.out.println(r1);


        Set<Integer> r2 = new HashSet<>();     //intersection
        r2.addAll(s1);
        r2.retainAll(s2);
        System.out.println(r2);


        Set<Integer> r3 = new HashSet<>();     //difference s1-s2
        r3.addAll(s1);
        r3.removeAll(s2);
        System.out.println(r3);



    }
}