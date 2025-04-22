
import java.util.List;

public class Problem12 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = 1994;
        String result = solution.intToRoman(num);
        System.out.println("Roman numeral: " + result);
    }
}

class Solution {
    public String intToRoman(int num) {
        List<String> cs = List.of("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I");
        List<Integer> vs = List.of(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1);
        StringBuilder ans = new StringBuilder();
        for (int i = 0, n = cs.size(); i < n; ++i) {
            while (num >= vs.get(i)) {
                num -= vs.get(i);
                ans.append(cs.get(i));
            }
        }
        return ans.toString();
    }
}