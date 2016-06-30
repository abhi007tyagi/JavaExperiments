/**
 * 
 */
package tyagiabhinav.hackerrank;

import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class Kangaroo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();

		int steps = 0;
		if (x1 >= 0 && x2 >= 0 && x1 <= 10000 && x2 <= 10000 && v1 > 0 && v2 > 0 && v1 <= 10000 && v2 <= 10000) {
			while (true) {
				if (x2 >= x1 && v2 > v1) {
					System.out.println("NO");
					break;
				} else if (x2 < x1 && v2 == v1) {
					System.out.println("NO");
					break;
				} else if (x1 >= x2 && v1 > v2) {
					System.out.println("NO");
					break;
				} else if (x1 < x2 && v1 == v2) {
					System.out.println("NO");
					break;
				} else {
					x1 += v1;
					x2 += v2;
					if (x1 == x2) {
						System.out.println("YES");
						break;
					}
				}
				steps++;
			}
		}
	}

}
