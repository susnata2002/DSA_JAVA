public class BettingGame {
    static int betBalance(String s) {
        // code here
        int bet=1;
        int res=4;
        for(int i=0;i<s.length();i++){
            if(res<bet){
                return -1; // I do not have the money for the bet.
            }
            if(s.charAt(i)=='W'){
                res=res+bet;
                bet=1;
            } else if (s.charAt(i)=='L') {
                res=res-bet;
                bet=2;
            }
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
