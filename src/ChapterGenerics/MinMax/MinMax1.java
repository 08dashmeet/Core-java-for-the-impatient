package ChapterGenerics.MinMax;

    interface MinMax1<T extends Comparable<T>> {

        T min();
        T max();
    }


    class A< T extends Comparable<T>> implements MinMax1<T>
    {
        T[] rr;

        A(T[] o){
            rr = o;
        }

        public  T min(){
            T minno = rr[0];
            for(int i =0;i< rr.length;i++){
                if(rr[i].compareTo(minno)< 0)
                    minno = rr[i];

            }
            return minno;
        }

        public  T max(){
            T maxno = rr[0];
            for(int j =0;j< rr.length;j++){
                if(rr[j].compareTo(maxno)> 0)
                    maxno = rr[j];}
            return maxno;

        }

    }


    class  MinMaxTester{
        public static void main(String args[]){

            Integer[] a = {21,4,1,6,4};
            A<Integer> obj = new A(a);
            System.out.println("The min no. is"+obj.min());
            System.out.println("The max no. is"+obj.max());
        }
    }

