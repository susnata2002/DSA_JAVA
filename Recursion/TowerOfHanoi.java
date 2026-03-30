public class TowerOfHanoi {
    static void hanoi(int n, char s,char h,char d){
        if(n==1){
            System.out.println("From "+s+" to "+d);
            return;
        }
        hanoi(n-1,s,d,h);
        System.out.println("From "+s+" to "+d);
        hanoi(n-1,h,s,d);
    }
    public static void main(String[] args) {
        hanoi(3,'A','B','C');
    }
}
