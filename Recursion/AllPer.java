public class AllPer {
    static String swap(String str,int i,int j){
        char[] arr=str.toCharArray();
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return String.valueOf(arr);
    }
    static void allPermutation(String str,int i){
        if(i==str.length()-1){
            System.out.println(str);
            return;
        }
        for(int j=i;j<str.length();j++){
            str=swap(str,i,j);
            allPermutation(str,i+1);
            str=swap(str,i,j);
        }
    }
    public static void main(String[] args) {
        allPermutation("ABC",0);
    }
}
