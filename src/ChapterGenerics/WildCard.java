package ChapterGenerics;

public class WildCard<T extends Number> {
    T[] obj;

    WildCard(T[] o){
        obj= o;
    }

    double Average(){
        double sum = 0.0;
        for(int i =0; i<obj.length;i++) {
            sum= sum + obj[i].doubleValue();
        }
        return sum/obj.length;
    }

    boolean sameAvg(WildCard<?> v) {
        if (Average() == v.Average())
            return true;
        else

            return false;
    }
}
class WildCardTester {
    public static void main(String args[]) {

        Integer[] num1 = {1, 5, 89, 34, 6,12,33};
        WildCard<Integer> g1 = new WildCard<>(num1);
        double ans1 = g1.Average();
        System.out.println(ans1);

        Double[] num2 = {1.00, 5.00, 89.00, 34.00, 6.00,12.00,33.00};
        WildCard<Double> g2 = new WildCard<>(num2);
        double ans2 = g2.Average();
        System.out.println(ans2);

        if(g1.sameAvg(g2)){
            System.out.println("The avg is same");}

            else{
            System.out.println("The avg is not same");
        }
    }

}


