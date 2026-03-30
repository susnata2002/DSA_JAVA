
public class DigitsInFact {

    static int digitsInFactorial(int n) {
        //Because log directly tells you how many digits a number has.
        // For any positive number N:
        // number of digits = ⌊ log10(N) ⌋ + 1

        if (n == 0 || n == 1) {
            return 1;
        }
        double sum = 0;
        for (int i = 2; i <= n; i++) {
            sum += Math.log10(i);
        }
        return (int) sum + 1;
    }

    public static void main(String[] args) {
        System.out.println(digitsInFactorial(5));
    }
}
