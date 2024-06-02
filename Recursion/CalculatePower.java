//print x^n (stack height = n)

import java.util.*;

public class CalculatePower {
    public static int calcPower(int x, int n){
        if (x == 0) {
            return 0;
        }        
        if (n == 0) {
            return 1;
        }
        int powerMOne = calcPower(x, n-1);
        int powerN = x * powerMOne;
        return powerN;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int ans = x * calcPower(x, n-1);
        System.out.println(ans);
    }
}






//We can even use below code since stack hieght will become n+1 but +1 is neglegible
// import java.util.*;

// public class CalculatePower {
//     public static int calcPower(int x, int n){
//         if (x == 0) {
//             return 0;
//         }        
//         if (n == 0) {
//             return 1;
//         }
//         int powerMOne = calcPower(x, n-1);
//         int powerN = x * powerMOne;
//         return powerN;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int n = sc.nextInt();
//         int ans = calcPower(x, n);
//         System.out.println(ans);
//     }
// }