public class ARRAY_8_LeftRotate_dPlaces {
    static void leftRoatate(int[] arr) {
        int n = arr.length;
        int left = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = left;
    }

    static void dLeftRotate(int[] arr, int d) {
        for (int i = 0; i < d; i++) {
            leftRoatate(arr);
        }
    }

    static void reverse(int[] arr, int start,int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void dLeftRotate_opt(int []arr,int d){
        reverse(arr, 0,d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0,arr.length-1);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int d = 2;
        // dLeftRotate(arr, d);
        dLeftRotate_opt(arr, d);
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
