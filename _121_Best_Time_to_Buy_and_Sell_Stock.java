public class _121_Best_Time_to_Buy_and_Sell_Stock {
      public int maxProfit(int[] prices) {
       int minPrice = prices[0];
       int maxPrice = 0;

       for(int i = 1; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }

            int profit = prices[i] - minPrice;

            if(profit > maxPrice){
                maxPrice = profit;
            }
       }
       return maxPrice;
    }
}
