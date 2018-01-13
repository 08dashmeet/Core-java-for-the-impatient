package ChapterInterface.Average.Computation;

public class TesterMeasurable {
    public static void main(String args[]){

        Measurable[]  arr = new Measurable[3];
        arr[0]= new Employee(980.90);
        arr[1]= new Employee(98450.90);
        arr[2]= new Employee(56780.90);

         double avg = Data.average(arr);
         System.out.println("The avg sal is"+avg);








    }
}
