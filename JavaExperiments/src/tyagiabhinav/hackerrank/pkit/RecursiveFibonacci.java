/**
 * 
 */
package tyagiabhinav.hackerrank.pkit;

import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class RecursiveFibonacci {

	/**
	 * @param args
	 */
	public static int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return n;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		System.out.println(fibonacci(n));
	}

}
