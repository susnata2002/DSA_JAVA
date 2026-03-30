public class lcm{
    static int hcf(int x,int y){
        if(y==0){
            return x;
        }
        return hcf(y,x%y);
    }
    static int LCM(int x,int y){
        return (x*y)/hcf(x,y);
    }
    public static void main(String[] args){
        System.out.println(LCM(4, 6));
    }
}
