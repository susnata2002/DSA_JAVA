public class RussPeaAlgo {
    static long mul(int a,int b){
        int mul=0;
        while(a>=1){
            if((a&1)==1){
                mul+=b;
            }
            a=a>>1;
            b=b<<1;
        }
        return mul;
    }
    static int multiplicativeModulo(int a,int b,int m){
        a=((a%m)+m)%m;
        b=((b%m)+m)%m;
        int mul=0;
        while(a>=1){
            if(a%2!=0){
                mul=(mul+b)%m;
            }
            mul%=m;
            a=(a>>1)%m;
            b=b<<1;
        }
        return mul;
    }
    static int multiplicativeModulo_naive(int a,int b,int m){
        return ((a%m)*(b%m))%m;
    }
    public static void main(String[] args) {
        System.out.println(mul(223,112));
        System.out.println(multiplicativeModulo(12,15,7));
        System.out.println(multiplicativeModulo_naive(12,15,7));
    }
}
