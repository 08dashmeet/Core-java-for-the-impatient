package HashMapDataStructure;

public class HM {

    private static final int size= 16;

    private Entry table[] = new Entry[size];



    public void put(String key, String value) {

        int index = key.hashCode()%16;

        Entry e = table[index];

        for (; e!= null; e = e.next) {

           if (e.key.equals(key)) {

                e.value = value;

            }
        }

        Entry entry = new Entry(key, value);
        entry.next = table[index];
        table[index] = entry;
    }


    public Entry get(String key) {

        int index = key.hashCode()%16;

        Entry e1 = table[index];


        while (e1 != null) {

            if (e1.key.equals(key)) {
                return e1;
            }
            e1 = e1.next;
        }

        return null;
    }


}