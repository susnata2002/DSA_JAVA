public class ARRAY_16_EvenOddSub {
    static int EvenOdd(int []arr){
        int n=arr.length;
        int count=1;
        int max=1;
        for(int i=1;i<n;i++){
            if(arr[i-1]%2==0&&arr[i]%2!=0||arr[i-1]%2!=0&&arr[i]%2==0){
                count++;
            }
            else{
                max=Math.max(max, count);
                count=1;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[]arr={1,4,13,19,5,25,30};
        System.out.println(EvenOdd(arr));
    }
}
