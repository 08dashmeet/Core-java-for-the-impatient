package ChapterInheritance.point;

public class LabeledPoint extends Point {
   static String label;

    public LabeledPoint(double x,double y,String label){
        super(x,y);
        this.label= label;


    }
    public String getLabel(){
        return label;
    }
    public  static void display(){
        System.out.println("the value of x is "+ x);
        System.out.println("the value of y is "+ y);
        System.out.println("the value of Label is "+ label);
    }
}
