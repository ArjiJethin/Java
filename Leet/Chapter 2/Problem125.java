public class Problem125 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String testString = "A man, a plan, a canal: Panama";
        System.out.println("Is Palindrome: " + solution.isPalindrome(testString));
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                ++i;
            } else if (!Character.isLetterOrDigit(s.charAt(j))) {
                --j;
            } else if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            } else {
                ++i;
                --j;
            }
        }
        return true;
    }
}