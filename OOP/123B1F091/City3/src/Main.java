import java.util.*;
import java.lang.*;

public class Main {

    static class City {
        public String Name ;
        public long pop;

        void display() {
            System.out.println("Name of city is " + this.Name + " and population of city is " + this.pop + ".");
        }
        City(String name, long popu) {
            this.Name = name;
            this.pop = popu;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        City[] c2 = new City[2];
        for (int i = 0; i < c2.length; i++) {
            System.out.println("Enter name of city no. "+(i+1)+" : ");
            String name = sc.next();
            System.out.println("Enter Popution of city : ");
            long pop = sc.nextLong();
            c2[i] = new City(name, pop);
        }

        for (int i = 0; i < c2.length; i++) {
            c2[i].display();
        }

    }
}