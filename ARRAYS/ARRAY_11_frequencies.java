public class ARRAY_11_frequencies {
    static void frequencies(int[] arr) {
        int n = arr.length;
        int count = 1;
        int max = 1;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } 
            else {
                max=Math.max(max,count);
                System.out.println("count of " + arr[i] + " is: " + max);
                count=1;
                max=1;
            }
        }
        if (count>0) {
            System.out.println("count of " + arr[n - 1] + " is: " + count);
        }
    }
    static void printFreq(int arr[])
    {
        int n=arr.length;
    	int freq = 1, i = 1;

    	while(i < n)
    	{
    		while(i < n && arr[i] == arr[i - 1])
    		{
    			freq++;
    			i++;
    		}

    		System.out.println(arr[i - 1] + " " + freq);

    		i++;
    		freq = 1;
    	}
    	if(n==1 || arr[n-1]!=arr[n-2])
    	System.out.println(arr[n-1]+" "+ 1) ;
    }

    public static void main(String[] args) {
        int []arr={1,1,1,2,3,3,5,5,8,8,8,9,9,10};
        frequencies(arr);
    }
}
