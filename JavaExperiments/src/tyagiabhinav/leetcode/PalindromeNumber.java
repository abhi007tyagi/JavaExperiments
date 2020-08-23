package tyagiabhinav.leetcode;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if(x<0) return false;
        int temp = x;
        int y = 0;
        while(temp!=0){
            int rem = temp%10;
            temp /= 10;

            y = y*10+rem;
        }
        return x == y;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12344321));
    }
}
