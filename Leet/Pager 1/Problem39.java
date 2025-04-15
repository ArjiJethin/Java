import java.util.*;

public class Problem39 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] candidates = { 2, 3, 6, 7 };
        int target = 7;
        System.out.println(solution.combinationSum(candidates, target));
    }
}

class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    private List<Integer> t = new ArrayList<>();
    private int[] candidates;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates); // Optional: helps with pruning
        this.candidates = candidates;
        dfs(0, target);
        return ans;
    }

    private void dfs(int i, int s) {
        if (s == 0) {
            ans.add(new ArrayList<>(t)); // ✅ Generic safe
            return;
        }
        if (i >= candidates.length || s < candidates[i]) {
            return;
        }

        // Skip current candidate
        dfs(i + 1, s);

        // Include current candidate
        t.add(candidates[i]);
        dfs(i, s - candidates[i]);
        t.remove(t.size() - 1);
    }
}
