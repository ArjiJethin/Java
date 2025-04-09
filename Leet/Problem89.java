public class Problem89 {
    public static void main(String[] args) {
        int n = 3;
        Solution solution = new Solution();
        List<Integer> result = solution.grayCode(n);
        System.out.println("Gray Code: " + result);
    }
}

class Solution {
    public:
        vector<int> grayCode(int n) {
            vector<int> ans;
            for (int i = 0; i < 1 << n; ++i) {
                ans.push_back(i ^ (i >> 1));
            }
            return ans;
        }
};