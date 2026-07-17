public class MinimumSum {

    public static int minimumSubarraySum(int[] nums, int k) {
        int sum = 0;
        int minSum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];

        }
        minSum = sum;
        for (int i = 0; i < nums.length - k; i++) {
            sum = sum - nums[i] + nums[i + k];
            if (sum > minSum) {
                minSum = sum;
            }
        }
        return minSum;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 6, 8, 10 };
        int k = 3;
        minimumSubarraySum(nums, k);
        System.out.println(minimumSubarraySum(nums, k));
    }

}
