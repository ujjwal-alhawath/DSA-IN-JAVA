   import java.util.HashMap;
public class LC169 {
 



    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;

        for (int num : nums) {

            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > n / 2) {
                return num;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        LC169 obj = new LC169();
        int [] nums = {2,2,1,1,1,2,2};
        int ans = obj.majorityElement(nums);
        System.out.println(ans);
    }
}

