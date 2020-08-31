package tyagiabhinav.leetcode;

import java.util.HashMap;
import java.util.Map;

public class VerifyAlienDictionary {
    public static boolean isAlienSorted(String[] words, String order) {
        int wordsSize = words.length;
        if (wordsSize < 2) return true;

        int orderLen = order.length();
        Map<Character, Integer> oMap = new HashMap<>(orderLen);
        for (int i = 0; i < orderLen; i++) {
            oMap.put(order.charAt(i), i);
        }

        for (int i = 1; i < wordsSize; i++) {
            int size = Math.min(words[i - 1].length(), words[i].length());
            int eqCount = 0;
            for (int j = 0; j < size; j++) {
                if (oMap.get(words[i - 1].charAt(j)) > oMap.get(words[i].charAt(j))) return false;
                if (oMap.get(words[i - 1].charAt(j)) < oMap.get(words[i].charAt(j))) break;
                if (oMap.get(words[i - 1].charAt(j)) == oMap.get(words[i].charAt(j))) eqCount++;
            }
            if (eqCount == size && words[i - 1].length() > words[i].length()) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "app", "applw"};
        System.out.println(isAlienSorted(arr, "abcdefghijklmnopqrstuvwxyz"));
    }
}
