
import java.util.Arrays;

class MovesZeros {

    public void moveZeroes(int[] nums) {
        int slow = 0;
        int temp;

        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;

                slow++;

            }
        }
    }

    public static void main(String[] args) {
        MovesZeros obj = new MovesZeros();
        int[] nums = { 0, 1, 0, 3, 12 };
        obj.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

}