
public class AllDivisors {

    static void allDivisor(int n) {
        int i;
        for (i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        for (; i > 1;) {
            i--;
            if (i != n / i && n % i == 0) {
                System.out.print(n / i + " ");
            }
        }
        // for(int i=1;i*i<=n;i++){
        //     if(n%i==0){
        //         if(n/i!=i){
        //             System.out.println(i);
        //             System.out.println(n/i
        //         }
        //         if(n/i==i){
        //             System.out.println(i);
        //         });
        //     }

        // }
    }

    public static void main(String[] args) {
        System.out.println("All Divisors");
        allDivisor(30);
    }
}
