import java.util.Arrays;

public class Rearrange {
    static void arrange(int []arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+(arr[arr[i]]%arr.length)*arr.length;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]/arr.length;
        }
    }
    public static void main(String[] args) {
        int []arr={4,0,2,1,3};
        arrange(arr);
        System.out.println(Arrays.toString(arr));
    }
}
