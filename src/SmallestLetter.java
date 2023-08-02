public class SmallestLetter {
    public static void main(String[] args) {
        char[]arr={'a','c','e','f'};
        char ans=smallest(arr,'l');
        System.out.println(ans);

    }
    static char smallest(char[]arr,char target) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;

            }
        }
            return arr[s % arr.length];

        }


    }

