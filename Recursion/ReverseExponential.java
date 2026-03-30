public class ReverseExponential {
    static int reverse_usingLog(int n) {
        // base case
        if (n < 10) {
            return n;
        }

        // count number of digits in n/10
        int digits = (int) Math.log10(n); // digits in n minus 1
        return (n % 10) * (int)Math.pow(10, digits) + reverse_usingLog(n / 10);
    }
    public static void main(String[] args) {
        System.out.println(reverse_usingLog(1232422445));
    }
}
