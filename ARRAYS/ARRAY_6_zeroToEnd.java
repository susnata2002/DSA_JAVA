public class ARRAY_6_zeroToEnd {
    static void move(int []arr){
        int n=arr.length;
        int res=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[res];
                arr[res]=arr[i];
                arr[i]=temp;
                res++;
            }
        }
    }
    public static void main(String[] args) {
        int []arr={0,0,20,10,0};
        move(arr);
        for(int i:arr){
            System.out.println(i);
        }
        System.out.println();
    }
}
