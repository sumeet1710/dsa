public class FloorBinarySearch {
    public static void main(String[] args) {
        int []arr={2,3,22,22,22,33,66,66,66,66,66,77,88,99};
        int target=66;
        int ans=findFloorNo(arr,target);
        System.out.println(ans);
    }
    static int findFloorNo(int[]arr,int target){
        int s=0;
        int e=arr.length-1;

        while(s<=e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] < target) {
                s = mid + 1;
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                return mid;
            }
        }
        return e;
    }
}
