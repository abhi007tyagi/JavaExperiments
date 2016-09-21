/**
 * 
 */
package tyagiabhinav.projecteuler;

import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class Project9 {

	/**
	 * 
	 * Special Pythagorean Triplet
	 * 
	 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for
	 * which, a2 + b2 = c2 For example, 32 + 42 = 9 + 16 = 25 = 52. There exists
	 * exactly one Pythagorean triplet for which a + b + c = N. Find the product
	 * abc.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int r = 0; r < T; r++) {
			int N = sc.nextInt();
			boolean isFound = false;
			int c = 3;
			for (int a = 1; a < N / 3; a++) {
				int b = a + 1;
				for (; (a+b+c)<=N; b++) {
					double cc = Math.sqrt((a * a) + (b * b));
					c = (int) cc;
					System.out.println("-----" + a + "*" + b + "*" + c);
					if (cc % 1 == 0) {
						if ((a + b + c == N)) {
							System.out.println(a + "*" + b + "*" + c);
							System.out.println(a * b * c);
							isFound = true;
							break;
						}
					}
					b++;
					
				}
				b = a + 2;
				c = b + 1;
				if (isFound) {
					break;
				}
			}
			if (!isFound) {
				System.out.println(-1);
			}
		}
	}

}
