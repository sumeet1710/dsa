public class FirstAndLastOccurance {
    public static void main(String []arg){
        int[]arr={2,3,4,5,7,9,9,9,9,9,9,9,11,15,17};

      //  int first=search(arr,9,true);
       // int last=search(arr, 9,false);
        //System.out.println(first);
       // System.out.println(last);
        int startIndex=search(arr,9,true);
        int endIndex=search(arr,9,false);
        System.out.println(startIndex);
        System.out.println(endIndex);

    }
    public int[] searchRange(int[]arr, int target){
        int[]ans={-1,-1};
        int s=search(arr,target,true);
        int e=search(arr,target,false);
        ans[0]=s;
        ans[1]=e;
        return ans;
    }
    static int search(int arr[],int target,boolean findStartIndex){

        int s=0;
        int e=arr.length-1;
        int ans=-1;
        while(s<=e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] < target) {
                s = mid + 1;
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                ans=mid;
                if(findStartIndex==true) {
                    e = mid - 1;
                }
                else{s=mid+1;}

            }


        }
    return ans;
}}
