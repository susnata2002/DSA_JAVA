
public class RussianPeasantMultiplication {

    long mulMod(long a, long b, long m) {

        // a=Math.floorMod(a,m);
        // b=Math.floorMod(b,m);
        a = ((a % m) + m) % m;
        b = ((b % m) + m) % m;
        long res = 0;

        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res + a) % m;
            }

            a = (a << 1) % m;   // double a
            b >>= 1;            // halve b
        }
        return res;
    }
}
