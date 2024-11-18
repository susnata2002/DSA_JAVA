public class ARRAY_17_circular_subArray {
    static int maxSum(int[] arr) {
        int n = arr.length;
        int res = arr[0];
        for (int i = 0; i < n; i++) {
            int sum = arr[i];
            for (int j = 1; j < n; j++) {
                int idx = (i + j) % n;
                sum += arr[idx];
                res = Math.max(sum, res);
            }
        }
        return res;
    }

    static int normalSum(int []arr){
        int n=arr.length;
        int maxEnd=arr[0];
        int res=arr[0];
        for(int i=1;i<n;i++){
            maxEnd=Math.max(maxEnd+arr[i], arr[i]);
            res=Math.max(maxEnd, res);
        }
        return res;
    }

    static int maxsum_opt(int[] arr) {
        int n = arr.length;
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
        int sum = arr[1];
        int minEnd = arr[1];
        for (int i = 2; i < n - 1; i++) {
            minEnd = Math.min(minEnd + arr[i], arr[i]);
            sum = Math.min(sum, minEnd);
        }
        return Math.max(totalSum-sum,normalSum(arr));

    }

    static int normalMaxSum(int arr[], int n)
    {
    	int res = arr[0];

    	int maxEnding = arr[0];

    	for(int i = 1; i < n; i++)
    	{
    		maxEnding = Math.max(maxEnding + arr[i], arr[i]);

    		res = Math.max(maxEnding, res);
    	}
    	
    	return res;
    }

    static int overallMaxSum(int arr[], int n)
    {
    	int max_normal = normalMaxSum(arr, n);

    	if(max_normal < 0)
    		return max_normal;

    	int arr_sum = 0;

    	for(int i = 0; i < n; i++)
    	{
    		arr_sum += arr[i];

    		arr[i] = -arr[i];
    	}

    	int max_circular = arr_sum + normalMaxSum(arr, n);

    	return Math.max(max_circular, max_normal);
        // return normalMaxSum(arr, n);
    }

    public static void main(String[] args) {
        int[] arr = {5,-2,3,4};
        System.out.println(maxSum(arr));
        // System.out.println(maxsum_opt(arr));
        System.out.println(overallMaxSum(arr, 4));
    }
}
