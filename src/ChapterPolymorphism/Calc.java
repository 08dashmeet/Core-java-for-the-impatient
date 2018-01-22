package ChapterPolymorphism;

public class Calc {

    public void  Rec(int l , int b){


              int area = l*b;
              System.out.println("The area is "+area);
    }
    public void Rec(int l , int b,int h){
        int length = l;
        int breadth = b;
        int heigth = h;

        int vol = l*b*h;
        System.out.println("The vol is "+vol);

    }

}

    class A{
    public static void main(String args[]){

        Calc obj = new Calc();
        obj.Rec(3,4);
        obj.Rec(5,7,8);


    }
}



