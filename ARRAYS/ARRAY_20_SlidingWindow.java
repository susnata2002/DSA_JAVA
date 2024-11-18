public class ARRAY_20_SlidingWindow {
    static int max_subarray_sum(int[] arr, int k) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            max = Math.max(sum, max);
        }
        return max;
    }

    static int maxSumSW(int[] arr, int k) {
        int n = arr.length;
        int curr = 0;
        for (int i = 0; i < k; i++) {
            curr += arr[i];
        }
        int res = curr;
        for (int i = k; i < n; i++) {
            curr = curr + (arr[i] - arr[i - k]);
            res = Math.max(res, curr);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 8, 30, -5, 20, 7 };
        int k = 3;
        System.out.println(max_subarray_sum(arr, k));
        System.out.println(maxSumSW(arr, k));
    }
}
