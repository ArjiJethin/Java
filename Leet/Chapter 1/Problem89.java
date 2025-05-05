import java.util.ArrayList;
import java.util.List;

public class Problem89 {
    public static void main(String[] args) {
        int n = 3;
        Solution solution = new Solution();
        List<Integer> result = solution.grayCode(n);
        System.out.println("Gray Code: " + result);
    }
}

class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < (1 << n); ++i) {
            ans.add(i ^ (i >> 1));
        }
        return ans;
    }
}
