import java.util.Arrays;

public class RemoveDuplicates {
    static int removedup(int [] arr){
        int res = 1;

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[res - 1] != arr[i])
            {
                arr[res] = arr[i];
                res++;
            }
        }

        return res;
    }
    static int remDups_naive(int arr[], int n) {
        int temp[] = new int[n];

        temp[0] = arr[0];

        int res = 1;

        for (int i = 1; i < n; i++) {
            if (temp[res - 1] != arr[i]) {
                temp[res] = arr[i];
                res++;
            }
        }

        for (int i = 0; i < res; i++) {
            arr[i] = temp[i];
        }

        return res;
    }
    public static void main(String[] args) {
        int [] arr={10,20,20,30,30,30,30};
        System.out.println(removedup(arr));
//        System.out.println(Arrays.toString(arr));
    }
}
