public class ARRAY_7_LeftRotate {
    static void rotate(int []arr){
        int n=arr.length;
        int left=arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=left;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        rotate(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
