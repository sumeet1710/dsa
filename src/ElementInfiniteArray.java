public class ElementInfiniteArray {
    public static void main(String[] args) {
        int[]arr={3,4,6,9,11,15,18,22,33,44,55,66,77,88};
       int target=88;
        System.out.println(search(arr,target));
    }


    static int search(int[] arr, int target) {
        int s = 0;
        int e = 1;
        while(target>arr[e]){
        int temp = e + 1;
         e = e+(e - s + 1) * 2;
         s=temp;
    }
        return binarySearch(arr,target,s,e);}

    static int binarySearch(int[] arr, int target,int s, int e) {



        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] < target) {
                s = mid + 1;
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;
    }
}