import java.util.*;

public class SumOfOddNos {
    public static void sumOfOddNos(int n) {
        int sum = 0;
        for(int i=n; i>0; i--) {
            if (i%2!=0) {
                sum = sum + i;   
            }
        }

        System.out.println("Sum of n natural odd numbers is "+ sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sumOfOddNos(n); 
    }
}
