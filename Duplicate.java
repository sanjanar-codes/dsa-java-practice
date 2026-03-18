public class Duplicate {
    //finding duplicate element in array
    public static void main(String[] args) {
        int arr[] = { 3, 7, 5, 3, 9, 7 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
