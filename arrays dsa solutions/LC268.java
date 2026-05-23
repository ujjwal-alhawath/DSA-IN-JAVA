public class LC268 {
    
    public int missingNumber(int[] nums) {
        int xor = nums.length;

        for (int i = 0; i < nums.length; i++)
            xor ^= i ^ nums[i];

        return xor;
    }
    public static void main(String[] args) {
        LC268 obj = new LC268();
        int [] nums = {3,0,1};
        int ans = obj.missingNumber(nums);
        System.out.println(ans);
    }
}

