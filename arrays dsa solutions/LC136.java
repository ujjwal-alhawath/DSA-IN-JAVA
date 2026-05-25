public class LC136 {
   
    public int singleNumber(int[] nums) {
        int xor =0;
        for(int n:nums){
            xor^=n;
        }
        return xor;
    }
    public static void main(String[] args) {
        LC136 obj = new LC136();
        int[] nums = {2,2,1};
        System.out.println(obj.singleNumber(nums));
        
    }
}


