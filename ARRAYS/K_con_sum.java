public class K_con_sum {
    static int maxSum(int []arr,int k){
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int curr_max=sum;
        for(int i=k;i<arr.length;i++){
            sum+=(arr[i]-arr[i-k]);
            curr_max=Math.max(curr_max,sum);
        }
        return curr_max;
    }
    public static void main(String[] args) {
        int[] arr={1, 4, 2, 10, 23, 3, 1, 0, 20};
        System.out.println(maxSum(arr,4));
    }
}
