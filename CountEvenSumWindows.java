class CountEvenSumWindows {
    public int countEvenSumWindows(int[] nums, int k) {
        int sum = 0;
        int evenCount = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
            if (sum % 2 == 0) {
                evenCount++;
            }
        }
        for (int i = 0; i < nums.length - k; i++) {
            sum = sum - nums[i] + nums[i + k];
            if (sum % 2 == 0) {
                evenCount++;
            }
        }

        return evenCount;
    }

    public static void main(String[] args) {

        CountEvenSumWindows obj = new CountEvenSumWindows();
        int[] nums = { 1, 2, 3, 4, 5 };
        int k = 3;
        System.out.println(obj.countEvenSumWindows(nums, k));

    }
}
