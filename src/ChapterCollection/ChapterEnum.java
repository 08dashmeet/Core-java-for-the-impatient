//Example of enumSet

package ChapterCollection;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum color{
    red,blue,green;
}

public class ChapterEnum {

    public static void main(String args[]) {
        Set<color> ee = EnumSet.allOf(color.class);

        Iterator<color> itr = ee.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        Set<color> ee1 = EnumSet.noneOf(color.class);

        Iterator<color> itr1 = ee1.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }

    }
}
