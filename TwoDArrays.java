import java.util.*;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();
        int twoDArray[][] = new int[rows][col];

        for(int i=0; i<rows; i++) {
            for(int j=0; j<col; j++) {
                twoDArray[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
