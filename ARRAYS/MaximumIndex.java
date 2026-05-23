public class MaximumIndex {
    static int findMax(int []arr) {
        int result = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {
                    result = Math.max(result, j - i);
                }

            }
        }

        return result;
    }
    static int findMax_opt(int []arr){
        int n=arr.length;
        int []lMin=new int[n];
        int []rMax=new int[n];
        lMin[0]=arr[0];
        rMax[n-1]=arr[n-1];
        for(int i=1;i<n;i++){
            lMin[i]=Math.min(lMin[i-1],arr[i]);
        }
        for(int i=n-2;i>=0;i--){
            rMax[i]=Math.max(rMax[i+1],arr[i]);
        }
        int i=0;
        int j=0;
        int result=0;
        while(i<n&&j<n){
            if(lMin[i] < rMax[j]){
                result=Math.max(result,j-i);
                j++;
            }
            else{
                i++;
            }

        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        System.out.println(findMax(arr));
        System.out.println(findMax_opt(arr));
    }
}
