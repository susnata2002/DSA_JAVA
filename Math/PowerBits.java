public class PowerBits {
    static int power(int n,int x){
        int result=1;
        while(n>0){
            if(x%2!=0){
                result*=n;
            }
            x/=2;
            n*=n;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(power(10,2));
    }
}
