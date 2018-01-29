/* Implement the “Sieve of Erathostenes” algorithm to determine all prime numbers ≤ n. Add all
numbers from 2 to n to a set. Then repeatedly find the smallest element s in the set, and remove
s 2 , s · (s + 1), s · (s + 2), and so on. You are done when s 2 > n. Do this with both a
HashSet<Integer> and a BitSet*/


package ChapterCollection;
import java.util.*;
public class SieveAlgo {

    public void  seiveoferathostenes(int n) {
        if (n < 2) {
            throw new IllegalArgumentException("Value of n should be greater than 2");
        }
        Set<Integer> num = new HashSet<>(n);

        for (int i = 2; i <=n && i >= 2; i++) {
            num.add(i); }

        for (int i = 2; i <= Math.sqrt((double) n); i++) {
            if (num.contains(i)) {
                for (int j = i * i; j <= n && j > 0; j+=i) {
                    num.remove(j);
                }
            }
        }

        ArrayList<Integer>  arr = new ArrayList<>(num);

        Iterator<Integer> itr = arr.iterator();
        while(itr.hasNext()){
            int a = itr.next();
            System.out.println(a);
        }
    }
}


class algoTester
{
    public static void main(String args[]){
        SieveAlgo obj= new  SieveAlgo();
        obj.seiveoferathostenes(10);

    }
}