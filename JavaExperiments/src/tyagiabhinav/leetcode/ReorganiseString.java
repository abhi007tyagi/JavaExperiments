package tyagiabhinav.leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReorganiseString {
    public static String reorganizeString(String S) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < S.length(); i++)
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0) + 1);

        PriorityQueue<Character> pq = new PriorityQueue<>((o1, o2) -> map.get(o2) - map.get(o1));

        for (char key : map.keySet())
            pq.add(key);

        if(pq.size() == 1) return "";

        StringBuilder strB = new StringBuilder();
        while (pq.size() >= 2) {
            char ch1 = pq.remove();
            char ch2 = pq.remove();
            strB.append(ch1);
            strB.append(ch2);

            if (map.get(ch1) > 1) {
                map.put(ch1, map.get(ch1) - 1);
                pq.add(ch1);
            } else map.remove(ch1);

            if (map.get(ch2) > 1) {
                map.put(ch2, map.get(ch2) - 1);
                pq.add(ch2);
            } else map.remove(ch2);
        }

        if(!pq.isEmpty()) {
            char ch = pq.remove();
            while (map.get(ch) > 0) {
                if (ch == strB.charAt(strB.length() - 1)) return "";
                strB.append(ch);
                map.put(ch, map.get(ch) - 1);
                pq.add(ch);
            }
        }
        return strB.toString();
    }

    public static void main(String[] args) {
        System.out.println(reorganizeString("aaaaaa"));
    }
}
