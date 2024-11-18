public class ARRAY_PRAC {
    
    static int remove(int []arr){
        int n=arr.length;
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[count-1]!=arr[i]){
                arr[count]=arr[i];
                count++;
            }
        }
        return count;
    }
    static int sum(int []arr){
        int n=arr.length;
        int res=arr[0];
        for(int i=0;i<n;i++){
            int sum=arr[i];
            for(int j=1;j<n;j++){
                int idx=(i+j)%n;
                sum+=arr[idx];
                res=Math.max(res,sum);
            }
        }
        return res;
    }

    static int removeDup(int []arr){
        int n=arr.length;
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[count]!=arr[i]){
                arr[count+1]=arr[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int []arr={10,20,20,30,30,30};
        for(int i=0;i<remove(arr);i++){
            System.out.println(arr[i]);
        }
        System.out.println();
        // System.out.println(sum(arr));
    }
}
