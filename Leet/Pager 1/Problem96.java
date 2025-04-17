public class Problem96 {
    public static void main(String[] args) {
        int n = 3;
        Solution solution = new Solution();
        int result = solution.numTrees(n);
        System.out.println("Number of unique BSTs: " + result);
    }
}

class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; ++i) {
            for (int j = 0; j < i; ++j) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        return dp[n];
    }
}
