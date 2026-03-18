public class Krotate {
    //rotating elements by k position
    public static void main(String[] args) {
        int arr[] = { 6, 3, 7, 4, 2 };

        int k = 8;
        for (int i = 0; i < k; i++) {
            int temp = arr[0];
            k = k % arr.length;
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];

            }
            arr[arr.length - 1] = temp;
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j] + " ");

        }

    }
}