package tyagiabhinav.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBreakII {

    public static List<String> wordBreak(String s, List<String> wordDict) {
        int size = wordDict.size();
        boolean[] isScanned = new boolean[size];
        for (int i = 0; i < size; i++) {
            isScanned[i] = false;
        }

        List<String> list = new ArrayList<>();
        int count = 0;
        while (count < size) {
            int lastIndex = 0;
            StringBuilder strB = new StringBuilder();
            for (int i = 0; i < size; i++) {
                if (!isScanned[i]) {
                    String word = wordDict.get(i);
                    int wSize = word.length();
                    if (s.indexOf(word, lastIndex) != -1) {
                        isScanned[i] = true;
                        count++;
                        lastIndex += (wSize-1);
                        strB.append(word).append(" ");
                    }
                }
            }
            list.add(strB.toString().trim());
        }
        return list;
    }

    public static void main(String[] args) {
//        String s = "catsanddog";
//        List<String> list = Arrays.asList("cat", "cats", "and", "sand", "dog");
//        list = wordBreak(s, list);
//        for (String str : list) {
//            System.out.println(str);
//        }
        
        String s = "-1,0,1,.,.,.,.";
        String[] ch = s.split(",");
    }

}
