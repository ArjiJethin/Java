import java.util.*;

public class Problem40 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] candidates = { 10, 1, 2, 7, 6, 1, 5 };
        int target = 8;
        System.out.println(solution.combinationSum2(candidates, target));
    }
}

class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    private List<Integer> t = new ArrayList<>();
    private int[] candidates;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        this.candidates = candidates;
        dfs(0, target);
        return ans;
    }

    private void dfs(int i, int s) {
        if (s == 0) {
            ans.add(new ArrayList<>(t));
            return;
        }
        if (i >= candidates.length || s < candidates[i]) {
            return;
        }
        for (int j = i; j < candidates.length; ++j) {
            if (j > i && candidates[j] == candidates[j - 1]) {
                continue;
            }
            t.add(candidates[j]);
            dfs(j + 1, s - candidates[j]);
            t.remove(t.size() - 1);
        }
    }
}