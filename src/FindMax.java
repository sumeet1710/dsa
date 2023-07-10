public class FindMax {
    public static void main(String[] args) {
        int arr[] = {55, 77, 99, 111,33, 22};
        System.out.println(max1(arr));
    }

    static int max1(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }

        }
        return max;
    }
}





