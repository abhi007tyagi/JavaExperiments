package tyagiabhinav.leetcode;

public class ValidPalindromeII {

    public static boolean validPalindrome(String s) {
        int size = s.length();
        int i = 0, j = size - 1, counter = 0;

        while (i <= j) {
            if (i == j && counter == 1) return false;
            if (s.charAt(i++) != s.charAt(j--)) {
                counter++;
                if (counter > 1) return false;
                return (isPalindrome(s,i - 1, j ) || isPalindrome(s,i , j + 1));
            }
        }
        return counter <= 1;
    }

    private static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validPalindrome("aaaaaaada"));
    }
}
