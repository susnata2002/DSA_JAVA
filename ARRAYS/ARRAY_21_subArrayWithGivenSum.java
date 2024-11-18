public class ARRAY_21_subArrayWithGivenSum {
    static boolean isGivenSum(int []arr,int k){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==k){
                    System.out.println("From "+i+" to "+j);
                    return true;
                }
            }
        }
        return false;
        
    }
    static boolean isGivenSum_SW(int []arr, int k) {
        int start = 0;
        int end = 0;
        int sum = 0;
        
        while (end < arr.length) {
            if (sum < k) {
                sum += arr[end++];
            }
            if (sum > k) {
                sum -= arr[start++];
            }
            if (sum == k) {
                System.out.println("From " + start + " to " + (end - 1));
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int []arr={1,4,20,3,10,5};
        int k=33;
        System.out.println(isGivenSum(arr, k));
        System.out.println(isGivenSum_SW(arr, k));
    }
}
