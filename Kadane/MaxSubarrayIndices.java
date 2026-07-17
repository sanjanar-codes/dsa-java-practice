public class MaxSubarrayIndices {

    public int[] maxSubArrayIndices(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum = currentSum + nums[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }

            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
        }

        return new int[] { start, end };

    }

    public static void main(String[] args) {
        MaxSubarrayIndices obj = new MaxSubarrayIndices();
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int[] result = obj.maxSubArrayIndices(nums);
        System.out.println("Start index: " + result[0] + ", End index: " + result[1]);
    }
}
