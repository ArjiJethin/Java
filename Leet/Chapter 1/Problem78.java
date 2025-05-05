import java.util.ArrayList;
import java.util.List;

public class Problem78 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> result = solution.subsets(nums);
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}

class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    private List<Integer> t = new ArrayList<>();
    private int[] nums;

    public List<List<Integer>> subsets(int[] nums) {
        this.nums = nums;
        dfs(0);
        return ans;
    }

    private void dfs(int i) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(t));
            return;
        }
        dfs(i + 1);
        t.add(nums[i]);
        dfs(i + 1);
        t.remove(t.size() - 1);
    }
}