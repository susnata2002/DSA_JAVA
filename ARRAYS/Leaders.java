public class Leaders {
    static void leaders(int [] arr){
        int max=arr[arr.length-1];
        System.out.println(max);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                System.out.println(arr[i]);
                max=arr[i];
            }
        }
    }
    static void leaders_naive(int arr[], int n)
    {
        for(int i = 0; i < n; i++)
        {
            boolean flag = false;

            for(int j = i + 1; j < n; j++)
            {
                if(arr[i] <= arr[j])
                {
                    flag = true;
                    break;
                }
            }

            if(flag == false)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={7,10,4,3,6,5,2};
        leaders(arr);
    }
}
