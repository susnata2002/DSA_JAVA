public class ARRAY_18_majorityElement {
    static int majority(int []arr){
        int n=arr.length;
        int maxCount=0;
        int element=arr[0];
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>maxCount){
                maxCount=count;
                element=arr[i];
            }
        }
        if(maxCount>(arr.length/2)){
            return element;
        }
        else return -1;
    }
    static void PrintMajority(int []arr){
        int k=majority(arr);
        if(k!=-1){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==k){
                    System.out.println(i);
                }
            }
        }
        else System.out.println(-1);
    }
    static int findMajority(int arr[], int n)
    {
    	for(int i = 0; i < n; i++)
    	{
    		int count = 1;

    		for(int j = i + 1; j < n; j++)
    		{
    			if(arr[i] == arr[j])
    				count++;
    		}

    		if(count > n / 2)
    			return i;
    	}

    	return -1;
    }
    static int findMajority_opt(int arr[], int n)
    {
    	int res = 0, count = 1;

    	for(int i = 1; i < n; i++)
    	{
    		if(arr[res] == arr[i])
    			count++;
    		else 
    			count --;

    		if(count == 0)
    		{
    			res = i; count = 1;
    		}
    	}

    	count = 0;

    	for(int i = 0; i < n; i++)
    		if(arr[res] == arr[i])
    			count++;

    	if(count <= n /2)
    		res = -1;

    	return res; 
    }
    public static void main(String[] args) {
        int []arr={8,3,4,8,8};
        // PrintMajority(arr);
        // int arr[] = {8, 7, 6, 8, 6, 6, 6, 6}, n = 8;

       System.out.println(findMajority(arr, 5));
       System.out.println(findMajority_opt(arr, 5));
    }
}
