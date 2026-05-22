// 88. Merge Sorted Array
    class LC88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = n - 1;
        int j = m - 1;
        int k = m + n - 1;

        int[] ans = new int[m + n];

        while (i >= 0 && j >= 0) {
            if (nums1[j] > nums2[i]) {
                ans[k] = nums1[j];
                j--;
            } else {
                ans[k] = nums2[i];
                i--;
            }
            k--;
        }

        while (j >= 0) {
            ans[k] = nums1[j];
            j--;
            k--;
        }

        while (i >= 0) {
            ans[k] = nums2[i];
            i--;
            k--;
        }

        for (int a = 0; a < m + n; a++) {
            nums1[a] = ans[a];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
}