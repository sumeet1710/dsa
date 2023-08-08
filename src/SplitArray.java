public class SplitArray {
    public static void main(String[] args) {
        int[] arr={7,2,5,8,10};
        System.out.println(splitArray(arr,2));

    }
    static int splitArray(int [] arr, int m){
        int s=0;int e=0;
        for(int i=0;i<arr.length;i++){
            s=Math.max(s,arr[i]);//end of the loop this contain the max element of the array
            e=e+arr[i];
        }
        //binary search
        while(s<e){
            //try to middle as potential ans
            int mid=s+(e-s)/2;
            // calculate how many pieces you can divide this in with this max sum
            int sum=0;
            int pieces=1;
            for(int num : arr){
                if(sum+ num>mid){
                    // we cannot add this in this sub array, make new one
                    //we add this num in new subarray, then sum=num
                    sum=num;
                    pieces++;
                }
                else{
                    sum=sum+num;
                }

            }
            if(pieces>m){
                s=mid+1;
            }
            else{
                e=mid;
            }
        }
        return e;
    }
}
