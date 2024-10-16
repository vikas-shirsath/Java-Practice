import java.util.ArrayList;
import java.util.Collection;
import javax.xml.transform.Source;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Integer> nums = new ArrayList<Integer>();
        
        nums.add(6);
        nums.add(8);
        nums.add(4);
        nums.add(5);

        System.out.println(nums.indexOf(5));

        System.out.println(nums.get(2));
        for(int n : nums ) {
            System.out.println(n);
        }

    }    
}