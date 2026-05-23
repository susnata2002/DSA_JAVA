//import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondLargest {
    static int largest(int[] arr){
        if(arr == null || arr.length == 0){
            return -1; // invalid
        }
        int max=arr[0];
        for(int i=1;i<=arr.length-1;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    static int secondLargest(int [] arr){
        if(arr == null || arr.length < 2){
            return -1; // no second largest
        }
        int large=largest(arr);
        int max2=Integer.MIN_VALUE;
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<large&&arr[i]>max2){
                max2=arr[i];
                idx=i;
            }
        }
        return idx;
    }
    static int secondLargest_opt(int[] arr){
        if(arr == null || arr.length < 2){
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int idx = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                second = largest;
                largest = arr[i];
                idx = i; // temporary (largest index)
            }
            else if(arr[i] < largest && arr[i] > second){
                second = arr[i];
                idx = i; // second largest index
            }
        }

        if(second == Integer.MIN_VALUE){
            return -1; // no second largest
        }

        return idx;
    }
    public static void main(String[] args) {
        int[] arr={10,5,8,20};
        System.out.println(secondLargest(arr));
    }
}
