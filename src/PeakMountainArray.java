public class PeakMountainArray {
    public static void main( String []args){
        int[]arr={1,3,5,7,9,11,8,6,4,2};
        int ans=findPeak(arr);
        System.out.println(ans);

    }
    static int findPeak(int arr[]){
        int s=0;
        int e= arr.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(arr[mid]>arr[mid+1]){
                e=mid;
            }
            else{
                s=mid+1;
            }
        }
        return s;
    }
}
