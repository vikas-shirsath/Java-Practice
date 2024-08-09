//Count total paths in a maze to move from (0,0) to (n,m)
//consider maze as matrix
//to take path one can move towards either right or down

public class PathsInMaze {
    public static int countPaths(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n-1 && j == m-1) {
            return 1;
        }
        // move downwards
        int downPaths = countPaths(i+1, j, n, m);

        //move rigt
        int rightPaths = countPaths(i, j+1, n, m);
        return downPaths + rightPaths;
    }
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println(countPaths(0, 0, n, m));
    }
}