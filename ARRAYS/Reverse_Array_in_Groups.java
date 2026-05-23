import java.util.Arrays;

public class Reverse_Array_in_Groups {
    static void reverse(int []arr, int start, int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static void reverseInGroups(int[] arr, int k){
        if (arr.length < k) {
            reverse(arr, 0, arr.length - 1);
            return;
        }

        int i = 0;

        while (i < arr.length) {

            // Prevent index out of bounds
            int end = i + k - 1;

            if (end >= arr.length) {
                end = arr.length - 1;
            }

            reverse(arr, i, end);

            i += k;
        }
    }
    static void reverseInGroups_opt(int[] arr, int k){

        int i = 0;

        while(i < arr.length){

            int end = Math.min(i + k - 1, arr.length - 1);

            reverse(arr, i, end);

            i += k;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5}; int k = 3;
        reverseInGroups(arr,k);
        System.out.println(Arrays.toString(arr));
    }
}
