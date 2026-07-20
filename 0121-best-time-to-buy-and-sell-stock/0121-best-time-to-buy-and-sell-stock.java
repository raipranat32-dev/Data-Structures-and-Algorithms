class Solution {
    public int maxProfit(int[] prices) {
        // Initialize your variables
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        // Iterate through the prices
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                // Update the minimum price seen so far
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                // Check if selling at current price yields a better profit
                maxProfit = prices[i] - minPrice;
            }
        }
        
        return maxProfit;
    }
}