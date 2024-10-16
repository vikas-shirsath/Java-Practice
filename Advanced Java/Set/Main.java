import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        
        Set<Integer> nums = new HashSet<Integer>();
        
        nums.add(6);
        nums.add(8);
        nums.add(4);
        nums.add(5);

        for(Object n : nums ) {
            System.out.println(n);
        }

    }    

}