
public class OnetoN {
    static void oneToN(int n, int i) {
        if (i == n) {
            System.out.println(i);
            return;
        }

        System.out.println(i);
        oneToN(n, i + 1);
    }
    public static void main(String[] args) {
        oneToN(10, 1);
    }
}
