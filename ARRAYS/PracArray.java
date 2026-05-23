import java.util.Collections;
import java.util.List;

public class PracArray {
    static int stock(int [] arr, int start, int end){
        if(start>=end){
            return 0;
        }
        int profit=0;
        for(int i=start;i<end;i++){
            for(int j=i+1;j<=end;j++){
                if(arr[j]>arr[i]){
                    int curr_profit=arr[j]-arr[i]+stock(arr,start,i-1)+stock(arr,j+1,end);
                    profit = Math.max(profit, curr_profit);
                }
            }
        }
        return profit;
    }
    static int trappig_rain(int [] arr){
        int result=0;
        for(int i=1;i<arr.length-1;i++){
            int lmax=arr[i];
            for(int j=0;j<=i;j++){
                lmax=Math.max(lmax, arr[j]);
            }
            int rmax=arr[i];
            for(int j=i;j<=arr.length-1;j++){
                rmax=Math.max(rmax,arr[j]);
            }
            result=result+Math.min(lmax,rmax)-arr[i];
        }
        return result;
    }
    static int trap_rain_opt(int [] arr){
        int []lmax=new int[arr.length];
        int []rmax=new int[arr.length];
        lmax[0]=arr[0];
        rmax[arr.length-1]=arr[arr.length-1];
        int result=0;
        for(int i=1;i<arr.length;i++){
            lmax[i]=Math.max(arr[i],lmax[i-1]);
        }
        for(int i=arr.length-2;i>=0;i--){
            rmax[i]=Math.max(arr[i],rmax[i+1]);
        }
        for(int i=1;i<arr.length-1;i++){
            result+=Math.min(lmax[i],rmax[i])-arr[i];
        }
        return result;
    }
    static int con1s(int []arr){
        int count=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                max=Math.max(max,count);
            }
            else count=0;
        }
        return max;
    }
    static int maxSubSum(int [] arr){
        int res=0;
        for(int i=0;i<arr.length;i++){
            int sum=arr[i];
            for(int j=i+1;j<arr.length;j++){
                sum+=arr[j];
                res=Math.max(sum,res);
            }
        }
        return res;
    }
    static int majorityEle(int []arr){
        int res=0;
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[res]){
                count++;
            }
            else count--;
            if(count==0){
                res=i;
                count=1;
            }
        }
        count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[res]==arr[i]){
                count++;
            }
        }
        if(count>(arr.length/2)){
            return arr[res];
        }
        return -1;
    }

//    The issue is in this condition order:
//
//    arr[i] != arr[correct]
//
//    You are accessing:
//
//    arr[correct]
//
//    before confirming that correct is a valid index.
//
//    If arr[i] is negative, 0, or greater than n, then:
//
//    correct = arr[i] - 1
//
//    can become invalid (-1, huge number, etc.), causing ArrayIndexOutOfBoundsException.
//
//    Example:
//
//    arr = [2, -3, 4]
//
//    When i = 1:
//
//    correct = -4
//
//    Then:
//
//    arr[correct]
//
//    crashes.

    static int maxOccured(List<Integer> L, List<Integer> R) {
        // code here
        int n = Collections.max(R);

        int[] freq = new int[n + 2];

        for (int i = 0; i < L.size(); i++) {
            freq[L.get(i)]++;

            freq[R.get(i) + 1]--;
        }

        for (int i = 1; i < freq.length; i++) {
            freq[i] += freq[i - 1];
        }

        int idx = 0;

        for (int i = 1; i < freq.length; i++) {
            if (freq[i] > freq[idx]) {
                idx = i;
            }
        }

        return idx;
    }
    static int smallestPositive(int []arr){
        int i=0;
        int n=arr.length;
        while(i<n){
            int correct=arr[i]-1;
            if(arr[i] > 0 &&                // arr[i]>0&&arr[i]!=arr[correct]&&arr[i]<=arr.length
                    arr[i] <= n &&
                    arr[i] != arr[correct]){
                int temp=arr[correct];
                arr[correct]=arr[i];
                arr[i]=temp;
            }
            else{
                i++;
            }
        }
        for(i = 0; i < arr.length; i++) {

            if(arr[i] != i + 1) {
                return i + 1;
            }
        }

        return arr.length + 1;
    }
    public static void main(String[] args) {
        int []arr={2,0,2};
        int [] ones={1,0,0,0,1,1,1,0,0,1,1,1,1};
        int [] sub={2,3,-8,7,-1,2,3};
//        System.out.println(trappig_rain(arr));
//        System.out.println(trap_rain_opt(arr));
//        System.out.println(con1s(ones));
        System.out.println(maxSubSum(sub));
    }
}
