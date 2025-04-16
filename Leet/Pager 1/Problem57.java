import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem57 {
    public static void main(String[] args) {
        Solution solution = new Problem57().new Solution();
        int[][] intervals = { { 1, 3 }, { 6, 9 } };
        int[] newInterval = { 2, 5 };
        int[][] result = solution.insert(intervals, newInterval);
        for (int[] interval : result) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }

    // LeetCode submit

    class Solution {
        public int[][] insert(int[][] intervals, int[] newInterval) {
            int[][] newIntervals = new int[intervals.length + 1][2];
            for (int i = 0; i < intervals.length; ++i) {
                newIntervals[i] = intervals[i];
            }
            newIntervals[intervals.length] = newInterval;
            return merge(newIntervals);
        }

        private int[][] merge(int[][] intervals) {
            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
            List<int[]> ans = new ArrayList<>();
            ans.add(intervals[0]);
            for (int i = 1; i < intervals.length; ++i) {
                int s = intervals[i][0], e = intervals[i][1];
                if (ans.get(ans.size() - 1)[1] < s) {
                    ans.add(intervals[i]);
                } else {
                    ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], e);
                }
            }
            return ans.toArray(new int[ans.size()][]);
        }
    }
}