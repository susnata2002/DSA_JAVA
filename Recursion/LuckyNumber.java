import java.util.ArrayList;

public class LuckyNumber {
    static int Number(int n,int count){
        if(count>n){
            return 1;
        }
        if(n%count==0){
            return 0;
        }
        n=n-(n/count);
        return Number(n,count+1);
    }
    static int luckyNumber(int n){
        return Number(n,2);
    }
    public static void main(String[] args) {
        System.out.println(luckyNumber(5));
    }
}
