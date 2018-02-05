package ChapterGenerics;

public class GenericConstructor {

        double  a;

        <T extends Number> GenericConstructor(T o){
            a = o.doubleValue();
        }

        void display(){

            System.out.println(a/10);
        }
    }

    class GConstructorTester {
        public static void main(String args[]) {
            GenericConstructor obj1 = new GenericConstructor(122.45f);
            GenericConstructor obj2 = new GenericConstructor(34);
            obj1.display();
            obj2.display();


        }

}
