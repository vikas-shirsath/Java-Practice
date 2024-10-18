import java.util.*;
class CalArea {
    void area(int r) {
        System.out.println("area of circle is "+(22/7)*(r*r));
    }

    void area(double s) {
        System.out.println("Area of square is : " + s*s);
    }

    void area(int l, int b) {
        System.out.println("Area of rectangle is : " + l*b);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalArea a = new CalArea();
        System.out.println("Enter the radius of circle : ");
        int r = sc.nextInt();
        a.area(r);
        System.out.println("Enter the side the square : ");
        double s = sc.nextInt();
        a.area(s);
        System.out.println("Enter the sides the rectangle : ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        a.area(l,b);
    }
}