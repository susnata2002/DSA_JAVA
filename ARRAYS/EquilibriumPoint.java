public class EquilibriumPoint {
    static int equilibrium(int []arr){
        for(int i=0;i<arr.length;i++){
            int ls=0;int rs=0;
            for(int j=0;j<i;j++){
                ls+=arr[j];
            }
            for(int j=i+1;j<arr.length;j++){
                rs+=arr[j];
            }
            if(ls==rs) return i;
        }
        return -1;
    }
    static int equilibrium_opt(int []arr){
        int total_sum=0;
        if(arr.length==1){
            return 0;
        }
        for(int i=0;i<arr.length;i++){
            total_sum+=arr[i];
        }
        int ls=0;
        for(int i=0;i<arr.length;i++){
            int rs=total_sum-arr[i]-ls;
            if(ls==rs){
                return i;
            }
            ls+=arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int []A = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(equilibrium(A));
        System.out.println(equilibrium_opt(A));
    }
}
