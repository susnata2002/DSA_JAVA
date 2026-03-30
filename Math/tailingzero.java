public class tailingzero {
    static int countZeros(int n){
        int sum=0;
        int divisor=5;
        while(n>=divisor){
            sum=sum+(n/divisor);
            divisor=divisor*5;
        }
        return sum;
    }
    public static void main(String[] args){
       System.out.println(countZeros(10));
    }
}
