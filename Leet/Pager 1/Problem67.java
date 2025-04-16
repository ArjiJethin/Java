
public class Problem67 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String a = "1010";
        String b = "1011";
        String result = solution.addBinary(a, b);
        System.out.println(result); // Output: 11001
    }
}

class Solution {
    public String addBinary(String a, String b) {
        var sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        for (int carry = 0; i >= 0 || j >= 0 || carry > 0; --i, --j) {
            carry += (i >= 0 ? a.charAt(i) - '0' : 0) + (j >= 0 ? b.charAt(j) - '0' : 0);
            sb.append(carry % 2);
            carry /= 2;
        }
        return sb.reverse().toString();
    }
}