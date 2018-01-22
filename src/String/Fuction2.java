package String;

public class Fuction2 {
    public static void main(String args[]) {
        StringBuffer sr = new StringBuffer("Dashmeet");
        StringBuffer s1 = new StringBuffer("Dashmeet");
        int l = sr.length();
        int c = sr.capacity();

      System.out.println("Length "+l);
        System.out.println("Capacity "+c);

         s1 = sr.append(" Singh Kaler");
        System.out.println(s1);

        StringBuffer str = new StringBuffer("Kaler");
        String revstr = str.reverse().toString();
        System.out.println(revstr);

    }

}
