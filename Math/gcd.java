public class gcd {
    static int hcf(int x,int y){
        int max=Math.max(x,y);
        int min=Math.min(x,y);
        for(int i=min;i>1;i--){
            if(min%i==0 && max%i==0){
                return i;
            }
        }
        return 1;
    }
    static int hcf_euclidian(int a, int b){
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        return a;
    }
    static int hcf_euclidian_opt(int a, int b){
        if(b==0){
            return a;
        }
        return hcf_euclidian_opt(b, a%b);
    }
    public static void main(String[] args){
        System.out.println(hcf(20, 36));
        System.out.println(hcf_euclidian(20, 36));
        System.out.println(hcf_euclidian_opt(20, 36));
    }
}
