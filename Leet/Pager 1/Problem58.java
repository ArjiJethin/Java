
public class Problem58 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "Hello World";
        int result = solution.lengthOfLastWord(s);
        System.out.println(result); // Output: 5
    }
}

class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            --i;
        }
        int j = i;
        while (j >= 0 && s.charAt(j) != ' ') {
            --j;
        }
        return i - j;
    }
}