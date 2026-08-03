public class LC713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k<=1){
            return 0;
        }
        int n=nums.length;
        int i=0;
         int j=0;
          int c=0;
        int p=1;
        while(j<n){
            p=p*nums[j];
            while(p>=k){
                p/=nums[i];
                i++;
            }
            c+=(j-i)+1;
            j++;
        }
        return c;
    }

} {
    
}
