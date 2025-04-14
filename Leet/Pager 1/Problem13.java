
import java.util.Map;
import java.util.HashMap;

public class Problem13 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "MCMXCIV";
        int result = solution.romanToInt(s);
        System.out.println("Roman to Integer: " + result);
    }
}

class Solution {
    public int romanToInt(String s) {
        String cs = "IVXLCDM";
        int[] vs = { 1, 5, 10, 50, 100, 500, 1000 };
        Map<Character, Integer> d = new HashMap<>();
        for (int i = 0; i < vs.length; ++i) {
            d.put(cs.charAt(i), vs[i]);
        }
        int n = s.length();
        int ans = d.get(s.charAt(n - 1));
        for (int i = 0; i < n - 1; ++i) {
            int sign = d.get(s.charAt(i)) < d.get(s.charAt(i + 1)) ? -1 : 1;
            ans += sign * d.get(s.charAt(i));
        }
        return ans;
    }
}
