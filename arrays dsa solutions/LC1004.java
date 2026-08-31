class LC1004 {
    public int longestOnes(int[] nums, int k) {
        int first=0;
        int second = 0;
        int flip =0;
        int maxx =0;
        for(first=0 ; first<nums.length; first++){
            if(nums[first]==0){
                flip++;
            }
            while(flip>k){
                if(nums[second]==0){
                    flip--;
                }
                second++;
            }
            maxx = Math.max(maxx , first-second+1);

        }
        return maxx;
    }
}