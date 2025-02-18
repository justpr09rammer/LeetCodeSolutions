
class Solution {
    public int maxProfit(int[] prices) {

        int buy = prices[0];
        int ans = 0;
        for (int i = 1; i < prices.length; i++) {
            int sell = prices[i];
            int profit = sell - buy;
            if (profit < 0) {
                buy = sell;
            }
            ans = Math.max(ans, profit);
        }
        return ans;
    }
}
