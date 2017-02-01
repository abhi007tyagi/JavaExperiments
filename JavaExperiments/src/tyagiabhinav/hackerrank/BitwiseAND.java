/**
 * 
 */
package tyagiabhinav.hackerrank;

import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class BitwiseAND {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int k = in.nextInt();
			maxAnd(n, k);
		}
	}

	private static void maxAnd(int n, int k) {
		int max = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = i + 1; j <= n; j++) {
				int and = i & j;
				if (and < k) {
					max = Math.max(max, and);
				}
			}
		}
		System.out.println(max);
	}
}

