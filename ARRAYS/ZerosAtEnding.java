public class ZerosAtEnding {
    static int moveZeros(int[] arr){
        int nz = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[nz];
                arr[nz] = temp;
                nz++;
            }
        }
        return nz;
    }

    public static void main(String[] args) {
        int []arr={8,5,0,10,0,20};
        int count=moveZeros(arr);
        for(int i=0;i<count;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
