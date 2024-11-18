public class ARRAY_12_Stocks {
    static int stock(int []arr){
        int n=arr.length;
        int low=arr[0];
        int sum=0;
        for(int i=1;i<n;i++){
            if(arr[i]>low){
                sum+=(arr[i]-low);
                low=arr[i];
            }
            else{
                low=arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int []arr={30,20,10};
        System.out.println(stock(arr));
    }
}
