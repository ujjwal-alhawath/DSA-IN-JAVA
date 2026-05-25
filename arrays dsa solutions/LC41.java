public class LC41 {
    
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for ( int i=0; i<n; i++){
            if (nums[i]<0){
                nums[i]*=0;          }
        }
        for( int j =0; j<n; j++){
            int t = Math.abs(nums[j])-1;
            if(t>=0 && t<n ){
                if(nums[t]>0)
                nums[t]*=-1;
                else if (nums[t]==0){
                    nums[t]=-1*(n+1);
                }
            }
           
        }
        for(int i=0; i<n; i++){
            if(nums[i]>=0){
                return i+1;
            }
        }
        return n+1;




    }
    public static void main(String[] args) {
        LC41 obj = new LC41();
        int[] nums = {3,4,-1,1};
        System.out.println(obj.firstMissingPositive(nums));
        
    }
}

