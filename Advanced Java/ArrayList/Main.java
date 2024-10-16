import java.util.ArrayList;
import java.util.Collection;
import javax.xml.transform.Source;

public class Main {
    public static void main(String[] args) {
        
        Collection<Integer> nums = new ArrayList<Integer>();
        
        nums.add(6);
        nums.add(8);
        nums.add(4);
        nums.add(5);

        for(int n : nums ) {
            System.out.println(n);
        }

    }    
}