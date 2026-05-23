import java.util.ArrayList;
import java.util.Arrays;

public class Max_And_Second_Max {
    static ArrayList<Integer> maxAndSecondMax(int []arr){
        int max = Integer.MIN_VALUE;
        int secondMax = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(max);
        ans.add(secondMax);

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2, 2, 2};
        System.out.println((maxAndSecondMax(arr)));
    }
}
