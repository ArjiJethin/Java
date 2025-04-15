
public class Problem44 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "aa";
        String p = "a";
        System.out.println(solution.isMatch(s, p)); // false
        s = "aa";
        p = "*";
        System.out.println(solution.isMatch(s, p)); // true
        s = "cb";
        p = "?a";
        System.out.println(solution.isMatch(s, p)); // false
        s = "adceb";
        p = "*a*b";
        System.out.println(solution.isMatch(s, p)); // true
        s = "acdcb";
        p = "a*c?b";
        System.out.println(solution.isMatch(s, p)); // false
    }
}

class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;
        for (int j = 1; j <= n; ++j) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }
        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                }
            }
        }
        return dp[m][n];
    }
}