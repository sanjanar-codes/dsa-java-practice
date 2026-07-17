public class MaxAverageStartIndex {
    public int maxAverageStartIndex(int[] nums, int k) {
        int sum = 0;
        int startIndex = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxAvg;
        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }

        maxSum = sum;
        startIndex = 0;
        for (int i = 0; i < nums.length - k; i++) {
            sum = sum - nums[i] + nums[i + k];
            if (sum > maxSum) {
                maxSum = sum;
            }
            maxAvg = maxSum / k;
            startIndex = i + 1;

        }

        return startIndex;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 5, 7, 8 };
        int k = 3;
        MaxAverageStartIndex solution = new MaxAverageStartIndex();
        System.out.println(solution.maxAverageStartIndex(nums, k));

    }
}
