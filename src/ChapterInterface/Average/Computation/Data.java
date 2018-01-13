package ChapterInterface.Average.Computation;

public class Data {
   public static double average(Measurable[] objects) {
       double sal=0.0;
        for (Measurable obj : objects) {
            sal = sal + obj.getMeasure();
        }
        if (objects.length > 0) {
            return sal / objects.length;
        } else {
            return 0;
        }

    }

}
