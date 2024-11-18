public class ARRAY_23_Eqilibrium_point {
    static boolean isEquilibrium(int []arr){
        int n=arr.length;
        int right=0;
        for(int i=1;i<n;i++){
            right+=arr[i];
        }
        int left=0;
        for(int i=0;i<n-1;i++){
            if(left==right){
                return true;
            }
            else{
                left+=arr[i];
                right-=arr[i+1];
            }
        }
        if(left==0){
            return true;
        }
        return false;
    }
    static int equilibrium(int arr[], int n) {
        int sum = 0, leftsum = 0;
        for (int i = 0; i < n; ++i)
            sum += arr[i];
    
        for (int i = 0; i < n; ++i) {
            sum -= arr[i];
            if (leftsum == sum)
                return i;
            leftsum += arr[i];
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int []arr={3,4,8,-9,20,6};
        int []arr1={4,2,-2};
        int []arr2={4,2,2};
        System.out.println(isEquilibrium(arr));
        System.out.println(isEquilibrium(arr1));
        System.out.println(isEquilibrium(arr2));
    }
}
