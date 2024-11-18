public class ARRAY_15_subArraySum {
    static int sum(int []arr){
        int n=arr.length;
        int maxEnd=arr[0];
        int res=arr[0];
        for(int i=1;i<n;i++){
            maxEnd=Math.max(maxEnd+arr[i], arr[i]);
            res=Math.max(maxEnd, res);
        }
        return res;
    }
    public static void main(String[] args) {
        int []arr={5,-2,3,4};
        System.out.println(sum(arr));
    }
}
