public class CountRBS {
    public static void main(String[] args) {
        int[] arr = {7, 9, 9,9,11, 13, 15,15, 1, 2, 3, 4, 5, 6,};
        System.out.println(rotationCount(arr));
    }
    static int rotationCount(int [] arr){
        int pivot=findPivotWithDuplicate(arr);
        return pivot+1;
    }

    static int findPivot(int[] num) {
        int s = 0;
        int e = num.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid < e && num[mid] > num[mid + 1]) {
                return mid;
            } else if (mid > s && num[mid - 1] > num[mid]) {
                return mid - 1;
            } else if (num[mid] > num[s]) {
                e = mid - 1;
            }
            s = mid + 1;
        }
        return -1;
    }

    static int findPivotWithDuplicate(int[] num) {
        int s = 0;
        int e = num.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid < e && num[mid] > num[mid + 1]) {
                return mid;
            } else if (mid > s && num[mid - 1] > num[mid]) {
                return mid - 1;
            }
            if (num[mid] == num[s] && num[mid] == num[e]) {
                if (num[s] > num[s + 1]) {
                    return s;
                }
                s++;
                if (num[e - 1] > num[e]) {
                    return e - 1;
                }
                e--;
            } else if (num[mid] > num[s] || num[mid] == num[s] && num[mid] > num[e]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }

}


