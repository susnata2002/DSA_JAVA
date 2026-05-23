import java.util.Arrays;
public class SmallestPositiveMissing {
    static int positiveMissing(int []arr){
        Arrays.sort(arr);
        int smallest=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                continue;
            }
            else if(arr[i]==smallest){
                smallest++;
            }
        }
        return smallest;
    }
    static int cyclicSort(int []arr){
        int n = arr.length;

        int i = 0;

        while(i < n) {

            int correct = arr[i] - 1;

            // valid positive and not already correct
            if(arr[i] > 0 &&
                    arr[i] <= n &&
                    arr[i] != arr[correct]) {

                // swap
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else {
                i++;
            }
        }

        // find first missing positive
        for(i = 0; i < n; i++) {

            if(arr[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }
    public static void main(String[] args) {
        int arr[] = {2, -3, 4, 1, 1, 7};
        System.out.println(positiveMissing(arr));
    }
}
