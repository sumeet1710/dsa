public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 8, 6, 4, 2};
        int target=11;
        int ans=oABS(arr,target);
        System.out.println(ans);
    }

    static int oABS(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        boolean isAsc = arr[s] < arr[e];
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }


        }
        return -1;

    }
}