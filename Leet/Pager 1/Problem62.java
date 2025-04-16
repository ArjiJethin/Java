import java.util.Arrays;

public class Problem62 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int m = 3;
        int n = 7;
        int result = solution.uniquePaths(m, n);
        System.out.println(result); // Output: 28
    }
}

class Solution {
    public int uniquePaths(int m, int n) {
        int[] f = new int[n];
        Arrays.fill(f, 1);
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                f[j] += f[j - 1];
            }
        }
        return f[n - 1];
    }
}