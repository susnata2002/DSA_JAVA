public class SubsetSum {
    static int subSum(int [] arr, int sum,int idx){
        if(idx==arr.length){
            return sum==0?1:0;
        }
        return subSum(arr,sum,idx+1)+subSum(arr,sum-arr[idx],idx+1);
    }
    public static void main(String[] args) {
        int[] arr={10,5,2,3,6};
        int sum=8;
        System.out.println(subSum(arr,sum,0));
    }
}
