import java.util.*;

public class AdultConditional {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("User is Adult");
        }
        else{
            System.out.println("User is not Adult");
        }
    }
}
