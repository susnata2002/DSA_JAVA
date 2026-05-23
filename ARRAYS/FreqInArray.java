public class FreqInArray {
    static void freq(int[] arr){
//        boolean flag=false;
        int count=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
            else{
                System.out.println(arr[i]+": "+count);
                count=1;
            }
        }
        System.out.println(arr[arr.length-1] + ": " + count);
    }
    static void printFreq(int arr[], int n)
    {
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
        int[] arr={10,10,10,25,25,30,30,30};
        freq(arr);
    }
}
