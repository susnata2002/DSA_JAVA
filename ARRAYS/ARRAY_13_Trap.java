public class ARRAY_13_Trap {
    static int rainWater(int []arr){
        int n=arr.length;
        int sum=0;
        for(int i=1;i<n-1;i++){
            int lmax=arr[0];
            for(int j=0;j<=i;j++){
                lmax=Math.max(lmax,arr[i]);
            }
            int rmax=arr[n-1];
            for(int j=n-1;j>=i;j--){
                rmax=Math.max(rmax, arr[i]);
            }
            sum+=Math.min(lmax, rmax)-arr[i];
        }
        return sum;
    }
    static int Trap(int []arr){
        int n=arr.length;
        int left=0;
        int right=arr.length-1;
        int lmax=arr[0];
        int rmax=arr[n-1];
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[left]<=arr[right]){
                if(arr[i]>lmax){
                    lmax=arr[i];
                }
                else{
                    sum+=lmax-arr[i];
                }
                left++;
            }
            else{
                if(arr[i]>rmax){
                    rmax=arr[i];
                }
                else{
                    sum+=rmax-arr[i];
                }
                right--;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int []arr={3,0,2,0,4};
        System.out.println(rainWater(arr));
        System.out.println(Trap(arr));
    }
}
