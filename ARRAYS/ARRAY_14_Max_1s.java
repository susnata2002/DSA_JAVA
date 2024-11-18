public class ARRAY_14_Max_1s {
    static int max1(int []arr){
        if(arr.length==0){
            return -1;
        }
        int n=arr.length;
        int count=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=1){
                max=Math.max(max, count);
                count=0;
            }
            else{
                count++;
            }
        }
        return Math.max(max, count);
    }
    public static void main(String[] args) {
        int []arr={0,0,0,0};
        System.out.println(max1(arr));
    }
}
