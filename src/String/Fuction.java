package String;

public class Fuction {
    public static void main(String args[]) {

        String s1 = "Never Have i Ever";
        String s2 = new String(s1);
        boolean d =s1.equals(s2);
        int start = 5;
        int end = 15;
        char[] arr = new char[20];
        s1.getChars(start, end, arr, 0);
        for(int i=0;i<end-start;i++){
            System.out.println(arr[i]);
        }
        if(s1==s2){
            System.out.println("true");
        }
        else{

            System.out.println("false");
        }
        System.out.println(d);

        String a="Ross";
        String b="Harvey";
       int ans= b.compareTo(a);
        System.out.println(ans);



    }
}
