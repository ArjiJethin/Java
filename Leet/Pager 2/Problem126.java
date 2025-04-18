import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Problem126 {

    // iteration bfs
    // https://leetcode.com/problems/word-ladder-ii/solution/
    public class Solution {

        List<List<String>> list = new ArrayList<List<String>>();

        public List<List<String>> findLadders(String start, String end, Set<String> dict) {

            if (start == null || end == null || dict == null)
                return list;

            dict.add(end); // !!!

            Queue<String> q = new LinkedList<String>();
            int level = 1;
            int currentLevelCount = 1;
            int newLevelCount = 0;
            boolean found = false;
            int foundLevel = -1;

            // from end word, to all paths
            HashMap<String, ArrayList<ArrayList<String>>> hm = new HashMap<String, ArrayList<ArrayList<String>>>();

            q.offer(start);
            ArrayList<String> singlePath = new ArrayList<String>();
            ArrayList<ArrayList<String>> allPaths = new ArrayList<ArrayList<String>>();

            singlePath.add(start);
            allPaths.add(singlePath);
            hm.put(start, allPaths);

            while (!q.isEmpty()) {

                String current = q.poll();
                currentLevelCount--; // 这里用了新旧count来标记每个level，没有用null

                for (int i = 0; i < current.length(); i++) {
                    char[] array = current.toCharArray();

                    for (char c = 'a'; c <= 'z'; c++) {
                        array[i] = c;
                        String each = new String(array);
                        if (each.equals(end)) {
                            found = true;
                            foundLevel = level;
                        }

                        if (dict.contains(each)) {
                            // q.offer(each);
                            newLevelCount++;

                            ArrayList<ArrayList<String>> prevAllPaths = hm.get(current);

                            if (hm.containsKey(each))
                                allPaths = hm.get(each);
                            else {
                                /*
                                 * @note@note:
                                 * enqueue is here. if no path ending at this one, then has to explore in future
                                 * if there is path ending at this one, meaning it's been explored already. no
                                 * need to enqueue
                                 */
                                q.offer(each);
                                allPaths = new ArrayList<ArrayList<String>>();
                                hm.put(each, allPaths);
                            }

                            // @note@note: this if is the key !!! no path for new word, or new word path is
                            // one more than previous path
                            // using this if, the"if visited" check can be removed
                            // if (allPaths.size() == 0 || prevAllPaths.size() + 1 == allPaths.size()) {
                            if (allPaths.size() == 0 || prevAllPaths.get(0).size() + 1 == allPaths.get(0).size()) {
                                for (ArrayList<String> eachPath : prevAllPaths) {
                                    ArrayList<String> newone = new ArrayList<String>(eachPath);
                                    newone.add(each);
                                    allPaths.add(newone);
                                }
                            }
                        }
                    }
                }

                // @note@note: also the key, to make sure only find shortest
                if (found && foundLevel != level) {
                    break;
                }

                // @note: must be after trying the last word of currentLevel, then update
                if (currentLevelCount == 0) {
                    currentLevelCount = newLevelCount;
                    newLevelCount = 0;
                    level++;

                }

            }

            if (!found) {
                return list;
            }

            for (ArrayList<String> each : hm.get(end)) {
                list.add(each);
            }

            return list;

        }
    }

    public class Solution_recursion {

        @SuppressWarnings("unused")
        private List<String> findPath(String fromWord, String toWord,
                Set<String> seenWords) {

            if (fromWord.equals(toWord)) {
                ArrayList<String> result = new ArrayList<>();
                result.add(toWord);
                return result;
            }

            // Find all words that you can go to from fromWord
            List<String> nextWords = getNextWords(fromWord, seenWords);
            for (String word : nextWords) {
                Set<String> newSeenWords = new HashSet<String>(seenWords);
                newSeenWords.add(word);
                List<String> subPath = findPath(word, toWord, newSeenWords);
                if (subPath != null) {
                    subPath.add(fromWord);
                    return subPath;
                }
            }

            // There wasn't a path
            return null;

        }

        private final List<String> WORDS = Arrays.asList("head", "heal",
                "teal", "tell", "tall", "tail");

        private final List<Character> ALPHA = Arrays.asList('a', 'b',
                'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');

        private final HashSet<String> DICTIONARY = new HashSet<String>(
                WORDS);

        private List<String> getNextWords(String fromWord,
                Set<String> seenWords) {
            List<String> outList = new ArrayList<String>();
            StringBuilder builder;
            for (int i = 0; i < fromWord.length(); i++) {
                builder = new StringBuilder(fromWord);
                for (Character j : ALPHA) {
                    if (j == fromWord.charAt(i)) {
                        continue;
                    }
                    builder.setCharAt(i, j);
                    String potentialWord = builder.toString();
                    if (DICTIONARY.contains(potentialWord)
                            && !seenWords.contains(potentialWord)) {
                        outList.add(potentialWord);
                    }
                }
            }
            return outList;
        }
    }
}