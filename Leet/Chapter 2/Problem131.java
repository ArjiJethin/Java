import java.util.*;

public class Problem131 {
    public static void main(String[] args) {
        String s = "aab";
        Solution solution = new Solution();
        List<List<String>> result = solution.partition(s);
        for (List<String> partition : result) {
            System.out.println(partition);
        }
    }
}

class Solution {
    private boolean[][] dp;
    private List<List<String>> ans;
    private int n;

    public List<List<String>> partition(String s) {
        ans = new ArrayList<>();
        n = s.length();
        dp = new boolean[n][n];
        for (int i = 0; i < n; ++i) {
            Arrays.fill(dp[i], true);
        }
        for (int i = n - 1; i >= 0; --i) {
            for (int j = i + 1; j < n; ++j) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1];
            }
        }
        dfs(s, 0, new ArrayList<>());
        return ans;
    }

    private void dfs(String s, int i, List<String> t) {
        if (i == n) {
            ans.add(new ArrayList<>(t));
            return;
        }
        for (int j = i; j < n; ++j) {
            if (dp[i][j]) {
                t.add(s.substring(i, j + 1));
                dfs(s, j + 1, t);
                t.remove(t.size() - 1);
            }
        }
    }
}