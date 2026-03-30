public class palindrome {
    static  boolean isPal(int n){
        String str=Integer.toString(n);
        int start=0;
        int end=str.length()-1;

        while(start<=end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        int n=12321;
        System.out.println(isPal(n));
    }
}
