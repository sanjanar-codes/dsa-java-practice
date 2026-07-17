public class kadanes {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            maxSum = Math.max(maxSum, currentSum);

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        kadanes obj = new kadanes();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = obj.maxSubArray(nums);
        System.out.println("Maximum sum of contiguous subarray: " + result);
    }
}
