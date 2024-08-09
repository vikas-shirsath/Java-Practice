//Print numbers in reverse order from 5 with the help of recursion

public class RecPrintRevNumb {
    public static void printNumb(int n) {
        if (n ==0 ) {
            return;
        }
        System.out.println(n);
        printNumb(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        printNumb(n);
    }
}
