class Solution {
    public int maxProfit(int[] prices) {
       int buyPrice = prices[0];
       int profit = 0;

       for( int i = 1; i < prices.length; i++) {
          if( prices[i] < buyPrice ) {
            buyPrice = prices[i];
          }
          else if(prices[i] - buyPrice > profit){
            profit = prices[i] - buyPrice;
          }
        }
        return profit;
       
    }
}

public static void main(String[] args) {
       // Sample input
       int[] prices = {7, 1, 5, 3, 6, 4};


       Solution sol = new Solution();
       int result = sol.maxProfit(prices);


       System.out.println("Maximum Profit: " + result);
   }
}

