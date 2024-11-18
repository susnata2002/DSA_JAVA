public class ARRAY22_Weighted_prefix_sum {
    static int getPSum(int[] arr, int l, int r) {
        if (l == 0) {
            return arr[r];
        } else {
            return arr[r]-arr[l-1];
        }
    }

    static int weightSum(int []ws,int l,int r){
        if (l == 0) {
            return ws[r];
        } else {
            return ws[r]-ws[l-1];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 4, 6, 1 };
        int l=0;
        int r=2;
        int[] ps = new int[arr.length];
        int[] ws=new int [arr.length];
        ps[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ps[i] = ps[i - 1] + arr[i];
        }
        ws[0]=0;
        for(int i=1;i<ws.length;i++){
            ws[i]=ws[i-1]+(i*arr[i]);
        }
        int wSum= weightSum(ws, l, r)-((l-1)*getPSum(ps, l, r));
        System.out.println("weighted Sum is : "+wSum);
    }
}
