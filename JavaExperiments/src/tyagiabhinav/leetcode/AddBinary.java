package tyagiabhinav.leetcode;

import java.math.BigInteger;

public class AddBinary {

    public static String addBinary(String a, String b) {
        int len1 = a.length() - 1;
        int len2 = b.length() - 1;
        int carry = 0;
        StringBuilder strB = new StringBuilder();
        while (len1 >= 0 || len2 >= 0) {
            int sum = carry;
            if(len1>=0) sum+=a.charAt(len1--)-48;
            if(len2>=0) sum+=b.charAt(len2--)-48;
            strB.append(sum%2);
            carry = sum/2;
        }
        if(carry > 0) strB.append(carry);

        return strB.reverse().toString();
    }

    public static String bruteAddBinary(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        int dx = Math.abs(len1 - len2);

        int size = Math.max(len1, len2);

        int sum = 0, carry = 0;
        StringBuilder strB = new StringBuilder();
        for (int i = size - 1; i >= 0; i--) {
            int aa = getChar(a, i, dx, size);
            int bb = getChar(b, i, dx, size);

            sum = ((aa ^ bb) ^ carry);
            carry = (aa == 1 && bb == 1) ? 1 : (carry == 1 && (aa == 1 || bb == 1)) ? 1 : 0;
            strB.append(sum);
        }
        if (carry > 0) {
            strB.append(carry);
        }
        return strB.reverse().toString();
    }

    private static int getChar(String s, int pos, int dx, int len) {
        if (s.length() < len) {
            if (pos - dx < 0) return 0;
            return s.charAt(pos - dx) - 48;
        } else {
            return s.charAt(pos) - 48;
        }
    }

    public static void main(String[] args) {
//        System.out.println(addBinary("1010", "1011"));
//        System.out.println(addBinary("11", "1"));

        int r = (int)(Math.random() * 26);
        System.out.println(r);
    }
}
