import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;

        try {
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
        finally {
            br.close();
        }

        // try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        //     num = Integer.parseInt(br.readLine());
        //     System.out.println(num);
        // }
    }   
}