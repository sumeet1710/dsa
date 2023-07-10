// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace char

public class Main {
    public static void main(String[] args) {

        int arr1[] = {10, 15, 33, 7, 4, 8};
        int element=7;

      //  boolean ans = findNumber( arr1,element);
        int ans= findNumber(arr1,element);
        System.out.println(ans);
    }

   // static boolean findNumber(int arr[], int element) {
    static int findNumber(int arr[],int element)
    {

        if (arr.length == 0) {
            return -1;
        }

        for (int i=0;i< arr.length;i++) {

            if (arr[i] == element) {

                return i;
            }
        }
                return -1;
            }

        }




