package ChapterException;

public class ChapterFinally {

    public static void main(String args[]){
        try {
            int[] arr = new int[5];
            arr[10] = 56;
            System.out.println(arr[10]);
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundException");

        }

        finally{

            System.out.println("finally block");
        }
    }
}
