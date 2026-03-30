public class Power {
    static int power(int x,int n){
        
        if (n == 0) return 1;   // x^0 = 1

        int result = 1;
        int base = x;           // keep the original base intact

        for (int i = 1; i <= n; i++) {
            result *= base;     // multiply base n times
        }
        return result;

    }
    static int power_rec(int x,int n){
        if(n==1){
            return x;
        }
        return x*power_rec(x,n-1);
    }
    static int power_opt(int x,int n){
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return power_opt(x, n/2)*power_opt(x,n/2);
        }
        else{
            return x*power_opt(x, n/2)*power_opt(x, n/2);
        }
    }
    public static void main(String[] args){
        System.out.println(power_opt(2, 10));
        System.out.println(power_rec(2, 10));
        System.out.println(power(2, 10));
    }
}
