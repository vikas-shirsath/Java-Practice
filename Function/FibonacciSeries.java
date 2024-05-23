import java.util.*;

public class FibonacciSeries {
    public static void fibonacciSeries(int n) {
        int a = 0, b = 1;
        System.out.println(a);
        if (n>1) {
            for(int i=1; i<n; i++) {
                int temp = b;
                System.out.println(b);
                b = a + b;
                a = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacciSeries(n);
    }
    
}
