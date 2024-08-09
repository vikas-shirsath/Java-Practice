import java.util.*;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println("Enter 1 for next number and zero for end.");
        int positive = 0, negative = 0, zeros = 0;

        while(input==1) {
            int a = sc.nextInt();
            if (a>0) {
                positive++;
            } else if (a<0) {
                negative++;
            } else {
                zeros++;
            }
            System.out.println("Enter 1 for next number and zero for end.");
            input = sc.nextInt();
        }
        
        System.out.println("Positives "+positive);
        System.out.println("Negatives "+negative);
        System.out.println("Zeros "+zeros);
    }
}
