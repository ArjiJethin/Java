package Leet;

public class Problem49 {
    public static void main(String[] args) {
        Solution solution = new Problem49().new Solution();
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println(solution.groupAnagrams(strs));
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> d = new HashMap<>();
        for (String s : strs) {
            char[] t = s.toCharArray();
            Arrays.sort(t);
            String k = String.valueOf(t);
            d.computeIfAbsent(k, key -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(d.values());
    }
}