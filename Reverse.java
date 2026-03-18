
public class Reverse {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 7, 9, 12 };
        boolean found = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                found = false;
                break;

            }
        }

        if (found) {
            System.out.println("sorted");
        } else {
            System.out.println("not sorted");
        }
    }
}
