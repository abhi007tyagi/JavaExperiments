package tyagiabhinav.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SubstringWithConcatenationWords {

    public static List<Integer> findSubstring(String s, String[] words) {
        int sLength = s.length();
        int noWords = words.length;
        if (noWords == 0) return new ArrayList<Integer>();
        int wordLength = words[0].length();
        if (sLength < wordLength) return new ArrayList<Integer>();
        if (sLength < wordLength*noWords) return new ArrayList<Integer>();

        int pos = 0;
        List<Integer> list = new ArrayList<>();
        for (String word : words) {
            pos = s.indexOf(word, pos);
            if (pos != -1) {
                list.add(pos++);
            } else {
                break;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        System.out.println(findSubstring(s, words));
//        System.out.println(s.indexOf("foo", 4));
    }
}
