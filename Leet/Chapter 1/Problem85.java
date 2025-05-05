import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Problem85 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[][] matrix = {
                { '1', '0', '1', '0', '0' },
                { '1', '0', '1', '1', '1' },
                { '1', '1', '1', '1', '1' },
                { '1', '0', '0', '1', '0' }
        };
        int result = solution.maximalRectangle(matrix);
        System.out.println("Maximal Rectangle Area: " + result);
    }
}

class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n = matrix[0].length;
        int[] heights = new int[n];
        int ans = 0;
        for (var row : matrix) {
            for (int j = 0; j < n; ++j) {
                if (row[j] == '1') {
                    heights[j] += 1;
                } else {
                    heights[j] = 0;
                }
            }
            ans = Math.max(ans, largestRectangleArea(heights));
        }
        return ans;
    }

    private int largestRectangleArea(int[] heights) {
        int res = 0, n = heights.length;
        Deque<Integer> stk = new ArrayDeque<>();
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(right, n);
        for (int i = 0; i < n; ++i) {
            while (!stk.isEmpty() && heights[stk.peek()] >= heights[i]) {
                right[stk.pop()] = i;
            }
            left[i] = stk.isEmpty() ? -1 : stk.peek();
            stk.push(i);
        }
        for (int i = 0; i < n; ++i) {
            res = Math.max(res, heights[i] * (right[i] - left[i] - 1));
        }
        return res;
    }
}