public class CeilingBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 8, 9, 23, 23, 23, 27, 55, 55, 88};
        int target=4;
        int ans = findCeiling(arr, target);
        System.out.println(ans);

    }

    static int findCeiling(int[] arr, int target) {
        int s = 0;
        int e = arr.length;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid < target) {
                s = mid + 1;
            } else if (mid > target) {
                e = mid - 1;
            }
            return mid;
        }

        return s;

    }
}
