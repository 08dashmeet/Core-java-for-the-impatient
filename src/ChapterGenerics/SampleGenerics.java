package ChapterGenerics;

    public class SampleGenerics<T> {
        T obj1;

        SampleGenerics(T a){
            obj1 = a;
        }

        public T get() {
            return obj1;

        }

      /*  void display(){
        System.out.println("The number is "obj);
        }*/
    }

    class genericsTester{

        public static void main(String args[]){
            SampleGenerics s = new SampleGenerics( new Double(45));
            double d = (Double) s.get();

            System.out.println("The number is "+  s.get());

            SampleGenerics<String> s1 = new SampleGenerics<>("habahaba");
            System.out.println("The String is "+s1.get());



        }
    }




