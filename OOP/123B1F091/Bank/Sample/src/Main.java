import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);
    private long accNo;
    private String accName;
    private long balance;
    public void addAcc() {
        System.out.println("Enter the Account Nomber : ");
        accNo = sc.nextLong();
        return;
    }

    public static void main(String[] args) {
        Main B = new Main();
        B.addAcc();
    }
}