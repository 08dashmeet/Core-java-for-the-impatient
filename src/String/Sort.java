 /*Write down the 5 String in an  string array and then sort those in
        alphabetically ascending order(withod using sort fuction).*/

package String;


public class Sort {
    public static void main(String args[]) {

        String[] names = {"Dashmeet","Ankit","Surbhi","Pande","Gulz"};
        int l = names.length;
        String temp;

        for (int i = 0; i<l; i++) {
            for (int j = 1 ;j<l-i; j++) {

                String s1 = names[j-1].toUpperCase();
                int a = s1.charAt(0);

                String s2 = names[j].toUpperCase();
                int b = s2.charAt(0);

                if(a > b){
                    temp = names[j];
                    names[j]=names[j-1];
                    names[j-1]= temp;
                }
            }
        }
        for (int p = 0; p < l; p++) {
            System.out.print(names[p]+", ");
        }
    }
}