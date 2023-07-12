import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={11,22,33,44,55,66,77,88,99};
        int target=82;
        int ans=search( arr,target);
        System.out.println(ans);
    }
    static int search(int []arr,int target){
        int s=0;int e= arr.length-1;

        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]>target){
                e=mid-1;
            }else if(arr[mid]<target){
                s=mid+1;
            }
            else{
                return mid;
        }
    }
        return -1;
}

}
