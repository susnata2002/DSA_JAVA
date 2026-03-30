
import java.util.Arrays;

public class Prac {

    static boolean[] seive(int n) {
        boolean[] arr = new boolean[n + 1];
        Arrays.fill(arr, true);
        for (int i = 2; i * i <= n; i++) {
            if (arr[i]) {
                for (int j = i * i; j <= n; j += i) {
                    arr[j] = false;
                }
            }
        }
        return arr;
    }

    static long product(int low, int high) {
        if (low > high) {
            return 1;
        }
        if (low == high) {
            return low;
        }
        if (high - low == 1) {
            return low * high;
        }
        int mid = (low + high) >> 1;
        return product(low, mid) * product(mid + 1, high);
    }

    static long factorial(int n) {
        return product(1, n);
    }

    static int facDigit(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        float result = 0;
        while (n >= 2) {
            result += Math.log10(n);
            n--;
        }
        return (int) result + 1;
    }

    static int RussianPeasentMul(int a, int b) {
        int sum = 0;
        while (a > 0) {
            if (a % 2 == 0) {
                a /= 2;
                b *= 2;
            } else {
                sum += b;
                a /= 2;
                b *= 2;
            }
        }
        return sum;
    }

    static int mulMod(int a, int b, int M) {
        int A = ((a % M) + M) % M;
        int B = ((b % M) + M) % M;
        int result = 0;
        while (B > 0) {
            if ((B & 1) == 1) {
                result += (A % M);
            }

            A = (A << 1) % M;

            B >>= 1;
        }
        return result;
    }
    static int gcdExtend(int a, int b, int[] arr){
        if(b==0){
            arr[0]=1; //x
            arr[1]=0; //y
            return a;
        }
        int[] temp=new int[2];
        int gcd=gcdExtend(b,a%b,temp);
        arr[0]=temp[1];
        arr[1]=temp[0]-(a/b)*temp[1];
        return gcd;
    }
    static int moduloInverse(int a, int m){
        int[] arr=new int[2];
        int gcd=gcdExtend(a,m,arr);
        if(gcd!=1){
            return -1;
        }
        else return (arr[0]%m+m)%m;
    }
    public static void main(String[] args) {
        // int a = 5;
        // System.out.println(factorial(a));
        // System.out.println(facDigit(a));
//        System.out.println(RussianPeasentMul(12, 15));
        System.out.println(moduloInverse(3,11));
    }
}
