package HashMapDataStructure;

public class HMTester {


    public static void main(String[] args) {
        HM tmhm = new HM();
        tmhm.put("1", "Dashmeet");

        tmhm.put("2", "Singh");
        tmhm.put("3", "Kaler");

        Entry e = tmhm.get("1");
        Entry e1 = tmhm.get("2");
        Entry e2 = tmhm.get("3");

        System.out.println( e.getKey() + " " + e.getValue());
        System.out.println(e1.getKey() + " " + e1.getValue());
        System.out.println(e2.getKey() + " " + e2.getValue());

    }
}