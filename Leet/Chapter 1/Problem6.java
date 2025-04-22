
public class Problem6 {

    public class Solution {
        public String convert(String s, int nRows) {
            if (s == null || s.length() <= nRows || nRows == 1) {
                return s;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < nRows; i++) {
                if (i == 0 || i == nRows - 1) {
                    int index = i;
                    while (index < s.length()) {
                        sb.append(s.charAt(index));
                        index += 2 * (nRows - 1);
                    }
                } else {
                    int index = i;
                    while (index < s.length()) {
                        sb.append(s.charAt(index));
                        if (index + 2 * nRows - 2 * i - 2 < s.length()) {
                            sb.append(s.charAt(index + 2 * nRows - 2 * i - 2));
                        }
                        index += 2 * (nRows - 1);
                    }
                }
            }
            return sb.toString();
        }
    }
}