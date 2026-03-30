// package Math;

public class countdigit{
    public static int count(int n) {
        if (n == 0) return 1;     // Edge case: 0 has 1 digit
        n = Math.abs(n);          // Handle negatives
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Digits in " + n + " = " + count(n));
    }
}