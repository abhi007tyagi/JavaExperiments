package tyagiabhinav.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinctCharacters {

    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        int size = s.length();
        if (size < k) return 0;

        Map<Character, Integer> map = new HashMap<>(k);
        int i = 0, j = 0;
        int max = 0, freq = 0;
        while (i < size) {
            char ch = s.charAt(i);
            if (i >= k) {
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                    freq++;
                } else {
                    if (map.size() >= k) {
                        char c = s.charAt(j++);
                        if (!map.containsKey(c)) {
                            c = s.charAt(j++);
                        }
                        freq -= map.get(c);
                        map.remove(c);
                    }
                    map.put(ch, 1);
                    freq++;
                }
            } else {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                freq++;
            }
            max = Math.max(freq, max);
            i++;
        }
        return max;
    }

    public static void main(String[] args) {
//        System.out.println(lengthOfLongestSubstringKDistinct("abcdsesasdew", 2));
        System.out.println(10&7);

    }
}
