package tyagiabhinav.leetcode;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        int size = s.length();
        int i = 0, j = size - 1;

        while (i < j) {
            char chi = s.charAt(i);
            char chj = s.charAt(j);
            if (!Character.isDigit(chi) && !Character.isLetter(chi)) {
                i++;
                continue;
            }
            if (!Character.isDigit(chj) && !Character.isLetter(chj)) {
                j--;
                continue;
            }
            if (Character.toLowerCase(chi) != Character.toLowerCase(chj)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
    }

}
