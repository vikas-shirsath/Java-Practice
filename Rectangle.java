import java.util.*;

public class Rectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=1; i<=n; i++){
            // System.out.print("*");
            for(int j=0; j<m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}