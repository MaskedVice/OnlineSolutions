public class LC121 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE , profit = 0;
        for(int i = 0 ; i < prices.length ; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            if(profit < prices[i] - min){
                profit = prices[i] - min;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        LC121 a = new LC121();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(a.maxProfit(prices));
    }
}
