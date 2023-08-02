
import java.util.Arrays;
public class FindIn2dArray {
    public static void main(String[] args) {
        int [][] arr= {
                {22, 33, 55, 66, 99},
                {12, 99, 878},
                {11, 22, 888, 45}
        };
        int target=33;
        int[]ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int [][] arr, int target){

        for(int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }

return new int[]{-1, -1};
    }
}
