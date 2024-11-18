public class ARRAY_19_Minimumflips {
    // static void printflips(int[] arr) {
    //     int n = arr.length;
    //     int group_0 = 0;
    //     int group_1 = 0;
    //     int flag = 0;
    //     for (int i = 0; i < n-1; i++) {
    //         if (arr[i] == 1) {
    //             if (flag == 0) {
    //                 group_1++;
    //                 flag++;
    //             }
    //             if (arr[i+1]==0){
    //                 flag=0;
    //             }
    //         }
    //         if (arr[i] == 0) {
    //             if (flag == 0) {
    //                 group_0++;
    //                 flag++;
    //             }
    //             if (arr[i+1]==1){
    //                 flag=0;
    //             }
    //         }
    //         if(arr[n-1]==0&&arr[n-2]==1){
    //             group_0++;
    //         }
    //         if(arr[n-1]==1&&arr[n-2]==0){
    //             group_1++;
    //         }
    //     }
    //     if (group_0 == group_1) {
    //         int count_0 = 0;
    //         int count_1 = 0;
    //         for (int i = 0; i < n; i++) {
    //             if (arr[i] == 0) {
    //                 count_0++;
    //             }
    //             if (arr[i] == 1) {
    //                 count_1++;
    //             }
    //         }
    //         if (count_0 <= count_1) {
    //             for (int i = 1; i < n; i++) {
    //                 int count_s = i - 1;
    //                 int count_e = i - 1;
    //                 while (arr[i - 1] == 0 && arr[i] == 0) {
    //                     count_e++;
    //                 }
    //                 System.out.println("From " + count_s + " to " + count_e);
    //             }
    //         } else {
    //             for (int i = 1; i < n; i++) {
    //                 int count_s = i - 1;
    //                 int count_e = i - 1;
    //                 while (arr[i - 1] == 1 && arr[i] == 1) {
    //                     count_e++;
    //                 }
    //                 System.out.println("From " + count_s + " to " + count_e);
    //             }
    //         }
    //     } else if (group_0 < group_1) {
    //         for (int i = 1; i < n; i++) {
    //             int count_s = i - 1;
    //             int count_e = i - 1;
    //             while (arr[i - 1] == 0 && arr[i] == 0) {
    //                 count_e++;
    //             }
    //             System.out.println("From " + count_s + " to " + count_e);
    //         }
    //     } else if (group_0 > group_1) {
    //         for (int i = 1; i < n; i++) {
    //             int count_s = i - 1;
    //             int count_e = i - 1;
    //             while (arr[i - 1] == 1 && arr[i] == 1) {
    //                 count_e++;
    //             }
    //             System.out.println("From " + count_s + " to " + count_e);
    //         }
    //     }

    // }

    static void printGroups(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                if (arr[i] != arr[0])
                    System.out.print("From " + i + " to ");
                else
                    System.out.println(i - 1);
            }
        }

        if (arr[n - 1] != arr[0])
            System.out.println(n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 0, 1, 1 };

        printGroups(arr, arr.length);
    }
}
