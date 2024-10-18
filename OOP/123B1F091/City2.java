import java.util.*;
import java.lang.*;

public class Main {

    static class City {
        Scanner sc = new Scanner(System.in);
        public String Name ;
        public long pop;

        void getter(int i) {
            System.out.println("Enter the Name of city no. " + (i+1)+" : ");
            this.Name = sc.next();
            System.out.println("Enter the Population of City : ");
            this.pop = sc.nextInt();
        }

        void display() {
            System.out.println("Name of city is " + this.Name + " and population of city is " + this.pop + ".");
        }
        City(int i) {
            getter(i);
        }
    }

    public static void main(String[] args) {
//        byte num = 90;
//        System.out.println(num);
//        num = 1233;
//        System.out.println(num);


//        City c1 = new City();
//        System.out.println("Enter the name of city : ");
//        c1.Name = sc.next();
//        System.out.println("Enter Population of City : ");
//        c1.pop = sc.nextInt();
//        System.out.println("Name of city is " + c1.Name + " and population of city is " + c1.pop + ".");

        City[] c2 = new City[2];
        for (int i = 0; i < c2.length; i++) {
            c2[i] = new City(i);
        }

        for (int i = 0; i < c2.length; i++) {
            c2[i].display();
        }

    }
}