package tyagiabhinav.leetcode;

import java.lang.ref.PhantomReference;
import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {

    private static  Map<Integer, String> romanMap;

    static {
        romanMap = new HashMap<>();
        romanMap.put(3000, "MMM");
        romanMap.put(2000, "MM");
        romanMap.put(1000, "M");
        romanMap.put(900, "CM");
        romanMap.put(800, "DCCC");
        romanMap.put(700, "DCC");
        romanMap.put(600, "DC");
        romanMap.put(500, "D");
        romanMap.put(400, "CD");
        romanMap.put(300, "CCC");
        romanMap.put(200, "CC");
        romanMap.put(100, "C");
        romanMap.put(90, "XC");
        romanMap.put(80, "LXXX");
        romanMap.put(70, "LXX");
        romanMap.put(60, "LX");
        romanMap.put(50, "L");
        romanMap.put(40, "XL");
        romanMap.put(30, "XXX");
        romanMap.put(20, "XX");
        romanMap.put(10, "X");
        romanMap.put(9, "IX");
        romanMap.put(8, "VIII");
        romanMap.put(7, "VII");
        romanMap.put(6, "VI");
        romanMap.put(5, "V");
        romanMap.put(4, "IV");
        romanMap.put(3, "III");
        romanMap.put(2, "II");
        romanMap.put(1, "I");
        romanMap.put(0, "");
    }

    public static String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
        int temp = num;
        int counter = 1;
        while (num != 0) {
            temp = num % 10;
            res = (new StringBuilder(romanMap.get(temp * counter))).append(res);
            num /= 10;
            counter *= 10;
        }
        return res.toString();
    }

    public static void main(String[] args) {
        int num = 3949;


        System.out.println(intToRoman(1000));
        System.out.println(intToRoman(500));
        System.out.println(intToRoman(50));
        System.out.println(intToRoman(5));
        System.out.println(intToRoman(1994));
    }
}
