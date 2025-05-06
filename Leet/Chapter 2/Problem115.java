public class Problem115 {
    public static void main(String[] args) {
        String s = "rabbbit";
        String t = "rabbit";
        Solution solution = new Solution();
        int result = solution.numDistinct(s, t);
        System.out.println("Number of Distinct Subsequences: " + result);
    }
}

class Solution {
    public int numDistinct(String s, String t) {
        int n = t.length();
        int[] f = new int[n + 1];
        f[0] = 1;
        for (char a : s.toCharArray()) {
            for (int j = n; j > 0; --j) {
                char b = t.charAt(j - 1);
                if (a == b) {
                    f[j] += f[j - 1];
                }
            }
        }
        return f[n];
    }
}