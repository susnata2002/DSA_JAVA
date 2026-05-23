public class MaxSubarraySum {
    static int subarraySum(int [] arr){
        int result=arr[0];
        for(int i=0;i<arr.length;i++){
            int max=0;
            for(int j=i;j<arr.length;j++){
                max=max+arr[j];
                result=Math.max(result,max);
            }
        }
        return result;
    }
    static int subarraySum_opt(int [] arr){
        int maxEnding=arr[0];
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            maxEnding=Math.max(maxEnding+arr[i],arr[i]);
            res=Math.max(res,maxEnding);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={2,3,-8,7,-1,2,3};
        System.out.println(subarraySum_opt(arr));
    }
}
