public class MinSubarrayStartIndex {
    public int minimumSubarrayStartIndex(int[] nums, int k) {
        int StartIndex = 0;
        int sum = 0;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];

            if (sum < minSum) {
                minSum = sum;
                StartIndex = 0;
            }
        }

        for (int i = 0; i < nums.length - k; i++) {
            sum = sum - nums[i] + nums[i + k];
            if (sum < minSum) {
                minSum = sum;
                StartIndex = i + 1;

            }
        }
        return StartIndex;

    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 6, 8, 10 };
        int k = 3;
        MinSubarrayStartIndex solution = new MinSubarrayStartIndex();
        System.out.println(solution.minimumSubarrayStartIndex(nums, k));
    }
}
