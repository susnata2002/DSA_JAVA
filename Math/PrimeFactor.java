
public class PrimeFactor {

    static boolean isPrime(int n) {
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
        if (n <= 1) {
            return;
        }
        if (isPrime(n)) {
            System.out.println(n);
            return;
        }
        for (int i = 2; i * i <= n; i++) {
            if (isPrime(i)) {
                while (n % i == 0) {
                    System.out.println(i);
                    n = n / i;
                }
            }
        }
        if (n > 1) {
            System.out.println(n);
        }
    }

    static void primeFactor_opt(int n) {
        if (n < 1) {
            return;
        }
        if (n == 2 || n == 3) {
            System.out.println(n);
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

    public static void main(String[] args) {
        System.out.println("Prime Factor: ");
        // primeFactor(315);
        primeFactor_opt(450);
    }
}
