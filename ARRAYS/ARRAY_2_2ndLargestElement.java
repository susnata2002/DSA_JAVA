public class ARRAY_2_2ndLargestElement {
    static int secLarge(int []arr){
        int max=Integer.MIN_VALUE,secondMax=Integer.MIN_VALUE;
        if(arr.length<2){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            max=Math.max(max, arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=max){
                secondMax=Math.max(secondMax, arr[i]);
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        int[]arr={1,2,32,43,21,34,2,24,4};
        System.out.println(secLarge(arr));
    }
}
