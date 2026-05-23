import java.util.HashSet;
import java.util.Set;

public class LC217 {
    
   
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (!seen.add(num)) {  
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        LC217 obj = new LC217();
        int [] nums = {1,2,3,1};
        boolean ans = obj.containsDuplicate(nums);
        System.out.println(ans);
    }
}

