import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LC229 {
    
    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        List<Integer> ans = new ArrayList<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                ans.add(key);
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        LC229 obj = new LC229();
        int [] nums = {3,2,3};
        List<Integer> ans = obj.majorityElement(nums);
        System.out.println(ans);
    }
}

