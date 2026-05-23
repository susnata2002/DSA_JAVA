import java.util.Arrays;

public class FractionTrouble {
    static int[] fraction(int n,int d){
        int bestNum = 0;
        int bestDen = 1;

        for(int den = 1; den <= 10000; den++){

            int num = (n * den - 1) / d;

            if(gcd(num, den) == 1){

                if((long)num * bestDen > (long)bestNum * den){

                    bestNum = num;
                    bestDen = den;
                }
            }
        }

        return new int[]{bestNum, bestDen};
    }
    static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fraction(1,8)));
    }
}
