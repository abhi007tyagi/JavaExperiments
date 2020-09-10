package tyagiabhinav.leetcode;

import java.util.*;

public class FindAllAnagramsofString {

    public static List<Integer> findAnagrams(String s, String p) {
        int sizeS = s.length();
        int sizeP = p.length();
        if (sizeS == 0 || sizeS < sizeP) return new ArrayList<>();

        Map<Character, Integer> pMap = new HashMap<>();
        for (int i = 0; i < sizeP; i++) {
            char ch = p.charAt(i);
            pMap.put(ch, pMap.getOrDefault(ch, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();

        Map<Character, Integer> sMap = new HashMap<>();
        for (int i = 0; i < sizeS; i++) {
            char ch = s.charAt(i);
            sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);
            if (i >= sizeP) {
                ch = s.charAt(i - sizeP);
                if (sMap.get(ch) == 1) {
                    sMap.remove(ch);
                } else {
                    sMap.put(ch, sMap.get(ch) - 1);
                }
            }
            if (pMap.equals(sMap)) {
                list.add(i - sizeP + 1);
            }
        }
        return list;
    }

    public static List<Integer> bruteFindAnagrams(String s, String p) {
        int sizeS = s.length();
        int sizeP = p.length();
        if (sizeS == 0 || sizeS < sizeP) return new ArrayList<>();

        int i = 0;
        List<Integer> list = new ArrayList<>();

        while (i + sizeP <= sizeS) {
            String temp = s.substring(i, i + sizeP);
            if (isAnagram(temp, p)) {
                list.add(i);
            }
            i++;
        }

        return list;
    }

    private static boolean isAnagram(String s, String p) {
        char[] ss = s.toCharArray();
        char[] pp = p.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(pp);

        int i = 0;
        while (ss[i] == pp[i]) {
            i++;
            if (i == ss.length) break;
        }
        return i == s.length();
    }


    public static void main(String[] args) {
        List<Integer> list = findAnagrams("cbaebabacdcba", "abc");
        for (int nu : list) {
            System.out.print(nu + ", ");
        }

//        System.out.println(isAnagram("acbde", "cdacb"));
    }
}
