//program to remove whitespaces from a string

package String;

public class Spaces {
    public static void main(String args[]) {

        String a = "Indian Technologies Services ";

        char[] c = a.toCharArray();
        int l = c.length;
        int pos1=0,pos2=0;

        for (int i = 0; i < l; i++) {
            int d = c[i];
            if(d==32){
                pos1 = i;
                break;
            }

        }
        for (int j = pos1+1; j < l; j++) {
            int e = c[j];
            if(e==32){
                pos2 = j;
                break;
            }

        }

        for(int i=pos1+1;i<=l-1;i++){
            c[i-1]=c[i];

        }
        for(int i=pos2;i<l;i++){
            c[i-1]=c[i];

        }


        for(int i =0;i<l;i++){
            System.out.print(c[i]);
        }

    }
}