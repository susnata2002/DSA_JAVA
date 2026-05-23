public class SubarrayGivenSum {
    static boolean isSubarraySumSameWithGivenSum(int [] arr,int sum){
        int curr_sum=arr[0];
        int start=0;
        for(int i=1;i<arr.length;i++){
            curr_sum += arr[i];

            while (curr_sum > sum) {
                curr_sum -= arr[start++];  // after while and subtracting you need to check it is same as sum or not that is why after while loop you have to use if (curr_sum == sum)
            }

            if (curr_sum == sum) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int []arr={1, 4, 20, 3, 10, 5};
        int sum=33;
        System.out.println(isSubarraySumSameWithGivenSum(arr,sum));
    }
}
