public class PivotRBS {
    public static void main(String[] args) {
        int [] arr={15,1,3,5,6};
        int ans=findPivot(arr);
        System.out.println(ans);
    }
    static int findPivot(int[]arr){
        int s=0;
        int e= arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid<e && arr[mid]>arr[mid+1]) {
            return mid;}
            if(mid>s&&arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[s]>=arr[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }

        }return-1;
    }
}
