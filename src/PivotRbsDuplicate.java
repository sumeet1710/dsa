public class PivotRbsDuplicate {
    public static void main(String[] args) {
        int [] arr={2,3,4,6,8,2,2,2};
        int ans=findPivotInDuplicate(arr);
        System.out.println(ans);
    }
    static int findPivotInDuplicate(int[]arr){
        int s=0;
        int e= arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid<e && arr[mid]>arr[mid+1]) {
                return mid;}
            if(mid>s&&arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[s]==arr[mid]&&arr[mid]==arr[e]){
                    if(arr[s]>arr[s+1]){
                        return s;

            }s++;
            if(arr[e]<arr[e-1]){
                return e-1;
            }e--;

            }
            else if(arr[mid]>arr[s]||arr[mid]==arr[s]&&arr[mid]>arr[e]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }


        }return-1;
    }
}

