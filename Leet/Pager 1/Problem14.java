
public class Problem14 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = { "flower", "flow", "flight" };
        String result = solution.longestCommonPrefix(strs);
        System.out.println("Longest common prefix: " + result);
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        for (int i = 0; i < strs[0].length(); ++i) {
            for (int j = 1; j < n; ++j) {
                if (strs[j].length() <= i || strs[j].charAt(i) != strs[0].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}