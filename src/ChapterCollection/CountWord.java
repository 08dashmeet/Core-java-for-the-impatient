/*Write a program that reads all words in a file and prints out how often each word occurred.
        Use a TreeMap<String, Integer>.*/

package ChapterCollection;

import java.util.*;

public class CountWord {
    public static void main(String args[]){
    ArrayList<String> arr = new ArrayList<>();
    arr.add("hi");
    arr.add("welcome");
    arr.add("hi");
    arr.add("welcome");
    arr.add("world");

    TreeMap<String,Integer> t = new TreeMap<>();
        for (String word : arr) {
            t.put(word, t.getOrDefault(word, 0) + 1);
        }

        Set s = t.entrySet();
        System.out.println(s);

}
}