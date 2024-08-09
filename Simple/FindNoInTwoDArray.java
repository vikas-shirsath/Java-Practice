import java.util.*;

public class FindNoInTwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][] twoDArray = new int[row][col];

        for(int i = 0; i < row; i++) {
            for(int j=0; j<col; j++) {
                twoDArray[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for(int i = 0; i < row; i++) {
            for(int j=0; j<col; j++) {
                if (twoDArray[i][j] == x) {
                    System.out.println("x found at "+i+" "+j+" ");
                    break;
                }
            }
        }
    }
}
