import java.util.Arrays;

public class Sorted_And_Rotated {
//    static void reverse(int []arr,int a,int b){
//        while(a<=b){
//            int temp=arr[a];
//            arr[a]=arr[b];
//            arr[b]=temp;
//            a++;
//            b--;
//        }
//    }

    // for both ascending sorted + rotated and descending sorted + rotated
    static boolean isSorted(int []arr) {
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < arr.length - 1; i++) {

            // Check ascending
            if (arr[i] > arr[i + 1]) {
                ascending = false;
            }

            // Check descending
            if (arr[i] < arr[i + 1]) {
                descending = false;
            }
        }

        return ascending || descending;
    }
//    }
//    static boolean isSortedAndRotated(int []arr){
//        if(isSorted(arr)) return false;
//        int[] sortedArray = Arrays.copyOf(arr, arr.length);
//        Arrays.sort(sortedArray);
//        for(int i=1;i<arr.length;i++){
//
//        }
//    }

    static boolean isSortedAndRotated(int []arr) {

        int n=arr.length;
        if (isSorted(arr)) {
            return false;
        }
        int countAsc=0;
        int countDsc=0;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[(i+1)%n]){
                countAsc++;
            }
            if(arr[i]<arr[(i+1)%n]){
                countDsc++;
            }
        }
        return countAsc==1||countDsc==1;

    }
    // only for ascending sorted + rotated
    public static boolean checkRotatedAndSorted(int[] arr) {

        int n = arr.length;

        if (n == 1) {
            return false;
        }

        int count = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] > arr[(i + 1) % n]) {
                count++;
            }
        }

        return count == 1 && arr[0] > arr[n - 1];
//        So we need one extra condition:
//        arr[0] > arr[n-1]
//        because in a properly rotated ascending array:
//        first element becomes greater than last element
//        Example:
//        [3,4,5,1,2]
//        3 > 2 ✅
//        But for sorted array:
//        [1,2,3,4,5]
//        1 > 5 ❌
//        So it correctly returns false.
    }
    public static void main(String[] args) {

    }
}
