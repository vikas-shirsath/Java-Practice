import java.util.*;

public class UnariOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //PreIncrement
        b = a++;  
        System.out.println(a);
        System.out.println(b);

        //PostIncrement
        a = sc.nextInt();
        b = sc.nextInt();
        b = ++a;
        System.out.println(a);
        System.out.println(b);
    }


}
