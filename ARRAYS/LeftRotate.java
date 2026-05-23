import java.util.Arrays;

public class LeftRotate {
    static void rotate(int []arr){
        int temp=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=temp;
    }
    public static void main(String[] args) {
        int[] arr={2,3,7,1,6};
        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }
}
