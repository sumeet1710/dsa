public class SqareRootBS {
    public static void main(String[] args) {
        int num=49;
        System.out.println(findSqareRoot(num));
    }
    static int findSqareRoot(int num){
        int s=0;
        int e= num;int ans=0;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid*mid==num){
                return mid;
            }
            else if (mid*mid<num){
                s=mid+1;
            }
            e=mid-1;
        }

    return s;
}}
