package tyagiabhinav.leetcode;

public class AddStrings {

    public static String addStrings(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int dx = Math.abs((len1 - len2));
        int size = Math.max(len1, len2);
        StringBuilder strB = new StringBuilder();

        int carry = 0, ch1 = 0, ch2 = 0, sum = 0;
        for (int i = size - 1; i >= 0; i--) {
            if (i - dx >= 0) {
                if (len1 > len2) {
                    ch1 = num1.charAt(i) - 48;
                    ch2 = num2.charAt(i - dx) - 48;
                } else {
                    ch1 = num1.charAt(i - dx) - 48;
                    ch2 = num2.charAt(i) - 48;
                }
                sum = ch1 + ch2 + carry;
            } else {
                if (len1 > len2) {
                    ch1 = num1.charAt(i) - 48;
                    sum = ch1 + carry;
                } else {
                    ch2 = num2.charAt(i) - 48;
                    sum = ch2 + carry;
                }
            }
            carry = sum / 10;
            sum = 48 + sum % 10;
            strB.append((char) sum);
        }
        if (carry > 0) {
            strB.append((char) (carry + 48));
        }
        return strB.reverse().toString();
    }

    public static void main(String[] args) {
//        System.out.println(addStrings("111", "222"));
//        System.out.println(addStrings("1111111", "9"));
        System.out.println(addStrings("1", "99999999"));
    }
}
