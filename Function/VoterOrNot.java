import java.util.*;

public class VoterOrNot {
    public static void voterOrNot(int a) {
        if (a>18) {
            System.out.println("Person is Eligible for Voting");
        } else {
            System.out.println("Person is not Eligible for voting");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        voterOrNot(a);
    }
}
