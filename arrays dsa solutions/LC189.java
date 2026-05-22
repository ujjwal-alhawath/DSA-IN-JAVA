public class LC189 {
    
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        int n=nums.length;
        reverse( nums, 0 ,n-1);
        reverse( nums ,0,k-1);
        reverse( nums ,k,n-1);
        
    }
    public void reverse(int[] nums ,int s, int e){
        while(s < e){
            int temp = nums[s];
            nums[s]= nums[e];
            nums[e]= temp;
            s++;
            e--;

        }
        
    }
    public static void main(String[] args) {
        LC189 obj = new LC189();
        int [] nums = {1,2,3,4,5,6,7};
        int k = 3;
        obj.rotate(nums, k);
        for(int i =0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
}


