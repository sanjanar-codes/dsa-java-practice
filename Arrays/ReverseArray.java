import java.util.Arrays;

public class ReverseArray {

    public int[] reverseArray(int arr[]) {
        int left = 0;
        int temp;
        int right = arr.length - 1;
        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }

    public static void main(String[] args) {
        ReverseArray obj = new ReverseArray();
        int[] arr = { 1, 2, 3, 4, 5 };
        obj.reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

}
