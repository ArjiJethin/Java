
import java.util.List;
import java.util.ArrayList;

public class Problem17 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String digits = "23";
        List<String> result = solution.letterCombinations(digits);
        System.out.println("Letter Combinations: " + result);
    }
}

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) {
            return ans;
        }
        ans.add("");
        String[] d = new String[] { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        for (char i : digits.toCharArray()) {
            String s = d[i - '2'];
            List<String> t = new ArrayList<>();
            for (String a : ans) {
                for (String b : s.split("")) {
                    t.add(a + b);
                }
            }
            ans = t;
        }
        return ans;
    }
}