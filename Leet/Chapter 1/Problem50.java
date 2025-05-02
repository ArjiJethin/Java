
public class Problem50 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        double x = 2.0;
        int n = 10;
        System.out.println(solution.myPow(x, n)); // Output: 1024.0
    }
}

class Solution {
    public double myPow(double x, int n) {
        return n >= 0 ? qpow(x, n) : 1 / qpow(x, -(long) n);
    }

    private double qpow(double a, long n) {
        double ans = 1;
        for (; n > 0; n >>= 1) {
            if ((n & 1) == 1) {
                ans = ans * a;
            }
            a = a * a;
        }
        return ans;
    }
}