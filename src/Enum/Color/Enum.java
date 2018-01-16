package Enum.Color;
enum color{
    red(10),blue(20),green(30);

  private int price; // variable of enum

    color(int a){   // constructor of enum
        price = a;
    }
    public int getPrice(){   //method of enum
        return price;
    }
}

public class Enum {
    public static void main(String args[]) {
        color[] arr= color.values();
        for(int i=0;i<3;i++){
            System.out.println(arr[i].getPrice());
        }

    }

}
