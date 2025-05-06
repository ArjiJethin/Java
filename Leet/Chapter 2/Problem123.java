
public class Problem123 {
    public static void main(String[] args) {
        int[] prices = { 3, 2, 6, 5, 0, 3 };
        Solution solution = new Solution();
        int result = solution.MaxProfit(prices);
        System.out.println("Maximum profit: " + result);
    }
}

class Solution {
    public int MaxProfit(int[] prices) {
        int f1 = -prices[0], f2 = 0, f3 = -prices[0], f4 = 0;
        for (int i = 1; i < prices.length; ++i) {
            f1 = Math.max(f1, -prices[i]);
            f2 = Math.max(f2, f1 + prices[i]);
            f3 = Math.max(f3, f2 - prices[i]);
            f4 = Math.max(f4, f3 + prices[i]);
        }
        return f4;
    }
}