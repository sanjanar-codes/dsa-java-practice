public class MissingNum {
    //finding missing num in series
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 6 };

        int arrSum = 0;
        int n = 6;
        int sum = n * (n + 1) / 2;
        for (int i = 0; i < arr.length; i++) {
            arrSum = arrSum + arr[i];
        }

        int missing = sum - arrSum;
        System.out.println("missing= " + missing);
    }

}
