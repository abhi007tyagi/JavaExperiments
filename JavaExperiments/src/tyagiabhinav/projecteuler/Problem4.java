/**
 * 
 */
package tyagiabhinav.projecteuler;

/**
 * @author abhinavtyagi
 *
 */
public class Problem4 {

	/**
	 * Largest palindrome product
	 * 
	 * A palindromic number reads the same both ways. The largest palindrome
	 * made from the product of two 2-digit numbers is 9009 = 91 × 99. Find the
	 * largest palindrome made from the product of two 3-digit numbers.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int largest = 0;
		for (int i = 999; i >= 100; i--) {
			for (int j = 999; j >= i; j--) {
				int num = i * j;
				if (isPalindrome(num) && largest < num) {
					largest = num;
					// System.out.println(i+"*"+j+"="+num);
					break;
				}
			}
		}
		System.out.println("Largest=" + largest);

	}

	public static boolean isPalindrome(int num) {
		int rev = num;
		int temp = 0, t;
		while (num > 0) {
			t = num % 10;
			temp = (temp * 10) + t;
			num /= 10;
		}
		return temp == rev;
	}

}
