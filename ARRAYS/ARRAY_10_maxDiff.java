public class ARRAY_10_maxDiff {
    static int maxDiff(int []arr){
        int n=arr.length;
        int min=arr[0];
        int diff=arr[1]-arr[0];
        for(int i=2;i<n;i++){
            diff=Math.max(diff, arr[i]-min);
            min=Math.min(min, arr[i]);
            
        }
        return diff;
    }
    public static void main(String[] args) {
        int []arr={2,3,10,6,4,8,1};
        System.out.println(maxDiff(arr));
    }
}
