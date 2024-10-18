import java.util.*;
import java.lang.String;
public class City {
    City(String name,long pop){
        this.name=name[];
        this.pop=pop[];
    }
    Scanner in = new Scanner(System.in);
    String[] name= new String[5];
    long[] pop= new long[5];
    // Accepting elements in array
    void accept(){
        System.out.println("Enter City names and Population:");
        for(int i=0;i<5;i++){
            System.out.println(name[i]);
            name[i]=in.next();
        }
        for(int i=0;i<5;i++){
            System.out.println(pop[i]);
            pop[i]=in.nextLong();
        }
    }
    // Accessing elements of array
    void access(){
        for(int i=0;i<5;i++){
            System.out.println(name[i]);
            System.out.println(pop[i]);
        }
    }
    public static void main(String[] args) {
        City c1=new City[];
        c1.accept();
        c1.access();
    }
}