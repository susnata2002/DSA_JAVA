public class ARRAY_9_leaders {
    static void leaders(int []arr){
        int n=arr.length;
        System.out.println(arr[n-1]);
        int max=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                System.out.println(arr[i]);
                max=arr[i];
            }
        }
    }
    public static void main(String[] args) {
        int []arr={4,9,3,1,5};
        leaders(arr);
    }
}
