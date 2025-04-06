package Leet;

public class Problem9 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int x = 121;
        boolean result = solution.isPalindrome(x);
        System.out.println("Is palindrome: " + result);
    }
}

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x > 0 && x % 10 == 0)) {
            return false;
        }
        int y = 0;
        for (; y < x; x /= 10) {
            y = y * 10 + x % 10;
        }
        return x == y || x == y / 10;
    }
}
