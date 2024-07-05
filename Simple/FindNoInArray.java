import java.util.*;

public class FindNoInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        for (int i = 0; i < number.length; i++) {
            if (number[i] == x) {
                System.out.println("Number Found at index " + i);
            }
        }
    }
}
