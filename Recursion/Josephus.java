import java.util.ArrayList;
import java.util.Scanner;

public class Josephus {
    static int lastPeople(ArrayList<Integer> arr,int k,int start){
        if(arr.size()==1){
            return arr.get(0);
        }
        int killIdx=(start+(k-1))%arr.size();
        arr.remove(killIdx);
        return lastPeople(arr,k,killIdx);
    }
    static int josephus(int n, int k){
        int res = 0;

        for(int i = 1; i <= n; i++){
            res = (res + k) % i;
        }

        return res + 1;
    }
    static int josephus_rec(int n, int k){
        if(n == 1) return 0;
        return (josephus(n - 1, k) + k) % n;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            arr.add(i+1);
        }
        System.out.println(lastPeople(arr,k,0));
    }
}
