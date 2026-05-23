public class MinimumAdjacentDifference {
    static int minimum(int []arr){
        int min=0;
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,Math.abs(arr[i]-arr[(i+1)%arr.length]));
        }
        return min;
    }
    public static void main(String[] args) {

    }
}
