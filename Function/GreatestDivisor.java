import java.util.*;

public class GreatestDivisor {
    public static int gretestCommonDivisor(int a, int b) {
        int gcd = 1;
        while (a!=b) {
            if (a>b) {
                a = a - b;
            }
            if (b>a) {
                b = b - a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int GDC = gretestCommonDivisor(number1, number2);
        System.out.println(GDC);
    }
}
