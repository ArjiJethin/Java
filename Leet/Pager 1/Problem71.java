import java.util.ArrayDeque;
import java.util.Deque;

public class Problem71 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String path = "/a/./b/../../c/";
        String result = solution.simplifyPath(path);
        System.out.println(result); // Output: "/c"
    }
}

class Solution {
    public String simplifyPath(String path) {
        Deque<String> stk = new ArrayDeque<>();
        for (String s : path.split("/")) {
            if ("".equals(s) || ".".equals(s)) {
                continue;
            }
            if ("..".equals(s)) {
                stk.pollLast();
            } else {
                stk.offerLast(s);
            }
        }
        return "/" + String.join("/", stk);
    }
}