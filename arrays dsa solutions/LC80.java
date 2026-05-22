
class   LC80 {
    public int removeDuplicates(int[] nums) {
        int count =0;
        for (int i:nums){
            if(count<2 || nums[count-2]!=i)
            {
                nums[count++]=i;
            }

        }
        return count;
    }
    public static void main(String[] args) {
        LC80 obj = new LC80();
        int [] nums = {1,1,1,2,2,3};
        int ans = obj.removeDuplicates(nums);
        System.out.println(ans);
    }

}