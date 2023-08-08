
import java.util.Arrays;
public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {{2, 3, 4, 5},
                {6, 7, 8},
                {9, 10, 11}};
int []ans=search(arr,11);
        System.out.println(Arrays.toString(ans));



    }
    static int []search(int[][] arr, int target) {
        //int s=0;
        // int e= arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};

                }

            }
        }
        return new int[]{-1, -1};

    }


}