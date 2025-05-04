
public class Problem70 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 5;
        int result = solution.climbStairs(n);
        System.out.println(result); // Output: 8
    }
}

class Solution {
    public int climbStairs(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; ++i) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}