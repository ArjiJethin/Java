import java.util.*;

public class Problem128 {
    public static void main(String[] args) {
        int[] nums = { 100, 4, 200, 1, 3, 2 };
        Solution solution = new Solution();
        int result = solution.longestConsecutive(nums);
        System.out.println("Longest Consecutive Sequence Length: " + result);
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int x : nums) {
            s.add(x);
        }
        int ans = 0;
        for (int x : nums) {
            if (!s.contains(x - 1)) {
                int y = x + 1;
                while (s.contains(y)) {
                    ++y;
                }
                ans = Math.max(ans, y - x);
            }
        }
        return ans;
    }
}