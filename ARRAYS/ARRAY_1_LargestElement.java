public class ARRAY_1_LargestElement {
    static int LargestElement(int[]arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
        
    }
    public static void main(String[] args) {
        int []arr={1,2,47,33,53,454,4,2,54,23};
        System.out.println(LargestElement(arr));
    }
}
