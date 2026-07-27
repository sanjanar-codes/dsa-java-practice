public class RemoveElements {

    public int removeElement(int[] nums, int val) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;

    }

    public static void main(String[] args) {
        RemoveElements re = new RemoveElements();
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        int newLength = re.removeElement(nums, val);
        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
