import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number");
        
        // int num = System.in.read(); // returns askii value
        // System.out.println(num - 48);


        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);

        // bf.close();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);

    }
}
