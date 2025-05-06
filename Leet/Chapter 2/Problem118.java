import java.util.*;

public class Problem118 {
    public static void main(String[] args) {
        int numRows = 5;
        Solution solution = new Solution();
        List<List<Integer>> result = solution.generate(numRows);
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> f = new ArrayList<>();
        f.add(List.of(1));
        for (int i = 0; i < numRows - 1; ++i) {
            List<Integer> g = new ArrayList<>();
            g.add(1);
            for (int j = 0; j < f.get(i).size() - 1; ++j) {
                g.add(f.get(i).get(j) + f.get(i).get(j + 1));
            }
            g.add(1);
            f.add(g);
        }
        return f;
    }
}