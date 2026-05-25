public class LC283 {
   
    public void moveZeroes(int[] nums) {

        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }
        }
     
    }
    public static void main(String[] args) {
        LC283 obj = new LC283();
        int[] nums = {0,1,0,3,12};
        obj.moveZeroes(nums);
        for(int i:nums){
            System.out.print(i+" ");
        }
        
    }
}

