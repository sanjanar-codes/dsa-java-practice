public class MinSubarrayLen {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum = sum + nums[right];
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum = sum - nums[left];
                left++;
            }
        }
        if (minLength == Integer.MAX_VALUE) {
            return 0;
        } else
            return minLength;

    }

    public static void main(String[] args) {
        MinSubarrayLen minSubarrayLen = new MinSubarrayLen();
        int target = 7;
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        int result = minSubarrayLen.minSubArrayLen(target, nums);
        System.out.println("The minimum length of a subarray with sum >= " + target + " is: " + result);

    }

}
