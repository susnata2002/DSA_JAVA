
public class moduloInverse {

    static long modInv(int n, int m) {
        for (int i = 1; i <= m; i++) {
            int mul = n * i;
            if ((mul - 1) % m == 0) {
                return i;
            }
        }
        return -1;
    }
    public static int modInverse(int n, int m) {
        int g = gcd(n, m);
        if (g != 1) {
            return -1;  // inverse doesn't exist
        }
        int x = modInverseUtil(n, m);
        // ensure positive result
        return (x % m + m) % m;
    }
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    // Extended Euclidean Algorithm
    private static int modInverseUtil(int a, int m) {
        int m0 = m, x0 = 0, x1 = 1;

        if (m == 1) {
            return 0;
        }

        while (a > 1) {
            int q = a / m;
            int t = m;

            // Update m and a
            m = a % m;
            a = t;

            // Update x0 and x1
            t = x0;
            x0 = x1 - q * x0;
            x1 = t;
        }

        return x1;
    }
    static int gcdExtended(int a,int b,int[] arr){
        if(b==0){
            arr[0]=1;
            arr[1]=0;
            return a;
        }
        int [] temp=new int[2];
        int gcd=gcdExtended(b,a%b,temp);
        arr[0]=temp[1];
        arr[1]=temp[0]-(a/b)*temp[1];
        return gcd;
    }
    static int moduloInverse(int a,int m){
        int[] arr=new int[2];
        int gcd=gcdExtended(a,m,arr);
        if(gcd!=1){
            System.out.println("Inverse does not exist");
            return -1;
        }
        int inverse=(arr[0]%m+m)%m;
        return inverse;
    }
    public static void main(String[] args) {
        System.out.println(moduloInverse(3,11));
    }
}
