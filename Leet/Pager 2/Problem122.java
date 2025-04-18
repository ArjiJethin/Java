public class Problem122 {
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        Solution solution = new Solution();
        int result = solution.maxProfit(prices);
        System.out.println("Maximum profit: " + result);
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        for (int i = 1; i < prices.length; ++i) {
            ans += Math.max(0, prices[i] - prices[i - 1]);
        }
        return ans;
    }
}