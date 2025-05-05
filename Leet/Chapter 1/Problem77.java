import java.util.ArrayList;
import java.util.List;

public class Problem77 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 4, k = 2;
        List<List<Integer>> result = solution.combine(n, k);
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }
}

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(1, n, k, new ArrayList<>(), res);
        return res;
    }

    private void dfs(int i, int n, int k, List<Integer> t, List<List<Integer>> res) {
        if (t.size() == k) {
            res.add(new ArrayList<>(t));
            return;
        }
        for (int j = i; j <= n; ++j) {
            t.add(j);
            dfs(j + 1, n, k, t, res);
            t.remove(t.size() - 1);
        }
    }
}