
import java.util.ArrayList;
import java.util.Arrays;

public class prac_mth {

    static int countDigit(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    static boolean isPalindrome(int n) {
        String str = Integer.toString(n);
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    static int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    static int tailingZero(int n) {
        if (n < 5) {
            return 0;
        }
        int mul = 5;
        int count = 0;
        while (mul <= n) {
            count += n / mul;
            mul *= 5;
        }
        return count;
    }

    static int gcd(int x, int y) {
        return x == y ? x : x > y ? gcd(x - y, x) : gcd(x, y - x);
    }

    static int gcd_opt(int x, int y) {
        return y == 0 ? x : gcd_opt(y, x % y);
    }

    static int lcm(int x, int y) {
        return (x * y) / gcd_opt(x, y);
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    static void primeFactor(int n) {
        if (n < 1) {
            System.out.println(0);
            return;
        }
        while (n % 2 == 0) {
            System.out.println(2);
            n /= 2;
        }
        while (n % 3 == 0) {
            System.out.println(3);
            n /= 3;
        }
        for (int i = 5; i * i <= n; i += 6) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
            while (n % (i + 2) == 0) {
                System.out.println(i + 2);
                n /= (i + 2);
            }
        }

        if (n > 3) {
            System.out.println(n);
        }
    }

    static void allDiv(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
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
    }

    static boolean[] shive(int n) { //O(n log log n)
        boolean[] arr = new boolean[n + 1];
        Arrays.fill(arr, true);
        for (int i = 2; i * i <= n; i++) {
            if (arr[i] == true) {
                for (int j = i * i; j <= n; j += i) {
                    arr[j] = false;
                }
            }
        }
        return arr;
    }

    static long power(int x, int n) {
        if (n == 1) {
            return x;
        }
        return x * power(x, n - 1);
    }

    static long power_opt(int x, int n) {
        if (n == 1) {
            return x;
        }
        long temp = power_opt(x, n / 2);
        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return x * temp * temp;
        }
    }

    static long power_opt_bits(int x, int n) {
        long result = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                result *= x;
            }
            x *= x;
            n >>= 1;
        }
        return result;
    }

    // Quadratic Equation Roots
    static ArrayList<Integer> quadRoot(int a, int b, int c) {
        ArrayList<Integer> list = new ArrayList<>();
        if (a == 0) {
            list.add(-1);
            return list;
        }
        long A = a;
        long B = b;
        long C = c;
        long disc = B * B - (4L * A * C);
        if (disc < 0) {
            list.add(-1);
            return list;
        }
        double root_disc = Math.sqrt(disc);
        double d = 2 * A;

        double r1 = (-B + root_disc) / d;
        double r2 = (-B - root_disc) / d;

        int R1 = (int) Math.floor(r1);
        int R2 = (int) Math.floor(r2);

        if (R1 > R2) {
            list.add(R2);
            list.add(R1);
        } else {
            list.add(R1);
            list.add(R2);
        }

        return list;
    }

    // Factorial Of A Number:
    public int factorial(int n) {
        // code here
        // if(n==1) return 1;
        // return n*factorial(n-1);
        return product(1, n);
    }

    static int product(int low, int high) {
        if (high < low) {
            return 1;
        }
        if (high == low) {
            return low;
        }
        if (high - low == 1) {
            return low * high;
        }
        int mid = (low + high) >>> 1;
        return product(low, mid) * product(mid + 1, high);
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int n1 = sc.nextInt();
        // System.out.println(countDigit(n));
        // System.out.println(isPalindrome(n));
        // System.out.println(fact(n1));
        // System.out.println(tailingZero(n1));
        // System.out.println(gcd(n, n1));
        // System.out.println(gcd_opt(n, n1));
        // // System.out.println(lcm(n, n1));
        // System.out.println(isPrime(n));
        // primeFactor(n);
        // allDiv(n);
        // boolean[] res = shive(n);
        // for (int i = 2; i < res.length; i++) {
        //     if (res[i] == true) {
        //         System.out.print(i + " ");
        //     }
        // }

        // System.out.println(power_opt_bits(3, 4));
        System.out.println(quadRoot(1, -7, 12));
    }

}
