public class RopeCutting {
    static int maxCut(int n,int a,int b,int c){
        if(n<0){
            return -1;
        }
        if(n==0){
            return 0;
        }
        int result=Math.max(Math.max(maxCut(n-a,a,b,c),maxCut(n-b,a,b,c)),maxCut(n-c,a,b,c));
        if(result==-1){
            return -1;
        }
        return result+1;
    }
    public static void main(String[] args) {
        System.out.println(maxCut(5,3,5,1));
    }
}
