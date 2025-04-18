import java.util.*;

public class Problem119 {
    public static void main(String[] args) {
        int rowIndex = 3;
        Solution solution = new Solution();
        List<Integer> result = solution.getRow(rowIndex);
        System.out.println(result);
    }
}

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> f = new ArrayList<>();
        for (int i = 0; i < rowIndex + 1; ++i) {
            f.add(1);
        }
        for (int i = 2; i < rowIndex + 1; ++i) {
            for (int j = i - 1; j > 0; --j) {
                f.set(j, f.get(j) + f.get(j - 1));
            }
        }
        return f;
    }
}