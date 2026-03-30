public class ReversePower {
    static int reverse(int n,int rev){
        if(n==0){
            return rev;
        }
        return reverse(n/10,rev*10+n%10);
    }
    static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int half=power(x,n/2);
        if((n&1)==1){
            return x*half*half;
        }
        else return half*half;
    }
    static int revPower(int n){
        return power(n,reverse(n,0));
    }
    public static void main(String[] args) {
        System.out.println(revPower(2));
    }
}
