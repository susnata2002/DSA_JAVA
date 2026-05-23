public class MajorityElement {
    static int majorEle(int [] arr){
        int half=arr.length/2;
        for(int i=0;i<arr.length-1;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>half){
                return i;
            }
        }
        return -1;
    }
    static int majorEle_opt(int []arr){
        int res=0;int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[res]==arr[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                res=i;count=1;
            }
        }
        count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[res]==arr[i]){
                count++;
            }
        }
        if(count>(arr.length/2)){
            return res;
        }
        return -1;

    }
    public static void main(String[] args) {
        int[]arr={3, 3, 4, 2, 4, 4, 2, 4, 4};
        System.out.println(majorEle(arr));
        System.out.println(majorEle_opt(arr));
//        System.out.println(majorEle_opt(arr));
    }
}
