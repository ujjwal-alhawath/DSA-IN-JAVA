class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int [] result = new int[n];
        int index = n-1;
        int l =0;
        int r =n-1;
        while(l<=r){
            if(Math.abs(nums[l])>Math.abs(nums[r])){
                result[index]=nums[l]*nums[l];
                l++;
            }else{
                result[index]=nums[r]*nums[r];
                r--;
            }
            index--;
        }
        return result;
    }
}