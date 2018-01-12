package ChapterInterface.Average.Computation;

 class Employee  implements Measurable{
     double sal;
     public Employee(double sal){
         this.sal= sal;

     }
    public  double getMeasure(){
         return this.sal;

     }
     void display(){
         System.out.println("the sal is "+ this.sal);
     }

}
