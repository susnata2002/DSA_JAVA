public class EvenOddSubarray {
    static int maxEvenOdd(int [] arr){
        int count=1;
        int result=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]%2==0&&arr[i+1]%2!=0||arr[i]%2!=0&&arr[i+1]%2==0){
                count++;
                result=Math.max(count,result);
            }
            else{
                count=1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={10,12,14,7,8};
        int[] arr1={7,10,13,14};
        System.out.println(maxEvenOdd(arr1));
    }
}

