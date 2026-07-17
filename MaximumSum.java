class MaximumSum {

    public static int maximumSubarraySum(int[] nums, int k) {
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }
        maxSum = sum;
        for (int i = 0; i < nums.length - k; i++) {
            sum = sum - nums[i] + nums[i + k];
            if (sum > maxSum) {
                maxSum = sum;
            }

        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int k = 2;
        maximumSubarraySum(nums, k);
        System.out.println(maximumSubarraySum(nums, k));
    }
}
