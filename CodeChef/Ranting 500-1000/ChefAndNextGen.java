// Chef and NextGen
// Chef is currently working for a secret research group called NEXTGEN. While the rest of the world is still in search of a way to utilize Helium-3 as a fuel, NEXTGEN scientists have been able to achieve 2 major milestones:

// Finding a way to make a nuclear reactor that will be able to utilize Helium-3 as a fuel
// Obtaining every bit of Helium-3 from the moon's surface
// Moving forward, the project requires some government funding for completion, which comes under one condition: to prove its worth, the project should power Chefland by generating at least A units of power each year for the next B years.

// Help Chef determine whether the group will get funded assuming that the moon has X grams of Helium-3 and 1 gram of Helium-3 can provide Y units of power.

import java.lang.*;
import java.util.*;

class ChefAndNextGen
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T ; i++) {
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    if(A*B<=X*Y) {
		        System.out.println("Yes");
		    } else {
		        System.out.println("No");
		    }
		}
	}
}