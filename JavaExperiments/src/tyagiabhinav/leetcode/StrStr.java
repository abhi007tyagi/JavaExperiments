package tyagiabhinav.leetcode;

import java.util.Arrays;

public class StrStr {

    public static int strStr(String haystack, String needle) {

        int size = haystack.length();
        int nSize = needle.length();
        if (nSize == 0) return 0;
        if (size < nSize) return -1;

        for (int i = 0; i < size; i++) {
            int j = 0;
            while (i + j < size && j < nSize) {
                if (haystack.charAt(i + j) != needle.charAt(j)) break;
                j++;
            }
            if (j == nSize) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "issipi"));
        System.out.println(strStr("mississippi", "pi"));
        System.out.println(strStr("a", "a"));
    }
}
