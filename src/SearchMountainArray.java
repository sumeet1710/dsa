public class SearchMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 8, 6, 4, 2};
        int target = 2;
    int ans = search(arr, target);
        System.out.println(ans);
}

    static int search(int[]arr,int target){
        int peak=peakSearch(arr);
        int firstTry=orderAgnosticbinarySearch(arr,target,0,peak);
        if(firstTry!=-1){
            return firstTry;}
        return orderAgnosticbinarySearch(arr,target,peak+1, arr.length-1);



    }
    static int peakSearch(int arr[]) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] > arr[mid + 1]) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
            return s;
        }


    static int orderAgnosticbinarySearch(int [] arr,int target,int s,int e){
        boolean isAsc=arr[s]<arr[e];
         while(s<=e){
             int mid=s+(e-s)/2;

             if(arr[mid]==target){
                 return mid;
             }
             if(isAsc){
                 if(arr[mid]>target){
                     e=mid-1;
                 }else{
                     s=mid+1;
                 }}
                 else{
                     if(arr[mid]<target){
                         e=mid-1;
                     }
                     else{
                         s=mid+1;
                     }
             }

         }return -1;
    }
}
