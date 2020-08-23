package tyagiabhinav.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static int lengthOfLongestSubstring(String s) {
        int max = 0, i = 0, j = 0;
        int size = s.length();
        Set<Character> set = new HashSet<>();
        while(i < size && j < size){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                max = Math.max(max, j-i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcabcabcdabcdabced"));
        System.out.println(lengthOfLongestSubstring("bbbbbbbbbbbb"));
        System.out.println(lengthOfLongestSubstring("aaabbbbccccccc"));
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
