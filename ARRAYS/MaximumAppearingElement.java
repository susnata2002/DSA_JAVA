public class MaximumAppearingElement {
    static int maxAppEle(int[] A, int[] B) {

        int maxVal = 0;

        for (int x : B) {
            maxVal = Math.max(maxVal, x);
        }

        int[] arr = new int[maxVal + 1];

        for (int i = 0; i < A.length; i++) {
            for (int j = A[i]; j <= B[i]; j++) {
                arr[j]++;
            }
        }

        int max_ele = 0;
        int max_freq = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max_freq) {
                max_freq = arr[i];
                max_ele = i;
            }
        }

        return max_ele;
    }
    static int maximumOccurredElement(int[] L, int[] R, int n) {

        // Find maximum value in R[]
        int maxi = 0;

        for (int x : R) {
            maxi = Math.max(maxi, x);
        }

        // Create frequency array dynamically
        int[] arr = new int[maxi + 2];

        // Difference array technique
        for (int i = 0; i < n; i++) {
            arr[L[i]]++;

            // Stop the effect after R[i]
            arr[R[i] + 1]--;
        }

        // Find prefix sum and maximum occurring element
        int maxFreq = arr[0];
        int ind = 0;

        for (int i = 1; i <= maxi; i++) {

            arr[i] += arr[i - 1];

            if (arr[i] > maxFreq) {
                maxFreq = arr[i];
                ind = i;
            }
        }

        return ind;
    }
    public static void main(String[] args) {

    }
}
