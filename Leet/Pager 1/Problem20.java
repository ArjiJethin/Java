
import java.util.Deque;
import java.util.ArrayDeque;

public class Problem20 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "{[()]}";
        boolean result = solution.isValid(s);
        System.out.println("Is valid: " + result);
    }
}

class Solution {
    public boolean isValid(String s) {
        Deque<Character> stk = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stk.push(c);
            } else if (stk.isEmpty() || !match(stk.pop(), c)) {
                return false;
            }
        }
        return stk.isEmpty();
    }

    private boolean match(char l, char r) {
        return (l == '(' && r == ')') || (l == '{' && r == '}') || (l == '[' && r == ']');
    }
}