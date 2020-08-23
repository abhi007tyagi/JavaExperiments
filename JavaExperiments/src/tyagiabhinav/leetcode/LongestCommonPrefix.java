package tyagiabhinav.leetcode;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length > 0) {
            if (strs.length == 1) {
                return strs[0];
            }
            int min = strs[0].length();
            for (int i = 0; i < strs.length; i++) {
                min = Math.min(min, strs[i].length());
            }

            StringBuilder strB = new StringBuilder();
            for (int i = 0; i < min; i++) {
                boolean isMatch = false;
                char ch = strs[0].charAt(i);
                for (int j = 0; j < strs.length - 1; j++) {
                    ch = strs[j].charAt(i);
                    if (strs[0].charAt(i) == strs[j + 1].charAt(i)) {
                        isMatch = true;
                    } else {
                        isMatch = false;
                        break;
                    }
                }
                if (isMatch) {
                    strB.append(ch);
                } else {
                    break;
                }
            }
            return strB.toString();
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
//        String[] arr = {"aca", "cba"};
//        System.out.println(longestCommonPrefix(arr));

        System.out.println("force".indexOf("foresee"));
        System.out.println("forsee".indexOf("force"));
    }
}