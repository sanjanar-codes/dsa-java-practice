public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }

        }
        return slow + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicates obj = new RemoveDuplicates();
        int[] nums = { 1, 1, 2, 2, 3, 4, 4, 5 };
        int newLength = obj.removeDuplicates(nums);
        System.out.println("New length after removing duplicates: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}