package ChapterInterface.Average.Computation;

public class Employee  implements Measurable{

     double sal;
     public Employee(double sal){
         this.sal= sal;

     }
    public  double getMeasure(){
         return this.sal;

     }
    /* double average(Measurable[] objects) {
         for (Measurable obj : objects) {
             sal = sal + obj.getMeasure();
         }
         if (objects.length > 0) {
             return sal / objects.length;
         } else {
             return 0;
         }

     }*/

}
