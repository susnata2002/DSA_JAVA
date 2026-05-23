public class CircularSubarraySum {
    static int subarrSum(int [] arr){
        int result=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int curr_sum=0;
            for(int j=0;j<arr.length;j++){
                int idx = (i + j) % arr.length;
                curr_sum += arr[idx];
                result = Math.max(result, curr_sum);
            }
        }
        return result;
    }
    static int normal_sum(int [] arr){
        int maxEnding=arr[0];
        int result=arr[0];
        for(int i=1;i<arr.length;i++){
            maxEnding=Math.max(maxEnding+arr[i],arr[i]);
            result=Math.max(maxEnding,result);
        }
        return result;
    }
    static int subarrSumOpt(int []arr){
        int subSum=normal_sum(arr);
        if(subSum<0){
            return subSum;
        }
        int arrSum=0;
        for(int i=0;i<arr.length;i++){
            arrSum+=arr[i];
            arr[i]=-arr[i];
        }
        int cirSum=arrSum+normal_sum(arr);
        return Math.max(subSum,cirSum);
    }
    public static void main(String[] args) {
        int[] arr={8, -8, 9, -9, 10, -11, 12};
        System.out.println(subarrSum(arr));
    }
}
