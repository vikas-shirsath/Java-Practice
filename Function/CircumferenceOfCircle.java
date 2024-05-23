import java.util.*;

public class CircumferenceOfCircle {
    public static double circumference(int r) {
        double cf = 2*(22/7)*r;
        return cf;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        double cf = circumference(r);
        System.out.println("Circumference of circle is "+cf);
    }
}
