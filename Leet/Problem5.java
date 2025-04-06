package Leet;

public class Problem5 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String result = solution.convert(s, numRows);
        System.out.println("Converted string: " + result);
    }
}

class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder ans = new StringBuilder();
        int group = 2 * numRows - 2;
        for (int i = 1; i <= numRows; i++) {
            int interval = i == numRows ? group : 2 * numRows - 2 * i;
            int idx = i - 1;
            while (idx < s.length()) {
                ans.append(s.charAt(idx));
                idx += interval;
                interval = group - interval;
                if (interval == 0) {
                    interval = group;
                }
            }
        }
        return ans.toString();
    }
}