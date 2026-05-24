import java.util.ArrayList;
import java.util.List;

public class LC448 {
   
    public List findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]) - 1;
            if (nums[idx] > 0) nums[idx] = -nums[idx];
        }
        List res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
            if (nums[i] > 0) res.add(i + 1);
        return res;
    }
    public static void main(String[] args) {
        LC448 obj = new LC448();
        int [] nums = {4,3,2,7,8,2,3,1};
        List ans = obj.findDisappearedNumbers(nums);
        System.out.println(ans);
    }
}

