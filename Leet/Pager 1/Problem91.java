public class Problem91 {
    public static void main(String[] args) {
        String s = "226";
        Solution solution = new Solution();
        int result = solution.numDecodings(s);
        System.out.println("Number of ways to decode: " + result);
    }
}

class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int f = 0, g = 1;
        for (int i = 1; i <= n; ++i) {
            int h = s.charAt(i - 1) != '0' ? g : 0;
            if (i > 1 && s.charAt(i - 2) != '0' && Integer.valueOf(s.substring(i - 2, i)) <= 26) {
                h += f;
            }
            f = g;
            g = h;
        }
        return g;
    }
}