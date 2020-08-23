package tyagiabhinav.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    private static Map<Character, Integer> romanMap;

    static {
        romanMap = new HashMap<>();
        romanMap.put('M', 1000);
        romanMap.put('D', 500);
        romanMap.put('C', 100);
        romanMap.put('L', 50);
        romanMap.put('X', 10);
        romanMap.put('V', 5);
        romanMap.put('I', 1);
    }

    public static int romanToInt(String s) {
        int size = s.length();
        char prev = 'I';
        int num = 0;
        for (int i = size - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == prev) num += (romanMap.get(ch));
            else if(romanMap.get(ch) < romanMap.get(prev)){
                num -= (romanMap.get(ch));
            } else{
                num += (romanMap.get(ch));
            }
            prev = ch;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("VIII"));
        System.out.println(romanToInt("XII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}
