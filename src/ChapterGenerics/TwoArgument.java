package ChapterGenerics;

    public class TwoArgument<T,V>{
        T t;
        V v;

        TwoArgument(T a,V b){
            t=a;
            v=b;
        }

        T get1(){ return t;}

        V get2(){ return v;}

    }


    class TwoArgumentTester{
        public static void main(String args[]){
            TwoArgument<Integer,Integer> a = new TwoArgument<>(10,20);
            Integer i = a.get1()+a.get2();
            System.out.println(i);
        }}

