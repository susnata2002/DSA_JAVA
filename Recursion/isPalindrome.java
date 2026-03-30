import java.util.Scanner;

class isPalindrome {
    static boolean isPal(int low,int high,char[] arr){
        if(high<low){
            return true;
        }
        if(arr[low]!=arr[high]){
            return false;
        }
        return isPal(low+1,high-1,arr);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] arr=str.toCharArray();
        System.out.println(isPal(0, arr.length-1,arr));
    }
}
