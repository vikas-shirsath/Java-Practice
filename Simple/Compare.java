import java.util.*;

public class Compare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Nos.");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x==y){
            System.out.println("Equal");
        } else if(x>y){
            System.out.println("First is greater");
        } else {
            System.out.println("First is lesser");
        }
    }
}
