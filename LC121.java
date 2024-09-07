public class LC121 {
    public int maxProfit(int[] prices) {
        int n = prices.length, i = 0;
        int profit = 0,min = prices[0];
        while(i<n){
            if(prices[i] < min) min = prices[i];
            if(prices[i] - min > profit) profit =prices[i] - min;
            i++;
        }
        return profit;
    }

    public static void main(String[] args) {
        LC121 obj = new LC121();
        int[] prices = {7,6,4,3,1}; 

        System.out.println(obj.maxProfit(prices));

    }
}
