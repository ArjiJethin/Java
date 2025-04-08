package Leet;

public class Problem59 {
    public static void main(String[] args) {
        Solution solution = new Problem59().new Solution();
        int n = 3;
        int[][] result = solution.generateMatrix(n);
        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int i = 0, j = 0, k = 0;
        int[][] dirs = { {0, 1}, {1, 0}, {0, -1}, {-1, 0} };
        for (int v = 1; v <= n * n; ++v) {
            ans[i][j] = v;
            int x = i + dirs[k][0], y = j + dirs[k][1];
            if (x < 0 || y < 0 || x >= n || y >= n || ans[x][y] > 0) {
                k = (k + 1) % 4;
                x = i + dirs[k][0];
                y = j + dirs[k][1];
            }
            i = x;
            j = y;
        }
        return a