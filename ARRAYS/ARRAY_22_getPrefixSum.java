public class ARRAY_22_getPrefixSum {
    static int getSum(int []arr,int s,int e){
        int sum=0;
        while(s<=e){
            if(s!=e){
            sum+=arr[s++]+arr[e--];
            }
            else{
                sum+=arr[s++];
            }
        }
        return sum;
    }
    static int[] prefixSum(int []arr){
        int []ps=new int[arr.length];
        ps[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            ps[i]=ps[i-1]+arr[i];
        }
        return ps;
    }
    static int getSum_opt(int []arr,int s,int e){
        if(s==0){
            return arr[e];
        }
        else return arr[e]-arr[s-1];
    }
    public static void main(String[] args) {
        int []arr={2,8,3,9,6,5,4};
        System.out.println(getSum(arr,0,2));
        System.out.println(getSum(arr,1,3));
        System.out.println(getSum_opt(prefixSum(arr),2,6));

    }
}
