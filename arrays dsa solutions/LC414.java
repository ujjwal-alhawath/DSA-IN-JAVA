class LC414 {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> mh = new PriorityQueue();
        HashSet<Integer> h = new HashSet();
        for (int i =0 ; i<nums.length; i++){
            if(h.contains(nums[i]) ){
                continue;
            }
            if(mh.size()<3){
                mh.add(nums[i]);
                h.add(nums[i]);
            }
            else if (mh.peek()<nums[i]){
                h.remove( mh.poll());
               
                mh.add(nums[i]);
                  h.add(nums[i]);
            }
        }
        if(mh.size()!=2) return (int) mh.peek();
        mh.poll();
       return (int) mh.peek();

    }
}