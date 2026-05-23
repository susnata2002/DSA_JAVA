public class PrefixSum {
    static void newArray(int []arr){
        int sum=arr[0];
        for(int i=1;i<arr.length;i++){
            sum+=arr[i];
            arr[i]=sum;
        }
    }
    static int sum(int[]arr,int start,int end){

        return start>0?arr[end]-arr[start-1]:arr[end];
    }
    public static void main(String[] args) {
        int []arr = {2,8,3,9,6,5,4};
        newArray(arr);
        System.out.println(sum(arr,0,2));
        System.out.println(sum(arr,1,3));
        System.out.println(sum(arr,2,6));
    }
}
