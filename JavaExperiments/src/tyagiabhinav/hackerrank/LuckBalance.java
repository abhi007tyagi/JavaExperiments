/**
 * 
 */
package tyagiabhinav.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class LuckBalance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		if (N >= 1 && N <= 100 && K >= 0 && K <= N) {
			int[] L = new int[N];
			int[] T = new int[N];
			int imp = 0, maxLuck = 0;
			for (int i = 0; i < N; i++) {
				L[i] = in.nextInt();
				T[i] = in.nextInt();
				if (T[i] == 1) {
					imp++;
				}
			}

			if (imp == K) {
				// all are imp.. max luck
				for (int i = 0; i < N; i++) {
					maxLuck += L[i];
				}
			} else {
				int lostTest = imp - K;
				int j=0;
				int[] temp = new int[imp];
				for (int i = 0; i < N; i++) {
					if (T[i] == 0) {
						// add non imp
						maxLuck += L[i];
					} else {
						temp[j++] = L[i];
					}
				}
				Arrays.sort(temp);
				for (int i = 0; i < imp; i++) {
					if (i < lostTest) {
						maxLuck -= temp[i];
					} else {
						maxLuck += temp[i];
					}
				}
			}
			System.out.println(maxLuck);

		}
	}

}
