package Leet;

public class Problem34 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 1, 2, 3, 4, 5 };
        int target = 3;
        int result = solution.search(nums, target);
        System.out.println(result); // Output: 2
    }

}

    boolean check(int x) {
    }

int search(int left, int right) {
    while (left < right) {
        int mid = (left + right + 1) >> 1;
        if (check(mid)) {
            left = mid;
        } else {
            right = mid - 1;
        }
    }
    return left;
}