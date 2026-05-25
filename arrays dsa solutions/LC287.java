public class LC287 {
   
    public int findDuplicate(int[] nums) {
        int slow = nums[0], fast = nums[0];
        do { 
            slow=nums[slow]; fast=nums[nums[fast]];
           } 
        while(slow!=fast);
        slow = nums[0];
        while (slow != fast) 
            { 
                slow=nums[slow]; fast=nums[fast]; 
            }
        return slow;
    }
    public static void main(String[] args) {
        LC287 obj = new LC287();
        int[] nums = {1,3,4,2,2};
        System.out.println(obj.findDuplicate(nums));
        
    }

}

//in this solution the time complexity is O(n) and space complexity is O(n) but easy to understand and implement but the above solution is better than this one because it has O(1) space complexity and O(n) time complexity but it is a bit difficult to understand and implement
// class Solution {
//     public int findDuplicate(int[] nums) {
//         boolean[] arr = new boolean[nums.length];
//         for(int i : nums) {
//             if(arr[i]) {
//                 return i;
//             } else {
//                 arr[i] = true;
//             }
//         }
//         return 0;
//     }
// }


