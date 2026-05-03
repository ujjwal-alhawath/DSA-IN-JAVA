public class LC238 {
    
    public static int[] productExceptSelf(int[] nums) {
        int n= nums.length;
       int [] left = new int[n];
          int [] right = new int[n];
          left[0]=1;
          right[n-1]=1;
           for(int i =1 ; i<n; i++){
            left[i]=left[i-1]*nums[i-1];
           }
           for (int j=n-2; j>=0; j--){
            right[j]=right[j+1]*nums[j+1];
           }
           int [] ans= new int[n];
           for(int k =0; k<n; k++){
            ans[k]=left[k]*right[k];
           }
           return ans;

    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        int [] ans = productExceptSelf(nums);
        for(int i =0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }

    
}
