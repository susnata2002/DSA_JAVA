public class TrappingRain {
    static int rainCollect(int [] arr){
        int result=0;
        for(int i=1;i<arr.length-1;i++){
            int lMax=arr[i];
            for(int j=0;j<i;j++){
                lMax=Math.max(lMax,arr[j]);
            }
            int rmax=arr[i];
            for (int j=i+1;j<arr.length;j++){
                rmax=Math.max(rmax,arr[j]);
            }
            result=result+(Math.min(lMax,rmax))-arr[i];
        }
        return result;
    }
    static int trap_Opt(int []arr){
        int result=0;
        int []lMax=new int[arr.length];
        int []rMax=new int[arr.length];

        lMax[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            lMax[i]=Math.max(arr[i],lMax[i-1]);
        }
        rMax[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rMax[i]=Math.max(arr[i],rMax[i+1]);
        }
        for(int i=1;i<arr.length-1;i++){
            result+=Math.min(lMax[i],rMax[i])-arr[i];
        }
        return result;
    }
    static int trap_moreOpt(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = height[left];
        int rightMax = height[right];
        int water = 0;

        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                water += leftMax - height[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                water += rightMax - height[right];
            }
        }

        return water;
    }
    public static void main(String[] args) {
        int[] arr={3,0,26,0,4};
//        System.out.println(rainCollect(arr));
        System.out.println(trap_Opt(arr));
    }
}
