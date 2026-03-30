import java.util.Arrays;

public class SieveOfEratosthenes {
    static boolean[] primeNumbers(int n){
        boolean[] sieve=new boolean[n+1];
        Arrays.fill(sieve,true);
        for(int i=2;i*i<=n;i++){
            if(sieve[i]){
                for(int j=i*i;j<=n;j+=i){
                    sieve[j]=false;
                }
            }
        }
        return sieve;
    }
    public static void main(String[] args){
        boolean[] sieve=primeNumbers(100);
        for(int i=0;i<sieve.length;i++){
            if(sieve[i]){
                System.out.print(i+" ");
            }
        }
    }
}
