public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={11,22,33,44,55,66,77,88,99};
        int target=66;
    }
    static int search(int arr,target){
        int s=0;int e=arr.length-1;
        int mid=s+(e-s)/2;
        while(s>=e){
            if(mid>target){
                e=mid-1;
            }else if(mid<target){
                s=mid+1;
            }
        }
    }
}
