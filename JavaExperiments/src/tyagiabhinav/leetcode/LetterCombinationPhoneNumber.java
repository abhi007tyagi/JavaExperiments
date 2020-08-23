package tyagiabhinav.leetcode;

import java.util.*;

public class LetterCombinationPhoneNumber {

    private static Map<Character, String> charMap;
    private static Set< String> bSet;

    static {
        charMap = new HashMap<>(8);
        charMap.put('2', "abc");
        charMap.put('3', "def");
        charMap.put('4', "ghi");
        charMap.put('5', "jkl");
        charMap.put('6', "mno");
        charMap.put('7', "pqrs");
        charMap.put('8', "tuv");
        charMap.put('9', "wxyz");

        bSet = new HashSet<>();
        bSet.add("ab");
        bSet.add("bc");
        bSet.add("ac");
        bSet.add("de");
        bSet.add("ef");
        bSet.add("df");
        bSet.add("gh");
        bSet.add("hi");
        bSet.add("gi");
        bSet.add("jk");
        bSet.add("kl");
        bSet.add("jl");
        bSet.add("mn");
        bSet.add("mo");
        bSet.add("no");
        bSet.add("pq");
        bSet.add("pr");
        bSet.add("ps");
        bSet.add("qr");
        bSet.add("qs");
        bSet.add("rs");
        bSet.add("tu");
        bSet.add("tv");
        bSet.add("uv");
        bSet.add("wx");
        bSet.add("wy");
        bSet.add("wz");
        bSet.add("xy");
        bSet.add("xz");
        bSet.add("yz");
    }

    public static  List<String> letterCombinations(String digits) {
        int size = digits.length();
        StringBuilder tempStr = new StringBuilder();
        for(int i=0; i<size; i++){
            char ch = digits.charAt(i);
            tempStr.append(charMap.get(ch));
        }
        char[] chars = new char[tempStr.length()];
        tempStr.getChars(0,tempStr.length(),chars,0);

        List<String> res = new ArrayList<>();
        for(int i=0;i<chars.length;i++){
            StringBuilder strB = new StringBuilder();
            int counter = 0;
            for(int j=i+1; j<chars.length; j++){
                String str = chars[i]+""+chars[j];
                if(!bSet.contains(str) && counter<(size*size)){
                    strB.append(str);
                    counter+=2;
                }
            }
            if(strB.length()>0) {
                res.add(strB.toString());
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
