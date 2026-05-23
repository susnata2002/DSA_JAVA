import java.util.Arrays;

public class RearrangeArrayAlternately {
    static void rearrange(int []arr){
        Arrays.sort(arr);
        int maxIdx=arr.length-1;
        int minIdx=0;
        int maxEle=arr[arr.length-1]+1;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i] = arr[i] + (arr[maxIdx] % maxEle) * maxEle;
                maxIdx--;
            }
            else{
                arr[i]=arr[i]+(arr[minIdx]%maxEle)*maxEle;
                minIdx++;
            }
        }
        for(int i=0;i< arr.length;i++){
            arr[i]=arr[i]/maxEle;
        }
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        rearrange(arr);
        System.out.println(Arrays.toString(arr));
    }
}
