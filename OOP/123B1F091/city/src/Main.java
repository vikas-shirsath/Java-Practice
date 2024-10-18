import java.util.*;
import java.lang.String;
public class Main {
    Scanner in = new Scanner(System.in);
    String[] name= new String[5];
    long[] pop= new long[5];
    // Accepting elements in array
    void accept(){
        System.out.println("Enter City names and Population:");
        for(int i=0;i<5;i++){
            name[i]=in.next();
            System.out.println(name[i]);

        }
        for(int i=0;i<5;i++){
            pop[i]=in.nextLong();
            System.out.println(pop[i]);

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
        Main c1=new Main();
        c1.accept();
        c1.access();
    }
}