import java.util.ArrayList;

public class PrintPattern {
    static ArrayList<Integer> pattern(int n){
        ArrayList<Integer> arr=new ArrayList<>();
        if(n<=0){
           arr.add(n);
        }
        int i=n;
        for(;i>-n;i-=5){
            arr.add(i);
        }
        for(;i<=n;i+=5){
            arr.add(i);
        }
        return arr;
    }
    public static void main(String[] args) {

    }
}
