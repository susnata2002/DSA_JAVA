import java.util.Arrays;

public class FrequenciesLimitedArray {
    static void freq(int []arr){
        int n=arr.length;
        int base=n+1;
        for(int i=0;i<n;i++){
            int idx=(arr[i]-1)%base;
            arr[idx]+=base;
        }
        for(int i=0;i<n;i++){
            arr[i]=arr[i]/base;
        }
    }

//    our logic is VERY close, but this line is wrong:
//
//    int idx = arr[i] % base - 1;
//
//    Because operator precedence makes it:
//
//            (arr[i]%base)−1
//
//    This can produce:
//
//            -1
//
//    when value becomes multiple of base.
//    Correct Line
//    int idx = (arr[i] - 1) % base;


    public static void main(String[] args) {
        int arr[] = {2, 3, 2, 3, 5};
        freq(arr);
        System.out.println(Arrays.toString(arr));
    }
}
