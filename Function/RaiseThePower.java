import java.util.*;

public class RaiseThePower {
    public static int raiseToPower(int x, int n) {
        int ans = 1;
        for(int i=1; i<=n; i++) {
            ans = ans * x;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        
    }
}
