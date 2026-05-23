import java.util.Arrays;

public class D_LeftRotate {
    static void rotate(int[] arr){
        int temp = arr[0];              // first element
        for(int i = 1; i < arr.length; i++){
            arr[i-1] = arr[i];          // shift left
        }
        arr[arr.length - 1] = temp;     // put first at end
    }
    static void leftRotate_d(int[] arr, int d){
        int n = arr.length;
        d = d % n;                     // important for large d

        for(int i = 0; i < d; i++){
            rotate(arr);
        }
    }
    static void reverse(int [] arr,int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static void leftRotate_d_opt(int[] arr,int d){
        if (arr.length == 0 || arr.length == 1||d> arr.length) {
            return;
        }
        d = d % arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d, arr.length-1);
        reverse(arr,0, arr.length-1);
    }
    static void rightRotate_d_opt(int[] arr, int d){
        int n = arr.length;
        if (n <= 1) return;

        d = d % n;

        reverse(arr, 0, n-1);
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
    }
    public static void main(String[] args) {
        int[] arr={2,3,7,1,6};
        leftRotate_d_opt(arr,3);
        System.out.println(Arrays.toString(arr));
    }
}
