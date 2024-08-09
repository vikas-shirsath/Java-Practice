import java.util.*;
public class Calculater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z;
        int button = sc.nextInt();

        switch(button){
            case 1 :    z=x+y;
                        System.out.println(z);
            break;
            case 2 :    z=x-y;
                        System.out.println(z);
            break;
            case 3 :    z=x*y;
                        System.out.println(z);
            break;
            case 4 :    z=x/y;
                        System.out.println(z);
            break;
            default :   System.out.println("Invalid");
        }
    }
    
}
