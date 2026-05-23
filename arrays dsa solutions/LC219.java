import java.util.HashMap;

public class LC219 {
    
    public boolean containsNearbyDuplicate(int[] nums, int k) {
          HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i]) && i-map.get(nums[i])<=k){
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
    public static void main(String[] args) {
        LC219 obj = new LC219();
        int [] nums = {1,0,1,1};
        boolean ans = obj.containsNearbyDuplicate(nums, 1);
        System.out.println(ans);
    }
}

