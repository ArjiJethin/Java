import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Problem84 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] heights = { 2, 1, 5, 6, 2, 3 };
        int result = solution.largestRectangleArea(heights);
        System.out.println("Largest Rectangle Area: " + result);
    }
}

class Solution {
    public int largestRectangleArea(int[] heights) {
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