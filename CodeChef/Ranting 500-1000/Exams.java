import java.lang.*;
import java.util.*;

class Exams
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
        for (int i = 0;i < T ; i++ ) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            int per = (X * Y);
            if (Z > per / 2 ) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } 
	}
}