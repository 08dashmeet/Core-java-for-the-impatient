package ChapterCollection;

import java.util.HashMap;
import java.util.*;

public class ChapterMap {

    public static void main(String args[]){
        Map<String,Integer> m = new HashMap<>();
        m.put("asd",455);
        m.put("lko",455);
        m.put("qww",789);
        m.put("pp",31);

        int l = m.size();
        //System.out.println(l);

       /*Iterator<Map.Entry> itr = m.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<Integer,String> j = itr.next();
            System.out.println("The key is "+j.getKey()+"  The Value is "+j.getValue());
        }*/


        for(Map.Entry a : m.entrySet()){
            System.out.println("The key is "+a.getKey()+"  The Value is "+a.getValue());
        }


    }

}
