public class ARRAY_24_Prac {
    static boolean isThreeParts(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        if (sum % 3 != 0) return false;

        int value = sum / 3;
        int check = arr[0];
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (check == value) {
                count++;
                check = arr[i];
            } else {
                check += arr[i];
            }
        }
        if (count == 2 && check == value) {
            return true;
        } else {
            return false;
        }
        
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 6, 1, 1, 1, 1, 4 };
        int[] arr1 = { 3, 2, 5, 1, 1, 5 };
        System.out.println(isThreeParts(arr));
        System.out.println(isThreeParts(arr1));
    }
}
