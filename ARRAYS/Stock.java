public class Stock {
    static int maxProfit_greedy(int[] arr){
        int profit = 0;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[i-1]){
                profit += (arr[i] - arr[i-1]);
            }
        }
        return profit;
    }
    static int maxProfit_rec(int price[], int start, int end) {
        if (end <= start)
            return 0;

        int profit = 0;

        for (int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (price[j] > price[i]) {
                    int curr_profit = price[j] - price[i]
                            + maxProfit_rec(price, start, i - 1)
                            + maxProfit_rec(price, j + 1, end);

                    profit = Math.max(profit, curr_profit);
                }
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] arr={1,5,3,1,2,8};
        System.out.println(maxProfit_greedy(arr));
    }
}
