public class LC643 {
        public double findMaxAverage(int[] nums, int k) {

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        for (int i = k; i < nums.length; i++) {

            sum += nums[i] - nums[i - k];

            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }
    public static void main(String[] args) {
        LC643 obj = new LC643();
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(obj.findMaxAverage(nums, k));
    }
}
