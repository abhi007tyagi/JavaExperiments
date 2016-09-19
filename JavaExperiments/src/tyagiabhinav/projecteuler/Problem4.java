/**
 * 
 */
package tyagiabhinav.projecteuler;

import java.util.Scanner;

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
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int k = 0; k < T; k++) {
			int N = sc.nextInt();
			int largest = 0;
			for (int i = 999; i >= 100; i--) {
				for (int j = 999; j >= i; j--) {
					int num = i * j;
					if (num < N && isPalindrome(num) && largest < num) {
						largest = num;
//						System.out.println(i + "*" + j + "=" + num);
						break;
					}
				}
			}
			System.out.println(largest);
		}
	}

	public static boolean isPalindrome(int num) {
		
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		String num1 = sb.toString();
//		String num2 = sb.reverse().toString();
//		
//		return num1.equals(num2);
//		
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
