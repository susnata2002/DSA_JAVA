public class MaxDifference {
    static int maxDiff(int [] arr){
        int result=arr[1]-arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            result=Math.max(result,arr[i]-min);
            min=Math.min(min,arr[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={2,3,10,6,4,8,1};
        System.out.println(maxDiff(arr));
    }
}
