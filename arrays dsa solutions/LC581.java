class LC581 {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;

        int max = Integer.MIN_VALUE;
        int right = -1;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            if (nums[i] < max) {
                right = i;
            }
        }

        if (right == -1) {
            return 0;
        }

        int min = Integer.MAX_VALUE;
        int left = -1;

        for (int i = n - 1; i >= 0; i--) {
            min = Math.min(min, nums[i]);
            if (nums[i] > min) {
                left = i;
            }
        }

        return right - left + 1;
    }
}
