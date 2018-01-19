package ChapterException;

import java.util.*;
public class ChapterThrow {

    public static void main(String args[]){

        System.out.println("Enter the value of a and b");
        Scanner sc = new Scanner(System.in);
         int a=sc.nextInt();
         int b =sc.nextInt();

        int c= a+b;
       if(c<50){
            throw new ArithmeticException();
        }
        else {
            System.out.println("The sum is"+c);
        }


    }
}
