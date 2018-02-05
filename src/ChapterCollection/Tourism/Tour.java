package ChapterCollection.Tourism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

    public class Tour {
        String country;
        int days;
        double cost;

        Tour(String s, int d, double c) {
            country = s;
            days = d;
            cost = c;
        }
    }

    class TourComparatorCost implements Comparator {
        Tour obj1;
        Tour obj2;

        public int compare(Object o1,Object o2){
            obj1 = (Tour)o1;
            obj2 = (Tour)o2;

            if(obj1.cost < obj2.cost){ return -1;}
            else if(obj1.cost > obj2.cost){ return 1;}
            else{return 0;}
        }
    }

    class TourComparatorDays implements Comparator{
        Tour obj1;
        Tour obj2;

        public int compare(Object o1,Object o2){
            obj1 = (Tour)o1;
            obj2 = (Tour)o2;

            if(obj1.days < obj2.days){ return -1;}
            else if(obj1.days >obj2.days){ return 1;}
            else{return 0;}

        }
    }

    class TourComparatorCountry implements Comparator {
        Tour obj1;
        Tour obj2;

        public int compare(Object o1, Object o2) {
            obj1 = (Tour) o1;
            obj2 = (Tour) o2;

            if (obj1.country.compareTo(obj2.country) < 1) {
                return -1; }
            else if (obj1.country.compareTo(obj2.country) > 1) {
                return 1;}
            else {
                return 0;}

        }
    }

    class TourTester {
        public static void main(String arrgs[]){
            ArrayList<Tour> arr = new ArrayList<Tour>();
            arr.add(new Tour("China",10,200));
            arr.add(new Tour("Australia",9,250));
            arr.add(new Tour("Canada",20,600));
            arr.add(new Tour("Austria",12,450));


            System.out.println("Sorting based on cost-:");
            Collections.sort(arr,new TourComparatorCost());
            Iterator<Tour> itr = arr.iterator();
            while(itr.hasNext()){
                Tour t = itr.next();
                System.out.println(t.country+"   "+t.days+"   "+t.cost);
            }
            System.out.println();
            System.out.println("Sorting based on days-: ");


            Collections.sort(arr,new TourComparatorDays());
            Iterator<Tour> itr1 = arr.iterator();
            while(itr1.hasNext()) {
                Tour t1 = itr1.next();
                System.out.println(t1.country + "   " + t1.days + "   " + t1.cost);
            }
            System.out.println();
            System.out.println("Sorting based on Country-: ");


            Collections.sort(arr,new TourComparatorCountry());
            Iterator<Tour> itr3 = arr.iterator();
            while(itr3.hasNext()){
                Tour t3 = itr3.next();
                System.out.println(t3.country+"   "+t3.days+"   "+t3.cost);


            }
        }
    }

