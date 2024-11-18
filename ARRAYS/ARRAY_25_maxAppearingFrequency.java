import java.util.Arrays;

public class ARRAY_25_maxAppearingFrequency {
    static int maxElement(int [] left,int []right){
        int n=left.length;
        int [] max=new int [100];
        Arrays.fill(max, 0);
        for(int i=0;i<n;i++){
            for(int j=left[i];j<=right[i];j++){
                max[j]++;
            }
        } 
        int res=0;
        for(int i=0;i<max.length;i++){
            if(max[i]>max[res]){
                res=i;
            }
        }
        return res;
    }
    static int opt_maxElement(int []left,int []right){
        int n=left.length;
        int []max=new int [100];
        Arrays.fill(max, 0);
        for(int i=0;i<n;i++){
            max[left[i]]++;
            max[right[i]+1]--;
        }
        
		int res = 0;
		for (int i = 1; i < 100 ; i++) {
			max[i] += max[i - 1];
			if (max[i] > max[res]) {
				res=i;
			}
		}

		return res;
    }
    public static void main(String[] args) {
        int[] left={1,4,3,1};
        int[] right={15,8,5,4};

        System.out.println(maxElement(left, right));
        System.out.println(opt_maxElement(left, right));
    }
}
